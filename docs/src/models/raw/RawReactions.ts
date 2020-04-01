import { RawTotalCount } from "./RawTotalCount";

export interface RawReaction {
    content: ReactionType;
    users: RawTotalCount;
}

export type ReactionType = "THUMBS_UP" |
    "THUMBS_DOWN" |
    "LAUGH" |
    "HOORAY" |
    "CONFUSED" |
    "HEART" |
    "ROCKET" |
    "EYES";