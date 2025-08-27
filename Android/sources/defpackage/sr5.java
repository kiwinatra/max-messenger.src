package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import java.util.ArrayList;

/* renamed from: sr5  reason: default package */
public final class sr5 extends qr5 {
    public StateListAnimator K;

    public final float e() {
        return this.s.getElevation();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        r0 = r2.s;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(android.graphics.Rect r3) {
        /*
            r2 = this;
            wie r0 = r2.t
            java.lang.Object r0 = r0.b
            jr5 r0 = (defpackage.jr5) r0
            boolean r0 = r0.w0
            if (r0 == 0) goto L_0x000e
            super.f(r3)
            goto L_0x002c
        L_0x000e:
            boolean r0 = r2.f
            if (r0 == 0) goto L_0x0028
            jr5 r0 = r2.s
            int r1 = r0.getSizeDimension()
            int r2 = r2.k
            if (r1 < r2) goto L_0x001d
            goto L_0x0028
        L_0x001d:
            int r0 = r0.getSizeDimension()
            int r2 = r2 - r0
            int r2 = r2 / 2
            r3.set(r2, r2, r2, r2)
            goto L_0x002c
        L_0x0028:
            r2 = 0
            r3.set(r2, r2, r2, r2)
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sr5.f(android.graphics.Rect):void");
    }

    public final void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        bh8 s = s();
        this.b = s;
        s.setTintList(colorStateList);
        if (mode != null) {
            this.b.setTintMode(mode);
        }
        bh8 bh8 = this.b;
        jr5 jr5 = this.s;
        bh8.j(jr5.getContext());
        if (i > 0) {
            Context context = jr5.getContext();
            j4e j4e = this.a;
            j4e.getClass();
            jq0 jq0 = new jq0(j4e);
            int a = fw3.a(context, rdc.design_fab_stroke_top_outer_color);
            int a2 = fw3.a(context, rdc.design_fab_stroke_top_inner_color);
            int a3 = fw3.a(context, rdc.design_fab_stroke_end_inner_color);
            int a4 = fw3.a(context, rdc.design_fab_stroke_end_outer_color);
            jq0.i = a;
            jq0.j = a2;
            jq0.k = a3;
            jq0.l = a4;
            float f = (float) i;
            if (jq0.h != f) {
                jq0.h = f;
                jq0.b.setStrokeWidth(f * 1.3333f);
                jq0.n = true;
                jq0.invalidateSelf();
            }
            if (colorStateList != null) {
                jq0.m = colorStateList.getColorForState(jq0.getState(), jq0.m);
            }
            jq0.p = colorStateList;
            jq0.n = true;
            jq0.invalidateSelf();
            this.d = jq0;
            jq0 jq02 = this.d;
            jq02.getClass();
            bh8 bh82 = this.b;
            bh82.getClass();
            drawable = new LayerDrawable(new Drawable[]{jq02, bh82});
        } else {
            this.d = null;
            drawable = this.b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(ld8.r0(colorStateList2), drawable, (Drawable) null);
        this.c = rippleDrawable;
        this.e = rippleDrawable;
    }

    public final void h() {
    }

    public final void i() {
        q();
    }

    public final void j(int[] iArr) {
    }

    public final void k(float f, float f2, float f3) {
        jr5 jr5 = this.s;
        if (jr5.getStateListAnimator() == this.K) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(qr5.E, r(f, f3));
            stateListAnimator.addState(qr5.F, r(f, f2));
            stateListAnimator.addState(qr5.G, r(f, f2));
            stateListAnimator.addState(qr5.H, r(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(jr5, "elevation", new float[]{f}).setDuration(0));
            arrayList.add(ObjectAnimator.ofFloat(jr5, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(qr5.z);
            stateListAnimator.addState(qr5.I, animatorSet);
            stateListAnimator.addState(qr5.J, r(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO));
            this.K = stateListAnimator;
            jr5.setStateListAnimator(stateListAnimator);
        }
        if (o()) {
            q();
        }
    }

    public final void m(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(ld8.r0(colorStateList));
        } else {
            super.m(colorStateList);
        }
    }

    public final boolean o() {
        return ((jr5) this.t.b).w0 || (this.f && this.s.getSizeDimension() < this.k);
    }

    public final void p() {
    }

    public final AnimatorSet r(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        jr5 jr5 = this.s;
        animatorSet.play(ObjectAnimator.ofFloat(jr5, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(jr5, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(qr5.z);
        return animatorSet;
    }

    public final bh8 s() {
        j4e j4e = this.a;
        j4e.getClass();
        return new bh8(j4e);
    }
}
