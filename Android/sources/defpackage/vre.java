package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import kotlin.math.MathKt;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: vre  reason: default package */
public final class vre extends kbe {
    public final ShapeDrawable D0;
    public Drawable E0;
    public final int F0 = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
    public final int G0 = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
    public final int H0 = MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
    public final int I0 = MathKt.roundToInt(((float) 14) * vo4.c().getDisplayMetrics().density);
    public wx1 J0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public vre(android.content.Context r6, android.graphics.drawable.ShapeDrawable r7, defpackage.vq7 r8) {
        /*
            r5 = this;
            one.me.sdk.uikit.common.views.OneMeDraweeView r0 = new one.me.sdk.uikit.common.views.OneMeDraweeView
            r0.<init>(r6)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = 36
            float r2 = (float) r2
            android.content.res.Resources r3 = defpackage.vo4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r3 = r3 * r2
            int r3 = kotlin.math.MathKt.roundToInt((float) r3)
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r2 = r2 * r4
            int r2 = kotlin.math.MathKt.roundToInt((float) r2)
            r1.<init>(r3, r2)
            r2 = 6
            float r2 = (float) r2
            android.content.res.Resources r3 = defpackage.vo4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r2 = r2 * r3
            int r2 = kotlin.math.MathKt.roundToInt((float) r2)
            r0.setPadding(r2, r2, r2, r2)
            r0.setLayoutParams(r1)
            lv4 r1 = r0.getHierarchy()
            sp6 r1 = (defpackage.sp6) r1
            ydd r2 = defpackage.ydd.n
            r1.h(r2)
            r5.<init>(r0)
            r5.D0 = r7
            r7 = 8
            float r7 = (float) r7
            android.content.res.Resources r1 = defpackage.vo4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r7 = r7 * r1
            int r7 = kotlin.math.MathKt.roundToInt((float) r7)
            r5.F0 = r7
            r7 = 12
            float r7 = (float) r7
            android.content.res.Resources r1 = defpackage.vo4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r7 = r7 * r1
            int r7 = kotlin.math.MathKt.roundToInt((float) r7)
            r5.G0 = r7
            r7 = 16
            float r7 = (float) r7
            android.content.res.Resources r1 = defpackage.vo4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r7 = r7 * r1
            int r7 = kotlin.math.MathKt.roundToInt((float) r7)
            r5.H0 = r7
            r7 = 14
            float r7 = (float) r7
            android.content.res.Resources r1 = defpackage.vo4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r7 = r7 * r1
            int r7 = kotlin.math.MathKt.roundToInt((float) r7)
            r5.I0 = r7
            qrb r7 = new qrb
            r1 = 0
            r7.<init>((defpackage.vre) r5, (android.content.Context) r6, (kotlin.coroutines.Continuation) r1)
            defpackage.b0h.H(r0, r7)
            kqc r6 = new kqc
            r7 = 17
            r6.<init>((int) r7, (java.lang.Object) r5, (java.lang.Object) r8)
            defpackage.ct.G(r0, 300, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vre.<init>(android.content.Context, android.graphics.drawable.ShapeDrawable, vq7):void");
    }

    public final void M(lz7 lz7) {
        wx1 wx1 = (wx1) lz7;
        this.J0 = wx1;
        String str = wx1.b.c;
        View view = this.a;
        if (str == null || str.length() == 0) {
            Integer num = wx1.o;
            if (num != null) {
                ((OneMeDraweeView) view).setImageResource(num.intValue());
            }
        } else {
            ((OneMeDraweeView) view).setImageURI(str);
        }
        mqe mqe = wx1.b;
        Q(mqe.x);
        P(mqe.w);
    }

    public final void P(lqe lqe) {
        lqe lqe2 = lqe.v;
        View view = this.a;
        if (lqe == lqe2) {
            if (this.E0 == null) {
                this.E0 = R();
            }
            ((sp6) ((OneMeDraweeView) view).getHierarchy()).k(this.E0);
            return;
        }
        ((sp6) ((OneMeDraweeView) view).getHierarchy()).k((Drawable) null);
    }

    public final void Q(boolean z) {
        View view = this.a;
        if (z) {
            ((OneMeDraweeView) view).setBackground(this.D0);
        } else {
            ((OneMeDraweeView) view).setBackground((Drawable) null);
        }
        wx1 wx1 = this.J0;
        if ((wx1 != null ? wx1.o : null) != null) {
            OneMeDraweeView oneMeDraweeView = (OneMeDraweeView) view;
            js9 js9 = fu4.k;
            oneMeDraweeView.setImageTintList(ColorStateList.valueOf(z ? js9.f(view).getIcon().f : js9.f(view).getIcon().i));
            return;
        }
        ((OneMeDraweeView) view).setImageTintList((ColorStateList) null);
    }

    public final LayerDrawable R() {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        js9 js9 = fu4.k;
        View view = this.a;
        iq.a0(shapeDrawable, js9.f(view).c().a.g);
        Drawable b = ew3.b(((OneMeDraweeView) view).getContext(), yua.a);
        iq.a0(b, js9.e(view.getContext()).f().getIcon().h);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, b});
        int i = this.G0;
        layerDrawable.setLayerSize(0, i, i);
        int i2 = this.F0;
        layerDrawable.setLayerSize(1, i2, i2);
        int i3 = this.I0;
        LayerDrawable layerDrawable2 = layerDrawable;
        layerDrawable2.setLayerInset(0, i3, i3, 0, 0);
        int i4 = this.H0;
        layerDrawable2.setLayerInset(1, i4, i4, 0, 0);
        return layerDrawable;
    }
}
