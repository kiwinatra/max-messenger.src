package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import one.me.rlottie.RLottieDrawable;

/* renamed from: g15  reason: default package */
public final class g15 extends kbe implements e25 {
    public static final /* synthetic */ int F0 = 0;
    public n25 D0;
    public final bj E0 = new bj(1, this);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g15(android.content.Context r3, defpackage.rt6 r4) {
        /*
            r2 = this;
            android.widget.ImageView r0 = new android.widget.ImageView
            r0.<init>(r3)
            r2.<init>(r0)
            bj r3 = new bj
            r1 = 1
            r3.<init>(r1, r2)
            r2.E0 = r3
            r3 = 32
            float r3 = (float) r3
            android.content.res.Resources r1 = defpackage.vo4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r3 = r3 * r1
            int r3 = kotlin.math.MathKt.roundToInt((float) r3)
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r1.<init>(r3, r3)
            r0.setLayoutParams(r1)
            r3 = 2
            float r3 = (float) r3
            android.content.res.Resources r1 = defpackage.vo4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r3 = r3 * r1
            int r3 = kotlin.math.MathKt.roundToInt((float) r3)
            r0.setPadding(r3, r3, r3, r3)
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r0.setScaleType(r3)
            h24 r3 = new h24
            r1 = 1
            r3.<init>((int) r1, (java.lang.Object) r2, (java.lang.Object) r4)
            r0.setOnClickListener(r3)
            mh0 r3 = new mh0
            r4 = 0
            r1 = 5
            r3.<init>((java.lang.Object) r2, (kotlin.coroutines.Continuation) r4, (int) r1)
            defpackage.b0h.H(r0, r3)
            el r3 = new el
            r4 = 4
            r3.<init>(r4, r2)
            r0.addOnAttachStateChangeListener(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g15.<init>(android.content.Context, rt6):void");
    }

    public final void M(lz7 lz7) {
        if (lz7 instanceof n25) {
            n25 n25 = (n25) lz7;
            this.D0 = n25;
            if (n25.w == 0) {
                P(true);
            }
            View view = this.a;
            ((ImageView) view).setImageDrawable(n25.v);
            Drawable drawable = ((ImageView) view).getDrawable();
            cl clVar = drawable instanceof cl ? (cl) drawable : null;
            if (clVar != null) {
                Drawable b = clVar.b();
                RLottieDrawable rLottieDrawable = clVar.v0;
                if (b == rLottieDrawable && rLottieDrawable != null) {
                    rLottieDrawable.addParentView(this.E0);
                }
                clVar.start();
            }
        }
    }

    public final void P(boolean z) {
        Drawable drawable = ((ImageView) this.a).getDrawable();
        cl clVar = drawable instanceof cl ? (cl) drawable : null;
        if (clVar != null) {
            RLottieDrawable rLottieDrawable = clVar.v0;
            if (rLottieDrawable != null) {
                rLottieDrawable.removeParentView(this.E0);
            }
            RLottieDrawable rLottieDrawable2 = clVar.v0;
            if (rLottieDrawable2 == null || !rLottieDrawable2.hasParentViews() || z) {
                clVar.stop();
            }
        }
    }

    public final void f() {
        Drawable drawable;
        n25 n25 = this.D0;
        if (n25 != null && (drawable = n25.v) != null) {
            ((ImageView) this.a).invalidateDrawable(drawable);
        }
    }
}
