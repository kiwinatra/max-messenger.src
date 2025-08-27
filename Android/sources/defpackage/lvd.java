package defpackage;

import java.util.Collections;

/* renamed from: lvd  reason: default package */
public final class lvd extends ivd {
    public final String x0;
    public final l20 y0;
    public final boolean z0;

    public lvd(kvd kvd) {
        super(kvd);
        this.x0 = kvd.m;
        this.y0 = (l20) kvd.o;
        this.z0 = kvd.n;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, m20] */
    public final ga9 A() {
        boolean z = this.z0;
        l20 l20 = this.y0;
        if (z) {
            j10 j = l20.j();
            j.w = z10.b;
            l20 = j.a();
        }
        ? obj = new Object();
        obj.a = Collections.singletonList(l20);
        w28 c = obj.c();
        ga9 ga9 = new ga9();
        ga9.n = c;
        String str = this.x0;
        if (!cvg.A(str)) {
            ga9.g = str;
        }
        ga9.F = null;
        return ga9;
    }

    public final long B(long j, a32 a32) {
        long B = super.B(j, a32);
        if (this.z0) {
            rl a = a();
            jna jna = (jna) a;
            jna.A(jna, new iw9(((ltb) jna.D()).a.n(), this.y0.g.b, j));
        }
        return B;
    }
}
