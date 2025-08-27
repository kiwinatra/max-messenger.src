package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: x32  reason: default package */
public final class x32 {
    public final Boolean a;

    public x32(Boolean bool) {
        this.a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x32) && Intrinsics.areEqual((Object) this.a, (Object) ((x32) obj).a);
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
