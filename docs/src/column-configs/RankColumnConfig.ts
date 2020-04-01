import { resolveAsText } from "../html-resolvers/resolveAsText";
import { TableColumnConfig } from "./TableColumnConfig";
export class RankColumnConfig implements TableColumnConfig<any> {
    constructor(public headerHtml = "#") {
    }
    resolveHtml(_: any, index?: number) {
        return resolveAsText(index + 1);
    }
}
