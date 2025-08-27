package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: fh3  reason: default package */
public final class fh3 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final String f;
    public final int g;
    public final int h;

    public fh3(long j, long j2, long j3, long j4, long j5, String str, int i, int i2) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = str;
        this.g = i;
        this.h = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fh3)) {
            return false;
        }
        fh3 fh3 = (fh3) obj;
        return this.a == fh3.a && this.b == fh3.b && this.c == fh3.c && this.d == fh3.d && this.e == fh3.e && Intrinsics.areEqual((Object) this.f, (Object) fh3.f) && this.g == fh3.g && this.h == fh3.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + rae.h(this.g, g63.d(wzf.i(wzf.i(wzf.i(wzf.i(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConnectionStat(n=");
        sb.append(this.h);
        sb.append("|");
        sb.append(this.f);
        sb.append(":");
        sb.append(this.g);
        sb.append("|total=");
        sb.append(this.b);
        sb.append("|dns=");
        sb.append(this.c);
        sb.append("|tcp=");
        sb.append(this.d);
        sb.append("|tls=");
        return wj6.m(sb, this.e, ")");
    }
}
