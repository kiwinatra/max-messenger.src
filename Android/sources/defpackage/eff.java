package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;

/* renamed from: eff  reason: default package */
public final /* synthetic */ class eff implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ hff b;

    public /* synthetic */ eff(hff hff, int i) {
        this.a = i;
        this.b = hff;
    }

    public final void onClick(View view) {
        int i;
        hff hff = this.b;
        switch (this.a) {
            case 0:
                hff.c.invoke(k04.a);
                return;
            case 1:
                hff.c.invoke(k04.b);
                return;
            case 2:
                hff.c.invoke(k04.c);
                return;
            case 3:
                hff.c.invoke(k04.o);
                return;
            default:
                int i2 = hff.n;
                View view2 = hff.e;
                if (i2 == -1) {
                    hff.n = view2.getWidth();
                }
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(hff.l, property, new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
                ofFloat.setDuration(100);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(hff.m, property, new float[]{1.0f, c44.DEFAULT_ASPECT_RATIO});
                ofFloat2.setDuration(100);
                Context context = hff.a;
                if (context.getResources().getBoolean(ldc.isTablet)) {
                    i = (int) (((float) (hff.r * af8.values().length)) * context.getResources().getDisplayMetrics().density);
                } else {
                    i = context.getResources().getDisplayMetrics().widthPixels - 40;
                }
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{view2.getWidth(), i});
                if (ofInt != null) {
                    ofInt.addUpdateListener(new fff(hff, 1));
                }
                if (ofInt != null) {
                    ofInt.setDuration(100);
                }
                AnimatorSet animatorSet = hff.q;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = hff.p;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                hff.p = animatorSet3;
                animatorSet3.playSequentially(new Animator[]{ofFloat2, ofInt, ofFloat});
                AnimatorSet animatorSet4 = hff.p;
                if (animatorSet4 != null) {
                    animatorSet4.addListener(new gff(hff, 2));
                }
                AnimatorSet animatorSet5 = hff.p;
                if (animatorSet5 != null) {
                    animatorSet5.addListener(new gff(hff, 1));
                }
                AnimatorSet animatorSet6 = hff.p;
                if (animatorSet6 != null) {
                    animatorSet6.start();
                    return;
                }
                return;
        }
    }
}
