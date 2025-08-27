package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import one.me.rlottie.RLottieImageViewUtils;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: q35  reason: default package */
public final class q35 extends kbe {
    public final ShapeDrawable D0;
    public final OneMeDraweeView E0;
    public final r3d F0;
    public final int G0;
    public vx1 H0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q35(android.content.Context r6, android.graphics.drawable.ShapeDrawable r7, defpackage.rx2 r8) {
        /*
            r5 = this;
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = 36
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r2 = kotlin.math.MathKt.roundToInt((float) r2)
            android.content.res.Resources r3 = defpackage.vo4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r1 = r1 * r3
            int r1 = kotlin.math.MathKt.roundToInt((float) r1)
            r0.<init>(r2, r1)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r6)
            r1.setLayoutParams(r0)
            r0 = 6
            float r0 = (float) r0
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r0 = r0 * r2
            int r0 = kotlin.math.MathKt.roundToInt((float) r0)
            r1.setPadding(r0, r0, r0, r0)
            one.me.sdk.uikit.common.views.OneMeDraweeView r0 = new one.me.sdk.uikit.common.views.OneMeDraweeView
            r0.<init>(r6)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = -1
            r4 = 17
            r2.<init>(r3, r3, r4)
            r0.setLayoutParams(r2)
            lv4 r2 = r0.getHierarchy()
            sp6 r2 = (defpackage.sp6) r2
            ydd r3 = defpackage.ydd.n
            r2.h(r3)
            r1.addView(r0)
            r5.<init>(r1)
            r5.D0 = r7
            r7 = 0
            android.view.View r7 = r1.getChildAt(r7)
            boolean r0 = r7 instanceof one.me.sdk.uikit.common.views.OneMeDraweeView
            r2 = 0
            if (r0 == 0) goto L_0x0072
            one.me.sdk.uikit.common.views.OneMeDraweeView r7 = (one.me.sdk.uikit.common.views.OneMeDraweeView) r7
            goto L_0x0073
        L_0x0072:
            r7 = r2
        L_0x0073:
            r5.E0 = r7
            p35 r7 = new p35
            r0 = 0
            r7.<init>(r6, r0)
            r3d r7 = defpackage.cvg.I(r7)
            r5.F0 = r7
            r7 = 24
            float r7 = (float) r7
            android.content.res.Resources r0 = defpackage.vo4.c()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r7 = r7 * r0
            int r7 = kotlin.math.MathKt.roundToInt((float) r7)
            r5.G0 = r7
            sa r7 = new sa
            r0 = 9
            r7.<init>((defpackage.kbe) r5, (java.lang.Object) r6, (kotlin.coroutines.Continuation) r2, (int) r0)
            defpackage.b0h.H(r1, r7)
            h24 r6 = new h24
            r7 = 2
            r6.<init>((defpackage.kbe) r5, (kotlin.jvm.functions.Function1) r8, (int) r7)
            defpackage.ct.G(r1, 300, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q35.<init>(android.content.Context, android.graphics.drawable.ShapeDrawable, rx2):void");
    }

    public final void M(lz7 lz7) {
        vx1 vx1 = (vx1) lz7;
        this.H0 = vx1;
        int i = vx1.y;
        r3d r3d = this.F0;
        OneMeDraweeView oneMeDraweeView = this.E0;
        String str = vx1.v;
        if (str != null) {
            if (oneMeDraweeView != null) {
                oneMeDraweeView.setVisibility(0);
            }
            if (oneMeDraweeView != null) {
                qa7 b = qa7.b(str);
                int i2 = OneMeDraweeView.z0;
                oneMeDraweeView.o(b, (qa7) null);
            }
            String str2 = vx1.w;
            if (str2 != null) {
                db8 db8 = (db8) r3d.getValue();
                y7e.c((ViewGroup) this.a, db8, -1);
                db8.setVisibility(0);
                int i3 = this.G0;
                db8.a(i3, i3, str2);
                db8.setOnFirstFrameListener(new rt3(23, (Object) this));
            } else if (r3d.isInitialized()) {
                db8 db82 = (db8) r3d.getValue();
                db82.getClass();
                RLottieImageViewUtils.release(db82);
                db82.x = null;
                db82.setVisibility(8);
            }
        } else {
            if (oneMeDraweeView != null) {
                oneMeDraweeView.setVisibility(0);
            }
            if (oneMeDraweeView != null) {
                oneMeDraweeView.setImageResource(i);
            }
            if (r3d.isInitialized()) {
                db8 db83 = (db8) r3d.getValue();
                db83.getClass();
                RLottieImageViewUtils.release(db83);
                db83.x = null;
                db83.setVisibility(8);
            }
        }
        P(vx1.c);
    }

    public final void P(boolean z) {
        View view = this.a;
        ((ViewGroup) view).setBackground(z ? this.D0 : null);
        OneMeDraweeView oneMeDraweeView = this.E0;
        if (oneMeDraweeView != null) {
            js9 js9 = fu4.k;
            oneMeDraweeView.setImageTintList(ColorStateList.valueOf(z ? js9.f(view).getIcon().f : js9.f(view).getIcon().i));
        }
    }
}
