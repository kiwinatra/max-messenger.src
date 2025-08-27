package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: gae  reason: default package */
public final class gae {
    public final ue1 a;
    public final String b;

    public gae(ue1 ue1, String str) {
        this.a = ue1;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gae)) {
            return false;
        }
        gae gae = (gae) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) gae.a) && Intrinsics.areEqual((Object) this.b, (Object) gae.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SignalingUrlSharingInfo(initiator=" + this.a + ", url=" + this.b + ")";
    }
}
