import { TableWidget } from "./table-widget";
import { Label } from "../models/Label";
import { database } from "../database";
import { chain } from "lodash";
import { RankColumnConfig } from "../column-configs/rank-column-config";
import { resolveAsText } from "../html-resolvers/simple-text-html-resolver";
import { resolveLabelHtml } from "../html-resolvers/label-html-resolver";

export class TopLabelsWidget extends TableWidget<Label> {
    constructor() {
        super(
            "top-labels",
            "Top Labels",
            [
                new RankColumnConfig(),
                { headerHtml: "Label", resolveHtml: label => resolveLabelHtml(label) },
                { headerHtml: "Problems #", resolveHtml: label => resolveAsText(label.problems.length) },
            ]
        );
    }

    loadData(): Label[] {
        let labeslList = chain(database.labels)
            .sortBy(l => -l.problems.length)
            .take(10)
            .value();

        return labeslList;
    }
}