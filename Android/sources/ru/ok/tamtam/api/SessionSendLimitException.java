package ru.ok.tamtam.api;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/tamtam/api/SessionSendLimitException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "tamtam-java-sdk"}, k = 1, mv = {2, 0, 0})
public final class SessionSendLimitException extends RuntimeException {
    public final int a;
    public final int b;
    public final String c = "ONEME-13309";

    public SessionSendLimitException(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final String getMessage() {
        return "Send tasks limit=" + this.a + " reached, tasks=" + this.b;
    }
}
