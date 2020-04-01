import { TableWidget } from "./TableWidget";
import { resolveUserHtml } from "../html-resolvers/resolveUserHtml";
import { resolveAsText } from "../html-resolvers/resolveAsText";
import { resolveReactions } from '../html-resolvers/resolveReactions';
import { take, sortBy } from "lodash";
import { Author } from "../models/author";
import { database } from "../Database";
import { RankColumnConfig } from "../column-configs/RankColumnConfig";
export class TopAuthorsByScoreWidget extends TableWidget<Author> {
    constructor() {
        super('top-authors-by-score', 'Top Authors by Score', [
            new RankColumnConfig(),
            { headerHtml: "Author", resolveHtml: rowData => resolveUserHtml(rowData) },
            { headerHtml: "Score", resolveHtml: rowData => resolveAsText(rowData.reactions.score) },
            { headerHtml: "Total Problems", resolveHtml: rowData => resolveAsText(rowData.problems.length) },
            { headerHtml: "Total Reactions", resolveHtml: rowData => resolveReactions(rowData.reactions) }
        ]);
    }
    loadData() {
        let authorlist = database.authors;
        authorlist = sortBy(authorlist, a => -a.reactions.score, a => -a.problems.length);
        authorlist = take(authorlist, 10);
        return authorlist;
    }
}
