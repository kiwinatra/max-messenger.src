package com.google.android.exoplayer2.upstream;

import java.io.IOException;

public class DataSourceException extends IOException {
    public static final /* synthetic */ int b = 0;
    public final int a;

    public DataSourceException(int i) {
        this.a = i;
    }

    public DataSourceException(Throwable th, int i) {
        super(th);
        this.a = i;
    }

    public DataSourceException(String str, int i) {
        super(str);
        this.a = i;
    }

    public DataSourceException(String str, Throwable th, int i) {
        super(str, th);
        this.a = i;
    }
}
