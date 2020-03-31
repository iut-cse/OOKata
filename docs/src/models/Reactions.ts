import { RawReactions } from './raw/RawReactions'

const reactionKeys = [
    "+1",
    "-1",
    "confused",
    "eyes",
    "heart",
    "hooray",
    "laugh",
    "rocket"
]

export class Reactions {
    get score() {
        return this["+1"] - this["-1"];
    }
    "+1": number;
    "-1": number;
    confused: number;
    eyes: number;
    heart: number;
    hooray: number;
    laugh: number;
    rocket: number;

    constructor(reactions: RawReactions | {} = {}) {
        reactionKeys.forEach(key => {
            this[key] = reactions[key] || 0;
        });
    }

    merge(otherReactions: Reactions): void {
        reactionKeys.forEach(key => this[key] += otherReactions[key]);
    }
}