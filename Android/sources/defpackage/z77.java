package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z77  reason: default package */
public final class z77 {
    public static final z77 d = new z77(CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList());
    public final List a;
    public final List b;
    public final List c;

    public z77(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z77)) {
            return false;
        }
        z77 z77 = (z77) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) z77.a) && Intrinsics.areEqual((Object) this.b, (Object) z77.b) && Intrinsics.areEqual((Object) this.c, (Object) z77.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rae.i(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IdleSearchData(recentContacts=");
        sb.append(this.a);
        sb.append(", recentSearch=");
        sb.append(this.b);
        sb.append(", allContacts=");
        return tr1.l(sb, this.c, ")");
    }
}
