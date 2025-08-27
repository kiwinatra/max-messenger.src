package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: nt  reason: default package */
public final class nt {
    public final zwd a;
    public final yz0 b;

    public nt(zwd zwd, yz0 yz0) {
        this.a = zwd;
        this.b = yz0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt)) {
            return false;
        }
        nt ntVar = (nt) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) ntVar.a) && Intrinsics.areEqual((Object) this.b, (Object) ntVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StartAsrRecord(sessionRoomId=" + this.a + ", callAsrInfo=" + this.b + ")";
    }
}
