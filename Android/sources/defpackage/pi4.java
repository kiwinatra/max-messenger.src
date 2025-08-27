package defpackage;

/* renamed from: pi4  reason: default package */
public final class pi4 extends tge {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: qge} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: qge} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: qge} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: qge} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.util.List r13, boolean r14) {
        /*
            r12 = this;
            r0 = r13
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0007:
            boolean r1 = r0.hasNext()
            r2 = 2
            r3 = 0
            java.lang.String r4 = "Unknown visibility "
            r5 = 8
            r6 = 4
            r7 = 0
            if (r1 == 0) goto L_0x0049
            java.lang.Object r1 = r0.next()
            r8 = r1
            qge r8 = (defpackage.qge) r8
            androidx.fragment.app.a r9 = r8.c
            android.view.View r9 = r9.S0
            float r10 = r9.getAlpha()
            int r10 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x002f
            int r10 = r9.getVisibility()
            if (r10 != 0) goto L_0x002f
            goto L_0x0007
        L_0x002f:
            int r9 = r9.getVisibility()
            if (r9 == 0) goto L_0x0044
            if (r9 == r6) goto L_0x0007
            if (r9 != r5) goto L_0x003a
            goto L_0x0007
        L_0x003a:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = defpackage.wj6.h(r9, r4)
            r12.<init>(r13)
            throw r12
        L_0x0044:
            int r8 = r8.a
            if (r8 == r2) goto L_0x0007
            goto L_0x004a
        L_0x0049:
            r1 = r3
        L_0x004a:
            qge r1 = (defpackage.qge) r1
            int r0 = r13.size()
            java.util.ListIterator r0 = r13.listIterator(r0)
        L_0x0054:
            boolean r8 = r0.hasPrevious()
            if (r8 == 0) goto L_0x008e
            java.lang.Object r8 = r0.previous()
            r9 = r8
            qge r9 = (defpackage.qge) r9
            androidx.fragment.app.a r10 = r9.c
            android.view.View r10 = r10.S0
            float r11 = r10.getAlpha()
            int r11 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x0074
            int r11 = r10.getVisibility()
            if (r11 != 0) goto L_0x0074
            goto L_0x0089
        L_0x0074:
            int r10 = r10.getVisibility()
            if (r10 == 0) goto L_0x0054
            if (r10 == r6) goto L_0x0089
            if (r10 != r5) goto L_0x007f
            goto L_0x0089
        L_0x007f:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = defpackage.wj6.h(r10, r4)
            r12.<init>(r13)
            throw r12
        L_0x0089:
            int r9 = r9.a
            if (r9 != r2) goto L_0x0054
            r3 = r8
        L_0x008e:
            qge r3 = (defpackage.qge) r3
            java.lang.String r0 = "FragmentManager"
            boolean r4 = android.util.Log.isLoggable(r0, r2)
            if (r4 == 0) goto L_0x009e
            java.util.Objects.toString(r1)
            java.util.Objects.toString(r3)
        L_0x009e:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.Object r6 = kotlin.collections.CollectionsKt.last(r13)
            qge r6 = (defpackage.qge) r6
            androidx.fragment.app.a r6 = r6.c
            java.util.Iterator r7 = r13.iterator()
        L_0x00b4:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00d7
            java.lang.Object r8 = r7.next()
            qge r8 = (defpackage.qge) r8
            androidx.fragment.app.a r8 = r8.c
            kc6 r8 = r8.V0
            kc6 r9 = r6.V0
            int r10 = r9.b
            r8.b = r10
            int r10 = r9.c
            r8.c = r10
            int r10 = r9.d
            r8.d = r10
            int r9 = r9.e
            r8.e = r9
            goto L_0x00b4
        L_0x00d7:
            java.util.Iterator r13 = r13.iterator()
        L_0x00db:
            boolean r6 = r13.hasNext()
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L_0x013c
            java.lang.Object r6 = r13.next()
            qge r6 = (defpackage.qge) r6
            ji4 r9 = new ji4
            r9.<init>(r6, r14)
            r4.add(r9)
            oi4 r9 = new oi4
            if (r14 == 0) goto L_0x00f9
            if (r6 != r1) goto L_0x00fc
        L_0x00f7:
            r7 = r8
            goto L_0x00fc
        L_0x00f9:
            if (r6 != r3) goto L_0x00fc
            goto L_0x00f7
        L_0x00fc:
            r9.<init>((java.lang.Object) r6)
            int r8 = r6.a
            r10 = 2
            androidx.fragment.app.a r11 = r6.c
            if (r8 != r10) goto L_0x010f
            if (r14 == 0) goto L_0x010b
            kc6 r8 = r11.V0
            goto L_0x0117
        L_0x010b:
            r11.getClass()
            goto L_0x0117
        L_0x010f:
            if (r14 == 0) goto L_0x0114
            kc6 r8 = r11.V0
            goto L_0x0117
        L_0x0114:
            r11.getClass()
        L_0x0117:
            int r8 = r6.a
            if (r8 != r10) goto L_0x0122
            if (r14 == 0) goto L_0x0120
            kc6 r8 = r11.V0
            goto L_0x0122
        L_0x0120:
            kc6 r8 = r11.V0
        L_0x0122:
            if (r7 == 0) goto L_0x012c
            if (r14 == 0) goto L_0x0129
            kc6 r7 = r11.V0
            goto L_0x012c
        L_0x0129:
            r11.getClass()
        L_0x012c:
            r5.add(r9)
            ir1 r7 = new ir1
            r8 = 26
            r7.<init>(r8, r12, r6)
            java.util.ArrayList r6 = r6.d
            r6.add(r7)
            goto L_0x00db
        L_0x013c:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r14 = r5.iterator()
        L_0x0145:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x015c
            java.lang.Object r1 = r14.next()
            r3 = r1
            oi4 r3 = (defpackage.oi4) r3
            boolean r3 = r3.b1()
            if (r3 != 0) goto L_0x0145
            r13.add(r1)
            goto L_0x0145
        L_0x015c:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x0165:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x0175
            java.lang.Object r1 = r13.next()
            oi4 r1 = (defpackage.oi4) r1
            r1.getClass()
            goto L_0x0165
        L_0x0175:
            java.util.Iterator r13 = r14.iterator()
        L_0x0179:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0189
            java.lang.Object r14 = r13.next()
            oi4 r14 = (defpackage.oi4) r14
            r14.getClass()
            goto L_0x0179
        L_0x0189:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r1 = r4.iterator()
        L_0x0197:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x01ad
            java.lang.Object r3 = r1.next()
            ji4 r3 = (defpackage.ji4) r3
            java.lang.Object r3 = r3.a
            qge r3 = (defpackage.qge) r3
            java.util.ArrayList r3 = r3.k
            kotlin.collections.CollectionsKt__MutableCollectionsKt.addAll(r14, r3)
            goto L_0x0197
        L_0x01ad:
            boolean r14 = r14.isEmpty()
            r14 = r14 ^ r8
            java.util.Iterator r1 = r4.iterator()
            r3 = r7
        L_0x01b7:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0206
            java.lang.Object r4 = r1.next()
            ji4 r4 = (defpackage.ji4) r4
            android.view.ViewGroup r5 = r12.a
            android.content.Context r5 = r5.getContext()
            java.lang.Object r6 = r4.a
            qge r6 = (defpackage.qge) r6
            ata r5 = r4.n1(r5)
            if (r5 != 0) goto L_0x01d4
            goto L_0x01b7
        L_0x01d4:
            java.lang.Object r5 = r5.c
            android.animation.AnimatorSet r5 = (android.animation.AnimatorSet) r5
            if (r5 != 0) goto L_0x01de
            r13.add(r4)
            goto L_0x01b7
        L_0x01de:
            androidx.fragment.app.a r5 = r6.c
            java.util.ArrayList r9 = r6.k
            boolean r9 = r9.isEmpty()
            r9 = r9 ^ r8
            if (r9 == 0) goto L_0x01f3
            boolean r4 = android.util.Log.isLoggable(r0, r2)
            if (r4 == 0) goto L_0x01b7
            java.util.Objects.toString(r5)
            goto L_0x01b7
        L_0x01f3:
            int r3 = r6.a
            r5 = 3
            if (r3 != r5) goto L_0x01fa
            r6.i = r7
        L_0x01fa:
            li4 r3 = new li4
            r3.<init>(r4)
            java.util.ArrayList r4 = r6.j
            r4.add(r3)
            r3 = r8
            goto L_0x01b7
        L_0x0206:
            java.util.Iterator r12 = r13.iterator()
        L_0x020a:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x023f
            java.lang.Object r13 = r12.next()
            ji4 r13 = (defpackage.ji4) r13
            java.lang.Object r1 = r13.a
            qge r1 = (defpackage.qge) r1
            androidx.fragment.app.a r4 = r1.c
            if (r14 == 0) goto L_0x0228
            boolean r13 = android.util.Log.isLoggable(r0, r2)
            if (r13 == 0) goto L_0x020a
            java.util.Objects.toString(r4)
            goto L_0x020a
        L_0x0228:
            if (r3 == 0) goto L_0x0234
            boolean r13 = android.util.Log.isLoggable(r0, r2)
            if (r13 == 0) goto L_0x020a
            java.util.Objects.toString(r4)
            goto L_0x020a
        L_0x0234:
            ii4 r4 = new ii4
            r4.<init>(r13)
            java.util.ArrayList r13 = r1.j
            r13.add(r4)
            goto L_0x020a
        L_0x023f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi4.b(java.util.List, boolean):void");
    }
}
