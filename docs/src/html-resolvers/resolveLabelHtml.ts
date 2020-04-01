import * as $ from "jquery";
import { Label } from "../models/Label";
import { Color } from "../utils/Color";

export function resolveLabelHtml(label: Label): JQuery {
    let textColor = Color.fromHex(label.color).contrast().toRgbString();
    let $label = $("<span>")
        .addClass("label")
        .html(label.name)
        .css("background-color", `#${label.color}`)
        .css("color", textColor)
        .attr("title", label.description);
    return $label;
}
