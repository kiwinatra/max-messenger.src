package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: nc8  reason: default package */
public final class nc8 {
    public final String a;
    public final long b;
    public final long c;
    public final long d;

    public nc8(long j, long j2, long j3, String str) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nc8)) {
            return false;
        }
        nc8 nc8 = (nc8) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) nc8.a) && this.b == nc8.b && this.c == nc8.c && this.d == nc8.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + wzf.i(wzf.i(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LooperMessage(message=");
        sb.append(this.a);
        sb.append(", startTime=");
        sb.append(this.b);
        sb.append(", endTime=");
        sb.append(this.c);
        sb.append(", messageQueueSize=");
        return wj6.m(sb, this.d, ")");
    }
}
