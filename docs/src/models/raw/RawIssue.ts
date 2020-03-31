import { RawReactions } from "./RawReactions";
import { RawUser } from "./RawUser";
import { RawLabel } from "./RawLabel";
export interface RawIssue {
    number: number;
    html_url: string;
    title: string;
    state: "open" | "closed";
    comments: number;
    created_at: string;
    user: RawUser;
    labels: RawLabel[];
    reactions: RawReactions;
}
