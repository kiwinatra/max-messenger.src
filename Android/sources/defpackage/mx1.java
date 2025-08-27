package defpackage;

import android.view.View;

/* renamed from: mx1  reason: default package */
public final /* synthetic */ class mx1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mx1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: type inference failed for: r6v10, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayoutChange(android.view.View r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13) {
        /*
            r4 = this;
            r0 = 11
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r4.b
            int r4 = r4.a
            switch(r4) {
                case 0: goto L_0x010d;
                case 1: goto L_0x0070;
                case 2: goto L_0x004b;
                case 3: goto L_0x0037;
                default: goto L_0x000b;
            }
        L_0x000b:
            r4 = r3
            b33 r4 = (defpackage.b33) r4
            java.lang.Object r5 = r4.c
            androidx.appcompat.widget.Toolbar r5 = (androidx.appcompat.widget.Toolbar) r5
            int r6 = r5.getChildCount()
            if (r2 >= r6) goto L_0x0036
            android.view.View r6 = r5.getChildAt(r2)
            boolean r7 = r6 instanceof androidx.appcompat.widget.ActionMenuView
            if (r7 == 0) goto L_0x0034
            android.graphics.drawable.Drawable r5 = r5.getNavigationIcon()
            if (r5 != 0) goto L_0x0034
            int r5 = r6.getMeasuredWidth()
            java.lang.Object r4 = r4.y
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x0036
            defpackage.iq.N(r4, r5)
            goto L_0x0036
        L_0x0034:
            int r2 = r2 + r1
            goto L_0x000b
        L_0x0036:
            return
        L_0x0037:
            kub r3 = (defpackage.kub) r3
            r3.getClass()
            int r8 = r8 - r6
            int r12 = r12 - r10
            if (r8 != r12) goto L_0x0044
            int r9 = r9 - r7
            int r13 = r13 - r11
            if (r9 == r13) goto L_0x004a
        L_0x0044:
            r3.b()
            r3.a(r1)
        L_0x004a:
            return
        L_0x004b:
            kotlin.reflect.KProperty[] r4 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            one.me.chatscreen.mediabar.MediaBarWidget r3 = (one.me.chatscreen.mediabar.MediaBarWidget) r3
            r3.getClass()
            kotlin.reflect.KProperty[] r4 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            r5 = 7
            r4 = r4[r5]
            sn0 r4 = r3.w0
            java.lang.Object r4 = r4.getValue()
            oz1 r4 = (defpackage.oz1) r4
            int r9 = r9 - r7
            int r5 = r4.getPaddingLeft()
            int r6 = r4.getPaddingTop()
            int r7 = r4.getPaddingRight()
            r4.setPadding(r5, r6, r7, r9)
            return
        L_0x0070:
            kotlin.reflect.KProperty[] r4 = one.me.chatscreen.ChatScreen.d1
            one.me.chatscreen.ChatScreen r3 = (one.me.chatscreen.ChatScreen) r3
            android.view.View r4 = r3.getView()
            if (r4 != 0) goto L_0x007c
            goto L_0x010c
        L_0x007c:
            int r4 = r5.getMeasuredHeight()
            int r6 = r5.getPaddingBottom()
            int r4 = r4 - r6
            android.view.ViewGroup r6 = r3.x0()
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            boolean r7 = r6 instanceof android.view.ViewGroup.MarginLayoutParams
            r8 = 0
            if (r7 == 0) goto L_0x0095
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            goto L_0x0096
        L_0x0095:
            r6 = r8
        L_0x0096:
            if (r6 == 0) goto L_0x009a
            int r2 = r6.bottomMargin
        L_0x009a:
            if (r4 == r2) goto L_0x00be
            android.view.ViewGroup r6 = r3.x0()
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            r7 = 48
            float r7 = (float) r7
            android.content.res.Resources r9 = defpackage.vo4.c()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r7 = r7 * r9
            int r7 = kotlin.math.MathKt.roundToInt((float) r7)
            int r7 = java.lang.Math.max(r4, r7)
            r6.bottomMargin = r7
        L_0x00be:
            oz1 r6 = r3.A0()
            int r6 = r6.getPaddingBottom()
            if (r4 == r6) goto L_0x00db
            oz1 r6 = r3.A0()
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            boolean r7 = r6 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r7 == 0) goto L_0x00d7
            r8 = r6
            android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
        L_0x00d7:
            if (r8 == 0) goto L_0x00db
            r8.bottomMargin = r4
        L_0x00db:
            int r4 = r5.getMeasuredHeight()
            kotlin.reflect.KProperty[] r6 = one.me.chatscreen.ChatScreen.d1
            r7 = r6[r0]
            kotlin.properties.ReadOnlyProperty r8 = r3.P0
            java.lang.Object r7 = r8.getValue(r3, r7)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            int r7 = r7.getPaddingBottom()
            if (r4 == r7) goto L_0x010c
            r4 = r6[r0]
            java.lang.Object r4 = r8.getValue(r3, r4)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            int r5 = r5.getMeasuredHeight()
            int r6 = r4.getPaddingLeft()
            int r7 = r4.getPaddingTop()
            int r8 = r4.getPaddingRight()
            r4.setPadding(r6, r7, r8, r5)
        L_0x010c:
            return
        L_0x010d:
            com.google.android.material.carousel.CarouselLayoutManager r3 = (com.google.android.material.carousel.CarouselLayoutManager) r3
            r3.getClass()
            if (r6 != r10) goto L_0x011a
            if (r7 != r11) goto L_0x011a
            if (r8 != r12) goto L_0x011a
            if (r9 == r13) goto L_0x0122
        L_0x011a:
            pr1 r4 = new pr1
            r4.<init>(r0, r3)
            r5.post(r4)
        L_0x0122:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mx1.onLayoutChange(android.view.View, int, int, int, int, int, int, int, int):void");
    }
}
