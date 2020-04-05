import { TableWidget } from "./TableWidget";
import { database } from "../Database";
import { RankColumnConfig } from "../column-configs/RankColumnConfig";
import { resolveUserHtml } from "../html-resolvers/resolveUserHtml";
import { resolveAsText } from "../html-resolvers/resolveAsText";
import { resolveReactions } from "../html-resolvers/resolveReactions";
import { compareProperty } from "../column-configs/compareProperty";
import { Author } from "../models/Author";
export class AuthorsWidget extends TableWidget<Author> {
    constructor() {
        super("authors", "All Authors", [
            new RankColumnConfig(),
            { headerHtml: "Author", resolveHtml: author => resolveUserHtml(author), compare: compareProperty(a => a.handle) },
            { headerHtml: "Total Problems", resolveHtml: author => resolveAsText(author.problems.length), compare: compareProperty(a => a.problems.length) },
            { headerHtml: "Score", resolveHtml: author => resolveAsText(author.reactions.score), compare: compareProperty(a => a.reactions.score) },
            { headerHtml: "Total Reactions", resolveHtml: author => resolveReactions(author.reactions), compare: compareProperty(a => a.reactions.total) }
        ]);
    }
    loadData(): Author[] {
        return database.authors;
    }
}
