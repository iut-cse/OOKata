import { Problem } from "../models";
import * as $ from 'jquery';

export function problemHtmlResolver(problem: Problem): JQuery {
    let $name = $("<a>")
        .attr("href", problem.htmlUrl)
        .attr("target", "blank")
        .html(problem.title);

    return $name;
}