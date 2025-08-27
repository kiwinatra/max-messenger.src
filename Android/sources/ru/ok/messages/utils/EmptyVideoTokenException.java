package ru.ok.messages.utils;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/messages/utils/EmptyVideoTokenException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class EmptyVideoTokenException extends IllegalStateException {
    public final k20 a;
    public final a32 b;

    public EmptyVideoTokenException(k20 k20, a32 a32) {
        this.a = k20;
        this.b = a32;
    }

    public final String getMessage() {
        String message = getMessage();
        return "Video token is empty on forward, message=" + message + ", video=" + this.a + ", from chat=" + this.b;
    }
}
