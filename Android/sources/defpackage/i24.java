package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: i24  reason: default package */
public final class i24 extends kbe {
    public static final int F0 = View.generateViewId();
    public static final int G0 = View.generateViewId();
    public final ImageView D0;
    public final TextView E0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i24(android.view.ViewGroup r10) {
        /*
            r9 = this;
            android.content.Context r10 = r10.getContext()
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r10)
            r1 = 0
            r0.setOrientation(r1)
            android.view.ViewGroup$MarginLayoutParams r2 = new android.view.ViewGroup$MarginLayoutParams
            r3 = 56
            float r3 = (float) r3
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r3 = r3 * r4
            int r3 = kotlin.math.MathKt.roundToInt((float) r3)
            r4 = -1
            r2.<init>(r4, r3)
            r0.setLayoutParams(r2)
            r2 = 18
            float r2 = (float) r2
            android.content.res.Resources r3 = defpackage.vo4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r3 = r3 * r2
            int r3 = kotlin.math.MathKt.roundToInt((float) r3)
            r4 = 12
            float r4 = (float) r4
            android.content.res.Resources r5 = defpackage.vo4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r5 = r5 * r4
            int r5 = kotlin.math.MathKt.roundToInt((float) r5)
            android.content.res.Resources r6 = defpackage.vo4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r4
            int r6 = kotlin.math.MathKt.roundToInt((float) r6)
            android.content.res.Resources r7 = defpackage.vo4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r4 = r4 * r7
            int r4 = kotlin.math.MathKt.roundToInt((float) r4)
            r0.setPadding(r3, r5, r6, r4)
            android.widget.ImageView r3 = new android.widget.ImageView
            r3.<init>(r10)
            int r4 = F0
            r3.setId(r4)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r6 = 24
            float r6 = (float) r6
            android.content.res.Resources r7 = defpackage.vo4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r7 = r7 * r6
            int r7 = kotlin.math.MathKt.roundToInt((float) r7)
            android.content.res.Resources r8 = defpackage.vo4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r6 = r6 * r8
            int r6 = kotlin.math.MathKt.roundToInt((float) r6)
            r5.<init>(r7, r6)
            android.content.res.Resources r6 = defpackage.vo4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r2 = r2 * r6
            int r2 = kotlin.math.MathKt.roundToInt((float) r2)
            r5.setMarginEnd(r2)
            r3.setLayoutParams(r5)
            r2 = 16
            r0.setGravity(r2)
            r0.addView(r3)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r10)
            int r10 = G0
            r2.setId(r10)
            ogf r5 = defpackage.puf.i
            r5.b(r2, defpackage.uy4.b)
            r5 = 1
            r2.setSingleLine(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r6 = -2
            r7 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r1, r6, r7)
            r1 = 19
            r5.gravity = r1
            r2.setLayoutParams(r5)
            r0.addView(r2)
            ce1 r1 = new ce1
            r5 = 0
            r6 = 2
            r1.<init>((java.lang.Object) r3, (java.lang.Object) r2, (kotlin.coroutines.Continuation) r5, (int) r6)
            defpackage.b0h.H(r0, r1)
            r9.<init>(r0)
            android.view.View r1 = r0.findViewById(r4)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r9.D0 = r1
            android.view.View r10 = r0.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r9.E0 = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i24.<init>(android.view.ViewGroup):void");
    }

    public final void O() {
        ((LinearLayout) this.a).setOnClickListener((View.OnClickListener) null);
    }

    /* renamed from: P */
    public final void M(g24 g24) {
        this.D0.setImageResource(g24.b);
        TextView textView = this.E0;
        textView.setText(g24.c.a(textView.getContext()));
        ((LinearLayout) this.a).setOnClickListener((View.OnClickListener) null);
    }
}
