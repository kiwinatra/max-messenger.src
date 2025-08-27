package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;

@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {
    public final qt9 c = new qt9(75);
    public final qt9 d = new qt9(0);

    public FabTransformationScrimBehavior() {
    }

    public final boolean f(View view, View view2) {
        return view2 instanceof jr5;
    }

    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public final AnimatorSet x(View view, View view2, boolean z, boolean z2) {
        ObjectAnimator objectAnimator;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        qt9 qt9 = z ? this.c : this.d;
        if (z) {
            if (!z2) {
                view2.setAlpha(c44.DEFAULT_ASPECT_RATIO);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{0.0f});
        }
        qt9.a(objectAnimator);
        arrayList.add(objectAnimator);
        AnimatorSet animatorSet = new AnimatorSet();
        cjf.M(animatorSet, arrayList);
        animatorSet.addListener(new eg5(view2, z));
        return animatorSet;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
