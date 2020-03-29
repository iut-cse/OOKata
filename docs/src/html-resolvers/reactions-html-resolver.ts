import { Reactions } from "../models/raw/Reactions";
import * as $ from 'jquery';

// the names must match with Reactions class's properties
const reactionImages = {
    "+1": "👍",
    "-1": "👎",
    laugh: "😄",
    hooray: "🎉",
    confused: "😕",
    heart: "❤️",
    rocket: "🚀",
    eyes: "👀",
}

export function resolveReactions(reactions: Reactions) {
    let $fullContent = $("<span>")
        .addClass("reaction-list");

    for (const key in reactionImages) {
        if (reactions[key] > 0) {
            $("<span>")
                .addClass("reaction")
                .html(`${reactionImages[key]}${reactions[key]}`)
                .appendTo($fullContent);
        }
    }

    return $fullContent;
}