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
import { compareProperty } from "../column-configs/compareProperty";
export class ProblemsWidget extends TableWidget<Problem> {
    constructor() {
        super("problems", "All problems", [
            new RankColumnConfig(),
            { headerHtml: "Title", resolveHtml: rowData => resolveProblemHtml(rowData), compare: compareProperty(p => p.title) },
            { headerHtml: "Author", resolveHtml: rowData => resolveUserHtml(rowData.author), compare: compareProperty(p => p.author.handle) },
            { headerHtml: "Score", resolveHtml: rowData => resolveAsText(rowData.reactions.score), compare: compareProperty(p => -p.reactions.score) },
            { headerHtml: "Reactions", resolveHtml: rowData => resolveReactions(rowData.reactions), compare: compareProperty(p => -p.reactions.total) },
            { headerHtml: "Comments", resolveHtml: rowData => resolveAsText(rowData.commentCount), compare: compareProperty(p => -p.commentCount) },
            { headerHtml: "Commits", resolveHtml: rowData => resolveAsText(rowData.commitCount), compare: compareProperty(p => -p.commitCount) },
            { headerHtml: "Labels", resolveHtml: rowData => resolveLabelHtml(rowData.labels) },
        ]);
    }

    loadData(): Problem[] {
        return database.problems;
    }
}
