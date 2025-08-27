package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: zq  reason: default package */
public final class zq {
    public final Boolean a;

    public zq(Boolean bool) {
        this.a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zq) && Intrinsics.areEqual((Object) this.a, (Object) ((zq) obj).a);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "Selection(isSelected=" + this.a + ")";
    }
}
