package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: y46  reason: default package */
public final class y46 {
    public static final y46 d = new y46(CollectionsKt.emptyList(), CollectionsKt.emptyList(), (tf6) null);
    public final List a;
    public final List b;
    public final tf6 c;

    public y46(List list, List list2, tf6 tf6) {
        this.a = list;
        this.b = list2;
        this.c = tf6;
    }

    public static y46 a(y46 y46) {
        return new y46(y46.a, y46.b, (tf6) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0037 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0038 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.y46
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            y46 r5 = (defpackage.y46) r5
            java.util.List r1 = r5.a
            java.util.List r3 = r4.a
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r1)
            if (r1 != 0) goto L_0x0017
            return r2
        L_0x0017:
            java.util.List r1 = r4.b
            java.util.List r3 = r5.b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0022
            return r2
        L_0x0022:
            tf6 r4 = r4.c
            tf6 r5 = r5.c
            if (r4 != 0) goto L_0x002e
            if (r5 != 0) goto L_0x002c
            r4 = r0
            goto L_0x0035
        L_0x002c:
            r4 = r2
            goto L_0x0035
        L_0x002e:
            if (r5 != 0) goto L_0x0031
            goto L_0x002c
        L_0x0031:
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
        L_0x0035:
            if (r4 != 0) goto L_0x0038
            return r2
        L_0x0038:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y46.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = rae.i(this.b, this.a.hashCode() * 31, 31);
        tf6 tf6 = this.c;
        return i + (tf6 == null ? 0 : tf6.hashCode());
    }

    public final String toString() {
        String str;
        tf6 tf6 = this.c;
        if (tf6 == null) {
            str = "null";
        } else {
            str = "FolderTutor(folderTutorType=" + tf6 + ")";
        }
        return "State(folders=" + this.a + ", recommendedFolders=" + this.b + ", tutor=" + str + ")";
    }
}
