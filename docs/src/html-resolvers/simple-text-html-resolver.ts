import * as $ from 'jquery';

export function resolveAsText(data: any) {
    return $("<span>").html(data);
}