import './app.scss';
import { TopProblemsWidget } from './widgets/top-problems-widget';
import { database } from './database';

const widgets = [
    new TopProblemsWidget()
];

database.load().then(()=>{
    widgets.forEach(w => w.render());
});
