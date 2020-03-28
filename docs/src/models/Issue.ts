import { Reactions } from "./Reactions";
import { User } from "./User";
import { Label } from "./Label";
export interface Issue {
    number: number;
    html_url: string;
    title: string;
    state: "open" | "closed";
    comments: number;
    created_at: string;
    user: User;
    labels: Label;
    reactions: Reactions;
}
