export interface Issue {
    number: number;
    html_url: string;
    title: string;
    state: "open" | "closed";
    comments: number;
    created_at: string;
    user: User;
    labels: Label;
    reactions: Reactions;
}

export interface User {
    login: string;
    avatar_url: string;
    html_url: string;
}

export interface Label {
    name: string;
    color: string;
    description: string;
}

export interface Reactions {
    total_count: number;
    "+1": number;
    "-1": number;
    laugh: number;
    hooray: number;
    confused: number;
    heart: number;
    rocket: number;
    eyes: number;
}

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