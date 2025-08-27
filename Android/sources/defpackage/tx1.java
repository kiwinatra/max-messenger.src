package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;

/* renamed from: tx1  reason: default package */
public final class tx1 extends kbe {
    public final Function0 D0;
    public final FrameLayout E0;
    public final AppCompatTextView F0;
    public final Lazy G0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public tx1(android.content.Context r6, kotlin.jvm.functions.Function0 r7) {
        /*
            r5 = this;
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r6)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = -1
            r3 = -2
            r1.<init>(r2, r3)
            r0.setLayoutParams(r1)
            r1 = 30
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r1 = r1 * r2
            int r1 = kotlin.math.MathKt.roundToInt((float) r1)
            r0.setMinimumHeight(r1)
            r5.<init>(r0)
            r5.D0 = r7
            r5.E0 = r0
            androidx.appcompat.widget.AppCompatTextView r7 = new androidx.appcompat.widget.AppCompatTextView
            r1 = 0
            r7.<init>(r6, r1)
            int r2 = defpackage.zua.m
            r7.setId(r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r3, r3)
            r3 = 8388627(0x800013, float:1.175497E-38)
            r2.gravity = r3
            r7.setLayoutParams(r2)
            ogf r2 = defpackage.puf.n
            r2.b(r7, defpackage.uy4.b)
            mh0 r2 = new mh0
            r3 = 3
            r4 = 2
            r2.<init>((int) r3, (kotlin.coroutines.Continuation) r1, (int) r4)
            defpackage.b0h.H(r7, r2)
            r5.F0 = r7
            v4 r1 = new v4
            r2 = 25
            r1.<init>(r6, r2)
            kotlin.Lazy r6 = kotlin.LazyKt.lazy(r1)
            r5.G0 = r6
            r0.addView(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tx1.<init>(android.content.Context, kotlin.jvm.functions.Function0):void");
    }

    public final void M(lz7 lz7) {
        if (lz7 instanceof xx1) {
            AppCompatTextView appCompatTextView = this.F0;
            xx1 xx1 = (xx1) lz7;
            appCompatTextView.setText(xx1.getName().a(appCompatTextView.getContext()));
            boolean q = xx1.q();
            Lazy lazy = this.G0;
            if (q) {
                f6e.c(this.E0, (View) lazy.getValue(), -1);
                ((View) lazy.getValue()).setVisibility(0);
                ct.G((View) lazy.getValue(), 300, new x4(19, (Object) this));
            } else if (lazy.isInitialized()) {
                AppCompatImageView appCompatImageView = (AppCompatImageView) lazy.getValue();
                appCompatImageView.setVisibility(8);
                appCompatImageView.setOnClickListener((View.OnClickListener) null);
            }
        }
    }
}
