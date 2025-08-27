package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: n19  reason: default package */
public final class n19 implements o19 {
    public final s58 a;
    public final float b;
    public final long c;

    public n19(s58 s58, float f, long j) {
        this.a = s58;
        this.b = f;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n19)) {
            return false;
        }
        n19 n19 = (n19) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) n19.a) && Float.compare(this.b, n19.b) == 0 && this.c == n19.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + g63.c(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SendLocation(locationData=");
        sb.append(this.a);
        sb.append(", zoom=");
        sb.append(this.b);
        sb.append(", livePeriod=");
        return wj6.m(sb, this.c, ")");
    }
}
