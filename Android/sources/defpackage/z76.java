package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: z76  reason: default package */
public final class z76 {
    public final boolean a;
    public final List b;
    public final List c;
    public final boolean d;
    public final String e;
    public final boolean f;

    public z76(boolean z, List list, List list2, boolean z2, String str, boolean z3) {
        this.a = z;
        this.b = list;
        this.c = list2;
        this.d = z2;
        this.e = str;
        this.f = z3;
    }

    public static z76 a(z76 z76, boolean z, List list, ArrayList arrayList, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = z76.a;
        }
        boolean z3 = z;
        List list2 = arrayList;
        if ((i & 4) != 0) {
            list2 = z76.c;
        }
        List list3 = list2;
        boolean z4 = z76.d;
        String str = z76.e;
        if ((i & 32) != 0) {
            z2 = z76.f;
        }
        z76.getClass();
        return new z76(z3, list, list3, z4, str, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.z76) r5;
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
            boolean r1 = r5 instanceof defpackage.z76
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            z76 r5 = (defpackage.z76) r5
            boolean r1 = r5.a
            boolean r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            java.util.List r1 = r4.b
            java.util.List r3 = r5.b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            java.util.List r1 = r4.c
            java.util.List r3 = r5.c
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0029
            return r2
        L_0x0029:
            boolean r1 = r4.d
            boolean r3 = r5.d
            if (r1 == r3) goto L_0x0030
            return r2
        L_0x0030:
            java.lang.String r1 = r4.e
            java.lang.String r3 = r5.e
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x003b
            return r2
        L_0x003b:
            boolean r4 = r4.f
            boolean r5 = r5.f
            if (r4 == r5) goto L_0x0042
            return r2
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z76.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + g63.d(g63.e(rae.i(this.c, rae.i(this.b, Boolean.hashCode(this.a) * 31, 31), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "State(foldersNotCreated=" + this.a + ", folders=" + this.b + ", selectedFolders=" + this.c + ", canSubmitForRemove=" + this.d + ", submitRemoveText=" + this.e + ", isSubmitEnabled=" + this.f + ")";
    }
}
