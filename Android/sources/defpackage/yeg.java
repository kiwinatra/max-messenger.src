package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* renamed from: yeg  reason: default package */
public final class yeg {
    public final String a;
    public final long b;
    public final long c;
    public final Thread d;
    public final List e;

    public yeg(String str, long j, long j2, Thread thread, List list) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = thread;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yeg)) {
            return false;
        }
        yeg yeg = (yeg) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) yeg.a) && Duration.m1358equalsimpl0(this.b, yeg.b) && Duration.m1358equalsimpl0(this.c, yeg.c) && Intrinsics.areEqual((Object) this.d, (Object) yeg.d) && Intrinsics.areEqual((Object) this.e, (Object) yeg.e);
    }

    public final int hashCode() {
        int r0 = (Duration.m1381hashCodeimpl(this.c) + ((Duration.m1381hashCodeimpl(this.b) + (this.a.hashCode() * 31)) * 31)) * 31;
        Thread thread = this.d;
        return this.e.hashCode() + ((r0 + (thread == null ? 0 : thread.hashCode())) * 31);
    }

    public final String toString() {
        String r0 = Duration.m1402toStringimpl(this.b);
        String r1 = Duration.m1402toStringimpl(this.c);
        StringBuilder sb = new StringBuilder("WatchdogTask(submitThread=");
        sb.append(this.a);
        sb.append(", submitTime=");
        sb.append(r0);
        sb.append(", startTime=");
        sb.append(r1);
        sb.append(", runningThread=");
        sb.append(this.d);
        sb.append(", stacktrace=");
        return tr1.l(sb, this.e, ")");
    }
}
