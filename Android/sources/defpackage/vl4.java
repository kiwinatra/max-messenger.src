package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.uuid.Uuid;

/* renamed from: vl4  reason: default package */
public final class vl4 implements tzb {
    public final ngf a;

    public vl4(igf igf) {
        this.a = igf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vl4) && Intrinsics.areEqual((Object) this.a, (Object) ((vl4) obj).a);
    }

    public final boolean f(lz7 lz7) {
        return ((long) Uuid.SIZE_BITS) == lz7.getItemId();
    }

    public final long getItemId() {
        return (long) Uuid.SIZE_BITS;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final int i() {
        return Uuid.SIZE_BITS;
    }

    public final boolean r(Object obj) {
        return Intrinsics.areEqual((Object) this, (Object) (lz7) obj);
    }

    public final String toString() {
        return g63.k(new StringBuilder("DeleteProfileItem(text="), this.a, ")");
    }
}
