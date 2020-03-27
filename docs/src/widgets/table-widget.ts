import { Widget } from "./widget";
import { TableColumnConfig } from "./table-column-config";
import * as $ from 'jquery';

export abstract class TableWidget<TData> extends Widget<TData> {
    constructor(
        protected id: string,
        protected title: string,
        private columns: TableColumnConfig<TData>[]) {
        super(id, title);
    }

    buildBodyContent(): string | JQuery<HTMLElement> {
        let $table = $("<table>")
            .addClass("table table-striped table-sm table-hover");
        let $headerRow = $("<tr>").appendTo($("<thead>").appendTo($table));
        this.columns.forEach(col => {
            $headerRow.append($("<th>").html(col.headerHtml));
        });

        let $tbody = $("<tbody>").appendTo($table);
        this.loadData().then(dataList => {
            dataList.forEach(rowData => {
                let $row = $("<tr>").appendTo($tbody);
                this.columns.forEach(col => {
                    let content = col.resolveHtml(rowData);
                    $row.append($("<td>").html(content[0]));
                });
            });
        });

        return $table;
    }

    abstract loadData(): Promise<TData[]>;
}