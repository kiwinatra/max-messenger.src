package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: tne  reason: default package */
public final class tne implements j74 {
    public final j74 a;
    public long b;
    public Uri c = Uri.EMPTY;
    public Map o = Collections.emptyMap();

    public tne(j74 j74) {
        j74.getClass();
        this.a = j74;
    }

    public final long G(q74 q74) {
        this.c = q74.a;
        this.o = Collections.emptyMap();
        j74 j74 = this.a;
        long G = j74.G(q74);
        Uri uri = j74.getUri();
        uri.getClass();
        this.c = uri;
        this.o = j74.x();
        return G;
    }

    public final void H(brf brf) {
        brf.getClass();
        this.a.H(brf);
    }

    public final void close() {
        this.a.close();
    }

    public final Uri getUri() {
        return this.a.getUri();
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.a.read(bArr, i, i2);
        if (read != -1) {
            this.b += (long) read;
        }
        return read;
    }

    public final Map x() {
        return this.a.x();
    }
}
