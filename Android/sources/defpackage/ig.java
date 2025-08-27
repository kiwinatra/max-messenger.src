package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
import kotlin.Pair;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: ig  reason: default package */
public final class ig implements Animator.AnimatorListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public ig(View view, boolean z) {
        this.b = z;
        this.c = view;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                View view = (View) this.c;
                view.setAlpha(1.0f);
                view.setVisibility(this.b ? 0 : 8);
                return;
            default:
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        int i = 8;
        boolean z = this.b;
        Object obj = this.c;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                view.setAlpha(1.0f);
                if (z) {
                    i = 0;
                }
                view.setVisibility(i);
                return;
            default:
                KProperty[] kPropertyArr = RecordControlsWidget.g1;
                RecordControlsWidget recordControlsWidget = (RecordControlsWidget) obj;
                recordControlsWidget.n0().setAlpha(1.0f);
                View n0 = recordControlsWidget.n0();
                float f = c44.DEFAULT_ASPECT_RATIO;
                n0.setTranslationX(c44.DEFAULT_ASPECT_RATIO);
                recordControlsWidget.o0().setAlpha(1.0f);
                recordControlsWidget.o0().setTranslationX(c44.DEFAULT_ASPECT_RATIO);
                recordControlsWidget.m0().setAlpha(1.0f);
                recordControlsWidget.m0().setTranslationX(c44.DEFAULT_ASPECT_RATIO);
                recordControlsWidget.s0().setAlpha(1.0f);
                Drawable v0 = recordControlsWidget.v0();
                fu4.k.f(recordControlsWidget.h0()).a().l().e.getClass();
                iq.a0(v0, -1);
                recordControlsWidget.j0().setScaleX(1.0f);
                recordControlsWidget.j0().setScaleY(1.0f);
                recordControlsWidget.j0().setAlpha(1.0f);
                if (z) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    recordControlsWidget.e1 = animatorSet;
                    animatorSet.playTogether(new Animator[]{i8b.b(recordControlsWidget.n0(), View.ALPHA, 1.0f, c44.DEFAULT_ASPECT_RATIO, 1000, 1000, 2, -1)});
                    AnimatorSet animatorSet2 = recordControlsWidget.e1;
                    if (animatorSet2 != null) {
                        animatorSet2.addListener(new wwc(recordControlsWidget, 12));
                    }
                    AnimatorSet animatorSet3 = recordControlsWidget.e1;
                    if (animatorSet3 != null) {
                        animatorSet3.start();
                    }
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    recordControlsWidget.c1 = animatorSet4;
                    animatorSet4.play(i8b.b(recordControlsWidget.m0(), View.TRANSLATION_X, c44.DEFAULT_ASPECT_RATIO, vo4.c().getDisplayMetrics().density * -4.0f, 1000, 1000, 2, -1));
                    AnimatorSet animatorSet5 = recordControlsWidget.c1;
                    if (animatorSet5 != null) {
                        animatorSet5.start();
                    }
                    recordControlsWidget.d1 = new AnimatorSet();
                    Pair pair = recordControlsWidget.U0;
                    if (pair != null) {
                        f = ((Number) pair.getSecond()).floatValue();
                    }
                    AnimatorSet animatorSet6 = recordControlsWidget.d1;
                    if (animatorSet6 != null) {
                        animatorSet6.play(i8b.b(recordControlsWidget.s0(), View.TRANSLATION_Y, f, f + ((float) MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density)), 1000, 1000, 2, -1));
                    }
                    AnimatorSet animatorSet7 = recordControlsWidget.d1;
                    if (animatorSet7 != null) {
                        animatorSet7.addListener(new lqc(recordControlsWidget, f, 1));
                    }
                    AnimatorSet animatorSet8 = recordControlsWidget.d1;
                    if (animatorSet8 != null) {
                        animatorSet8.start();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                if (this.b) {
                    ((View) this.c).setVisibility(0);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public ig(RecordControlsWidget recordControlsWidget, boolean z) {
        this.c = recordControlsWidget;
        this.b = z;
    }
}
