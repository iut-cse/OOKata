import { User } from "../models/User";
import * as $ from 'jquery';
import { Author } from "../models/Problem";

export function resolveUserHtml(user: Author) {
    let $avatar = $("<img>")
        .attr("src", user.avatarUrl)
        .attr("width", 40)
        .attr("alt", user.handle)
        .addClass("avatar");

    let $name = $("<a>")
        .attr("href", user.htmlUrl)
        .attr("target", "blank")
        .html(user.handle);

    let $fullContent = $("<div>")
        .addClass("user")
        //.append($avatar) temporarily commented
        .append($name);

    return $fullContent;
}