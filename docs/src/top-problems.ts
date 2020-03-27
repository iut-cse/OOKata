import { ProblemList } from './problem-list';
import { orderBy, take } from 'lodash';
import * as $ from 'jquery';
import { HtmlTable, TableColumnConfig } from './html-table';
import { Problem } from './models';
import { resolveUserHtml } from './html-resolvers/user-html-resolver';
import { problemHtmlResolver as resolveProblemHtml } from './html-resolvers/problem-html-resolver';
import { resolveAsText } from './html-resolvers/simple-text-html-resolver';
import { resolveReactions } from './html-resolvers/reactions-html-resolver';

export async function load() {
    let problemList = await ProblemList.get();
    problemList = orderBy(problemList, p => p.points, "desc");
    problemList = orderBy(problemList, 10);

    let columnConfigs: TableColumnConfig<Problem>[] = [
        { headerHtml: "Title", resolveHtml: rowData => resolveProblemHtml(rowData) },
        { headerHtml: "Author", resolveHtml: rowData => resolveUserHtml(rowData.user) },
        { headerHtml: "Points", resolveHtml: rowData => resolveAsText(rowData.points) },
        { headerHtml: "Reactions", resolveHtml: rowData => resolveReactions(rowData.reactions) },
    ];
    let htmlTable = new HtmlTable<Problem>(columnConfigs, problemList);
    htmlTable.render($("#top-problems-widget .widget-content"));
}