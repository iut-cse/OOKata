import { RawReaction, ReactionType } from './raw/RawReactions'
import { invert, each } from 'lodash';

const propertyToReactionType: { [name: string]: ReactionType } = {
    "thumbsUp": "THUMBS_UP",
    "thumbsDown": "THUMBS_DOWN",
    "confused": "CONFUSED",
    "eyes": "EYES",
    "heart": "HEART",
    "hooray": "HOORAY",
    "laugh": "LAUGH",
    "rocket": "ROCKET",
}

const reactionTypeToProperty = invert(propertyToReactionType);

export class Reactions {
    get score() {
        return this.thumbsUp - this.thumbsDown;
    }
    thumbsUp: number = 0;
    thumbsDown: number = 0;
    confused: number = 0;
    eyes: number = 0;
    heart: number = 0;
    hooray: number = 0;
    laugh: number = 0;
    rocket: number = 0;

    constructor(reactions: RawReaction[]) {
        each(reactions, r => {
            this[reactionTypeToProperty[r.content]] += r.users.totalCount;
        });
    }

    merge(otherReactions: Reactions): void {
        each(Object.keys(propertyToReactionType), prop => this[prop] += otherReactions[prop]);
    }
}