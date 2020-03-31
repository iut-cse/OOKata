import { TableWidget } from "./table-widget";
import { Problem } from "../models/Problem";
import { resolveUserHtml } from '../html-resolvers/user-html-resolver';
import { resolveProblemHtml } from '../html-resolvers/problem-html-resolver';
import { resolveAsText } from '../html-resolvers/simple-text-html-resolver';
import { resolveReactions } from '../html-resolvers/reactions-html-resolver';
import { orderBy, take, sortBy, includes, groupBy, keyBy, partition, countBy, uniqBy, reduce } from "lodash";
import { Author } from "../models/author";
import { database } from "../database";
import { RankColumnConfig } from "../column-configs/rank-column-config";

export class TopAuthorsByProblemCountWidget extends TableWidget<Author> {
    constructor() {
        super('top-authors-by-problem-count',
            'Top Authors by Problem Count',
            [
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