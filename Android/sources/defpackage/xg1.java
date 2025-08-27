package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;

/* renamed from: xg1  reason: default package */
public final class xg1 extends uh {
    public final Lazy Y;

    public xg1() {
        this(-1);
    }

    public static final void o(xg1 xg1, View view, boolean z) {
        xg1.getClass();
        mi1 mi1 = view instanceof mi1 ? (mi1) view : null;
        if (mi1 != null) {
            mi1.x(z);
        }
        if (z) {
            kne.i(view, new Rect(0, 0, view.getWidth(), view.getHeight()), c44.DEFAULT_ASPECT_RATIO);
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
        AnimatorSet animatorSet2 = animatorSet;
        View view2 = view;
        boolean z2 = z;
        animatorSet2.setInterpolator(new DecelerateInterpolator());
        wg1 wg1 = r0;
        wg1 wg12 = new wg1(this, view, z, view, z, view, z, 0);
        animatorSet2.addListener(wg1);
        List createListBuilder = CollectionsKt.createListBuilder();
        c91 c91 = (c91) ((b91) this.Y.getValue());
        c91.getClass();
        PointF pointF = c91.b;
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        float f = z2 ? 0.0f : 1.0f;
        float f2 = z2 ? 1.0f : 0.0f;
        jg jgVar = new jg("bounds", f);
        boolean z3 = view2 instanceof mi1;
        mi1 mi1 = z3 ? (mi1) view2 : null;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, jgVar, new float[]{f, f2});
        vg1 vg1 = r0;
        ObjectAnimator objectAnimator = ofFloat;
        boolean z4 = z3;
        vg1 vg12 = new vg1(ofFloat, this, z, view, pointF2, mi1);
        objectAnimator.addUpdateListener(vg1);
        if (z2) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{f, f2});
            ofFloat2.setDuration(50);
            createListBuilder.add(ofFloat2);
        }
        createListBuilder.add(objectAnimator);
        mi1 mi12 = z4 ? (mi1) view2 : null;
        if (mi12 != null) {
            mi12.y(this.o, createListBuilder, z2);
        }
        animatorSet2.playTogether(CollectionsKt.build(createListBuilder));
    }

    public xg1(long j) {
        super(j, 2);
        this.Y = oh1.a.c();
    }
}
