package defpackage;

import java.util.BitSet;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: tc1  reason: default package */
public final class tc1 extends wc1 {
    public final ni1 b;

    public tc1(ni1 ni1) {
        super(vag.c);
        this.b = ni1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tc1) && Intrinsics.areEqual((Object) this.b, (Object) ((tc1) obj).b);
    }

    public final long getItemId() {
        return 225;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final int i() {
        return 225;
    }

    public final Object l(Object obj) {
        lz7 lz7 = (lz7) obj;
        tc1 tc1 = lz7 instanceof tc1 ? (tc1) lz7 : null;
        if (tc1 == null) {
            return null;
        }
        j3h j3h = new j3h(7);
        ((BitSet) j3h.a).set(0, !Intrinsics.areEqual((Object) this.b, (Object) tc1.b));
        return j3h;
    }

    public final String toString() {
        return "Sharing(sharingState=" + this.b + ")";
    }
}
