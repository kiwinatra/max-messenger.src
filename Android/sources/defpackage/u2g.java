package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: u2g  reason: default package */
public final class u2g extends uh {
    public u2g() {
        super(0);
    }

    public final ey3 b() {
        return new uh(this.o, this.X);
    }

    public final Animator l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z && view2 != null) {
            arrayList.add(ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, new float[]{(float) view2.getHeight(), 0.0f}));
        } else if (!z && view != null) {
            arrayList.add(ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{(float) view.getHeight()}));
        }
        animatorSet.playTogether(arrayList);
        return animatorSet;
    }

    public final void n(View view) {
    }

    public u2g(long j) {
        super(j, 2);
    }
}
