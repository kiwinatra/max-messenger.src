package ru.ok.android.externcalls.sdk.api;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/api/JoinByIdResponse;", "", "p2pForbidden", "", "endpoint", "", "deviceIndex", "", "(ZLjava/lang/String;I)V", "getDeviceIndex", "()I", "getEndpoint", "()Ljava/lang/String;", "getP2pForbidden", "()Z", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class JoinByIdResponse {
    private final int deviceIndex;
    private final String endpoint;
    private final boolean p2pForbidden;

    public JoinByIdResponse(boolean z, String str, int i) {
        this.p2pForbidden = z;
        this.endpoint = str;
        this.deviceIndex = i;
    }

    public final int getDeviceIndex() {
        return this.deviceIndex;
    }

    public final String getEndpoint() {
        return this.endpoint;
    }

    public final boolean getP2pForbidden() {
        return this.p2pForbidden;
    }
}
