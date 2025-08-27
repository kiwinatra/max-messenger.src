package defpackage;

import android.view.View;

/* renamed from: f5a  reason: default package */
public final class f5a implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ h5a b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public f5a(int i, int i2, h5a h5a) {
        this.c = i;
        this.d = i2;
        this.b = h5a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayoutChange(android.view.View r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11) {
        /*
            r2 = this;
            int r4 = r2.d
            r5 = 8
            int r6 = r2.c
            h5a r7 = r2.b
            r8 = 0
            r9 = 2
            r10 = 1
            int r11 = r2.a
            switch(r11) {
                case 0: goto L_0x0240;
                default: goto L_0x0010;
            }
        L_0x0010:
            r3.removeOnLayoutChangeListener(r2)
            android.view.View r2 = r7.getContentView()
            int r2 = r2.getMeasuredWidth()
            r3 = 16
            float r3 = (float) r3
            android.content.res.Resources r11 = defpackage.vo4.c()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            int r2 = defpackage.a81.e(r3, r11, r2)
            android.widget.TextView r3 = r7.f
            android.view.ViewGroup$LayoutParams r11 = r3.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            if (r11 == 0) goto L_0x023a
            fj3 r11 = (defpackage.fj3) r11
            r11.P = r2
            r3.setLayoutParams(r11)
            android.widget.TextView r3 = r7.e
            android.view.ViewGroup$LayoutParams r11 = r3.getLayoutParams()
            if (r11 == 0) goto L_0x0234
            fj3 r11 = (defpackage.fj3) r11
            r11.P = r2
            r3.setLayoutParams(r11)
            android.widget.TextView r2 = r7.d
            android.widget.TextView r3 = r7.f
            android.widget.TextView r11 = r7.e
            r0 = 3
            android.view.View[] r0 = new android.view.View[r0]
            r0[r8] = r2
            r0[r10] = r3
            r0[r9] = r11
            java.util.List r2 = kotlin.collections.CollectionsKt.listOf(r0)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
            boolean r3 = r2.hasNext()
            if (r3 != 0) goto L_0x006d
            r2 = 0
            goto L_0x0096
        L_0x006d:
            java.lang.Object r3 = r2.next()
            boolean r11 = r2.hasNext()
            if (r11 != 0) goto L_0x0079
        L_0x0077:
            r2 = r3
            goto L_0x0096
        L_0x0079:
            r11 = r3
            android.view.View r11 = (android.view.View) r11
            int r11 = r11.getMeasuredWidth()
        L_0x0080:
            java.lang.Object r0 = r2.next()
            r1 = r0
            android.view.View r1 = (android.view.View) r1
            int r1 = r1.getMeasuredWidth()
            if (r11 >= r1) goto L_0x008f
            r3 = r0
            r11 = r1
        L_0x008f:
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L_0x0080
            goto L_0x0077
        L_0x0096:
            android.view.View r2 = (android.view.View) r2
            if (r2 != 0) goto L_0x009c
            goto L_0x0233
        L_0x009c:
            int r2 = r2.getId()
            pj3 r3 = new pj3
            r3.<init>()
            androidx.constraintlayout.widget.ConstraintLayout r11 = r7.c
            r3.d(r11)
            android.view.View r11 = r7.g
            int r11 = r11.getId()
            r0 = 6
            r3.e(r11, r0, r2, r0)
            android.view.View r11 = r7.g
            int r11 = r11.getId()
            r1 = 7
            r3.e(r11, r1, r2, r1)
            android.view.View r11 = r7.h
            int r11 = r11.getId()
            r3.e(r11, r0, r2, r0)
            android.view.View r11 = r7.h
            int r11 = r11.getId()
            r3.e(r11, r1, r2, r1)
            androidx.constraintlayout.widget.ConstraintLayout r2 = r7.c
            r3.a(r2)
            android.view.View r2 = r7.getContentView()
            int r2 = r2.getMeasuredHeight()
            androidx.constraintlayout.widget.ConstraintLayout r3 = r7.c
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r6
            r11 = 0
            if (r3 > r2) goto L_0x0136
            boolean r2 = r7.b
            if (r2 == 0) goto L_0x00f4
            androidx.constraintlayout.widget.ConstraintLayout r2 = r7.c
            boolean r2 = defpackage.h88.L(r2)
            if (r2 != 0) goto L_0x00f4
            goto L_0x0136
        L_0x00f4:
            androidx.constraintlayout.widget.ConstraintLayout r2 = r7.c
            float r3 = (float) r4
            int r4 = r2.getMeasuredWidth()
            float r4 = (float) r4
            float r3 = r3 - r4
            float r4 = (float) r5
            android.content.res.Resources r5 = defpackage.vo4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r4 = r4 * r5
            int r4 = kotlin.math.MathKt.roundToInt((float) r4)
            float r4 = (float) r4
            float r3 = kotlin.ranges.RangesKt.coerceAtLeast((float) r3, (float) r4)
            r2.setX(r3)
            androidx.constraintlayout.widget.ConstraintLayout r2 = r7.c
            float r3 = (float) r6
            android.content.Context r4 = r2.getContext()
            int r4 = defpackage.ld9.E(r4)
            float r4 = (float) r4
            float r3 = r3 - r4
            r2.setY(r3)
            androidx.constraintlayout.widget.ConstraintLayout r2 = r7.c
            int r3 = r2.getMeasuredWidth()
            float r3 = (float) r3
            r2.setPivotX(r3)
            androidx.constraintlayout.widget.ConstraintLayout r2 = r7.c
            r2.setPivotY(r11)
            goto L_0x01e1
        L_0x0136:
            float r2 = (float) r4
            androidx.constraintlayout.widget.ConstraintLayout r3 = r7.c
            int r3 = r3.getMeasuredWidth()
            float r3 = (float) r3
            float r2 = r2 - r3
            float r3 = (float) r5
            android.content.res.Resources r5 = defpackage.vo4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r5 = r5 * r3
            int r5 = kotlin.math.MathKt.roundToInt((float) r5)
            float r5 = (float) r5
            float r2 = kotlin.ranges.RangesKt.coerceAtLeast((float) r2, (float) r5)
            androidx.constraintlayout.widget.ConstraintLayout r5 = r7.c
            float r6 = (float) r6
            android.content.Context r0 = r5.getContext()
            int r0 = defpackage.ld9.E(r0)
            float r0 = (float) r0
            float r6 = r6 - r0
            androidx.constraintlayout.widget.ConstraintLayout r0 = r7.c
            int r0 = r0.getMeasuredHeight()
            float r0 = (float) r0
            float r6 = r6 - r0
            r5.setY(r6)
            boolean r5 = r7.b
            if (r5 == 0) goto L_0x01c8
            androidx.constraintlayout.widget.ConstraintLayout r5 = r7.c
            boolean r5 = defpackage.h88.L(r5)
            if (r5 != 0) goto L_0x01c8
            androidx.constraintlayout.widget.ConstraintLayout r2 = r7.c
            int r2 = r2.getMeasuredWidth()
            float r2 = (float) r2
            float r5 = (float) r4
            float r2 = r2 + r5
            android.view.View r5 = r7.getContentView()
            int r5 = r5.getMeasuredWidth()
            android.content.res.Resources r6 = defpackage.vo4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            int r5 = defpackage.a81.e(r3, r6, r5)
            float r5 = (float) r5
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x01ad
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r3 = r3 * r2
            int r2 = kotlin.math.MathKt.roundToInt((float) r3)
            float r2 = (float) r2
            goto L_0x01c2
        L_0x01ad:
            float r2 = (float) r4
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r3 = r3 * r4
            int r3 = kotlin.math.MathKt.roundToInt((float) r3)
            float r3 = (float) r3
            float r2 = kotlin.ranges.RangesKt.coerceAtLeast((float) r2, (float) r3)
        L_0x01c2:
            androidx.constraintlayout.widget.ConstraintLayout r3 = r7.c
            r3.setPivotX(r11)
            goto L_0x01d2
        L_0x01c8:
            androidx.constraintlayout.widget.ConstraintLayout r3 = r7.c
            int r4 = r3.getMeasuredWidth()
            float r4 = (float) r4
            r3.setPivotX(r4)
        L_0x01d2:
            androidx.constraintlayout.widget.ConstraintLayout r3 = r7.c
            r3.setX(r2)
            androidx.constraintlayout.widget.ConstraintLayout r2 = r7.c
            int r3 = r2.getMeasuredHeight()
            float r3 = (float) r3
            r2.setPivotY(r3)
        L_0x01e1:
            ch r2 = r7.a
            boolean r2 = r2.q()
            if (r2 == 0) goto L_0x0233
            float[] r2 = new float[r9]
            r2 = {1056964608, 1065353216} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r2)
            e5a r3 = new e5a
            r3.<init>(r7, r10)
            r2.addListener(r3)
            g5a r3 = new g5a
            r3.<init>(r7, r10)
            r2.addUpdateListener(r3)
            float[] r3 = new float[r9]
            r3 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofFloat(r3)
            g5a r4 = new g5a
            r4.<init>(r7, r8)
            r3.addUpdateListener(r4)
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            r5 = 150(0x96, double:7.4E-322)
            r4.setDuration(r5)
            android.view.animation.DecelerateInterpolator r5 = new android.view.animation.DecelerateInterpolator
            r5.<init>()
            r4.setInterpolator(r5)
            android.animation.Animator[] r5 = new android.animation.Animator[r9]
            r5[r8] = r2
            r5[r10] = r3
            r4.playTogether(r5)
            r4.start()
            r7.j = r4
        L_0x0233:
            return
        L_0x0234:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            r2.<init>(r0)
            throw r2
        L_0x023a:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            r2.<init>(r0)
            throw r2
        L_0x0240:
            r3.removeOnLayoutChangeListener(r2)
            int r2 = r3.getMeasuredHeight()
            int r2 = r2 + r6
            if (r2 > r4) goto L_0x0271
            boolean r2 = r7.b
            if (r2 == 0) goto L_0x0257
            androidx.constraintlayout.widget.ConstraintLayout r2 = r7.c
            boolean r2 = defpackage.h88.L(r2)
            if (r2 != 0) goto L_0x0257
            goto L_0x0271
        L_0x0257:
            float r2 = (float) r6
            float r4 = (float) r5
            android.content.res.Resources r5 = defpackage.vo4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r4 = r4 * r5
            int r4 = kotlin.math.MathKt.roundToInt((float) r4)
            float r4 = (float) r4
            float r2 = kotlin.ranges.RangesKt.coerceAtLeast((float) r2, (float) r4)
            r3.setY(r2)
            goto L_0x0287
        L_0x0271:
            float r2 = (float) r6
            int r4 = r3.getMeasuredHeight()
            float r4 = (float) r4
            float r2 = r2 - r4
            androidx.constraintlayout.widget.ConstraintLayout r4 = r7.c
            android.content.Context r4 = r4.getContext()
            int r4 = defpackage.ld9.E(r4)
            float r4 = (float) r4
            float r2 = r2 - r4
            r3.setY(r2)
        L_0x0287:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f5a.onLayoutChange(android.view.View, int, int, int, int, int, int, int, int):void");
    }

    public f5a(h5a h5a, int i, int i2) {
        this.b = h5a;
        this.c = i;
        this.d = i2;
    }
}
