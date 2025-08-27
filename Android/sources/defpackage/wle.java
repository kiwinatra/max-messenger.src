package defpackage;

import android.animation.Animator;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.math.MathKt;

/* renamed from: wle  reason: default package */
public final class wle implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ TextView c;

    public /* synthetic */ wle(boolean z, TextView textView, int i) {
        this.a = i;
        this.b = z;
        this.c = textView;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                boolean z = this.b;
                TextView textView = this.c;
                if (z) {
                    ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                    if (layoutParams != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMarginStart(0);
                        textView.setLayoutParams(marginLayoutParams);
                        textView.setVisibility(4);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                textView.setAlpha(1.0f);
                return;
            default:
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                boolean z = this.b;
                TextView textView = this.c;
                if (z) {
                    ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                    if (layoutParams != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMarginStart(0);
                        textView.setLayoutParams(marginLayoutParams);
                        textView.setVisibility(4);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                textView.setAlpha(1.0f);
                return;
            default:
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                return;
            default:
                boolean z = this.b;
                TextView textView = this.c;
                if (z) {
                    textView.setAlpha(c44.DEFAULT_ASPECT_RATIO);
                    return;
                }
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMarginStart(MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density));
                    textView.setLayoutParams(marginLayoutParams);
                    textView.setVisibility(0);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }
}
