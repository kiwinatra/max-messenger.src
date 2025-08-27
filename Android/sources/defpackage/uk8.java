package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: uk8  reason: default package */
public final class uk8 implements wk8 {
    public final s58 a;
    public final float b;
    public final long c;

    public uk8(s58 s58, float f, long j) {
        this.a = s58;
        this.b = f;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk8)) {
            return false;
        }
        uk8 uk8 = (uk8) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) uk8.a) && Float.compare(this.b, uk8.b) == 0 && this.c == uk8.c;
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
