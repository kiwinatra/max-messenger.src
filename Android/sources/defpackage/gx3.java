package defpackage;

import android.widget.FrameLayout;
import one.me.sdk.contextmenu.popup.ContextMenuPopupWindow;

/* renamed from: gx3  reason: default package */
public final class gx3 extends FrameLayout implements phf {
    public final /* synthetic */ ContextMenuPopupWindow a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public gx3(one.me.sdk.contextmenu.popup.ContextMenuPopupWindow r18, android.view.LayoutInflater r19, android.content.Context r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r0.a = r1
            r2 = r20
            r0.<init>(r2)
            r2 = 1
            r0.setClickable(r2)
            xu3 r3 = new xu3
            r4 = 3
            r3.<init>((int) r4, (java.lang.Object) r1)
            defpackage.ct.G(r0, 300, r3)
            kotlin.reflect.KProperty[] r3 = one.me.sdk.contextmenu.popup.ContextMenuPopupWindow.X
            r18.getClass()
            srb r3 = new srb
            android.content.Context r4 = r19.getContext()
            boolean r5 = r18.d0()
            r3.<init>(r4, r5)
            int r4 = one.me.sdk.contextmenu.popup.ContextMenuPopupWindow.Y
            r3.setId(r4)
            android.os.Bundle r4 = r18.getArgs()
            java.lang.String r5 = "actions"
            android.os.Bundle r4 = r4.getBundle(r5)
            r6 = 0
            if (r4 == 0) goto L_0x0041
            java.util.Collection r4 = defpackage.kr7.g(r4)
            goto L_0x0042
        L_0x0041:
            r4 = r6
        L_0x0042:
            if (r4 != 0) goto L_0x004a
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            java.util.Collection r4 = (java.util.Collection) r4
        L_0x004a:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            boolean r7 = r4 instanceof java.util.Collection
            if (r7 == 0) goto L_0x005b
            r7 = r4
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x005b
        L_0x0059:
            r4 = 0
            goto L_0x0070
        L_0x005b:
            java.util.Iterator r4 = r4.iterator()
        L_0x005f:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0059
            java.lang.Object r7 = r4.next()
            ow3 r7 = (defpackage.ow3) r7
            java.lang.Integer r7 = r7.d
            if (r7 == 0) goto L_0x005f
            r4 = r2
        L_0x0070:
            android.os.Bundle r7 = r18.getArgs()
            java.lang.String r9 = "header"
            java.lang.Class<ngf> r10 = defpackage.ngf.class
            java.lang.Object r7 = defpackage.n54.k(r7, r9, r10)
            android.os.Parcelable r7 = (android.os.Parcelable) r7
            ngf r7 = (defpackage.ngf) r7
            r15 = -1
            r14 = -2
            if (r7 == 0) goto L_0x00e0
            android.content.Context r9 = r3.getContext()
            fx3 r10 = new fx3
            r10.<init>(r7, r1, r9)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r7.<init>(r15, r14)
            r9 = 12
            float r9 = (float) r9
            android.content.res.Resources r11 = defpackage.vo4.c()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r11 = r11 * r9
            int r11 = kotlin.math.MathKt.roundToInt((float) r11)
            r7.topMargin = r11
            android.content.res.Resources r11 = defpackage.vo4.c()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r11 = r11 * r9
            int r11 = kotlin.math.MathKt.roundToInt((float) r11)
            r7.bottomMargin = r11
            android.content.res.Resources r11 = defpackage.vo4.c()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r11 = r11 * r9
            int r11 = kotlin.math.MathKt.roundToInt((float) r11)
            r7.setMarginStart(r11)
            android.content.res.Resources r11 = defpackage.vo4.c()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r9 = r9 * r11
            int r9 = kotlin.math.MathKt.roundToInt((float) r9)
            r7.setMarginEnd(r9)
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            r3.addView(r10, r7)
        L_0x00e0:
            android.os.Bundle r7 = r18.getArgs()
            android.os.Bundle r5 = r7.getBundle(r5)
            if (r5 == 0) goto L_0x00ee
            java.util.Collection r6 = defpackage.kr7.g(r5)
        L_0x00ee:
            if (r6 != 0) goto L_0x00f7
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            r6 = r5
            java.util.Collection r6 = (java.util.Collection) r6
        L_0x00f7:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r5 = r6.iterator()
        L_0x00fd:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0142
            java.lang.Object r6 = r5.next()
            ow3 r6 = (defpackage.ow3) r6
            rrb r7 = new rrb
            android.content.Context r9 = r3.getContext()
            boolean r10 = r18.d0()
            r7.<init>(r9, r10)
            ngf r11 = r6.b
            java.lang.Integer r13 = r6.d
            if (r13 == 0) goto L_0x011f
            r16 = r2
            goto L_0x0121
        L_0x011f:
            r16 = 0
        L_0x0121:
            java.lang.Integer r12 = r6.c
            r9 = r7
            r10 = r7
            r2 = r13
            r13 = r16
            r8 = r14
            r14 = r4
            r9.c(r10, r11, r12, r13, r14)
            java.lang.Integer r9 = r6.e
            r7.b(r2, r9)
            pb r2 = new pb
            r9 = 26
            r2.<init>(r9, r1, r6)
            defpackage.ct.G(r7, 300, r2)
            r3.addView(r7, r15, r8)
            r14 = r8
            r2 = 1
            goto L_0x00fd
        L_0x0142:
            r8 = r14
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r4 = 250(0xfa, float:3.5E-43)
            float r4 = (float) r4
            android.content.res.Resources r5 = defpackage.vo4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r4 = r4 * r5
            int r4 = kotlin.math.MathKt.roundToInt((float) r4)
            r5 = 51
            r2.<init>(r4, r8, r5)
            r0.addView(r3, r2)
            k2b r1 = one.me.sdk.contextmenu.popup.ContextMenuPopupWindow.c0(r18)
            r0.onThemeChanged(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx3.<init>(one.me.sdk.contextmenu.popup.ContextMenuPopupWindow, android.view.LayoutInflater, android.content.Context):void");
    }

    public final void onThemeChanged(k2b k2b) {
        ContextMenuPopupWindow contextMenuPopupWindow = this.a;
        if (contextMenuPopupWindow.getArgs().getBoolean("dim")) {
            setBackgroundColor(ContextMenuPopupWindow.c0(contextMenuPopupWindow).c().d);
        }
    }
}
