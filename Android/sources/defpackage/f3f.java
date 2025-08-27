package defpackage;

import java.io.Closeable;

/* renamed from: f3f  reason: default package */
public interface f3f extends Closeable {
    af6 getReadableDatabase();

    af6 getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z);
}
