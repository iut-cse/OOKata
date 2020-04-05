import './app.scss';
import { database } from './Database';
import { ProblemsWidget } from './widgets/ProblemsWidget';
import { AuthorsWidget } from './widgets/AuthorsWidget';
import { LabelsWidget } from './widgets/LabelsWidget';

export function init(fakeData: boolean) {
    const widgets = [
        new ProblemsWidget(),
        new AuthorsWidget(),
        new LabelsWidget(),
    ];
    
    let loaderPromise = fakeData ? database.loadFakeData() : database.loadByGraphQL();
    loaderPromise.then(()=>{
        widgets.forEach(w => w.render());
    });
}

