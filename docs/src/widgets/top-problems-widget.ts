import { TableWidget } from "./table-widget";
import { Problem } from "../models/Problem";
import { resolveUserHtml } from '../html-resolvers/user-html-resolver';
import { resolveProblemHtml} from '../html-resolvers/problem-html-resolver';
import { resolveAsText } from '../html-resolvers/simple-text-html-resolver';
import { resolveReactions } from '../html-resolvers/reactions-html-resolver';
import { orderBy, take } from "lodash";
import { database } from "../database";

export class TopProblemsWidget extends TableWidget<Problem> {
    constructor() {
        super('top-problems',
            'Top Problems', 
            [
                { headerHtml: "Title", resolveHtml: rowData => resolveProblemHtml(rowData) },
                { headerHtml: "Author", resolveHtml: rowData => resolveUserHtml(rowData.author) },
                { headerHtml: "Score", resolveHtml: rowData => resolveAsText(rowData.score) },
                { headerHtml: "Reactions", resolveHtml: rowData => resolveReactions(rowData.reactions) },
            ]);
    }

    loadData(){
        let problemList = database.problems;
        problemList = orderBy(problemList, p => p.score, "desc");
        problemList = take(problemList, 10);
        return problemList;
    }
}