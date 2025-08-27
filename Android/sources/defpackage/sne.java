package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: sne  reason: default package */
public final class sne implements h74 {
    public final h74 a;
    public long b;
    public Uri c = Uri.EMPTY;
    public Map o = Collections.emptyMap();

    public sne(h74 h74) {
        h74.getClass();
        this.a = h74;
    }

    public final long N(p74 p74) {
        this.c = p74.a;
        this.o = Collections.emptyMap();
        h74 h74 = this.a;
        long N = h74.N(p74);
        Uri uri = h74.getUri();
        uri.getClass();
        this.c = uri;
        this.o = h74.x();
        return N;
    }

    public final void O(arf arf) {
        arf.getClass();
        this.a.O(arf);
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
