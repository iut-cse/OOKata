import { TableWidget } from "./TableWidget";
import { Problem } from "../models/Problem";
import { database } from "../Database";
import { RankColumnConfig } from "../column-configs/RankColumnConfig";
import { resolveProblemHtml } from "../html-resolvers/resolveProblemHtml";
import { resolveUserHtml } from "../html-resolvers/resolveUserHtml";
import { resolveAsText } from "../html-resolvers/resolveAsText";
import { resolveReactions } from "../html-resolvers/resolveReactions";
import { resolveLabelHtml } from "../html-resolvers/resolveLabelHtml";
import { TableColumnConfig } from "../column-configs/TableColumnConfig";
export class ProblemsWidget extends TableWidget<Problem> {
    constructor() {
        super("problems", "All problems", [
            new RankColumnConfig(),
            { headerHtml: "Title", resolveHtml: rowData => resolveProblemHtml(rowData) },
            { headerHtml: "Author", resolveHtml: rowData => resolveUserHtml(rowData.author) },
            { headerHtml: "Score", resolveHtml: rowData => resolveAsText(rowData.reactions.score) },
            { headerHtml: "Reactions", resolveHtml: rowData => resolveReactions(rowData.reactions) },
            { headerHtml: "Comments", resolveHtml: rowData => resolveAsText(rowData.commentCount) },
            { headerHtml: "Commits", resolveHtml: rowData => resolveAsText(rowData.commitCount) },
            { headerHtml: "Labels", resolveHtml: rowData => resolveLabelHtml(rowData.labels) },
        ]);
    }

    loadData(): Problem[] {
        return database.problems;
    }
}
