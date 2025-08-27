package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: szd  reason: default package */
public final class szd implements tzd {
    public final vxd a;

    public szd(vxd vxd) {
        this.a = vxd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof szd) && Intrinsics.areEqual((Object) this.a, (Object) ((szd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SessionsInfo(event=" + this.a + ")";
    }
}
