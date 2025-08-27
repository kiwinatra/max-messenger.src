package com.google.android.exoplayer2;

import java.io.IOException;

public class ParserException extends IOException {
    public final boolean a;
    public final int b;

    public ParserException(String str, Exception exc, boolean z, int i) {
        super(str, exc);
        this.a = z;
        this.b = i;
    }

    public static ParserException a(String str, RuntimeException runtimeException) {
        return new ParserException(str, runtimeException, true, 1);
    }

    public static ParserException b(Exception exc, String str) {
        return new ParserException(str, exc, true, 4);
    }

    public static ParserException c(String str) {
        return new ParserException(str, (Exception) null, false, 1);
    }
}
