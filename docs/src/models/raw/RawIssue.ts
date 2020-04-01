import { RawReaction } from "./RawReactions";
import { RawUser } from "./RawUser";
import { RawLabel } from "./RawLabel";
import { RawTotalCount } from "./RawTotalCount";

export interface RawIssue {
    number: number;
    title: string;
    url: string;
    comments: RawTotalCount;
    author: RawUser;
    labels: {
        nodes: RawLabel[]
    };
    reactionGroups: RawReaction[];
    timelineItems: RawTotalCount
}
