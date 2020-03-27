import './app.scss';
import { WidgetFactory } from './widget-factory';

const widgetFactory = new WidgetFactory();
const widgetsPromises = [
    widgetFactory.topProblems()
];

widgetsPromises.forEach(wp => wp.then(
    w=> w.render()
));