import { TableWidget } from "./TableWidget";
import { Label } from "../models/Label";
import { database } from "../Database";
import { chain } from "lodash";
import { RankColumnConfig } from "../column-configs/RankColumnConfig";
import { resolveAsText } from "../html-resolvers/resolveAsText";
import { resolveLabelHtml } from "../html-resolvers/resolveLabelHtml";
export class TopLabelsWidget extends TableWidget<Label> {
    constructor() {
        super("top-labels", "Top Labels", [
            new RankColumnConfig(),
            { headerHtml: "Label", resolveHtml: label => resolveLabelHtml([label]) },
            { headerHtml: "Problems #", resolveHtml: label => resolveAsText(label.problems.length) },
        ]);
    }
    loadData(): Label[] {
        let labeslList = chain(database.labels)
            .sortBy(l => -l.problems.length)
            .take(10)
            .value();
        return labeslList;
    }
}
