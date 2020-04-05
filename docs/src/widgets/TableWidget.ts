import * as $ from "jquery";
import { Widget } from "./Widget";
import { TableColumnConfig } from "../column-configs/TableColumnConfig";

export abstract class TableWidget<TData> extends Widget {
    constructor(protected id: string, protected title: string, private columns: TableColumnConfig<TData>[]) {
        super(id, title);
    }
    buildBodyContent() : void {
        let $table = $("<table>")
            .addClass("table table-striped table-sm table-hover");
        let $headerRow = $("<tr>").appendTo($("<thead>").appendTo($table));
        this.columns.forEach(col => {
            $headerRow.append($("<th>").html(col.headerHtml));
        });
        let $tbody = $("<tbody>").appendTo($table);
        let dataList = this.loadData();
        dataList.forEach((rowData, rowIndex) => {
            let $row = $("<tr>").appendTo($tbody);
            this.columns.forEach((col) => {
                let content = col.resolveHtml(rowData, rowIndex);
                $row.append($("<td>").append(content));
            });
        });
        this.$body.empty();
        this.$body.append($table);
    }
    abstract loadData(): TData[];
}
