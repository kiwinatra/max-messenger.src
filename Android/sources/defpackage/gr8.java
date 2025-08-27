package defpackage;

import android.net.Uri;
import java.util.Collections;

/* renamed from: gr8  reason: default package */
public final class gr8 implements jv0 {
    public static final zc8 w = new zc8(23);
    public final String a;
    public final zq8 b;
    public final vq8 c;
    public final ts8 o;
    public final rq8 v;

    static {
        oq8 oq8 = new oq8();
        lx5 lx5 = tb7.b;
        k0d k0d = k0d.v;
        Collections.emptyList();
        k0d k0d2 = k0d.v;
        oq8.b();
        ts8 ts8 = ts8.Q0;
    }

    public gr8(String str, rq8 rq8, zq8 zq8, vq8 vq8, ts8 ts8) {
        this.a = str;
        this.b = zq8;
        this.c = vq8;
        this.o = ts8;
        this.v = rq8;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [pq8, rq8] */
    public static gr8 a(Uri uri) {
        Uri uri2 = uri;
        oq8 oq8 = new oq8();
        lx5 lx5 = tb7.b;
        k0d k0d = k0d.v;
        return new gr8("", new pq8(oq8), uri2 != null ? new zq8(uri2, (cvg) null, Collections.emptyList(), k0d.v) : null, new vq8(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), ts8.Q0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr8)) {
            return false;
        }
        gr8 gr8 = (gr8) obj;
        return t0g.a(this.a, gr8.a) && this.v.equals(gr8.v) && t0g.a(this.b, gr8.b) && t0g.a(this.c, gr8.c) && t0g.a(this.o, gr8.o);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        zq8 zq8 = this.b;
        int hashCode2 = zq8 != null ? zq8.hashCode() : 0;
        int hashCode3 = this.c.hashCode();
        return this.o.hashCode() + ((this.v.hashCode() + ((hashCode3 + ((hashCode + hashCode2) * 31)) * 31)) * 31);
    }
}
