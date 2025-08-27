package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: y4b  reason: default package */
public final class y4b implements lz7 {
    public static final y4b o = new y4b(0, x4b.b, CollectionsKt.emptyList());
    public final int a;
    public final x4b b;
    public final List c;

    public y4b(int i, x4b x4b, List list) {
        this.a = i;
        this.b = x4b;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        y4b y4b = (y4b) obj;
        if (this.a != y4b.a || this.b != y4b.b) {
            return false;
        }
        List list = this.c;
        int size = list.size();
        List list2 = y4b.c;
        if (size != list2.size()) {
            return false;
        }
        Iterable<Pair> zip = CollectionsKt.zip(list, list2);
        if (!(zip instanceof Collection) || !((Collection) zip).isEmpty()) {
            for (Pair pair : zip) {
                if (!Intrinsics.areEqual((Object) (na1) pair.component1(), (Object) (na1) pair.component2())) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean f(lz7 lz7) {
        y4b y4b = (y4b) lz7;
        return y4b.b == this.b && y4b.a == this.a;
    }

    public final long getItemId() {
        return (long) this.a;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a * 31)) * 31);
    }

    public final int i() {
        return 1;
    }

    public final Object l(Object obj) {
        y4b y4b = (y4b) ((lz7) obj);
        return Intrinsics.areEqual((Object) this, (Object) y4b) ? CollectionsKt.emptyList() : CollectionsKt.listOf(new w4b(y4b));
    }

    public final boolean r(Object obj) {
        lz7 lz7 = (lz7) obj;
        y4b y4b = (y4b) lz7;
        return Intrinsics.areEqual((Object) lz7, (Object) this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpponentsPageState(pagePosition=");
        sb.append(this.a);
        sb.append(", pageType=");
        sb.append(this.b);
        sb.append(", opponents=");
        return tr1.l(sb, this.c, ")");
    }
}
