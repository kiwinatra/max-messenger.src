package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: yz0  reason: default package */
public final class yz0 {
    public final ue1 a;
    public final Long b;

    public yz0(ue1 ue1, Long l) {
        this.a = ue1;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz0)) {
            return false;
        }
        yz0 yz0 = (yz0) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) yz0.a) && Intrinsics.areEqual((Object) this.b, (Object) yz0.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "CallAsrInfo(initiatorId=" + this.a + ", movieId=" + this.b + ")";
    }
}
