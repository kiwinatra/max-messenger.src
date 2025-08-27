package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ue5  reason: default package */
public final class ue5 extends v5a {
    public final ngf b;

    public ue5(igf igf) {
        super(Unit.INSTANCE);
        this.b = igf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ue5) && Intrinsics.areEqual((Object) this.b, (Object) ((ue5) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return g63.k(new StringBuilder("ShowSnackbar(text="), this.b, ")");
    }
}
