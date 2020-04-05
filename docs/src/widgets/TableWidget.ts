import * as $ from "jquery";
import { Widget } from "./Widget";
import { TableColumnConfig } from "../column-configs/TableColumnConfig";
import { orderBy, sortBy } from "lodash";


export abstract class TableWidget<TData> extends Widget {
    protected $table: JQuery;
    private sortingColumn: TableColumnConfig<TData>;

    constructor(protected id: string, protected title: string, private columns: TableColumnConfig<TData>[]) {
        super(id, title);
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
            $th.click(()=> {
                if(col.compare !== null){
                    this.sortingColumn = col;
                    this.buildBodyContent();
                }
            });
            $headerRow.append($th);
        });
    }

    getSortedData(){
        let dataList = [].concat(this.loadData());
        if(this.sortingColumn)
            dataList.sort(this.sortingColumn.compare);

        return dataList;
    }
    abstract loadData(): TData[];
}
