package defpackage;

import kotlin.math.MathKt;

/* renamed from: jz0  reason: default package */
public final class jz0 extends zyc {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;
    public final int o;

    public jz0(int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density);
                this.c = MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
                this.o = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
                return;
            case 3:
                this.b = MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density);
                this.c = MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
                this.o = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
                return;
            case 4:
                this.b = MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
                this.c = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
                this.o = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
                return;
            case 5:
                this.b = MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
                this.c = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
                this.o = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
                return;
            case 6:
                this.b = MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density);
                this.c = MathKt.roundToInt(((float) 7) * vo4.c().getDisplayMetrics().density);
                this.o = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
                return;
            default:
                float f = (float) 8;
                this.b = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
                MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density);
                float f2 = (float) 16;
                this.c = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2);
                this.o = MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density);
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: k1e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(android.graphics.Rect r6, android.view.View r7, androidx.recyclerview.widget.RecyclerView r8, defpackage.lzc r9) {
        /*
            r5 = this;
            int r9 = r5.a
            switch(r9) {
                case 0: goto L_0x02a4;
                case 1: goto L_0x0249;
                case 2: goto L_0x0222;
                case 3: goto L_0x0197;
                case 4: goto L_0x011b;
                case 5: goto L_0x009f;
                case 6: goto L_0x006a;
                default: goto L_0x0005;
            }
        L_0x0005:
            tyc r9 = r8.getAdapter()
            if (r9 != 0) goto L_0x000c
            goto L_0x0069
        L_0x000c:
            int r7 = androidx.recyclerview.widget.RecyclerView.S(r7)
            if (r7 < 0) goto L_0x0069
            int r9 = r9.j()
            if (r7 >= r9) goto L_0x0069
            r9 = 81
            float r9 = (float) r9
            android.content.res.Resources r0 = defpackage.vo4.c()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r9 = r9 * r0
            int r9 = kotlin.math.MathKt.roundToInt((float) r9)
            int r0 = r5.b
            int r9 = defpackage.hsg.e(r8, r9, r0)
            androidx.recyclerview.widget.GridLayoutManager r1 = defpackage.y7e.u(r8)
            if (r1 == 0) goto L_0x0069
            xu6 r1 = r1.K
            if (r1 == 0) goto L_0x0069
            int r1 = r1.b(r7, r0)
            androidx.recyclerview.widget.GridLayoutManager r8 = defpackage.y7e.u(r8)
            r2 = 1
            if (r8 == 0) goto L_0x004e
            xu6 r8 = r8.K
            if (r8 == 0) goto L_0x004e
            int r7 = r8.c(r7)
            goto L_0x004f
        L_0x004e:
            r7 = r2
        L_0x004f:
            if (r7 != r0) goto L_0x0056
            int r5 = r5.o
            r6.top = r5
            goto L_0x0069
        L_0x0056:
            int r5 = r5.c
            int r5 = r5 / 2
            r6.bottom = r5
            r6.top = r5
            int r5 = r1 * r9
            int r5 = r5 / r0
            r6.left = r5
            int r1 = r1 + r2
            int r1 = r1 * r9
            int r1 = r1 / r0
            int r9 = r9 - r1
            r6.right = r9
        L_0x0069:
            return
        L_0x006a:
            pzc r9 = r8.U(r7)
            if (r9 != 0) goto L_0x0071
            goto L_0x009e
        L_0x0071:
            int r7 = androidx.recyclerview.widget.RecyclerView.S(r7)
            tyc r8 = r8.getAdapter()
            int r9 = r9.w
            if (r9 == 0) goto L_0x009e
            if (r8 == 0) goto L_0x009e
            if (r7 < 0) goto L_0x009e
            int r8 = r8.j()
            if (r7 >= r8) goto L_0x009e
            int r8 = r5.o
            r6.left = r8
            r6.right = r8
            int r8 = r5.b
            if (r7 != 0) goto L_0x0094
            r6.top = r8
            goto L_0x009e
        L_0x0094:
            int r7 = defpackage.m1b.s
            if (r9 != r7) goto L_0x009e
            r6.top = r8
            int r5 = r5.c
            r6.bottom = r5
        L_0x009e:
            return
        L_0x009f:
            r8.getClass()
            int r7 = androidx.recyclerview.widget.RecyclerView.S(r7)
            tyc r8 = r8.getAdapter()
            boolean r9 = r8 instanceof defpackage.c3e
            r0 = 0
            if (r9 == 0) goto L_0x00b2
            c3e r8 = (defpackage.c3e) r8
            goto L_0x00b3
        L_0x00b2:
            r8 = r0
        L_0x00b3:
            if (r8 != 0) goto L_0x00b7
            goto L_0x011a
        L_0x00b7:
            if (r7 < 0) goto L_0x011a
            int r9 = r8.j()
            if (r7 >= r9) goto L_0x011a
            java.lang.Object r9 = r8.E(r7)
            lz7 r9 = (defpackage.lz7) r9
            boolean r1 = r9 instanceof defpackage.xmd
            if (r1 == 0) goto L_0x00cc
            xmd r9 = (defpackage.xmd) r9
            goto L_0x00cd
        L_0x00cc:
            r9 = r0
        L_0x00cd:
            int r1 = r7 + 1
            lz7 r8 = r8.I(r1)
            boolean r1 = r8 instanceof defpackage.xmd
            if (r1 == 0) goto L_0x00da
            xmd r8 = (defpackage.xmd) r8
            goto L_0x00db
        L_0x00da:
            r8 = r0
        L_0x00db:
            r1 = 0
            if (r7 != 0) goto L_0x00e0
            r7 = 1
            goto L_0x00e1
        L_0x00e0:
            r7 = r1
        L_0x00e1:
            int r2 = r5.o
            r6.left = r2
            r6.right = r2
            int r2 = r5.b
            if (r7 == 0) goto L_0x00ed
            r7 = r2
            goto L_0x00ee
        L_0x00ed:
            r7 = r1
        L_0x00ee:
            r6.top = r7
            if (r9 == 0) goto L_0x00fb
            int r7 = r9.s()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x00fc
        L_0x00fb:
            r7 = r0
        L_0x00fc:
            if (r8 == 0) goto L_0x0106
            int r8 = r8.s()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
        L_0x0106:
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r0)
            if (r7 != 0) goto L_0x010e
            r1 = r2
            goto L_0x0118
        L_0x010e:
            if (r9 == 0) goto L_0x0118
            boolean r7 = r9.k()
            if (r7 != 0) goto L_0x0118
            int r1 = r5.c
        L_0x0118:
            r6.bottom = r1
        L_0x011a:
            return
        L_0x011b:
            r8.getClass()
            int r7 = androidx.recyclerview.widget.RecyclerView.S(r7)
            tyc r8 = r8.getAdapter()
            boolean r9 = r8 instanceof defpackage.k2e
            r0 = 0
            if (r9 == 0) goto L_0x012e
            k2e r8 = (defpackage.k2e) r8
            goto L_0x012f
        L_0x012e:
            r8 = r0
        L_0x012f:
            if (r8 != 0) goto L_0x0133
            goto L_0x0196
        L_0x0133:
            if (r7 < 0) goto L_0x0196
            int r9 = r8.j()
            if (r7 >= r9) goto L_0x0196
            java.lang.Object r9 = r8.E(r7)
            lz7 r9 = (defpackage.lz7) r9
            boolean r1 = r9 instanceof defpackage.bnd
            if (r1 == 0) goto L_0x0148
            bnd r9 = (defpackage.bnd) r9
            goto L_0x0149
        L_0x0148:
            r9 = r0
        L_0x0149:
            int r1 = r7 + 1
            lz7 r8 = r8.I(r1)
            boolean r1 = r8 instanceof defpackage.bnd
            if (r1 == 0) goto L_0x0156
            bnd r8 = (defpackage.bnd) r8
            goto L_0x0157
        L_0x0156:
            r8 = r0
        L_0x0157:
            r1 = 0
            if (r7 != 0) goto L_0x015c
            r7 = 1
            goto L_0x015d
        L_0x015c:
            r7 = r1
        L_0x015d:
            int r2 = r5.o
            r6.left = r2
            r6.right = r2
            int r2 = r5.b
            if (r7 == 0) goto L_0x0169
            r7 = r2
            goto L_0x016a
        L_0x0169:
            r7 = r1
        L_0x016a:
            r6.top = r7
            if (r9 == 0) goto L_0x0177
            int r7 = r9.s()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0178
        L_0x0177:
            r7 = r0
        L_0x0178:
            if (r8 == 0) goto L_0x0182
            int r8 = r8.s()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
        L_0x0182:
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r0)
            if (r7 != 0) goto L_0x018a
            r1 = r2
            goto L_0x0194
        L_0x018a:
            if (r9 == 0) goto L_0x0194
            boolean r7 = r9.k()
            if (r7 != 0) goto L_0x0194
            int r1 = r5.c
        L_0x0194:
            r6.bottom = r1
        L_0x0196:
            return
        L_0x0197:
            r8.getClass()
            int r7 = androidx.recyclerview.widget.RecyclerView.S(r7)
            tyc r8 = r8.getAdapter()
            boolean r9 = r8 instanceof defpackage.rd3
            r0 = 0
            if (r9 == 0) goto L_0x01aa
            rd3 r8 = (defpackage.rd3) r8
            goto L_0x01ab
        L_0x01aa:
            r8 = r0
        L_0x01ab:
            if (r8 != 0) goto L_0x01af
            goto L_0x0221
        L_0x01af:
            android.util.Pair r8 = r8.G(r7)
            java.lang.Object r9 = r8.first
            boolean r9 = r9 instanceof defpackage.k1e
            if (r9 == 0) goto L_0x01be
            java.lang.Object r9 = r8.second
            java.lang.Integer r9 = (java.lang.Integer) r9
            goto L_0x01c3
        L_0x01be:
            r9 = -1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
        L_0x01c3:
            java.lang.Object r8 = r8.first
            boolean r1 = r8 instanceof defpackage.k1e
            if (r1 == 0) goto L_0x01d0
            boolean r1 = r8 instanceof defpackage.k1e
            if (r1 == 0) goto L_0x01d0
            r0 = r8
            k1e r0 = (defpackage.k1e) r0
        L_0x01d0:
            if (r0 != 0) goto L_0x01d3
            goto L_0x0221
        L_0x01d3:
            int r8 = r0.j()
            int r1 = r9.intValue()
            if (r1 < 0) goto L_0x0221
            if (r1 >= r8) goto L_0x0221
            int r8 = r9.intValue()
            java.lang.Object r8 = r0.E(r8)
            lz7 r8 = (defpackage.lz7) r8
            i1e r8 = (defpackage.i1e) r8
            int r1 = r9.intValue()
            r2 = 1
            int r1 = r1 + r2
            lz7 r0 = r0.I(r1)
            i1e r0 = (defpackage.i1e) r0
            int r9 = r9.intValue()
            r1 = 0
            if (r9 != 0) goto L_0x0201
            if (r7 != 0) goto L_0x0201
            goto L_0x0202
        L_0x0201:
            r2 = r1
        L_0x0202:
            int r7 = r5.o
            r6.left = r7
            r6.right = r7
            if (r2 == 0) goto L_0x020d
            int r7 = r5.b
            goto L_0x020e
        L_0x020d:
            r7 = r1
        L_0x020e:
            r6.top = r7
            if (r0 == 0) goto L_0x021d
            int r7 = r8.s()
            int r8 = r0.s()
            if (r7 != r8) goto L_0x021d
            goto L_0x021f
        L_0x021d:
            int r1 = r5.c
        L_0x021f:
            r6.bottom = r1
        L_0x0221:
            return
        L_0x0222:
            r8.getClass()
            int r7 = androidx.recyclerview.widget.RecyclerView.S(r7)
            tyc r8 = r8.getAdapter()
            if (r8 == 0) goto L_0x0248
            if (r7 < 0) goto L_0x0248
            int r8 = r8.j()
            if (r7 >= r8) goto L_0x0248
            int r8 = r5.o
            r6.left = r8
            r6.right = r8
            if (r7 != 0) goto L_0x0244
            int r5 = r5.b
            r6.top = r5
            goto L_0x0248
        L_0x0244:
            int r5 = r5.c
            r6.top = r5
        L_0x0248:
            return
        L_0x0249:
            tyc r9 = r8.getAdapter()
            if (r9 != 0) goto L_0x0250
            goto L_0x02a3
        L_0x0250:
            int r7 = androidx.recyclerview.widget.RecyclerView.S(r7)
            if (r7 < 0) goto L_0x02a3
            int r0 = r9.j()
            if (r7 >= r0) goto L_0x02a3
            r0 = 32
            float r0 = (float) r0
            android.content.res.Resources r1 = defpackage.vo4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r0 = r0 * r1
            int r0 = kotlin.math.MathKt.roundToInt((float) r0)
            int r1 = r5.b
            int r0 = defpackage.hsg.e(r8, r0, r1)
            androidx.recyclerview.widget.GridLayoutManager r8 = defpackage.y7e.u(r8)
            if (r8 == 0) goto L_0x02a3
            xu6 r8 = r8.K
            if (r8 == 0) goto L_0x02a3
            int r8 = r8.b(r7, r1)
            int r7 = r9.l(r7)
            int r9 = defpackage.zua.q
            if (r7 != r9) goto L_0x028f
            int r5 = r5.o
            r6.top = r5
            goto L_0x02a3
        L_0x028f:
            int r5 = r5.c
            int r5 = r5 / 2
            r6.bottom = r5
            r6.top = r5
            int r5 = r8 * r0
            int r5 = r5 / r1
            r6.left = r5
            int r8 = r8 + 1
            int r8 = r8 * r0
            int r8 = r8 / r1
            int r0 = r0 - r8
            r6.right = r0
        L_0x02a3:
            return
        L_0x02a4:
            r8.getClass()
            int r7 = androidx.recyclerview.widget.RecyclerView.S(r7)
            tyc r8 = r8.getAdapter()
            boolean r9 = r8 instanceof defpackage.bd1
            r0 = 0
            if (r9 == 0) goto L_0x02b7
            bd1 r8 = (defpackage.bd1) r8
            goto L_0x02b8
        L_0x02b7:
            r8 = r0
        L_0x02b8:
            if (r8 != 0) goto L_0x02bc
            goto L_0x031b
        L_0x02bc:
            if (r7 < 0) goto L_0x031b
            int r9 = r8.j()
            if (r7 >= r9) goto L_0x031b
            java.lang.Object r9 = r8.E(r7)
            lz7 r9 = (defpackage.lz7) r9
            boolean r1 = r9 instanceof defpackage.kz0
            if (r1 == 0) goto L_0x02d1
            kz0 r9 = (defpackage.kz0) r9
            goto L_0x02d2
        L_0x02d1:
            r9 = r0
        L_0x02d2:
            int r1 = r7 + 1
            lz7 r1 = r8.I(r1)
            boolean r2 = r1 instanceof defpackage.kz0
            if (r2 == 0) goto L_0x02df
            kz0 r1 = (defpackage.kz0) r1
            goto L_0x02e0
        L_0x02df:
            r1 = r0
        L_0x02e0:
            r2 = 1
            r3 = 0
            if (r7 != 0) goto L_0x02e6
            r4 = r2
            goto L_0x02e7
        L_0x02e6:
            r4 = r3
        L_0x02e7:
            int r8 = r8.j()
            int r8 = r8 - r2
            if (r7 != r8) goto L_0x02ef
            goto L_0x02f0
        L_0x02ef:
            r2 = r3
        L_0x02f0:
            int r7 = r5.c
            r6.left = r7
            r6.right = r7
            int r7 = r5.b
            if (r4 == 0) goto L_0x02fc
            r8 = r3
            goto L_0x02fd
        L_0x02fc:
            r8 = r7
        L_0x02fd:
            r6.top = r8
            if (r2 == 0) goto L_0x0304
            int r3 = r5.o
            goto L_0x0319
        L_0x0304:
            if (r9 == 0) goto L_0x030b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            goto L_0x030c
        L_0x030b:
            r5 = r0
        L_0x030c:
            if (r1 == 0) goto L_0x0312
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
        L_0x0312:
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r0)
            if (r5 != 0) goto L_0x0319
            r3 = r7
        L_0x0319:
            r6.bottom = r3
        L_0x031b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz0.f(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, lzc):void");
    }

    public jz0(int i, int i2, int i3) {
        this.a = i3;
        switch (i3) {
            case 7:
                this.b = i;
                this.c = i2;
                this.o = MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density);
                return;
            default:
                this.b = i;
                this.c = i2;
                this.o = MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density);
                return;
        }
    }
}
