package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ssg  reason: default package */
public final class ssg {
    public final long a;
    public final svb b;

    public ssg(long j, svb svb) {
        this.a = j;
        this.b = svb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssg)) {
            return false;
        }
        ssg ssg = (ssg) obj;
        return this.a == ssg.a && Intrinsics.areEqual((Object) this.b, (Object) ssg.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "State(uptime=" + this.a + ", processorInfo=" + this.b + ")";
    }
}
