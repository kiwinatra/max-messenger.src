package com.google.android.gms.common.api;

public final class UnsupportedApiCallException extends UnsupportedOperationException {
    public final tj5 a;

    public UnsupportedApiCallException(tj5 tj5) {
        this.a = tj5;
    }

    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.a));
    }
}
