package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: dxb  reason: default package */
public final class dxb extends hxb {
    public final ngf b;

    public dxb(kgf kgf) {
        this.b = kgf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dxb) && Intrinsics.areEqual((Object) this.b, (Object) ((dxb) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return g63.k(new StringBuilder("ShareLinkToChat(text="), this.b, ")");
    }
}
