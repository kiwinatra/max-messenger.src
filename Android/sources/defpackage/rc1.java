package defpackage;

import java.util.BitSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: rc1  reason: default package */
public final class rc1 extends wc1 {
    public final List b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rc1(yu6 yu6) {
        super(vag.o);
        List list = yu6 != null ? yu6.a : null;
        list = list == null ? CollectionsKt.emptyList() : list;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rc1) && Intrinsics.areEqual((Object) this.b, (Object) ((rc1) obj).b);
    }

    public final long getItemId() {
        return 222;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final int i() {
        return 222;
    }

    public final Object l(Object obj) {
        lz7 lz7 = (lz7) obj;
        rc1 rc1 = lz7 instanceof rc1 ? (rc1) lz7 : null;
        if (rc1 == null) {
            return null;
        }
        j3h j3h = new j3h(7);
        ((BitSet) j3h.a).set(0, !Intrinsics.areEqual((Object) this.b, (Object) rc1.b));
        return j3h;
    }

    public final String toString() {
        return tr1.l(new StringBuilder("Grid(opponentsPages="), this.b, ")");
    }
}
