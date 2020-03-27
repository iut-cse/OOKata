import './app.scss';
import { TopProblemsWidget } from './widgets/top-problems-widget';

const widgets = [
    new TopProblemsWidget()
];

widgets.forEach(w => w.render());