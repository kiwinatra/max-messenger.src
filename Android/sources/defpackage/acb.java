package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: acb  reason: default package */
public final class acb {
    public final List a;
    public final long b;

    public acb(long j, List list) {
        this.a = list;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acb)) {
            return false;
        }
        acb acb = (acb) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) acb.a) && this.b == acb.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PerfSpansPreparedForEvent(spans=" + this.a + ", totalDuration=" + this.b + ")";
    }
}
