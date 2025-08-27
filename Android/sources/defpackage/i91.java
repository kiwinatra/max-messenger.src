package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: i91  reason: default package */
public final class i91 extends j91 {
    public final ngf b;

    public i91(igf igf) {
        super(0);
        this.b = igf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i91) && Intrinsics.areEqual((Object) this.b, (Object) ((i91) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return g63.k(new StringBuilder("ShowSnackbar(message="), this.b, ")");
    }
}
