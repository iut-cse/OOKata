import { RawIssue } from "./raw/RawIssue";
import { RawLabel } from "./raw/RawLabel";
import { Author } from "./Author";
import { Reactions } from "./Reactions";
export class Problem {
    number: number;
    htmlUrl: string;
    title: string;
    state: "open" | "closed";
    comments: number;
    createdAt: string;
    labels: RawLabel[];
    reactions: Reactions;
    author: Author;

    constructor(issue: RawIssue) {
        this.number = issue.number;
        this.htmlUrl = issue.html_url;
        this.title = issue.title;
        this.state = issue.state;
        this.comments = issue.comments;
        this.createdAt = issue.created_at;
        this.labels = issue.labels;
        this.reactions = new Reactions(issue.reactions);
    }
}
