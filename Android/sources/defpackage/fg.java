package defpackage;

import java.io.Closeable;

/* renamed from: fg  reason: default package */
public final class fg implements Closeable {
    public final int a;
    public final y33 b;

    public fg(int i, jd4 jd4) {
        this.a = i;
        this.b = jd4;
    }

    public final void close() {
        this.b.close();
    }
}
