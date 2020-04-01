import './app.scss';
import { TopProblemsWidget } from './widgets/top-problems-widget';
import { database } from './database';
import { TopAuthorsByScoreWidget } from './widgets/top-authors-by-score-widget';
import { TopAuthorsByProblemCountWidget } from './widgets/top-authors-by-problem-count-widget';
import { TopLabelsWidget } from './widgets/top-labels-widget';

const widgets = [
    new TopProblemsWidget(),
    new TopAuthorsByScoreWidget(),
    new TopAuthorsByProblemCountWidget(),
    new TopLabelsWidget(),
];

database.load().then(()=>{
    widgets.forEach(w => w.render());
});
