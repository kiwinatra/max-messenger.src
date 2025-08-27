package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ae7  reason: default package */
public final class ae7 implements tzb {
    public final ngf a;

    public ae7(ggf ggf) {
        this.a = ggf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ae7) && Intrinsics.areEqual((Object) this.a, (Object) ((ae7) obj).a);
    }

    public final boolean f(lz7 lz7) {
        return ((long) 64) == lz7.getItemId();
    }

    public final long getItemId() {
        return (long) 64;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final int i() {
        return 64;
    }

    public final boolean r(Object obj) {
        return Intrinsics.areEqual((Object) this, (Object) (lz7) obj);
    }

    public final String toString() {
        return g63.k(new StringBuilder("InactiveTimeDeleteProfileItem(text="), this.a, ")");
    }
}
