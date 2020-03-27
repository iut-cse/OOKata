import 'node-fetch';
import { Problem } from './models';
import { map } from 'lodash';

// TODO: Consider pagination! Are all issues coming?
export class ProblemList {
    private static problemList: Problem[] = [];
    private static status = "notLoaded";

    static async get(): Promise<Problem[]> {
        if (status === "loaded" || status === "loading") {
            return this.problemList;
        }
        status = "loading";

        return fetch("https://api.github.com/repos/iut-cse/oo-problem-catalog/issues", {
            headers: {
                "Accept": "*/*,application/vnd.github.squirrel-girl-preview"
            }
        }).then(res => res.json())
            .then(issues => {
                status = "loaded";
                let problems = map(issues, issue => new Problem(issue));
                this.problemList.length = 0;
                Array.prototype.push.apply(this.problemList, problems);
                return this.problemList;
            }).catch(error => {
                console.log(error);
                return this.problemList;
            });
    }
}



