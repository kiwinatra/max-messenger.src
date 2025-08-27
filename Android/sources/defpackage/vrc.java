package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: vrc  reason: default package */
public final class vrc {
    public final long a;
    public final String b;
    public final hqc c;

    public vrc(long j, hqc hqc, String str) {
        this.a = j;
        this.b = str;
        this.c = hqc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrc)) {
            return false;
        }
        vrc vrc = (vrc) obj;
        return this.a == vrc.a && Intrinsics.areEqual((Object) this.b, (Object) vrc.b) && Intrinsics.areEqual((Object) this.c, (Object) vrc.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + g63.d(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "PlayingState(msgId=" + this.a + ", url=" + this.b + ", reaction=" + this.c + ")";
    }
}
