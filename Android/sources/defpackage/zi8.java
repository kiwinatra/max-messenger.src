package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: zi8  reason: default package */
public final class zi8 implements Comparable {
    public final String a;
    public final long b;
    public final long c;
    public final TimeUnit o;
    public final String v;
    public final long w;

    public zi8(String str, long j, long j2, TimeUnit timeUnit, String str2, long j3) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.o = timeUnit;
        this.v = str2;
        this.w = j3;
    }

    public final int compareTo(Object obj) {
        zi8 zi8 = (zi8) obj;
        TimeUnit timeUnit = this.o;
        int compare = Intrinsics.compare(timeUnit.toNanos(this.b) + timeUnit.toNanos(this.c), zi8.o.toNanos(zi8.b) + zi8.o.toNanos(zi8.c));
        Integer valueOf = Integer.valueOf(compare);
        if (compare == 0) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.intValue() : this.a.compareTo(zi8.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi8)) {
            return false;
        }
        zi8 zi8 = (zi8) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) zi8.a) && this.b == zi8.b && this.c == zi8.c && this.o == zi8.o && Intrinsics.areEqual((Object) this.v, (Object) zi8.v) && this.w == zi8.w;
    }

    public final int hashCode() {
        return Long.hashCode(this.w) + g63.d((this.o.hashCode() + wzf.i(wzf.i(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.v);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Measurement(taskName=");
        sb.append(this.a);
        sb.append(", dependencyDuration=");
        sb.append(this.b);
        sb.append(", executionDuration=");
        sb.append(this.c);
        sb.append(", unit=");
        sb.append(this.o);
        sb.append(", threadName=");
        sb.append(this.v);
        sb.append(", startTime=");
        return wj6.m(sb, this.w, ")");
    }
}
