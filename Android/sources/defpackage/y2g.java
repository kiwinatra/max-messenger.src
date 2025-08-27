package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: y2g  reason: default package */
public final class y2g {
    public final z2g a;
    public final x2g b;

    public y2g(z2g z2g, x2g x2g) {
        this.a = z2g;
        this.b = x2g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2g)) {
            return false;
        }
        y2g y2g = (y2g) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) y2g.a) && Intrinsics.areEqual((Object) this.b, (Object) y2g.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VfxColors(emptyBlock=" + this.a + ", buttonIconOverlayPlain=" + this.b + ")";
    }
}
