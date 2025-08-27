package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;

/* renamed from: qr5  reason: default package */
public abstract class qr5 {
    public static final int A = edc.motionDurationLong2;
    public static final int B = edc.motionEasingEmphasizedInterpolator;
    public static final int C = edc.motionDurationMedium1;
    public static final int D = edc.motionEasingEmphasizedAccelerateInterpolator;
    public static final int[] E = {16842919, 16842910};
    public static final int[] F = {16843623, 16842908, 16842910};
    public static final int[] G = {16842908, 16842910};
    public static final int[] H = {16843623, 16842910};
    public static final int[] I = {16842910};
    public static final int[] J = new int[0];
    public static final fh5 z = xg.c;
    public j4e a;
    public bh8 b;
    public Drawable c;
    public jq0 d;
    public LayerDrawable e;
    public boolean f;
    public boolean g = true;
    public float h;
    public float i;
    public float j;
    public int k;
    public Animator l;
    public pt9 m;
    public pt9 n;
    public float o;
    public float p = 1.0f;
    public int q;
    public int r = 0;
    public final jr5 s;
    public final wie t;
    public final Rect u = new Rect();
    public final RectF v = new RectF();
    public final RectF w = new RectF();
    public final Matrix x = new Matrix();
    public xz3 y;

    /* JADX WARNING: type inference failed for: r5v1, types: [o5h, java.lang.Object] */
    public qr5(jr5 jr5, wie wie) {
        this.s = jr5;
        this.t = wie;
        ? obj = new Object();
        obj.a = new ArrayList();
        obj.b = null;
        obj.c = new z6(13, (Object) obj);
        sr5 sr5 = (sr5) this;
        obj.s(E, d(new or5(sr5, 1)));
        obj.s(F, d(new or5(sr5, 0)));
        obj.s(G, d(new or5(sr5, 0)));
        obj.s(H, d(new or5(sr5, 0)));
        obj.s(I, d(new or5(sr5, 2)));
        obj.s(J, d(new pr5(sr5)));
        this.o = jr5.getRotation();
    }

    public static ValueAnimator d(pr5 pr5) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(z);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(pr5);
        valueAnimator.addUpdateListener(pr5);
        valueAnimator.setFloatValues(new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
        return valueAnimator;
    }

    public final void a(float f2, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.s.getDrawable();
        if (drawable != null && this.q != 0) {
            RectF rectF = this.v;
            RectF rectF2 = this.w;
            rectF.set(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i2 = this.q;
            rectF2.set(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) i2, (float) i2);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i3 = this.q;
            matrix.postScale(f2, f2, ((float) i3) / 2.0f, ((float) i3) / 2.0f);
        }
    }

    public final AnimatorSet b(pt9 pt9, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f2};
        jr5 jr5 = this.s;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(jr5, property, fArr);
        pt9.d("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(jr5, View.SCALE_X, new float[]{f3});
        pt9.d("scale").a(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(jr5, View.SCALE_Y, new float[]{f3});
        pt9.d("scale").a(ofFloat3);
        arrayList.add(ofFloat3);
        Matrix matrix = this.x;
        a(f4, matrix);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(jr5, new v97(), new lr5(this), new Matrix[]{new Matrix(matrix)});
        pt9.d("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        cjf.M(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(float f2, float f3, float f4, int i2, int i3) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
        jr5 jr5 = this.s;
        ofFloat.addUpdateListener(new mr5(this, jr5.getAlpha(), f2, jr5.getScaleX(), f3, jr5.getScaleY(), this.p, f4, new Matrix(this.x)));
        arrayList.add(ofFloat);
        cjf.M(animatorSet, arrayList);
        Context context = jr5.getContext();
        animatorSet.setDuration((long) ld8.n0(i2, jr5.getContext().getResources().getInteger(zic.material_motion_duration_long_1), context));
        animatorSet.setInterpolator(ld8.o0(jr5.getContext(), i3, xg.b));
        return animatorSet;
    }

    public abstract float e();

    public void f(Rect rect) {
        int i2 = 0;
        if (this.f) {
            i2 = Math.max((this.k - this.s.getSizeDimension()) / 2, 0);
        }
        float e2 = this.g ? e() + this.j : c44.DEFAULT_ASPECT_RATIO;
        int max = Math.max(i2, (int) Math.ceil((double) e2));
        int max2 = Math.max(i2, (int) Math.ceil((double) (e2 * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    public abstract void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i2);

    public abstract void h();

    public abstract void i();

    public abstract void j(int[] iArr);

    public abstract void k(float f2, float f3, float f4);

    public final void l() {
    }

    public void m(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable != null) {
            ru4.h(drawable, ld8.r0(colorStateList));
        }
    }

    public final void n(j4e j4e) {
        this.a = j4e;
        bh8 bh8 = this.b;
        if (bh8 != null) {
            bh8.setShapeAppearanceModel(j4e);
        }
        Drawable drawable = this.c;
        if (drawable instanceof u4e) {
            ((u4e) drawable).setShapeAppearanceModel(j4e);
        }
        jq0 jq0 = this.d;
        if (jq0 != null) {
            jq0.o = j4e;
            jq0.invalidateSelf();
        }
    }

    public abstract boolean o();

    public abstract void p();

    public final void q() {
        Rect rect = this.u;
        f(rect);
        bs0.q(this.e, "Didn't initialize content background");
        boolean o2 = o();
        wie wie = this.t;
        if (o2) {
            qr5.super.setBackgroundDrawable(new InsetDrawable(this.e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            LayerDrawable layerDrawable = this.e;
            if (layerDrawable != null) {
                qr5.super.setBackgroundDrawable(layerDrawable);
            } else {
                wie.getClass();
            }
        }
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        jr5 jr5 = (jr5) wie.b;
        jr5.x0.set(i2, i3, i4, i5);
        int i6 = jr5.z;
        jr5.setPadding(i2 + i6, i3 + i6, i4 + i6, i5 + i6);
    }
}
