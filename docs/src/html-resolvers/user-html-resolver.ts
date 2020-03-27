import { User } from "../models";
import * as $ from 'jquery';

export function resolveUserHtml(user: User) {
    let $avatar = $("<img>")
        .attr("src", user.avatar_url)
        .attr("width", 40)
        .attr("alt", user.login)
        .addClass("avatar");

    let $name = $("<a>")
        .attr("href", user.html_url)
        .attr("target", "blank")
        .html(user.login);

    let $fullContent = $("<div>")
        .addClass("user")
        //.append($avatar) temporarily commented
        .append($name);

    return $fullContent;
}