package defpackage;

import kotlin.Lazy;

/* renamed from: nta  reason: default package */
public final class nta implements xt4 {
    public final String a = nta.class.getName();
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;

    public nta(Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.b = lazy;
        this.c = lazy2;
        this.d = lazy3;
    }

    public final pt4 a(pt4 pt4) {
        return pt4;
    }

    public final byte[] b(pt4 pt4) {
        return ut4.b(pt4);
    }

    public final pt4 c(pt4 pt4, Long l) {
        if (!(pt4 instanceof mta)) {
            return pt4;
        }
        mta mta = (mta) pt4;
        return new mta(mta.a, mta.b, mta.c, mta.d, l, mta.f, mta.g);
    }

    public final pt4 d(long j, qtd qtd) {
        ur7 ur7;
        nta nta;
        Long l;
        ha9 k;
        long j2 = j;
        qtd qtd2 = qtd;
        String str = qtd2.b;
        Long l2 = null;
        if (str == null || str.length() == 0) {
            nta = this;
            ur7 = null;
        } else {
            ur7 ur72 = new ur7(str, qe8.u(qtd2.d));
            nta = this;
            ur7 = ur72;
        }
        Lazy lazy = nta.c;
        Long l3 = qtd2.e;
        if (l3 != null) {
            ha9 k2 = ((fa9) lazy.getValue()).k(j2, l3.longValue());
            l = k2 != null ? Long.valueOf(k2.b) : null;
        } else {
            l = null;
        }
        Long l4 = qtd2.f;
        if (!(l4 == null || (k = ((fa9) lazy.getValue()).k(j2, l4.longValue())) == null)) {
            l2 = Long.valueOf(k.b);
        }
        return new mta(qtd2.a, ur7, l, l2, Long.valueOf(qtd2.g), true, 64);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0074: MOVE  (r8v2 java.util.Collection) = (r7v0 java.util.List)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    public final defpackage.qtd e(defpackage.pt4 r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.mta
            java.lang.String r1 = r10.a
            r2 = 0
            if (r0 != 0) goto L_0x0019
            java.lang.String r10 = "toServerDraft: Wrong draft type"
            defpackage.z68.f(r1, r10, r2)
            qtd r10 = new qtd
            r6 = 0
            r7 = 0
            r4 = 0
            r5 = 0
            r8 = 127(0x7f, float:1.78E-43)
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
        L_0x0019:
            mta r11 = (defpackage.mta) r11
            boolean r0 = r11.d()
            if (r0 == 0) goto L_0x0033
            java.lang.String r10 = "toServerDraft: draft is empty"
            defpackage.z68.f(r1, r10, r2)
            qtd r10 = new qtd
            r6 = 0
            r7 = 0
            r4 = 0
            r5 = 0
            r8 = 127(0x7f, float:1.78E-43)
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
        L_0x0033:
            ur7 r0 = r11.b
            if (r0 == 0) goto L_0x0058
            java.lang.String r3 = r0.a
            if (r3 == 0) goto L_0x0058
            kotlin.Lazy r4 = r10.d
            java.lang.Object r4 = r4.getValue()
            bud r4 = (defpackage.bud) r4
            akd r4 = (defpackage.akd) r4
            r4.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r5 = ru.ok.tamtam.android.prefs.PmsKey.f68maxmsglength
            r6 = 4000(0xfa0, float:5.605E-42)
            long r6 = (long) r6
            long r4 = r4.r(r5, r6)
            int r4 = (int) r4
            java.lang.String r3 = kotlin.text.StringsKt.take((java.lang.String) r3, (int) r4)
            r5 = r3
            goto L_0x0059
        L_0x0058:
            r5 = r2
        L_0x0059:
            r3 = 0
            if (r0 == 0) goto L_0x0065
            java.lang.String r4 = r0.a
            if (r4 == 0) goto L_0x0065
            int r4 = r4.length()
            goto L_0x0066
        L_0x0065:
            r4 = r3
        L_0x0066:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            if (r0 == 0) goto L_0x0070
            java.util.List r7 = r0.b
            goto L_0x0071
        L_0x0070:
            r7 = r2
        L_0x0071:
            if (r5 == 0) goto L_0x00cc
            r8 = r7
            java.util.Collection r8 = (java.util.Collection) r8
            if (r8 == 0) goto L_0x00cc
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x007f
            goto L_0x00cc
        L_0x007f:
            int r8 = r5.length()
            if (r8 != r4) goto L_0x0086
            goto L_0x00cc
        L_0x0086:
            java.util.Iterator r1 = r7.iterator()
        L_0x008a:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x00d1
            java.lang.Object r7 = r1.next()
            ta9 r7 = (defpackage.ta9) r7
            int r8 = r7.d
            if (r8 <= r4) goto L_0x00ab
            int r8 = r8 - r4
            r9 = 55
            ta9 r7 = defpackage.ta9.a(r7, r8, r3, r9)
            ta9 r7 = r7.b()
            if (r7 == 0) goto L_0x008a
            r6.add(r7)
            goto L_0x008a
        L_0x00ab:
            int r9 = r7.e
            int r9 = r9 + r8
            if (r9 <= r4) goto L_0x00c2
            int r8 = r4 - r8
            r9 = 47
            ta9 r7 = defpackage.ta9.a(r7, r3, r8, r9)
            ta9 r7 = r7.b()
            if (r7 == 0) goto L_0x008a
            r6.add(r7)
            goto L_0x008a
        L_0x00c2:
            ta9 r7 = r7.b()
            if (r7 == 0) goto L_0x008a
            r6.add(r7)
            goto L_0x008a
        L_0x00cc:
            java.lang.String r3 = "Don't need validate elements"
            defpackage.z68.c(r1, r3, new java.lang.Object[0])
        L_0x00d1:
            kotlin.Lazy r10 = r10.c
            java.lang.Long r1 = r11.c
            if (r1 == 0) goto L_0x00ee
            long r3 = r1.longValue()
            java.lang.Object r1 = r10.getValue()
            fa9 r1 = (defpackage.fa9) r1
            ha9 r1 = r1.r(r3)
            if (r1 == 0) goto L_0x00ee
            long r3 = r1.c
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            goto L_0x00ef
        L_0x00ee:
            r1 = r2
        L_0x00ef:
            java.lang.Long r11 = r11.d
            if (r11 == 0) goto L_0x010a
            long r3 = r11.longValue()
            java.lang.Object r10 = r10.getValue()
            fa9 r10 = (defpackage.fa9) r10
            ha9 r10 = r10.r(r3)
            if (r10 == 0) goto L_0x010a
            long r10 = r10.c
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            goto L_0x010b
        L_0x010a:
            r10 = r2
        L_0x010b:
            boolean r11 = r6.isEmpty()
            if (r11 == 0) goto L_0x0116
            if (r0 == 0) goto L_0x0115
            java.util.List r2 = r0.b
        L_0x0115:
            r6 = r2
        L_0x0116:
            java.util.List r6 = (java.util.List) r6
            java.util.ArrayList r11 = defpackage.qe8.v(r6)
            if (r11 != 0) goto L_0x0122
            java.util.List r11 = kotlin.collections.CollectionsKt.emptyList()
        L_0x0122:
            r6 = r11
            r2 = 0
            if (r1 == 0) goto L_0x012c
            long r0 = r1.longValue()
            goto L_0x012d
        L_0x012c:
            r0 = r2
        L_0x012d:
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            if (r10 == 0) goto L_0x0137
            long r2 = r10.longValue()
        L_0x0137:
            java.lang.Long r8 = java.lang.Long.valueOf(r2)
            qtd r10 = new qtd
            r9 = 69
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nta.e(pt4):qtd");
    }

    public final pt4 f(byte[] bArr) {
        return ut4.a(bArr, (m95) this.b.getValue());
    }
}
