import { Label } from "../models/Label";
import * as $ from "jquery";

export function resolveLabelHtml(label: Label): JQuery{
    let $label = $("<span>")
        .addClass("label")
        .html(label.name)
        .css("background-color", `#${label.color}`)
        .attr("title", label.description);

    return $label;
}