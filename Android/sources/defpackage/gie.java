package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: gie  reason: default package */
public final class gie {
    public final String a = "DEF_SSL";
    public final long b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;
    public final int g;
    public final long h;
    public final long i;
    public final int j;
    public final long k;

    public gie(long j2, long j3, int i2, long j4, long j5, int i3, long j6, long j7, int i4) {
        long j8 = j4;
        long j9 = j6;
        this.b = j2;
        this.c = j3;
        this.d = i2;
        this.e = j8;
        this.f = j5;
        this.g = i3;
        this.h = j9;
        this.i = j7;
        this.j = i4;
        this.k = j8 + j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gie)) {
            return false;
        }
        gie gie = (gie) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) gie.a) && this.b == gie.b && this.c == gie.c && this.d == gie.d && this.e == gie.e && this.f == gie.f && this.g == gie.g && this.h == gie.h && this.i == gie.i && this.j == gie.j;
    }

    public final int hashCode() {
        return Integer.hashCode(this.j) + wzf.i(wzf.i(rae.h(this.g, wzf.i(wzf.i(rae.h(this.d, wzf.i(wzf.i(rae.h(0, wzf.i(wzf.i(rae.h(0, wzf.i(wzf.i(this.a.hashCode() * 31, 31, 0), 31, 0), 31), 31, 0), 31, 0), 31), 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), 31), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SslProviderStat(");
        sb.append(this.a);
        sb.append("|init=0/0_0|scc=0/0_0|sfc=");
        sb.append(this.b);
        sb.append("/");
        sb.append(this.c);
        sb.append("_");
        sb.append(this.d);
        sb.append("|sh=");
        sb.append(this.h);
        sb.append("/");
        sb.append(this.i);
        sb.append("_");
        sb.append(this.j);
        sb.append("|sv=");
        sb.append(this.e);
        sb.append("/");
        sb.append(this.f);
        sb.append("_");
        return wj6.l(sb, this.g, ")");
    }
}
