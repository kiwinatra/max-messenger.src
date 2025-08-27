package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: v80  reason: default package */
public final class v80 extends ibf {
    public final String c;
    public final int o;
    public final long v;
    public final long w;
    public final int x;

    public v80(String str, int i, long j, long j2, int i2) {
        this.c = str;
        this.o = i;
        this.v = j;
        this.w = j2;
        this.x = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v80)) {
            return false;
        }
        v80 v80 = (v80) obj;
        return Intrinsics.areEqual((Object) this.c, (Object) v80.c) && this.o == v80.o && this.v == v80.v && this.w == v80.w && this.x == v80.x;
    }

    public final int hashCode() {
        return Integer.hashCode(this.x) + wzf.i(wzf.i(rae.h(this.o, this.c.hashCode() * 31, 31), 31, this.v), 31, this.w);
    }

    public final String toString() {
        StringBuilder p = tr1.p("Response(verifyToken='", cvg.G(this.c), "', altActionDuration=");
        p.append(this.v);
        p.append(", codeLength=");
        p.append(this.o);
        p.append(", requestMaxDuration=");
        p.append(this.w);
        p.append(", requestCountLeft=");
        return wj6.l(p, this.x, ")");
    }
}
