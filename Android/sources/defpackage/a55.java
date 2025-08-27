package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: a55  reason: default package */
public final class a55 implements c55 {
    public final gpe a;

    public a55(gpe gpe) {
        this.a = gpe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a55) && Intrinsics.areEqual((Object) this.a, (Object) ((a55) obj).a);
    }

    public final int hashCode() {
        gpe gpe = this.a;
        if (gpe == null) {
            return 0;
        }
        return gpe.hashCode();
    }

    public final String toString() {
        return "EmptyDialog(sticker=" + this.a + ")";
    }
}
