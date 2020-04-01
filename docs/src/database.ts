import 'node-fetch';
import { Problem } from "./models/Problem";
import { Author } from "./models/Author";
import { map, uniqBy, find, flatMap, keyBy, chain, values } from 'lodash';
import { RawIssue } from './models/raw/RawIssue';
import { Label } from './models/Label';

class Database {
    public problems: Problem[];
    public authors: Author[];
    public labels: Label[];

    async load(): Promise<void> {
        let headers: any = {
            "Accept": "*/*,application/vnd.github.squirrel-girl-preview"
        };
        if (localStorage["token"])
            headers["Authorization"] = `token ${localStorage["token"]}`;

        return fetch("https://api.github.com/repos/iut-cse/oo-kata/issues", {
            headers: headers
        }).then(res => res.json()
        ).then(issues => {
            this.process(issues);
        }).catch(error => {
            console.log(error);
        });
    }

    private process(rawIssues: RawIssue[]) {
        this.authors = chain(rawIssues)
            .map(ri => ri.user)
            .uniqBy(ri => ri.login)
            .map(ru => new Author(ru))
            .value();

        this.labels = chain(rawIssues)
            .flatMap(ri => ri.labels)
            .uniqBy(ri => ri.name)
            .map(rl => new Label(rl))
            .value();

        this.problems = map(rawIssues, ri => new Problem(ri));

        let authorMap = keyBy(this.authors, a => a.handle);
        let labelMap = keyBy(this.labels, l => l.name);

        this.problems = map(rawIssues, ri => {
            let problem = new Problem(ri);
            problem.author = authorMap[ri.user.login];
            problem.author.reactions.merge(problem.reactions);
            problem.author.problems.push(problem);

            ri.labels.forEach(rl => {
                let label = labelMap[rl.name];
                label.problems.push(problem);
                problem.labels.push(label);
            });

            return problem;
        });
    }
}

export const database = new Database();