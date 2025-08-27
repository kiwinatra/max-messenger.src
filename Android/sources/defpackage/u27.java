package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: u27  reason: default package */
public final class u27 implements lz7 {
    public final String a;
    public final Boolean b;

    public u27(String str, Boolean bool) {
        this.a = str;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u27)) {
            return false;
        }
        u27 u27 = (u27) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) u27.a) && Intrinsics.areEqual((Object) this.b, (Object) u27.b);
    }

    public final boolean f(lz7 lz7) {
        return getItemId() == lz7.getItemId();
    }

    public final long getItemId() {
        return (long) this.a.hashCode();
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final int i() {
        return 0;
    }

    public final Object l(Object obj) {
        lz7 lz7 = (lz7) obj;
        u27 u27 = lz7 instanceof u27 ? (u27) lz7 : null;
        if (u27 == null) {
            return null;
        }
        Boolean bool = this.b;
        Boolean bool2 = u27.b;
        if (!Intrinsics.areEqual((Object) bool, (Object) bool2)) {
            return new t27(bool2);
        }
        return null;
    }

    public final String toString() {
        return "HostItem(host=" + this.a + ", isSelected=" + this.b + ")";
    }
}
