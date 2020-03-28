import { Problem } from "../models/Problem";
import * as $ from 'jquery';

export function resolveProblemHtml(problem: Problem): JQuery {
    let $name = $("<a>")
        .attr("href", problem.htmlUrl)
        .attr("target", "blank")
        .html(problem.title);

    return $name;
}