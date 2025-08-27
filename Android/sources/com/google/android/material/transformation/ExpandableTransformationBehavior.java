package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    public AnimatorSet b;

    public ExpandableTransformationBehavior() {
    }

    public void w(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.b;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet x = x(view, view2, z, z3);
        this.b = x;
        x.addListener(new z6(5, (Object) this));
        this.b.start();
        if (!z2) {
            this.b.end();
        }
    }

    public abstract AnimatorSet x(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
