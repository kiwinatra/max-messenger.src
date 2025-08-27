package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: wj1  reason: default package */
public final class wj1 {
    public final zwd a;
    public final twd b;

    public wj1(zwd zwd, twd twd) {
        this.a = zwd;
        this.b = twd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj1)) {
            return false;
        }
        wj1 wj1 = (wj1) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) wj1.a) && Intrinsics.areEqual((Object) this.b, (Object) wj1.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdatedParams(roomId=" + this.a + ", room=" + this.b + ")";
    }
}
