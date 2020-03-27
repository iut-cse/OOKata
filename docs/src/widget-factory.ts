import { ProblemList } from './problem-list';
import { orderBy, take } from 'lodash';
import * as $ from 'jquery';
import { Problem } from './models';
import { resolveUserHtml } from './html-resolvers/user-html-resolver';
import { problemHtmlResolver as resolveProblemHtml } from './html-resolvers/problem-html-resolver';
import { resolveAsText } from './html-resolvers/simple-text-html-resolver';
import { resolveReactions } from './html-resolvers/reactions-html-resolver';
import { TableColumnConfig } from './widgets/table-column-config';
import { Widget } from './widgets/widget';
import { TableWidget } from './widgets/table-widget';


export class WidgetFactory {
    async topProblems(): Promise<Widget> {
        let problemList = await ProblemList.get();
        problemList = orderBy(problemList, p => p.points, "desc");
        problemList = take(problemList, 10);

        let columnConfigs: TableColumnConfig<Problem>[] = [
            { headerHtml: "Title", resolveHtml: rowData => resolveProblemHtml(rowData) },
            { headerHtml: "Author", resolveHtml: rowData => resolveUserHtml(rowData.user) },
            { headerHtml: "Points", resolveHtml: rowData => resolveAsText(rowData.points) },
            { headerHtml: "Reactions", resolveHtml: rowData => resolveReactions(rowData.reactions) },
        ];

        return new TableWidget<Problem>('top-problems', 'Top Problems', columnConfigs, problemList);
    }
}