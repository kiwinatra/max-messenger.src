package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: zgd  reason: default package */
public final class zgd {
    public final long a;
    public final String b;
    public final ze1 c;
    public final long d;
    public final ygd e;

    public zgd(long j, String str, ze1 ze1, long j2, ygd ygd) {
        this.a = j;
        this.b = str;
        this.c = ze1;
        this.d = j2;
        this.e = ygd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgd)) {
            return false;
        }
        zgd zgd = (zgd) obj;
        return this.a == zgd.a && Intrinsics.areEqual((Object) this.b, (Object) zgd.b) && Intrinsics.areEqual((Object) this.c, (Object) zgd.c) && this.d == zgd.d && this.e == zgd.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + wzf.i((this.c.hashCode() + g63.d(Long.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        return "ScreenRecordBroadcastData(id=" + this.a + ", streamId=" + this.b + ", initiatorId=" + this.c + ", startTimeMs=" + this.d + ", recordType=" + this.e + ")";
    }
}
