package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: bxb  reason: default package */
public final class bxb extends hxb {
    public final ngf b;

    public bxb(kgf kgf) {
        this.b = kgf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bxb) && Intrinsics.areEqual((Object) this.b, (Object) ((bxb) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return g63.k(new StringBuilder("ExternalShareLink(text="), this.b, ")");
    }
}
