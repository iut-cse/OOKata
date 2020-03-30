import './app.scss';
import { TopProblemsWidget } from './widgets/top-problems-widget';
import { database } from './database';
import { TopAuthorsByPointsWidget } from './widgets/top-authors-by-points-widget';

const widgets = [
    new TopProblemsWidget(),
    new TopAuthorsByPointsWidget()
];

database.load().then(()=>{
    widgets.forEach(w => w.render());
});
