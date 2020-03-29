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
    labels: Label;
    reactions: Reactions;
    author: Author;

    constructor(issue: Issue) {
        this.number = issue.number;
        this.htmlUrl = issue.html_url;
        this.title = issue.title;
        this.state = issue.state;
        this.comments = issue.comments;
        this.createdAt = issue.created_at;
        this.labels = issue.labels;
        this.reactions = issue.reactions;
    }
    get points(): number {
        return this.reactions["+1"] - this.reactions["-1"];
    }
}

export class Author {
    handle: string;
    htmlUrl: string;
    avatarUrl: string;
    problems: Problem[];
    constructor(user: User) {
        this.handle = user.login;
        this.htmlUrl = user.html_url;
        this.avatarUrl = user.avatar_url;

        this.problems = [];
    }
}