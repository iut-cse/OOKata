import 'node-fetch';
import { Problem } from "./models/Problem";
import { map } from 'lodash';

class Database {
    public problems: Problem[];

    private promise: Promise<void>;

    async load(): Promise<void> {
        return fetch("https://api.github.com/repos/iut-cse/oo-problem-catalog/issues", {
            headers: {
                "Accept": "*/*,application/vnd.github.squirrel-girl-preview"
            }
        }).then(res => res.json()
        ).then(issues => {
            this.problems = map(issues, issue => new Problem(issue));
        }).catch(error => {
            console.log(error);
        });
    }
}

export const database = new Database();