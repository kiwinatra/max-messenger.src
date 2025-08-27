package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: yo3  reason: default package */
public final class yo3 {
    public final Boolean a;

    public yo3(Boolean bool) {
        this.a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yo3) && Intrinsics.areEqual((Object) this.a, (Object) ((yo3) obj).a);
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
