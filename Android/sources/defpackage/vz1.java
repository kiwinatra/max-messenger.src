package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: vz1  reason: default package */
public final class vz1 extends wz1 {
    public final ngf a;

    public vz1(igf igf) {
        this.a = igf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vz1) && Intrinsics.areEqual((Object) this.a, (Object) ((vz1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g63.k(new StringBuilder("SomethingWentWrong(text="), this.a, ")");
    }
}
