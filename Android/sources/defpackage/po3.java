package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: po3  reason: default package */
public final class po3 {
    public static final po3 d = new po3((List) null, (List) null, (List) null);
    public final List a;
    public final List b;
    public final List c;

    public po3(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public static po3 a(po3 po3, ArrayList arrayList, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = po3.a;
        }
        List list2 = po3.b;
        List list3 = po3.c;
        po3.getClass();
        return new po3(list, list2, list3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r1.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        r1 = r1.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b() {
        /*
            r1 = this;
            java.util.List r0 = r1.a
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0025
        L_0x000c:
            java.util.List r0 = r1.b
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x0018
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0025
        L_0x0018:
            java.util.List r1 = r1.c
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L_0x0027
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r1 = 0
            goto L_0x0028
        L_0x0027:
            r1 = 1
        L_0x0028:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.po3.b():boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof po3)) {
            return false;
        }
        po3 po3 = (po3) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) po3.a) && Intrinsics.areEqual((Object) this.b, (Object) po3.b) && Intrinsics.areEqual((Object) this.c, (Object) po3.c);
    }

    public final int hashCode() {
        int i = 0;
        List list = this.a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.c;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactList(contacts=");
        sb.append(this.a);
        sb.append(", globalContacts=");
        sb.append(this.b);
        sb.append(", phonebook=");
        return tr1.l(sb, this.c, ")");
    }
}
