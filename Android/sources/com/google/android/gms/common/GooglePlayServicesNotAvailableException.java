package com.google.android.gms.common;

public final class GooglePlayServicesNotAvailableException extends Exception {
    public final int a;

    public GooglePlayServicesNotAvailableException(int i) {
        this.a = i;
    }
}
