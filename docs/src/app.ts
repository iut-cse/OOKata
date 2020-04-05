import './app.scss';
import { database } from './Database';
import { TopLabelsWidget } from "./widgets/TopLabelsWidget";
import { ProblemsWidget } from './widgets/ProblemsWidget';
import { AuthorsWidget } from './widgets/AuthorsWidget';

export function init(fakeData: boolean) {
    const widgets = [
        new ProblemsWidget(),
        new AuthorsWidget(),
        new TopLabelsWidget(),
    ];
    
    let loaderPromise = fakeData ? database.loadFakeData() : database.loadByGraphQL();
    loaderPromise.then(()=>{
        widgets.forEach(w => w.render());
    });
}

