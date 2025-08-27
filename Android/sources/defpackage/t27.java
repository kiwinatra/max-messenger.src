package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: t27  reason: default package */
public final class t27 {
    public final Boolean a;

    public t27(Boolean bool) {
        this.a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t27) && Intrinsics.areEqual((Object) this.a, (Object) ((t27) obj).a);
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
