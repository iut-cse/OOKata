import { TableWidget } from "./TableWidget";
import { RankColumnConfig } from "../column-configs/RankColumnConfig";
import { resolveAsText } from "../html-resolvers/resolveAsText";
import { Label } from "../models/Label";
import { resolveLabelHtml } from "../html-resolvers/resolveLabelHtml";
import { compareProperty } from "../column-configs/compareProperty";
import { database } from "../Database";

export class LabelsWidget extends TableWidget<Label> {
    constructor() {
        super("labels", "Labels", [
            new RankColumnConfig(),
            { headerHtml: "Label", resolveHtml: label => resolveLabelHtml([label]), compare: compareProperty(l => l.name) },
            { headerHtml: "Problems #", resolveHtml: label => resolveAsText(label.problems.length), compare: compareProperty(l => l.problems.length) },
        ]);
    }
    loadData(): Label[] {
        return database.labels;
    }
}
