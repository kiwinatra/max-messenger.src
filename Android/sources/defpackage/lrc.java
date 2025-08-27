package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: lrc  reason: default package */
public final class lrc {
    public final hqc a;
    public final long b;
    public final long c;
    public final String d;
    public final boolean e;

    public lrc(hqc hqc, long j, long j2, String str, boolean z) {
        this.a = hqc;
        this.b = j;
        this.c = j2;
        this.d = str;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lrc)) {
            return false;
        }
        lrc lrc = (lrc) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) lrc.a) && this.b == lrc.b && this.c == lrc.c && Intrinsics.areEqual((Object) this.d, (Object) lrc.d) && this.e == lrc.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + g63.d(wzf.i(wzf.i(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddReaction(selfReaction=");
        sb.append(this.a);
        sb.append(", msgLocalId=");
        sb.append(this.b);
        sb.append(", msgTime=");
        sb.append(this.c);
        sb.append(", effectLottieUrl=");
        sb.append(this.d);
        sb.append(", checkIsVisibleInWindow=");
        return tr1.m(sb, this.e, ")");
    }
}
