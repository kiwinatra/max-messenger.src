package defpackage;

import java.util.Comparator;

/* renamed from: cx4  reason: default package */
public final class cx4 implements Comparator {
    public static final cx4 b = new cx4(0);
    public static final cx4 c = new cx4(1);
    public static final cx4 o = new cx4(2);
    public static final cx4 v = new cx4(3);
    public static final cx4 w = new cx4(4);
    public static final /* synthetic */ cx4 x = new cx4(5);
    public final /* synthetic */ int a;

    public /* synthetic */ cx4(int i) {
        this.a = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (r6 == null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        if (r6 != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0170, code lost:
        if (kotlin.jvm.internal.Intrinsics.compare((int) r4, (int) r5) < 0) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0173, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0182, code lost:
        if (r6 < r7) goto L_0x0174;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compare(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            r0 = -1
            r1 = 1
            r2 = 0
            int r6 = r6.a
            switch(r6) {
                case 0: goto L_0x027f;
                case 1: goto L_0x0272;
                case 2: goto L_0x0265;
                case 3: goto L_0x0258;
                case 4: goto L_0x0235;
                case 5: goto L_0x0228;
                case 6: goto L_0x021e;
                case 7: goto L_0x0209;
                case 8: goto L_0x01fc;
                case 9: goto L_0x01ef;
                case 10: goto L_0x01da;
                case 11: goto L_0x01c5;
                case 12: goto L_0x01b0;
                case 13: goto L_0x019b;
                case 14: goto L_0x0186;
                case 15: goto L_0x014f;
                case 16: goto L_0x0141;
                case 17: goto L_0x0134;
                case 18: goto L_0x0119;
                case 19: goto L_0x00ee;
                case 20: goto L_0x00d9;
                case 21: goto L_0x00c8;
                case 22: goto L_0x00af;
                case 23: goto L_0x00a5;
                case 24: goto L_0x0090;
                case 25: goto L_0x0077;
                case 26: goto L_0x005e;
                case 27: goto L_0x002a;
                case 28: goto L_0x001d;
                default: goto L_0x0008;
            }
        L_0x0008:
            k48 r8 = (defpackage.k48) r8
            long r0 = r8.v
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            k48 r7 = (defpackage.k48) r7
            long r7 = r7.v
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            int r6 = kotlin.comparisons.ComparisonsKt.compareValues(r6, r7)
            return r6
        L_0x001d:
            xxe r7 = (defpackage.xxe) r7
            java.lang.String r6 = r7.a
            xxe r8 = (defpackage.xxe) r8
            java.lang.String r7 = r8.a
            int r6 = kotlin.comparisons.ComparisonsKt.compareValues(r6, r7)
            return r6
        L_0x002a:
            jp6 r7 = (defpackage.jp6) r7
            jp6 r8 = (defpackage.jp6) r8
            androidx.recyclerview.widget.RecyclerView r6 = r7.d
            if (r6 != 0) goto L_0x0034
            r3 = r1
            goto L_0x0035
        L_0x0034:
            r3 = r2
        L_0x0035:
            androidx.recyclerview.widget.RecyclerView r4 = r8.d
            if (r4 != 0) goto L_0x003b
            r4 = r1
            goto L_0x003c
        L_0x003b:
            r4 = r2
        L_0x003c:
            if (r3 == r4) goto L_0x0043
            if (r6 != 0) goto L_0x0041
        L_0x0040:
            r0 = r1
        L_0x0041:
            r2 = r0
            goto L_0x005d
        L_0x0043:
            boolean r6 = r7.a
            boolean r3 = r8.a
            if (r6 == r3) goto L_0x004c
            if (r6 == 0) goto L_0x0040
            goto L_0x0041
        L_0x004c:
            int r6 = r8.b
            int r0 = r7.b
            int r6 = r6 - r0
            if (r6 == 0) goto L_0x0055
        L_0x0053:
            r2 = r6
            goto L_0x005d
        L_0x0055:
            int r6 = r7.c
            int r7 = r8.c
            int r6 = r6 - r7
            if (r6 == 0) goto L_0x005d
            goto L_0x0053
        L_0x005d:
            return r2
        L_0x005e:
            a89 r7 = (defpackage.a89) r7
            long r6 = r7.h()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            a89 r8 = (defpackage.a89) r8
            long r7 = r8.h()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            int r6 = kotlin.comparisons.ComparisonsKt.compareValues(r6, r7)
            return r6
        L_0x0077:
            a89 r7 = (defpackage.a89) r7
            long r6 = r7.h()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            a89 r8 = (defpackage.a89) r8
            long r7 = r8.h()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            int r6 = kotlin.comparisons.ComparisonsKt.compareValues(r6, r7)
            return r6
        L_0x0090:
            wp4 r8 = (defpackage.wp4) r8
            long r0 = r8.a
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            wp4 r7 = (defpackage.wp4) r7
            long r7 = r7.a
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            int r6 = kotlin.comparisons.ComparisonsKt.compareValues(r6, r7)
            return r6
        L_0x00a5:
            lo4 r7 = (defpackage.lo4) r7
            lo4 r8 = (defpackage.lo4) r8
            int r6 = r7.a
            int r7 = r8.a
            int r6 = r6 - r7
            return r6
        L_0x00af:
            yd4 r7 = (defpackage.yd4) r7
            yd4 r8 = (defpackage.yd4) r8
            long r6 = r7.a()
            long r3 = r8.a()
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 >= 0) goto L_0x00c0
            goto L_0x00c7
        L_0x00c0:
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x00c6
            r0 = r2
            goto L_0x00c7
        L_0x00c6:
            r0 = r1
        L_0x00c7:
            return r0
        L_0x00c8:
            java.lang.Thread r7 = (java.lang.Thread) r7
            java.lang.String r6 = r7.getName()
            java.lang.Thread r8 = (java.lang.Thread) r8
            java.lang.String r7 = r8.getName()
            int r6 = kotlin.comparisons.ComparisonsKt.compareValues(r6, r7)
            return r6
        L_0x00d9:
            a24 r7 = (defpackage.a24) r7
            long r6 = r7.a
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            a24 r8 = (defpackage.a24) r8
            long r7 = r8.a
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            int r6 = kotlin.comparisons.ComparisonsKt.compareValues(r6, r7)
            return r6
        L_0x00ee:
            java.lang.Thread r7 = (java.lang.Thread) r7
            java.lang.Thread r8 = (java.lang.Thread) r8
            r6 = 0
            if (r7 == 0) goto L_0x00fa
            java.lang.String r2 = r7.getName()
            goto L_0x00fb
        L_0x00fa:
            r2 = r6
        L_0x00fb:
            java.lang.String r3 = "main"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r3)
            if (r2 == 0) goto L_0x0104
            goto L_0x0118
        L_0x0104:
            if (r8 == 0) goto L_0x010a
            java.lang.String r6 = r8.getName()
        L_0x010a:
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r3)
            if (r6 == 0) goto L_0x0112
            r0 = r1
            goto L_0x0118
        L_0x0112:
            ew2 r6 = defpackage.f24.c
            int r0 = r6.compare(r7, r8)
        L_0x0118:
            return r0
        L_0x0119:
            android.view.View r7 = (android.view.View) r7
            android.view.View r8 = (android.view.View) r8
            java.util.WeakHashMap r6 = defpackage.gag.a
            float r6 = defpackage.v9g.m(r7)
            float r7 = defpackage.v9g.m(r8)
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 <= 0) goto L_0x012c
            goto L_0x0133
        L_0x012c:
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x0132
            r0 = r1
            goto L_0x0133
        L_0x0132:
            r0 = r2
        L_0x0133:
            return r0
        L_0x0134:
            qdb r7 = (defpackage.qdb) r7
            java.lang.String r6 = r7.b
            qdb r8 = (defpackage.qdb) r8
            java.lang.String r7 = r8.b
            int r6 = kotlin.comparisons.ComparisonsKt.compareValues(r6, r7)
            return r6
        L_0x0141:
            j53 r7 = (defpackage.j53) r7
            j53 r8 = (defpackage.j53) r8
            int r6 = r8.b()
            int r7 = r7.b()
            int r6 = r6 - r7
            return r6
        L_0x014f:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = (java.lang.String) r8
            int r6 = r7.length()
            int r3 = r8.length()
            int r6 = java.lang.Math.min(r6, r3)
            r3 = 4
        L_0x0160:
            if (r3 >= r6) goto L_0x0178
            char r4 = r7.charAt(r3)
            char r5 = r8.charAt(r3)
            if (r4 == r5) goto L_0x0176
            int r6 = kotlin.jvm.internal.Intrinsics.compare((int) r4, (int) r5)
            if (r6 >= 0) goto L_0x0173
            goto L_0x0174
        L_0x0173:
            r0 = r1
        L_0x0174:
            r2 = r0
            goto L_0x0185
        L_0x0176:
            int r3 = r3 + r1
            goto L_0x0160
        L_0x0178:
            int r6 = r7.length()
            int r7 = r8.length()
            if (r6 == r7) goto L_0x0185
            if (r6 >= r7) goto L_0x0173
            goto L_0x0174
        L_0x0185:
            return r2
        L_0x0186:
            zo3 r8 = (defpackage.zo3) r8
            boolean r6 = r8.y
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            zo3 r7 = (defpackage.zo3) r7
            boolean r7 = r7.y
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            int r6 = kotlin.comparisons.ComparisonsKt.compareValues(r6, r7)
            return r6
        L_0x019b:
            xk2 r8 = (defpackage.xk2) r8
            long r0 = r8.Y
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            xk2 r7 = (defpackage.xk2) r7
            long r7 = r7.Y
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            int r6 = kotlin.comparisons.ComparisonsKt.compareValues(r6, r7)
            return r6
        L_0x01b0:
            bd9 r7 = (defpackage.bd9) r7
            long r6 = r7.i
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            bd9 r8 = (defpackage.bd9) r8
            long r7 = r8.i
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            int r6 = kotlin.comparisons.ComparisonsKt.compareValues(r6, r7)
            return r6
        L_0x01c5:
            sd1 r7 = (defpackage.sd1) r7
            boolean r6 = r7.w
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            sd1 r8 = (defpackage.sd1) r8
            boolean r7 = r8.w
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            int r6 = kotlin.comparisons.ComparisonsKt.compareValues(r6, r7)
            return r6
        L_0x01da:
            sd1 r7 = (defpackage.sd1) r7
            boolean r6 = r7.v
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            sd1 r8 = (defpackage.sd1) r8
            boolean r7 = r8.v
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            int r6 = kotlin.comparisons.ComparisonsKt.compareValues(r6, r7)
            return r6
        L_0x01ef:
            zo0 r7 = (defpackage.zo0) r7
            zo0 r8 = (defpackage.zo0) r8
            int r6 = r7.a
            int r7 = r8.a
            int r6 = java.lang.Integer.compare(r6, r7)
            return r6
        L_0x01fc:
            fm r7 = (defpackage.fm) r7
            java.lang.String r6 = r7.a
            fm r8 = (defpackage.fm) r8
            java.lang.String r7 = r8.a
            int r6 = kotlin.comparisons.ComparisonsKt.compareValues(r6, r7)
            return r6
        L_0x0209:
            qi r7 = (defpackage.qi) r7
            int r6 = r7.c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            qi r8 = (defpackage.qi) r8
            int r7 = r8.c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r6 = kotlin.comparisons.ComparisonsKt.compareValues(r6, r7)
            return r6
        L_0x021e:
            int[] r7 = (int[]) r7
            int[] r8 = (int[]) r8
            r6 = r7[r2]
            r7 = r8[r2]
            int r6 = r6 - r7
            return r6
        L_0x0228:
            com.google.android.gms.common.api.Scope r7 = (com.google.android.gms.common.api.Scope) r7
            com.google.android.gms.common.api.Scope r8 = (com.google.android.gms.common.api.Scope) r8
            java.lang.String r6 = r7.b
            java.lang.String r7 = r8.b
            int r6 = r6.compareTo(r7)
            return r6
        L_0x0235:
            y29 r7 = (defpackage.y29) r7
            y29 r8 = (defpackage.y29) r8
            boolean r6 = r7.X
            boolean r0 = r8.X
            if (r6 == r0) goto L_0x0244
            int r6 = java.lang.Boolean.compare(r0, r6)
            goto L_0x0257
        L_0x0244:
            boolean r6 = r7.z
            boolean r0 = r8.z
            if (r6 == r0) goto L_0x024f
            int r6 = java.lang.Boolean.compare(r0, r6)
            goto L_0x0257
        L_0x024f:
            long r0 = r8.w
            long r6 = r7.w
            int r6 = kotlin.jvm.internal.Intrinsics.compare((long) r0, (long) r6)
        L_0x0257:
            return r6
        L_0x0258:
            rw8 r7 = (defpackage.rw8) r7
            rw8 r8 = (defpackage.rw8) r8
            java.lang.String r6 = r7.d
            java.lang.String r7 = r8.d
            int r6 = r6.compareToIgnoreCase(r7)
            return r6
        L_0x0265:
            rw8 r7 = (defpackage.rw8) r7
            rw8 r8 = (defpackage.rw8) r8
            java.lang.String r6 = r7.d
            java.lang.String r7 = r8.d
            int r6 = r6.compareToIgnoreCase(r7)
            return r6
        L_0x0272:
            rw8 r7 = (defpackage.rw8) r7
            rw8 r8 = (defpackage.rw8) r8
            java.lang.String r6 = r7.d
            java.lang.String r7 = r8.d
            int r6 = r6.compareToIgnoreCase(r7)
            return r6
        L_0x027f:
            ix4 r7 = (defpackage.ix4) r7
            ix4 r8 = (defpackage.ix4) r8
            java.lang.String r6 = r8.a
            java.lang.String r0 = r7.a
            int r6 = r0.compareTo(r6)
            if (r6 == 0) goto L_0x028f
        L_0x028d:
            r2 = r6
            goto L_0x029a
        L_0x028f:
            java.lang.String r6 = r7.b
            java.lang.String r7 = r8.b
            int r6 = r6.compareTo(r7)
            if (r6 == 0) goto L_0x029a
            goto L_0x028d
        L_0x029a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cx4.compare(java.lang.Object, java.lang.Object):int");
    }
}
