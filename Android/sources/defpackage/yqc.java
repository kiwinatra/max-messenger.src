package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.ImageView;
import kotlin.math.MathKt;

/* renamed from: yqc  reason: default package */
public final class yqc extends kbe implements phf {
    public final zqc D0;
    public final GradientDrawable E0;
    public final RippleDrawable F0;
    public final RippleDrawable G0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yqc(android.content.Context r7, defpackage.zqc r8) {
        /*
            r6 = this;
            int r0 = r8.a()
            float r0 = (float) r0
            android.content.res.Resources r1 = defpackage.vo4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r0 = r0 * r1
            int r0 = kotlin.math.MathKt.roundToInt((float) r0)
            android.widget.ImageView r1 = new android.widget.ImageView
            r1.<init>(r7)
            bzc r7 = new bzc
            r7.<init>((int) r0, (int) r0)
            r1.setLayoutParams(r7)
            r7 = 0
            r1.setClipToOutline(r7)
            android.widget.ImageView$ScaleType r7 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r1.setScaleType(r7)
            el r7 = new el
            r0 = 7
            r7.<init>(r0, r1)
            r1.addOnAttachStateChangeListener(r7)
            r6.<init>(r1)
            r6.D0 = r8
            js9 r7 = defpackage.fu4.k
            android.content.Context r8 = r1.getContext()
            fu4 r8 = r7.e(r8)
            k2b r8 = r8.f()
            df0 r8 = r8.c()
            cf0 r8 = r8.a
            int r8 = r8.h
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0 = 0
            android.graphics.drawable.GradientDrawable r8 = defpackage.i8b.K(r8, r0, r0)
            r6.E0 = r8
            android.content.Context r2 = r1.getContext()
            fu4 r2 = r7.e(r2)
            k2b r2 = r2.f()
            xef r2 = r2.getText()
            int r2 = r2.e
            r3 = 1050253722(0x3e99999a, float:0.3)
            int r2 = defpackage.j4b.l0(r3, r2)
            r4 = -65536(0xffffffffffff0000, float:NaN)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            android.graphics.drawable.GradientDrawable r4 = defpackage.i8b.K(r4, r0, r0)
            android.graphics.drawable.RippleDrawable r5 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r5.<init>(r2, r8, r4)
            r6.F0 = r5
            android.content.Context r8 = r1.getContext()
            fu4 r7 = r7.e(r8)
            k2b r7 = r7.f()
            xef r7 = r7.getText()
            int r7 = r7.e
            int r7 = defpackage.j4b.l0(r3, r7)
            android.graphics.drawable.RippleDrawable r8 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r7 = android.content.res.ColorStateList.valueOf(r7)
            r8.<init>(r7, r0, r0)
            r6.G0 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yqc.<init>(android.content.Context, zqc):void");
    }

    /* renamed from: P */
    public final void M(xqc xqc) {
        int i;
        boolean z = xqc.o;
        if (z) {
            zqc zqc = this.D0;
            i = MathKt.roundToInt(((float) ((zqc.a() - (ld8.f0(zqc.a) >= 360 ? 22 : 20)) / 2)) * vo4.c().getDisplayMetrics().density);
        } else {
            i = 0;
        }
        View view = this.a;
        view.setPadding(i, i, i, i);
        view.setBackground(z ? this.F0 : this.G0);
        ((ImageView) view).setImageDrawable(xqc.c);
    }

    public final void onThemeChanged(k2b k2b) {
        this.F0.setColor(ColorStateList.valueOf(j4b.l0(0.3f, k2b.getText().e)));
        this.E0.setColor(k2b.c().a.h);
        this.G0.setColor(ColorStateList.valueOf(j4b.l0(0.3f, k2b.getText().e)));
    }
}
