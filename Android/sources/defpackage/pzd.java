package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: pzd  reason: default package */
public final class pzd implements tzd {
    public final sh3 a;

    public pzd(sh3 sh3) {
        this.a = sh3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pzd) && Intrinsics.areEqual((Object) this.a, (Object) ((pzd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ConnectionInfo(event=" + this.a + ")";
    }
}
