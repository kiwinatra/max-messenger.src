package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: u7e  reason: default package */
public final class u7e implements tzb {
    public final o54 a;

    public u7e(o54 o54) {
        this.a = o54;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7e)) {
            return false;
        }
        return Intrinsics.areEqual((Object) this.a, (Object) ((u7e) obj).a);
    }

    public final boolean f(lz7 lz7) {
        return ((long) 16) == lz7.getItemId();
    }

    public final long getItemId() {
        return (long) 16;
    }

    public final int hashCode() {
        o54 o54 = this.a;
        return Integer.hashCode(-2147483632) + ((o54 == null ? 0 : o54.hashCode()) * 31);
    }

    public final int i() {
        return -2147483632;
    }

    public final Object l(Object obj) {
        lz7 lz7 = (lz7) obj;
        if (!(lz7 instanceof u7e)) {
            return null;
        }
        return new k0c(((u7e) lz7).a);
    }

    public final boolean r(Object obj) {
        return Intrinsics.areEqual((Object) this, (Object) (lz7) obj);
    }

    public final String toString() {
        return "ShortLinkInputItem(state=" + this.a + ", viewType=-2147483632)";
    }
}
