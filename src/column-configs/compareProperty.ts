import { ObjectIterator, map, PropertyPath } from "lodash";

export function compareProperty<TData>(property: (obj:TData)=> any) {
    
    return (a: TData, b: TData) => {
        let va = property(a)
        let vb = property(b);
        if(va > vb)
            return 1;
        else if (va < vb)
            return -1;
        else
            return 0;
    };
}