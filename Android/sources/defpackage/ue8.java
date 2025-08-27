package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: ue8  reason: default package */
public final class ue8 extends zyc {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object o;

    public /* synthetic */ ue8(ji7 ji7, ji7 ji72, ji7 ji73, int i) {
        this.a = i;
        this.b = ji7;
        this.c = ji72;
        this.o = ji73;
    }

    public static Integer i(RecyclerView recyclerView, int i) {
        tyc adapter = recyclerView.getAdapter();
        if (adapter != null) {
            return Integer.valueOf(adapter.l(i));
        }
        return null;
    }

    public void f(Rect rect, View view, RecyclerView recyclerView, lzc lzc) {
        int i;
        int i2;
        switch (this.a) {
            case 0:
                pzc U = recyclerView.U(view);
                if (U != null && (i = U.w) != 0) {
                    int i3 = 536870911 & i;
                    ji7 ji7 = (ji7) this.b;
                    rect.left = ji7.b(i3);
                    rect.right = ji7.b(i3);
                    if (!tf6.W(i)) {
                        if (U.q() != 0 && !tf6.V(i)) {
                            rect.top = ((ji7) this.c).b(i3);
                        }
                        if (U.q() != lzc.b() - 1 && !tf6.U(i)) {
                            rect.bottom = ((ji7) this.o).b(i3);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                pzc U2 = recyclerView.U(view);
                if (U2 != null && (i2 = U2.w) != 0) {
                    int i4 = 536870911 & i2;
                    ji7 ji72 = (ji7) this.b;
                    rect.left = ji72.b(i4);
                    rect.right = ji72.b(i4);
                    if ((1073741824 & i2) == 0) {
                        if (U2.q() != 0 && (Integer.MIN_VALUE & i2) == 0) {
                            rect.top = ((ji7) this.c).b(i4);
                        }
                        if (U2.q() != lzc.b() - 1 && (536870912 & i2) == 0) {
                            rect.bottom = ((ji7) this.o).b(i4);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                super.f(rect, view, recyclerView, lzc);
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: android.view.ViewOutlineProvider} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01d7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(android.graphics.Canvas r12, androidx.recyclerview.widget.RecyclerView r13, defpackage.lzc r14) {
        /*
            r11 = this;
            int r12 = r11.a
            switch(r12) {
                case 2: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            r12 = 48
            float r12 = (float) r12
            android.content.res.Resources r14 = defpackage.vo4.c()
            android.util.DisplayMetrics r14 = r14.getDisplayMetrics()
            float r14 = r14.density
            float r12 = r12 * r14
            int r12 = kotlin.math.MathKt.roundToInt((float) r12)
            r14 = 4
            float r14 = (float) r14
            android.content.res.Resources r0 = defpackage.vo4.c()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r14 = r14 * r0
            int r14 = kotlin.math.MathKt.roundToInt((float) r14)
            r0 = 0
            r1 = r0
        L_0x002b:
            int r2 = r13.getChildCount()
            r3 = 1
            if (r1 >= r2) goto L_0x0034
            r2 = r3
            goto L_0x0035
        L_0x0034:
            r2 = r0
        L_0x0035:
            if (r2 == 0) goto L_0x01e0
            int r2 = r1 + 1
            android.view.View r1 = r13.getChildAt(r1)
            if (r1 == 0) goto L_0x01da
            boolean r4 = r1 instanceof defpackage.h0g
            r5 = 0
            if (r4 == 0) goto L_0x0047
            h0g r1 = (defpackage.h0g) r1
            goto L_0x0048
        L_0x0047:
            r1 = r5
        L_0x0048:
            if (r1 != 0) goto L_0x004c
            goto L_0x01d7
        L_0x004c:
            r13.getClass()
            int r4 = androidx.recyclerview.widget.RecyclerView.S(r1)
            tyc r6 = r13.getAdapter()
            if (r6 == 0) goto L_0x0062
            int r6 = r6.j()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x0063
        L_0x0062:
            r6 = r5
        L_0x0063:
            r7 = -1
            if (r4 == r7) goto L_0x01e0
            if (r6 != 0) goto L_0x006a
            goto L_0x01e0
        L_0x006a:
            java.lang.Object r7 = r11.b
            lr0 r7 = (defpackage.lr0) r7
            if (r4 != 0) goto L_0x008c
            int r4 = r1.getHeight()
            int r5 = r12 + r14
            if (r4 == r5) goto L_0x0089
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            r4.height = r5
            int r4 = r1.getPaddingLeft()
            int r5 = r1.getPaddingRight()
            r1.setPadding(r4, r14, r5, r0)
        L_0x0089:
            r5 = r7
            goto L_0x01cb
        L_0x008c:
            java.lang.Integer r8 = i(r13, r4)
            int r9 = defpackage.gua.i
            java.lang.Object r10 = r11.o
            lr0 r10 = (defpackage.lr0) r10
            if (r8 != 0) goto L_0x0099
            goto L_0x00bb
        L_0x0099:
            int r8 = r8.intValue()
            if (r8 != r9) goto L_0x00bb
            int r4 = r1.getHeight()
            int r5 = r12 + r14
            if (r4 == r5) goto L_0x00b8
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            r4.height = r5
            int r4 = r1.getPaddingLeft()
            int r5 = r1.getPaddingRight()
            r1.setPadding(r4, r0, r5, r14)
        L_0x00b8:
            r5 = r10
            goto L_0x01cb
        L_0x00bb:
            int r8 = r6.intValue()
            int r8 = r8 - r3
            if (r4 != r8) goto L_0x0101
            java.lang.Integer r8 = i(r13, r4)
            int r9 = defpackage.gua.l
            if (r8 != 0) goto L_0x00cb
            goto L_0x0101
        L_0x00cb:
            int r8 = r8.intValue()
            if (r8 != r9) goto L_0x0101
            int r8 = r4 + -1
            java.lang.Integer r8 = i(r13, r8)
            if (r8 != 0) goto L_0x00da
            goto L_0x00e0
        L_0x00da:
            int r8 = r8.intValue()
            if (r8 == r9) goto L_0x0101
        L_0x00e0:
            int r4 = r1.getHeight()
            int r5 = r14 * 2
            int r5 = r5 + r12
            if (r4 == r5) goto L_0x00fa
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            r4.height = r5
            int r4 = r1.getPaddingLeft()
            int r5 = r1.getPaddingRight()
            r1.setPadding(r4, r14, r5, r14)
        L_0x00fa:
            java.lang.Object r4 = r11.c
            r5 = r4
            n04 r5 = (defpackage.n04) r5
            goto L_0x01cb
        L_0x0101:
            int r8 = r6.intValue()
            int r8 = r8 - r3
            if (r4 != r8) goto L_0x0141
            java.lang.Integer r8 = i(r13, r4)
            int r9 = defpackage.gua.l
            if (r8 != 0) goto L_0x0111
            goto L_0x0141
        L_0x0111:
            int r8 = r8.intValue()
            if (r8 != r9) goto L_0x0141
            int r8 = r4 + -1
            java.lang.Integer r8 = i(r13, r8)
            if (r8 != 0) goto L_0x0120
            goto L_0x0126
        L_0x0120:
            int r8 = r8.intValue()
            if (r8 == r9) goto L_0x0141
        L_0x0126:
            int r4 = r1.getHeight()
            int r5 = r12 + r14
            if (r4 == r5) goto L_0x00b8
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            r4.height = r5
            int r4 = r1.getPaddingLeft()
            int r5 = r1.getPaddingRight()
            r1.setPadding(r4, r0, r5, r14)
            goto L_0x00b8
        L_0x0141:
            int r6 = r6.intValue()
            int r6 = r6 - r3
            if (r4 != r6) goto L_0x0181
            java.lang.Integer r6 = i(r13, r4)
            int r8 = defpackage.gua.l
            if (r6 != 0) goto L_0x0151
            goto L_0x0181
        L_0x0151:
            int r6 = r6.intValue()
            if (r6 != r8) goto L_0x0181
            int r6 = r4 + -1
            java.lang.Integer r6 = i(r13, r6)
            if (r6 != 0) goto L_0x0160
            goto L_0x0181
        L_0x0160:
            int r6 = r6.intValue()
            if (r6 != r8) goto L_0x0181
            int r4 = r1.getHeight()
            int r5 = r12 + r14
            if (r4 == r5) goto L_0x00b8
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            r4.height = r5
            int r4 = r1.getPaddingLeft()
            int r5 = r1.getPaddingRight()
            r1.setPadding(r4, r0, r5, r14)
            goto L_0x00b8
        L_0x0181:
            java.lang.Integer r6 = i(r13, r4)
            int r8 = defpackage.gua.l
            if (r6 != 0) goto L_0x018a
            goto L_0x01ba
        L_0x018a:
            int r6 = r6.intValue()
            if (r6 != r8) goto L_0x01ba
            int r4 = r4 + -1
            java.lang.Integer r4 = i(r13, r4)
            if (r4 != 0) goto L_0x0199
            goto L_0x019f
        L_0x0199:
            int r4 = r4.intValue()
            if (r4 == r8) goto L_0x01ba
        L_0x019f:
            int r4 = r1.getHeight()
            int r5 = r12 + r14
            if (r4 == r5) goto L_0x0089
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            r4.height = r5
            int r4 = r1.getPaddingLeft()
            int r5 = r1.getPaddingRight()
            r1.setPadding(r4, r14, r5, r0)
            goto L_0x0089
        L_0x01ba:
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            r4.height = r12
            int r4 = r1.getPaddingLeft()
            int r6 = r1.getPaddingRight()
            r1.setPadding(r4, r0, r6, r0)
        L_0x01cb:
            r1.setOutlineProvider(r5)
            android.view.ViewOutlineProvider r4 = r1.getOutlineProvider()
            if (r4 == 0) goto L_0x01d7
            r1.setClipToOutline(r3)
        L_0x01d7:
            r1 = r2
            goto L_0x002b
        L_0x01da:
            java.lang.IndexOutOfBoundsException r11 = new java.lang.IndexOutOfBoundsException
            r11.<init>()
            throw r11
        L_0x01e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ue8.g(android.graphics.Canvas, androidx.recyclerview.widget.RecyclerView, lzc):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ue8(int r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r0.a = r1
            switch(r1) {
                case 2: goto L_0x027d;
                default: goto L_0x0009;
            }
        L_0x0009:
            r1 = 12
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r3 = kotlin.math.MathKt.roundToInt((float) r2)
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r4 = kotlin.math.MathKt.roundToInt((float) r2)
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r5 = kotlin.math.MathKt.roundToInt((float) r2)
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r6 = kotlin.math.MathKt.roundToInt((float) r2)
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r7 = kotlin.math.MathKt.roundToInt((float) r2)
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r8 = kotlin.math.MathKt.roundToInt((float) r2)
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r9 = kotlin.math.MathKt.roundToInt((float) r2)
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r10 = kotlin.math.MathKt.roundToInt((float) r2)
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r12 = kotlin.math.MathKt.roundToInt((float) r2)
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r14 = kotlin.math.MathKt.roundToInt((float) r2)
            r2 = 24
            float r2 = (float) r2
            android.content.res.Resources r11 = defpackage.vo4.c()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r2 = r2 * r11
            int r15 = kotlin.math.MathKt.roundToInt((float) r2)
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r16 = kotlin.math.MathKt.roundToInt((float) r2)
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r1 = r1 * r2
            int r17 = kotlin.math.MathKt.roundToInt((float) r1)
            r11 = 1024(0x400, float:1.435E-42)
            r13 = 512(0x200, float:7.175E-43)
            bz9 r1 = defpackage.y7e.D(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r2 = 8
            float r3 = (float) r2
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r3
            int r5 = kotlin.math.MathKt.roundToInt((float) r4)
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r3
            int r6 = kotlin.math.MathKt.roundToInt((float) r4)
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r3
            int r7 = kotlin.math.MathKt.roundToInt((float) r4)
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r3
            int r8 = kotlin.math.MathKt.roundToInt((float) r4)
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r3
            int r9 = kotlin.math.MathKt.roundToInt((float) r4)
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r3
            int r10 = kotlin.math.MathKt.roundToInt((float) r4)
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r3
            int r11 = kotlin.math.MathKt.roundToInt((float) r4)
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r3
            int r12 = kotlin.math.MathKt.roundToInt((float) r4)
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r3
            int r14 = kotlin.math.MathKt.roundToInt((float) r4)
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r3
            int r16 = kotlin.math.MathKt.roundToInt((float) r4)
            r4 = 6
            float r4 = (float) r4
            android.content.res.Resources r13 = defpackage.vo4.c()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r13.density
            float r4 = r4 * r13
            int r17 = kotlin.math.MathKt.roundToInt((float) r4)
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r3
            int r18 = kotlin.math.MathKt.roundToInt((float) r4)
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r3 = r3 * r4
            int r19 = kotlin.math.MathKt.roundToInt((float) r3)
            r13 = 1024(0x400, float:1.435E-42)
            r15 = 512(0x200, float:7.175E-43)
            bz9 r3 = defpackage.y7e.D(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            float r2 = (float) r2
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r2
            int r5 = kotlin.math.MathKt.roundToInt((float) r4)
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r2
            int r6 = kotlin.math.MathKt.roundToInt((float) r4)
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r2
            int r7 = kotlin.math.MathKt.roundToInt((float) r4)
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r2
            int r8 = kotlin.math.MathKt.roundToInt((float) r4)
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r2
            int r9 = kotlin.math.MathKt.roundToInt((float) r4)
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r2
            int r10 = kotlin.math.MathKt.roundToInt((float) r4)
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r2
            int r11 = kotlin.math.MathKt.roundToInt((float) r4)
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r2
            int r12 = kotlin.math.MathKt.roundToInt((float) r4)
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r2
            int r14 = kotlin.math.MathKt.roundToInt((float) r4)
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r2
            int r16 = kotlin.math.MathKt.roundToInt((float) r4)
            r4 = 3
            float r4 = (float) r4
            android.content.res.Resources r13 = defpackage.vo4.c()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r13.density
            float r4 = r4 * r13
            int r17 = kotlin.math.MathKt.roundToInt((float) r4)
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r2
            int r18 = kotlin.math.MathKt.roundToInt((float) r4)
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r2 = r2 * r4
            int r19 = kotlin.math.MathKt.roundToInt((float) r2)
            r13 = 512(0x200, float:7.175E-43)
            r15 = 1024(0x400, float:1.435E-42)
            bz9 r2 = defpackage.y7e.D(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r4 = 0
            r0.<init>(r1, r3, r2, r4)
            return
        L_0x027d:
            r20.<init>()
            lr0 r1 = new lr0
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r3 = 1098907648(0x41800000, float:16.0)
            float r2 = r2 * r3
            r4 = 1
            r1.<init>(r2, r4)
            r0.b = r1
            n04 r1 = new n04
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r3
            r1.<init>(r2)
            r0.c = r1
            lr0 r1 = new lr0
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r3
            r3 = 0
            r1.<init>(r2, r3)
            r0.o = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ue8.<init>(int):void");
    }
}
