package com.google.android.gms.internal.play_billing;

import java.io.IOException;

public class zzdn extends IOException {
    public static final /* synthetic */ int a = 0;

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.internal.play_billing.zzdn, java.io.IOException] */
    public static zzdn a() {
        return new IOException("Protocol message had invalid UTF-8.");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.internal.play_billing.zzdn, java.io.IOException] */
    public static zzdn b() {
        return new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.internal.play_billing.zzdn, java.io.IOException] */
    public static zzdn c() {
        return new IOException("Failed to parse the message.");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.internal.play_billing.zzdn, java.io.IOException] */
    public static zzdn d() {
        return new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
