import { RawLabel } from "./raw/RawLabel";
import { Problem } from "./Problem";

export class Label {
    name: string;
    color: string;
    description: string;

    problems: Problem[];

    constructor(rawLabel: RawLabel) {
        this.name = rawLabel.name;
        this.color = rawLabel.color;
        this.description = rawLabel.description;
        this.problems = [];
    }
}