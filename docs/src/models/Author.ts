import { User } from "./raw/User";
import { Problem } from "./Problem";
import { Reactions } from "./raw/Reactions";
export class Author {
    handle: string;
    htmlUrl: string;
    avatarUrl: string;
    problems: Problem[];
    score: number;
    totalProplems: number;
    totalReactions: Reactions;
    constructor(user: User) {
        this.handle = user.login;
        this.htmlUrl = user.html_url;
        this.avatarUrl = user.avatar_url;
        this.problems = [];
    }
     
}
