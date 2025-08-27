package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.WeakHashMap;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect c = new Rect();
    public final RectF d = new RectF();
    public final RectF e = new RectF();
    public final int[] f = new int[2];
    public float g;
    public float h;

    public FabTransformationBehavior() {
    }

    public static float B(xe8 xe8, qt9 qt9, float f2) {
        long j = qt9.a;
        qt9 d2 = ((pt9) xe8.b).d("expansion");
        return xg.a(f2, c44.DEFAULT_ASPECT_RATIO, qt9.b().getInterpolation(((float) (((d2.a + d2.b) + 17) - j)) / ((float) qt9.b)));
    }

    public static Pair y(float f2, float f3, boolean z, xe8 xe8) {
        qt9 qt9;
        qt9 qt92;
        int i;
        if (f2 == c44.DEFAULT_ASPECT_RATIO || f3 == c44.DEFAULT_ASPECT_RATIO) {
            qt92 = ((pt9) xe8.b).d("translationXLinear");
            qt9 = ((pt9) xe8.b).d("translationYLinear");
        } else if ((!z || f3 >= c44.DEFAULT_ASPECT_RATIO) && (z || i <= 0)) {
            qt92 = ((pt9) xe8.b).d("translationXCurveDownwards");
            qt9 = ((pt9) xe8.b).d("translationYCurveDownwards");
        } else {
            qt92 = ((pt9) xe8.b).d("translationXCurveUpwards");
            qt9 = ((pt9) xe8.b).d("translationYCurveUpwards");
        }
        return new Pair(qt92, qt9);
    }

    public final float A(View view, View view2, cd4 cd4) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        C(view, rectF);
        rectF.offset(this.g, this.h);
        C(view2, rectF2);
        cd4.getClass();
        return (rectF2.centerY() - rectF.centerY()) + c44.DEFAULT_ASPECT_RATIO;
    }

    public final void C(View view, RectF rectF) {
        rectF.set(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    public abstract xe8 D(Context context, boolean z);

    public final boolean f(View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof jr5)) {
            return false;
        } else {
            int expandedComponentIdHint = ((jr5) view2).getExpandedComponentIdHint();
            return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
        }
    }

    public final void g(wz3 wz3) {
        if (wz3.h == 0) {
            wz3.h = 80;
        }
    }

    public final AnimatorSet x(View view, View view2, boolean z, boolean z2) {
        ObjectAnimator objectAnimator;
        ArrayList arrayList;
        ObjectAnimator objectAnimator2;
        ObjectAnimator objectAnimator3;
        ObjectAnimator objectAnimator4;
        View view3 = view;
        View view4 = view2;
        boolean z3 = z;
        xe8 D = D(view2.getContext(), z3);
        if (z3) {
            this.g = view.getTranslationX();
            this.h = view.getTranslationY();
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        WeakHashMap weakHashMap = gag.a;
        float i = v9g.i(view2) - v9g.i(view);
        if (z3) {
            if (!z2) {
                view4.setTranslationZ(-i);
            }
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Z, new float[]{0.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Z, new float[]{-i});
        }
        ((pt9) D.b).d("elevation").a(objectAnimator);
        arrayList2.add(objectAnimator);
        RectF rectF = this.d;
        float z4 = z(view3, view4, (cd4) D.c);
        float A = A(view3, view4, (cd4) D.c);
        Pair y = y(z4, A, z3, D);
        qt9 qt9 = (qt9) y.first;
        qt9 qt92 = (qt9) y.second;
        if (z3) {
            if (!z2) {
                view4.setTranslationX(-z4);
                view4.setTranslationY(-A);
            }
            arrayList = arrayList3;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{0.0f});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{0.0f});
            float B = B(D, qt9, -z4);
            float B2 = B(D, qt92, -A);
            Rect rect = this.c;
            view4.getWindowVisibleDisplayFrame(rect);
            rectF.set(rect);
            RectF rectF2 = this.e;
            C(view4, rectF2);
            rectF2.offset(B, B2);
            rectF2.intersect(rectF);
            rectF.set(rectF2);
            objectAnimator2 = ofFloat2;
            objectAnimator3 = ofFloat;
        } else {
            arrayList = arrayList3;
            objectAnimator3 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{-z4});
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{-A});
        }
        qt9.a(objectAnimator3);
        qt92.a(objectAnimator2);
        arrayList2.add(objectAnimator3);
        arrayList2.add(objectAnimator2);
        rectF.width();
        rectF.height();
        float z5 = z(view3, view4, (cd4) D.c);
        float A2 = A(view3, view4, (cd4) D.c);
        Pair y2 = y(z5, A2, z3, D);
        qt9 qt93 = (qt9) y2.first;
        qt9 qt94 = (qt9) y2.second;
        Property property = View.TRANSLATION_X;
        if (!z3) {
            z5 = this.g;
        }
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view3, property, new float[]{z5});
        Property property2 = View.TRANSLATION_Y;
        if (!z3) {
            A2 = this.h;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view3, property2, new float[]{A2});
        qt93.a(ofFloat3);
        qt94.a(ofFloat4);
        arrayList2.add(ofFloat3);
        arrayList2.add(ofFloat4);
        if (view4 instanceof ViewGroup) {
            View findViewById = view4.findViewById(agc.mtrl_child_content_container);
            ViewGroup viewGroup = findViewById != null ? findViewById instanceof ViewGroup ? (ViewGroup) findViewById : null : (ViewGroup) view4;
            if (viewGroup != null) {
                if (z3) {
                    if (!z2) {
                        nz2.a.set(viewGroup, Float.valueOf(c44.DEFAULT_ASPECT_RATIO));
                    }
                    objectAnimator4 = ObjectAnimator.ofFloat(viewGroup, nz2.a, new float[]{1.0f});
                } else {
                    objectAnimator4 = ObjectAnimator.ofFloat(viewGroup, nz2.a, new float[]{0.0f});
                }
                ((pt9) D.b).d("contentFade").a(objectAnimator4);
                arrayList2.add(objectAnimator4);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        cjf.M(animatorSet, arrayList2);
        animatorSet.addListener(new dg5(z3, view4, view3));
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList.get(i2));
        }
        return animatorSet;
    }

    public final float z(View view, View view2, cd4 cd4) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        C(view, rectF);
        rectF.offset(this.g, this.h);
        C(view2, rectF2);
        cd4.getClass();
        return (rectF2.centerX() - rectF.centerX()) + c44.DEFAULT_ASPECT_RATIO;
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
