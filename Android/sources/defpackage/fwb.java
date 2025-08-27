package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: fwb  reason: default package */
public final class fwb {
    public final owb a;
    public final List b;
    public final List c;

    public fwb(owb owb, List list, List list2) {
        this.a = owb;
        this.b = list;
        this.c = list2;
    }

    public static fwb a(fwb fwb, owb owb, List list, int i) {
        if ((i & 2) != 0) {
            list = fwb.b;
        }
        return new fwb(owb, list, fwb.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwb)) {
            return false;
        }
        fwb fwb = (fwb) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) fwb.a) && Intrinsics.areEqual((Object) this.b, (Object) fwb.b) && Intrinsics.areEqual((Object) this.c, (Object) fwb.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rae.i(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(appBarState=");
        sb.append(this.a);
        sb.append(", items=");
        sb.append(this.b);
        sb.append(", commonItems=");
        return tr1.l(sb, this.c, ")");
    }

    public /* synthetic */ fwb(owb owb, List list) {
        this(owb, list, CollectionsKt.emptyList());
    }
}
