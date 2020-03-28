import { TableWidget } from "./table-widget";
import { Problem } from "../models/Problem";
import { resolveUserHtml } from '../html-resolvers/user-html-resolver';
import { resolveProblemHtml} from '../html-resolvers/problem-html-resolver';
import { resolveAsText } from '../html-resolvers/simple-text-html-resolver';
import { resolveReactions } from '../html-resolvers/reactions-html-resolver';
import { orderBy, take } from "lodash";
import { ProblemList } from "../problem-list";

export class TopProblemsWidget extends TableWidget<Problem> {
    constructor() {
        super('top-problems',
            'Top Problems', 
            [
                { headerHtml: "Title", resolveHtml: rowData => resolveProblemHtml(rowData) },
                { headerHtml: "Author", resolveHtml: rowData => resolveUserHtml(rowData.user) },
                { headerHtml: "Points", resolveHtml: rowData => resolveAsText(rowData.points) },
                { headerHtml: "Reactions", resolveHtml: rowData => resolveReactions(rowData.reactions) },
            ]);
    }

    async loadData(){
        let problemList = await ProblemList.get();
        problemList = orderBy(problemList, p => p.points, "desc");
        problemList = take(problemList, 10);
        return problemList;
    }
}