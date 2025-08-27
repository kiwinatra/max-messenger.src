package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: dcf  reason: default package */
public final class dcf {
    public final s58 a;
    public final long b;
    public final long c;

    public dcf(s58 s58, long j, long j2) {
        this.a = s58;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dcf)) {
            return false;
        }
        dcf dcf = (dcf) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) dcf.a) && this.b == dcf.b && this.c == dcf.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + wzf.i(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocationResult(locationData=");
        sb.append(this.a);
        sb.append(", livePeriod=");
        sb.append(this.b);
        sb.append(", zoom=");
        return wj6.m(sb, this.c, ")");
    }
}
