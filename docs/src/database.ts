import 'node-fetch';
import { Problem } from "./models/Problem";
import { Author } from "./models/Author";
import { map, uniqBy, find } from 'lodash';
import { Issue } from './models/raw/Issue';

class Database {
    public problems: Problem[];
    public authors: Author[];

    async load(): Promise<void> {
        let headers: any = {
            "Accept": "*/*,application/vnd.github.squirrel-girl-preview"
        };
        if(localStorage["token"])
            headers["Authorization"] = `token ${localStorage["token"]}`;

        return fetch("https://api.github.com/repos/iut-cse/oo-problem-catalog/issues", {
            headers: headers
        }).then(res => res.json()
        ).then(issues => {
            this.process(issues);
        }).catch(error => {
            console.log(error);
        });
    }

    private process(rawIssues: Issue[]) {
        let rawAuthors = map(rawIssues, ri => ri.user);
        rawAuthors = uniqBy(rawAuthors, ra => ra.login);
        this.authors = map(rawAuthors, ra=>new Author(ra));


        this.problems = map(rawIssues, ri => {
            let problem = new Problem(ri);
            problem.author = find(this.authors, author => author.handle === ri.user.login);
            problem.author.problems.push(problem);

            return problem;
        });
    }
}

export const database = new Database();