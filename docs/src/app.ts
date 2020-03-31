import './app.scss';
import { TopProblemsWidget } from './widgets/top-problems-widget';
import { database } from './database';
import { TopAuthorsByScoreWidget } from './widgets/top-authors-by-score-widget';

const widgets = [
    new TopProblemsWidget(),
    new TopAuthorsByScoreWidget()
];

database.load().then(()=>{
    widgets.forEach(w => w.render());
});
