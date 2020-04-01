import './app.scss';
import { TopProblemsWidget } from "./widgets/TopProblemsWidget";
import { database } from './Database';
import { TopAuthorsByScoreWidget } from "./widgets/TopAuthorsByScoreWidget";
import { TopAuthorsByProblemCountWidget } from "./widgets/TopAuthorsByProblemCountWidget";
import { TopLabelsWidget } from "./widgets/TopLabelsWidget";

const widgets = [
    new TopProblemsWidget(),
    new TopAuthorsByScoreWidget(),
    new TopAuthorsByProblemCountWidget(),
    new TopLabelsWidget(),
];

database.loadByGraphQL().then(()=>{
    widgets.forEach(w => w.render());
});
