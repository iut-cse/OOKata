import * as $ from "jquery";
import { Widget } from "./Widget";
import { TableColumnConfig } from "../column-configs/TableColumnConfig";

export abstract class TableWidget<TData> extends Widget {
    protected $table: JQuery;
    private sorting: {
        isDesc: boolean;
        column: TableColumnConfig<TData>;
        $th: JQuery;
    }

    constructor(protected id: string, protected title: string, private columns: TableColumnConfig<TData>[]) {
        super(id, title);
        this.sorting = {
            isDesc: true,
            column: { headerHtml: "", resolveHtml: null, compare: () => 0 },
            $th: $()
        }
    }
    buildBodyContent(): void {
        this.$table = $("<table>")
            .addClass("table table-striped table-sm table-hover");

        this.buildTableHeader();
        this.buildTableBody();
    }
    buildTableHeader() {
        let $headerRow = $("<tr>").appendTo($("<thead>").appendTo(this.$table));
        this.columns.forEach(col => {
            let $th = $("<th>").html(col.headerHtml);
            if (col.compare) {
                $th.addClass("sortable");
                $th.append($("<span>").addClass("sort-icon").html(""));
                $th.click(() => {
                    if (this.sorting.column === col) {
                        this.sorting.isDesc = !this.sorting.isDesc;
                    } else {
                        this.sorting.isDesc = false;
                    }
                    this.sorting.$th.removeClass("asc desc");
                    this.sorting.$th = $th;
                    this.sorting.column = col;
                    this.buildTableBody();
                    $th.addClass(this.sorting.isDesc ? "desc" : "asc");
                });
            }
            $headerRow.append($th);
        });
    }
    buildTableBody() {
        this.$table.find("tbody").remove();
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
    getSortedData() {
        let dataList = [].concat(this.loadData());
        dataList = dataList.sort(this.sorting.column.compare);
        if(this.sorting.isDesc) {
            dataList.reverse();
        }
        
        return dataList;
    }
    abstract loadData(): TData[];
}
