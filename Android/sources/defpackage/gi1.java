package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: gi1  reason: default package */
public final class gi1 extends ji1 {
    public final ngf b;

    public gi1(igf igf) {
        this.b = igf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gi1) && Intrinsics.areEqual((Object) this.b, (Object) ((gi1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return g63.k(new StringBuilder("ShowError(textSource="), this.b, ")");
    }
}
