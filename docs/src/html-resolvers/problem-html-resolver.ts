import { Problem } from "../models/Problem";
import * as $ from 'jquery';

export function resolveProblemHtml(problem: Problem): JQuery {
    let $name = $("<a>")
        .attr("href", problem.url)
        .attr("target", "blank")
        .html(problem.title);

    return $name;
}