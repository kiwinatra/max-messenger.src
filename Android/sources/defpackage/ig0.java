package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ig0  reason: default package */
public final class ig0 {
    public static final ig0 c = new ig0(new Object(), new Object());
    public final hg0 a;
    public final gg0 b;

    public ig0(hg0 hg0, gg0 gg0) {
        this.a = hg0;
        this.b = gg0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig0)) {
            return false;
        }
        ig0 ig0 = (ig0) obj;
        ig0.getClass();
        return Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) this.a, (Object) ig0.a) && Intrinsics.areEqual((Object) this.b, (Object) ig0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BadNetworkIndicatorConfig(calcNetworkStatusConfig=null, reportNetworkStatusConfig=null, signalingConfig=" + this.a + ", debugLoggingConfig=" + this.b + ")";
    }
}
