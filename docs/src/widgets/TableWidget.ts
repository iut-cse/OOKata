import * as $ from "jquery";
import { Widget } from "./Widget";
import { TableColumnConfig } from "../column-configs/TableColumnConfig";

export abstract class TableWidget<TData> extends Widget {
    protected $table: JQuery;
    private sorting: {
        isDesc: boolean;
        column: TableColumnConfig<TData>;
    }

    constructor(protected id: string, protected title: string, private columns: TableColumnConfig<TData>[]) {
        super(id, title);
        this.sorting = {
            isDesc: true,
            column: { headerHtml: "", resolveHtml: null, compare: () => 0 }
        }
    }
    buildBodyContent(): void {
        if (this.$table)
            this.$table.remove();

        this.$table = $("<table>")
            .addClass("table table-striped table-sm table-hover");

        this.buildTableHeader();

        let $tbody = $("<tbody>").appendTo(this.$table);

        let dataList = this.getSortedData();

        dataList.forEach((rowData, rowIndex) => {
            let $row = $("<tr>").appendTo($tbody);
            this.columns.forEach((col) => {
                let content = col.resolveHtml(rowData, rowIndex);
                $row.append($("<td>").append(content));
            });
        });

        this.$body.append(this.$table);
    }
    buildTableHeader() {
        let $headerRow = $("<tr>").appendTo($("<thead>").appendTo(this.$table));
        this.columns.forEach(col => {
            let $th = $("<th>").html(col.headerHtml);
            if (col.compare) {
                $th.addClass("sortable");
                $th.click(() => {
                    if (this.sorting.column === col) {
                        this.sorting.isDesc = !this.sorting.isDesc;
                    } else {
                        this.sorting.isDesc = false;
                    }
                    this.sorting.column = col;
                    this.buildBodyContent();
                });
            }
            $headerRow.append($th);
        });
    }

    getSortedData() {
        let dataList = [].concat(this.loadData());
        let comp = this.sorting.column.compare;
        if(this.sorting.isDesc) {
            comp = (a, b) => -this.sorting.column.compare(a, b);
        }
        dataList = dataList.sort(comp);
        return dataList;
    }
    abstract loadData(): TData[];
}
