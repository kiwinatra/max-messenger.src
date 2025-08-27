package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: e7d  reason: default package */
public final class e7d {
    public final ue1 a;
    public final String b;
    public final zwd c;

    public e7d(ue1 ue1, String str, zwd zwd) {
        this.a = ue1;
        this.b = str;
        this.c = zwd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7d)) {
            return false;
        }
        e7d e7d = (e7d) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) e7d.a) && Intrinsics.areEqual((Object) this.b, (Object) e7d.b) && Intrinsics.areEqual((Object) this.c, (Object) e7d.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "RoomSignalingUrlSharingInfo(initiator=" + this.a + ", url=" + this.b + ", roomId=" + this.c + ")";
    }
}
