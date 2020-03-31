import { TableWidget } from "./table-widget";
import { Problem } from "../models/Problem";
import { resolveUserHtml } from '../html-resolvers/user-html-resolver';
import { resolveProblemHtml } from '../html-resolvers/problem-html-resolver';
import { resolveAsText } from '../html-resolvers/simple-text-html-resolver';
import { resolveReactions } from '../html-resolvers/reactions-html-resolver';
import { orderBy, take, sortBy, includes, groupBy, keyBy, partition, countBy, uniqBy, reduce } from "lodash";
import { Author } from "../models/author";
import { database } from "../database";
import { Reactions } from "../models/raw/Reactions";

export class TopAuthorsByPointsWidget extends TableWidget<Author> {
    constructor() {
        super('top-authors-by-points',
            'Top Authors',
            [

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