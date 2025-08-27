package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: osc  reason: default package */
public final class osc {
    public final hqc a;
    public final long b;
    public final long c;
    public final xd9 d;

    public osc(hqc hqc, long j, long j2, xd9 xd9) {
        this.a = hqc;
        this.b = j;
        this.c = j2;
        this.d = xd9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof osc)) {
            return false;
        }
        osc osc = (osc) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) osc.a) && this.b == osc.b && this.c == osc.c && Intrinsics.areEqual((Object) this.d, (Object) osc.d);
    }

    public final int hashCode() {
        int i = wzf.i(wzf.i(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        xd9 xd9 = this.d;
        return i + (xd9 == null ? 0 : xd9.hashCode());
    }

    public final String toString() {
        return "SelfReactionData(selfReaction=" + this.a + ", msgLocalId=" + this.b + ", msgServerId=" + this.c + ", reactions=" + this.d + ")";
    }
}
