import { TableWidget } from "./table-widget";
import { Problem } from "../models/Problem";
import { resolveUserHtml } from '../html-resolvers/user-html-resolver';
import { resolveProblemHtml} from '../html-resolvers/problem-html-resolver';
import { resolveAsText } from '../html-resolvers/simple-text-html-resolver';
import { resolveReactions } from '../html-resolvers/reactions-html-resolver';
import { orderBy, take, sortBy, includes, groupBy, keyBy, partition, countBy, uniqBy, reduce } from "lodash";
import { Author } from "../models/author";
import { database } from "../database";
import { Reactions } from "../models/raw/Reactions";

export class TopAuthorsByPointsWidget extends TableWidget<Author> {
    constructor() {
        super('top-authors-by-points',
            'Top Authors', 
            [
                
                { headerHtml: "Author", resolveHtml: rowData => resolveUserHtml(rowData) },
                { headerHtml: "Score", resolveHtml: rowData => resolveAsText(rowData.score) },
                { headerHtml: "Total Problems", resolveHtml: rowData => resolveAsText(rowData.totalProplems) },
                { headerHtml: "Total Reactions", resolveHtml: rowData => resolveReactions(rowData.totalReactions) }
        
            ]);
    }

     loadData(){
        
        let authorlist = database.authors;
        var problemlist;
        var points = 0;
        var reactions: Reactions ;
        authorlist.forEach(element => {
            problemlist = element.problems;
            problemlist.forEach(element => {
                points = points + element.points;
                reactions = element.reactions;
                console.log(reactions["+1"]+element.reactions["+1"]);
            });
            element.totalReactions = reactions;
            element.score = points;
            element.totalProplems = problemlist.length;
            points = 0;
        });
        authorlist = orderBy(authorlist, p=> p.score,"desc" );
    
        return authorlist;
    }
}