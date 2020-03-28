import { Issue } from "./Issue";
import { Label } from "./Label";
import { User } from "./User";
import { Reactions } from "./Reactions";
export class Problem {
    number: number;
    htmlUrl: string;
    title: string;
    state: "open" | "closed";
    comments: number;
    createdAt: string;
    user: User;
    labels: Label;
    reactions: Reactions;
    constructor(issue: Issue) {
        this.number = issue.number;
        this.htmlUrl = issue.html_url;
        this.title = issue.title;
        this.state = issue.state;
        this.comments = issue.comments;
        this.createdAt = issue.created_at;
        this.user = issue.user;
        this.labels = issue.labels;
        this.reactions = issue.reactions;
    }
    get points(): number {
        return this.reactions["+1"] - this.reactions["-1"];
    }
}
