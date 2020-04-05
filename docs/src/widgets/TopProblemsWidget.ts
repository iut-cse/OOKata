import { TableWidget } from "./TableWidget";
import { Problem } from "../models/Problem";
import { resolveUserHtml } from "../html-resolvers/resolveUserHtml";
import { resolveProblemHtml } from "../html-resolvers/resolveProblemHtml";
import { resolveAsText } from "../html-resolvers/resolveAsText";
import { resolveReactions } from '../html-resolvers/resolveReactions';
import { orderBy, take } from "lodash";
import { database } from "../Database";
import { RankColumnConfig } from "../column-configs/RankColumnConfig";
export class TopProblemsWidget extends TableWidget<Problem> {
    constructor() {
        super('top-problems', 'Top Problems', [
            new RankColumnConfig(),
            { headerHtml: "Title", resolveHtml: rowData => resolveProblemHtml(rowData) },
            { headerHtml: "Author", resolveHtml: rowData => resolveUserHtml(rowData.author) },
            { headerHtml: "Score", resolveHtml: rowData => resolveAsText(rowData.reactions.score) },
            { headerHtml: "Reactions", resolveHtml: rowData => resolveReactions(rowData.reactions) },
        ]);
    }
    loadData() {
        let problemList = database.problems;
        problemList = orderBy(problemList, p => p.reactions.score, "desc");
        problemList = take(problemList, 10);
        return problemList;
    }
}


