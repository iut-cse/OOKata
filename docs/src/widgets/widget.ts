import * as $ from 'jquery';

export abstract class Widget<TData> {
    constructor(
        protected id: string,
        protected title: string) {
    }

    render() {
        let $widget = $("<div>")
            .addClass("card");
        let $header = $("<div>")
            .addClass("card-header widget-header")
            .append(this.buildHeaderContent())
            .appendTo($widget);

        let $body = $("<div>")
            .addClass("card-body widget-content")
            .append(this.buildBodyContent())
            .appendTo($widget);

        $(`[data-widget-id='${this.id}']`).append($widget);
    }

    buildHeaderContent(): JQuery | string {
        return this.title;
    }

    abstract buildBodyContent(): JQuery | string;
    abstract async loadData(): Promise<TData[]>;
}