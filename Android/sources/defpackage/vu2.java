package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: vu2  reason: default package */
public final class vu2 {
    public static final vu2 f = new vu2(uu2.c, "", z77.d, CollectionsKt.emptyList(), true);
    public final uu2 a;
    public final String b;
    public final z77 c;
    public final List d;
    public final boolean e;

    public vu2(uu2 uu2, String str, z77 z77, List list, boolean z) {
        this.a = uu2;
        this.b = str;
        this.c = z77;
        this.d = list;
        this.e = z;
    }

    public static vu2 a(vu2 vu2, uu2 uu2, z77 z77, ArrayList arrayList, boolean z, int i) {
        if ((i & 1) != 0) {
            uu2 = vu2.a;
        }
        uu2 uu22 = uu2;
        String str = vu2.b;
        if ((i & 4) != 0) {
            z77 = vu2.c;
        }
        z77 z772 = z77;
        List list = arrayList;
        if ((i & 8) != 0) {
            list = vu2.d;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            z = vu2.e;
        }
        vu2.getClass();
        return new vu2(uu22, str, z772, list2, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.vu2) r5;
        r1 = r5.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.vu2
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            vu2 r5 = (defpackage.vu2) r5
            uu2 r1 = r5.a
            uu2 r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            java.lang.String r1 = r4.b
            java.lang.String r3 = r5.b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            z77 r1 = r4.c
            z77 r3 = r5.c
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0029
            return r2
        L_0x0029:
            java.util.List r1 = r4.d
            java.util.List r3 = r5.d
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0034
            return r2
        L_0x0034:
            boolean r4 = r4.e
            boolean r5 = r5.e
            if (r4 == r5) goto L_0x003b
            return r2
        L_0x003b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vu2.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int d2 = g63.d(this.a.hashCode() * 31, 31, this.b);
        return Boolean.hashCode(this.e) + rae.i(this.d, (this.c.hashCode() + d2) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatsListSearchState(type=");
        sb.append(this.a);
        sb.append(", searchQuery=");
        sb.append(this.b);
        sb.append(", idleSearchData=");
        sb.append(this.c);
        sb.append(", searchResult=");
        sb.append(this.d);
        sb.append(", scrollToTop=");
        return tr1.m(sb, this.e, ")");
    }
}
