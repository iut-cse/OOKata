import * as $ from "jquery";
import { Problem } from "../models/Problem";

export function resolveProblemHtml(problem: Problem): JQuery {
    let $name = $("<a>")
        .attr("href", problem.url)
        .attr("target", "blank")
        .html(`${problem.title} (#${problem.number})`);
    return $name;
}
