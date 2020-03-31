import * as $ from 'jquery';

export abstract class Widget {
    constructor(
        protected id: string,
        protected title: string) {
    }

    render() {
        let $widget = $("<div>")
            .addClass("card")
            .addClass("border-primary");
        let $header = $("<div>")
            .addClass("card-header widget-header")
            .addClass("text-white bg-primary")
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
}