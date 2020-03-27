import { ProblemList } from './problem-list';
import * as _ from 'lodash';
import * as $ from 'jquery';
import { HtmlTable, TableColumnConfig } from './html-table';

export async function load() {
    let problemList = await ProblemList.get();
    let topProblems = _(problemList)
        .orderBy(p => p.reactions["+1"] - p.reactions["-1"], "desc")
        .take(10)
        .value();

    let columnConfigs: TableColumnConfig[] = [
        { headerHtml: "Title", resolveValue: rowData => rowData.title }
    ];
    let htmlTable = new HtmlTable(columnConfigs, topProblems);
    htmlTable.render($("#top-problems-widget .widget-content"));
}