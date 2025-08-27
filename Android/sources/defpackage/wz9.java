package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: wz9  reason: default package */
public final class wz9 {
    public final vz9 a;
    public final boolean b;

    public wz9(vz9 vz9, boolean z) {
        this.a = vz9;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wz9)) {
            return false;
        }
        wz9 wz9 = (wz9) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) wz9.a) && this.b == wz9.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MuteState(muteEvent=" + this.a + ", isForAll=" + this.b + ")";
    }
}
