package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: w31  reason: default package */
public final class w31 extends uh {
    public w31() {
        this(-1);
    }

    public final Animator l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z && view2 != null) {
            arrayList.add(ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f}));
        } else if (!z && view != null) {
            arrayList.add(ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f}));
        }
        animatorSet.playTogether(arrayList);
        return animatorSet;
    }

    public final void n(View view) {
    }

    public w31(long j) {
        super(j, 2);
    }
}
