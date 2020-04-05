import { RawIssue } from "./raw/RawIssue";
import { RawLabel } from "./raw/RawLabel";
import { Author } from "./Author";
import { Reactions } from "./Reactions";
import { Label } from "./Label";
export class Problem {
    number: number;
    url: string;
    title: string;
    labelNames: string[];
    labels: Label[];
    reactions: Reactions;
    authorHandle: string;
    author: Author;
    commentCount: number;
    commitCount: number;

    constructor(issue: RawIssue) {
        this.number = issue.number;
        this.url = issue.url;
        this.title = issue.title;
        this.authorHandle = issue.author.login;
        this.commentCount = issue.comments.totalCount;
        this.commitCount = issue.timelineItems.totalCount;
        this.labelNames = issue.labels.nodes.map(rl => rl.name);
        this.labels = [];
        this.reactions = new Reactions(issue.reactionGroups);
    }
}
