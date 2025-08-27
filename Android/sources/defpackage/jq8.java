package defpackage;

import android.net.Uri;
import java.io.Closeable;

/* renamed from: jq8  reason: default package */
public final class jq8 implements tf5, Closeable {
    public final tf5 a;
    public final iq8 b;
    public final Uri c;

    public jq8(tf5 tf5, iq8 iq8) {
        this.a = tf5;
        this.b = iq8;
        Uri uri = iq8.a.getUri();
        if (uri != null) {
            this.c = uri;
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void U(xf5 xf5) {
        this.a.U(xf5);
    }

    public final void close() {
        release();
    }

    public final void d(long j, long j2) {
        this.a.d(j, j2);
    }

    public final int g(vf5 vf5, yl4 yl4) {
        return this.a.g(vf5, yl4);
    }

    public final boolean n(vf5 vf5) {
        return this.a.n(vf5);
    }

    public final void release() {
        this.a.release();
        this.b.close();
    }
}
