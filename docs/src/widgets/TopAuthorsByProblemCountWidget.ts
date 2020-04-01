import { TableWidget } from "./TableWidget";
import { resolveUserHtml } from "../html-resolvers/resolveUserHtml";
import { resolveAsText } from "../html-resolvers/resolveAsText";
import { resolveReactions } from '../html-resolvers/resolveReactions';
import { take, sortBy } from "lodash";
import { Author } from "../models/author";
import { database } from "../Database";
import { RankColumnConfig } from "../column-configs/RankColumnConfig";
export class TopAuthorsByProblemCountWidget extends TableWidget<Author> {
    constructor() {
        super('top-authors-by-problem-count', 'Top Authors by Problem Count', [
            new RankColumnConfig(),
            { headerHtml: "Author", resolveHtml: rowData => resolveUserHtml(rowData) },
            { headerHtml: "Total Problems", resolveHtml: rowData => resolveAsText(rowData.problems.length) },
            { headerHtml: "Score", resolveHtml: rowData => resolveAsText(rowData.reactions.score) },
            { headerHtml: "Total Reactions", resolveHtml: rowData => resolveReactions(rowData.reactions) }
        ]);
    }
    loadData() {
        let authorlist = database.authors;
        authorlist = sortBy(authorlist, a => -a.problems.length, a => -a.reactions.score);
        authorlist = take(authorlist, 10);
        return authorlist;
    }
}
