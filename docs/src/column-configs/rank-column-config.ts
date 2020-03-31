import { resolveAsText } from "../html-resolvers/simple-text-html-resolver";
import { TableColumnConfig } from "./table-column-config";
export class RankColumnConfig implements TableColumnConfig<any> {
    constructor(public headerHtml = "#") {
    }
    resolveHtml(_: any, index?: number) {
        return resolveAsText(index + 1);
    }
}
