import * as $ from "jquery";
import { Label } from "../models/Label";
import { Color } from "../utils/Color";

export function resolveLabelHtml(labels: Label[]): JQuery {
    let $allLabels = $("<div>")
        .addClass("label-list");

    labels.forEach(label => {
        resolveSingleLabelHtml(label).appendTo($allLabels);
    });
    
    return $allLabels;
}

function resolveSingleLabelHtml(label: Label) {
    let textColor = Color.fromHex(label.color).contrast().toRgbString();
    let $label = $("<span>")
        .addClass("label")
        .html(label.name)
        .css("background-color", `#${label.color}`)
        .css("color", textColor)
        .attr("title", label.description);
    return $label;
}
