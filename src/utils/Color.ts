export class Color {
    constructor(
        public r: number,
        public g: number,
        public b: number) {
    }

    contrast(): Color {
        // https://stackoverflow.com/a/11868398/887149
        var yiq = ((this.r * 299) + (this.g * 587) + (this.b * 114)) / 1000;
        return yiq >= 128 ? new Color(0, 0, 0) : new Color(255, 255, 255);
    }

    toRgbString(): string {
        return `rgb(${this.r},${this.g},${this.b})`
    }

    static fromHex(hexColor: string) {
        hexColor = hexColor.replace("#", "");
        var r = parseInt(hexColor.substr(0, 2), 16);
        var g = parseInt(hexColor.substr(2, 2), 16);
        var b = parseInt(hexColor.substr(4, 2), 16);

        return new Color(r, g, b);
    }
}