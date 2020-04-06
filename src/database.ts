import 'node-fetch';
import { Problem } from "./models/Problem";
import { Author } from "./models/Author";
import { map, uniqBy, find, flatMap, keyBy, chain, values, each } from 'lodash';
import { RawIssue } from './models/raw/RawIssue';
import { Label } from './models/Label';

const defaultAuthToken = "2539426bc71ac5c249b608f23b9b6c228c890b3e";

class Database {
    public problems: Problem[];
    public authors: Author[];
    public labels: Label[];

    private async process(response: Promise<Response>) {
        let responseJson = await (await response).json();
        let rawIssues: RawIssue[] = responseJson.data.repository.issues.nodes;
        this.authors = chain(rawIssues)
            .map(ri => ri.author)
            .uniqBy(ra => ra.login)
            .map(ra => new Author(ra))
            .value();

        this.labels = chain(rawIssues)
            .flatMap(ri => ri.labels.nodes)
            .uniqBy(rl => rl.name)
            .map(rl => new Label(rl))
            .value();

        this.problems = map(rawIssues, ri => new Problem(ri));
        this.setupReferenceProperties();
    }

    private setupReferenceProperties() {
        let authorMap = keyBy(this.authors, a => a.handle);
        let labelMap = keyBy(this.labels, l => l.name);

        each(this.problems, p => {
            p.labels = map(p.labelNames, ln => labelMap[ln]);
            p.labels.forEach(l => l.problems.push(p));

            p.author = authorMap[p.authorHandle];
            p.author.problems.push(p);
            p.author.reactions.merge(p.reactions);
        });
    }

    private graphQLQuery = `
    {
        repository(name: "oo-kata", owner: "iut-cse") {
            issues(first: 100, states: OPEN ) {
                nodes {
                    number
                    title
                    url
                    comments {
                        totalCount
                    }
                    reactionGroups {
                        content
                        users {
                          totalCount
                        }
                    }
                    labels(first: 100) {
                        nodes {
                            name
                            color
                            description
                        }
                    }
                    author {
                        login
                        url
                        avatarUrl
                    }
                    timelineItems (itemTypes:REFERENCED_EVENT) {
                        totalCount
                    }
                }
            }
        }
    }
    `
    public async loadByGraphQL() {
        let response = fetch("https://api.github.com/graphql", {
            method: "POST",
            headers: {
                "Authorization": `token ${localStorage["token"] || defaultAuthToken}`,
            },
            body: JSON.stringify({ query: this.graphQLQuery })
        });

        return this.process(response);
    }

    public async loadFakeData() {
        let response = fetch("/data/graphql.json");
        return this.process(response);
    }
}

export const database = new Database();