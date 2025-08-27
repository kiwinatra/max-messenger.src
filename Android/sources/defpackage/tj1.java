package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: tj1  reason: default package */
public final class tj1 {
    public final zwd a;
    public final twd b;

    public tj1(zwd zwd, twd twd) {
        this.a = zwd;
        this.b = twd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tj1)) {
            return false;
        }
        tj1 tj1 = (tj1) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) tj1.a) && Intrinsics.areEqual((Object) this.b, (Object) tj1.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        twd twd = this.b;
        return hashCode + (twd == null ? 0 : twd.hashCode());
    }

    public final String toString() {
        return "ActiveRoomChangedParams(roomId=" + this.a + ", room=" + this.b + ")";
    }
}
