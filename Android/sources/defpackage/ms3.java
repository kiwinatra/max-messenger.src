package defpackage;

import java.util.Comparator;

/* renamed from: ms3  reason: default package */
public final /* synthetic */ class ms3 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ ns3 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Cloneable o;

    public /* synthetic */ ms3(ns3 ns3, Object obj, Cloneable cloneable, int i) {
        this.a = i;
        this.b = ns3;
        this.c = obj;
        this.o = cloneable;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: mtb} */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ed, code lost:
        if (r1 == r0) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f0, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0105, code lost:
        if (r1 == r0) goto L_0x00f1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compare(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
            int r0 = r7.a
            switch(r0) {
                case 0: goto L_0x0084;
                default: goto L_0x0005;
            }
        L_0x0005:
            ns3 r0 = r7.b
            r0.getClass()
            java.lang.Object r1 = r7.c
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            java.lang.Object r8 = r1.invoke(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r1.invoke(r9)
            java.lang.String r9 = (java.lang.String) r9
            obe r0 = r0.a
            java.lang.Object r0 = r0.f()
            java.text.Collator r0 = (java.text.Collator) r0
            java.lang.Cloneable r7 = r7.o
            java.util.HashMap r7 = (java.util.HashMap) r7
            java.lang.Object r1 = r7.get(r8)
            java.text.CollationKey r1 = (java.text.CollationKey) r1
            if (r1 != 0) goto L_0x0039
            java.lang.String r1 = r8.toLowerCase()
            java.text.CollationKey r1 = r0.getCollationKey(r1)
            r7.put(r8, r1)
        L_0x0039:
            java.lang.Object r2 = r7.get(r9)
            java.text.CollationKey r2 = (java.text.CollationKey) r2
            if (r2 != 0) goto L_0x004c
            java.lang.String r2 = r9.toLowerCase()
            java.text.CollationKey r2 = r0.getCollationKey(r2)
            r7.put(r9, r2)
        L_0x004c:
            boolean r7 = defpackage.cvg.A(r8)
            r0 = 1
            r3 = 0
            if (r7 != 0) goto L_0x0060
            char r7 = r8.charAt(r3)
            boolean r7 = java.lang.Character.isLetter(r7)
            if (r7 == 0) goto L_0x0060
            r7 = r0
            goto L_0x0061
        L_0x0060:
            r7 = r3
        L_0x0061:
            boolean r8 = defpackage.cvg.A(r9)
            if (r8 != 0) goto L_0x0072
            char r8 = r9.charAt(r3)
            boolean r8 = java.lang.Character.isLetter(r8)
            if (r8 == 0) goto L_0x0072
            r3 = r0
        L_0x0072:
            if (r7 == 0) goto L_0x0076
            if (r3 != 0) goto L_0x007a
        L_0x0076:
            if (r7 != 0) goto L_0x007f
            if (r3 != 0) goto L_0x007f
        L_0x007a:
            int r7 = r1.compareTo(r2)
            goto L_0x0083
        L_0x007f:
            if (r7 == 0) goto L_0x0082
            r0 = -1
        L_0x0082:
            r7 = r0
        L_0x0083:
            return r7
        L_0x0084:
            vk3 r8 = (defpackage.vk3) r8
            vk3 r9 = (defpackage.vk3) r9
            ns3 r0 = r7.b
            r0.getClass()
            long r0 = r8.r()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r1 = r7.c
            java.util.Map r1 = (java.util.Map) r1
            boolean r0 = r1.containsKey(r0)
            mtb r2 = defpackage.mtb.c
            if (r0 == 0) goto L_0x00b0
            long r3 = r8.r()
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.lang.Object r0 = r1.get(r0)
            mtb r0 = (defpackage.mtb) r0
            goto L_0x00b1
        L_0x00b0:
            r0 = r2
        L_0x00b1:
            long r3 = r9.r()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            boolean r3 = r1.containsKey(r3)
            if (r3 == 0) goto L_0x00ce
            long r2 = r9.r()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r1 = r1.get(r2)
            r2 = r1
            mtb r2 = (defpackage.mtb) r2
        L_0x00ce:
            int r1 = r0.a
            r3 = 0
            r4 = 1
            r5 = -1
            int r0 = r0.b
            java.lang.Cloneable r7 = r7.o
            java.text.Collator r7 = (java.text.Collator) r7
            if (r1 != 0) goto L_0x00f3
            int r6 = r2.a
            if (r6 == 0) goto L_0x00e0
            goto L_0x00f3
        L_0x00e0:
            int r1 = r2.b
            if (r0 != r1) goto L_0x00e9
            int r7 = defpackage.ns3.a(r8, r9, r7)
            goto L_0x010c
        L_0x00e9:
            if (r1 >= r0) goto L_0x00ed
        L_0x00eb:
            r3 = r5
            goto L_0x00f1
        L_0x00ed:
            if (r1 != r0) goto L_0x00f0
            goto L_0x00f1
        L_0x00f0:
            r3 = r4
        L_0x00f1:
            r7 = r3
            goto L_0x010c
        L_0x00f3:
            if (r1 == 0) goto L_0x0108
            int r6 = r2.a
            if (r6 == 0) goto L_0x0108
            int r1 = r2.b
            if (r0 != r1) goto L_0x0102
            int r7 = defpackage.ns3.a(r8, r9, r7)
            goto L_0x010c
        L_0x0102:
            if (r1 >= r0) goto L_0x0105
            goto L_0x00eb
        L_0x0105:
            if (r1 != r0) goto L_0x00f0
            goto L_0x00f1
        L_0x0108:
            if (r1 == 0) goto L_0x010b
            r4 = r5
        L_0x010b:
            r7 = r4
        L_0x010c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ms3.compare(java.lang.Object, java.lang.Object):int");
    }
}
