import * as $ from 'jquery';

export class HtmlTable {
    constructor(private columns: TableColumnConfig[],
        private data: any[]) {
    }

    render($container: JQuery) {
        let $table = $("<table>")
            .addClass("table table-striped table-sm table-hover")
            .appendTo($container);
        let $headerRow = $("<tr>").appendTo($("<thead>").appendTo($table));
        this.columns.forEach(col => {
            $headerRow.append($("<th>").html(col.headerHtml));
        });

        let $tbody = $("<tbody>").appendTo($table);
        this.data.forEach(rowData => {
            let $row = $("<tr>").appendTo($tbody);
            this.columns.forEach(col => {
                $row.append($("<td>").html(col.resolveValue(rowData)));
            });
        });
    }
}

export interface TableColumnConfig {
    headerHtml: string;
    resolveValue: (rowData: any) => string;
}
