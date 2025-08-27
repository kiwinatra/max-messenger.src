package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: vvc  reason: default package */
public final class vvc implements xvc {
    public final ngf a;

    public vvc(igf igf) {
        this.a = igf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vvc) && Intrinsics.areEqual((Object) this.a, (Object) ((vvc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g63.k(new StringBuilder("ShowSnackbar(textSource="), this.a, ")");
    }
}
