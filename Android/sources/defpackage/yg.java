package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: yg  reason: default package */
public final /* synthetic */ class yg implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ pg c;

    public /* synthetic */ yg(View view, pg pgVar, int i) {
        this.a = i;
        this.b = view;
        this.c = pgVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                Drawable background = this.b.getBackground();
                if (background != null) {
                    background.setAlpha(this.c.a);
                    return;
                }
                return;
            case 1:
                View view = this.b;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams.height = this.c.a;
                view.setLayoutParams(marginLayoutParams);
                return;
            default:
                View view2 = this.b;
                kne.i(view2, new Rect(0, -((int) (vo4.c().getDisplayMetrics().density * 16.0f)), view2.getWidth(), this.c.a), vo4.c().getDisplayMetrics().density * 16.0f);
                return;
        }
    }
}
