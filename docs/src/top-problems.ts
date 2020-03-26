import { ProblemList } from './problem-list';
import * as _ from 'lodash';

export async function load() {
    let problemList = await ProblemList.get();
    let topProblems = _(problemList)
        .orderBy(p => p.reactions["+1"] - p.reactions["-1"], "desc")
        .take(10)
        .value();
    console.log(topProblems);
}