import * as $ from 'jquery';

export class HtmlTable<TData> {
    constructor(private columns: TableColumnConfig<TData>[],
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
                let content = col.resolveHtml(rowData);
                $row.append($("<td>").html(content[0]));
            });
        });
    }
}

export interface TableColumnConfig<TData> {
    headerHtml: string;
    resolveHtml: (rowData: TData) => JQuery;
}
