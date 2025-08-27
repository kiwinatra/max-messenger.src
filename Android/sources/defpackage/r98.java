package defpackage;

import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: r98  reason: default package */
public final class r98 implements tzb {
    public static final r98 a = new Object();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof r98);
    }

    public final boolean f(lz7 lz7) {
        return ((long) ConstantsKt.MINIMUM_BLOCK_SIZE) == lz7.getItemId();
    }

    public final long getItemId() {
        return (long) ConstantsKt.MINIMUM_BLOCK_SIZE;
    }

    public final int hashCode() {
        return -95268716;
    }

    public final int i() {
        return ConstantsKt.MINIMUM_BLOCK_SIZE;
    }

    public final boolean r(Object obj) {
        return Intrinsics.areEqual((Object) this, (Object) (lz7) obj);
    }

    public final String toString() {
        return "LogoutItem";
    }
}
