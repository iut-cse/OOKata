import * as $ from "jquery";

export abstract class Widget {
    protected $widget: JQuery;
    protected $header: JQuery;
    protected $body: JQuery;

    constructor(protected id: string, protected title: string) {
    }
    render() {
        this.$widget = $("<div>")
            .addClass("card")
            .addClass("border-primary");
        this.$header = $("<div>")
            .addClass("card-header widget-header")
            .addClass("text-white bg-primary")
            .appendTo(this.$widget);
        this.$body = $("<div>")
            .addClass("card-body widget-content")
            .appendTo(this.$widget);

        this.buildHeaderContent();
        this.buildBodyContent();
        $(`[data-widget-id='${this.id}']`).append(this.$widget);
    }
    buildHeaderContent(): void {
        this.$header.append(this.title);
    }
    abstract buildBodyContent(): void;
}
