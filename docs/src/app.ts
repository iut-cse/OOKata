import './app.scss';
import { TopProblemsWidget } from "./widgets/TopProblemsWidget";
import { database } from './Database';
import { TopAuthorsByScoreWidget } from "./widgets/TopAuthorsByScoreWidget";
import { TopAuthorsByProblemCountWidget } from "./widgets/TopAuthorsByProblemCountWidget";
import { TopLabelsWidget } from "./widgets/TopLabelsWidget";

export function init(fakeData: boolean) {
    const widgets = [
        new TopProblemsWidget(),
        new TopAuthorsByScoreWidget(),
        new TopAuthorsByProblemCountWidget(),
        new TopLabelsWidget(),
    ];
    
    let loaderPromise = fakeData ? database.loadFakeData() : database.loadByGraphQL();
    loaderPromise.then(()=>{
        widgets.forEach(w => w.render());
    });
}

