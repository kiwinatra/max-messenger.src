package defpackage;

import java.util.BitSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: vc1  reason: default package */
public final class vc1 extends wc1 {
    public final List b;
    public final gd8 c;
    public final v4b o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vc1(nge nge) {
        super(vag.b);
        v4b v4b = null;
        List list = nge != null ? nge.a : null;
        list = list == null ? CollectionsKt.emptyList() : list;
        gd8 gd8 = nge != null ? nge.b : null;
        v4b = nge != null ? nge.c : v4b;
        this.b = list;
        this.c = gd8;
        this.o = v4b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vc1)) {
            return false;
        }
        vc1 vc1 = (vc1) obj;
        return Intrinsics.areEqual((Object) this.b, (Object) vc1.b) && Intrinsics.areEqual((Object) this.c, (Object) vc1.c) && Intrinsics.areEqual((Object) this.o, (Object) vc1.o);
    }

    public final long getItemId() {
        return 111;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        int i = 0;
        gd8 gd8 = this.c;
        int hashCode2 = (hashCode + (gd8 == null ? 0 : gd8.hashCode())) * 31;
        v4b v4b = this.o;
        if (v4b != null) {
            i = v4b.hashCode();
        }
        return hashCode2 + i;
    }

    public final int i() {
        return 111;
    }

    public final Object l(Object obj) {
        lz7 lz7 = (lz7) obj;
        j3h j3h = null;
        vc1 vc1 = lz7 instanceof vc1 ? (vc1) lz7 : null;
        if (vc1 != null) {
            j3h = new j3h(7);
            BitSet bitSet = (BitSet) j3h.a;
            boolean z = false;
            bitSet.set(0, !Intrinsics.areEqual((Object) this.b, (Object) vc1.b));
            if (!Intrinsics.areEqual((Object) this.c, (Object) vc1.c) || !Intrinsics.areEqual((Object) this.o, (Object) vc1.o)) {
                z = true;
            }
            bitSet.set(1, z);
        }
        return j3h;
    }

    public final String toString() {
        return "Speaker(opponentsPages=" + this.b + ", mainOpponentState=" + this.c + ", opponentPipState=" + this.o + ")";
    }
}
