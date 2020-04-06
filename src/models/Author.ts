import { RawUser } from "./raw/RawUser";
import { Problem } from "./Problem";
import { Reactions } from "./Reactions";
export class Author {
    handle: string;
    htmlUrl: string;
    avatarUrl: string;
    problems: Problem[];
    reactions: Reactions;
    constructor(user: RawUser) {
        this.handle = user.login;
        this.htmlUrl = user.url;
        this.avatarUrl = user.avatarUrl;
        this.problems = [];
        this.reactions = new Reactions([]);
    }
}
