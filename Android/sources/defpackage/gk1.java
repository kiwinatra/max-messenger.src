package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.math.MathKt;

/* renamed from: gk1  reason: default package */
public final class gk1 extends uh {
    public final Lazy Y;

    public gk1() {
        this(-1);
    }

    public static final void o(gk1 gk1, View view, boolean z) {
        gk1.getClass();
        oi1 oi1 = view instanceof oi1 ? (oi1) view : null;
        if (oi1 != null) {
            oi1.a(z);
        }
        if (z) {
            view.setClipToOutline(true);
            kne.i(view, new Rect(0, 0, view.getWidth(), view.getHeight()), vo4.c().getDisplayMetrics().density * c44.DEFAULT_ASPECT_RATIO);
        }
    }

    public final Animator l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (z && view2 != null) {
            p(animatorSet, view2, true);
        } else if (!z && view != null) {
            p(animatorSet, view, false);
        }
        return animatorSet;
    }

    public final void n(View view) {
    }

    public final void p(AnimatorSet animatorSet, View view, boolean z) {
        int i;
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.addListener(new wg1(this, view, z, view, z, view, z, 1));
        List createListBuilder = CollectionsKt.createListBuilder();
        if (z) {
            ((c91) ((b91) this.Y.getValue())).getClass();
            i = MathKt.roundToInt(((float) 174) * vo4.c().getDisplayMetrics().density);
        } else {
            i = view.getHeight();
        }
        int height = z ? view.getHeight() : 0;
        pg pgVar = new pg("bounds", i);
        int[] iArr = {i, height};
        oi1 oi1 = null;
        ObjectAnimator ofInt = ObjectAnimator.ofInt((Object) null, pgVar, iArr);
        ofInt.addUpdateListener(new yg(view, pgVar, 2));
        createListBuilder.add(ofInt);
        if (view instanceof oi1) {
            oi1 = (oi1) view;
        }
        if (oi1 != null) {
            oi1.C(this.o, createListBuilder, z);
        }
        animatorSet.playTogether(CollectionsKt.build(createListBuilder));
    }

    public gk1(long j) {
        super(j, 2);
        this.Y = oh1.a.c();
    }
}
