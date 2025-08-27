package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* renamed from: al0  reason: default package */
public final class al0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ il0 b;

    public /* synthetic */ al0(il0 il0, int i) {
        this.a = i;
        this.b = il0;
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.c();
                return;
            case 1:
                this.b.d();
                return;
            case 2:
                this.b.c();
                return;
            default:
                this.b.d();
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                il0 il0 = this.b;
                tv3 tv3 = il0.j;
                int i = il0.c;
                int i2 = il0.a;
                int i3 = i - i2;
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) tv3;
                snackbarContentLayout.a.setAlpha(c44.DEFAULT_ASPECT_RATIO);
                long j = (long) i2;
                ViewPropertyAnimator duration = snackbarContentLayout.a.animate().alpha(1.0f).setDuration(j);
                TimeInterpolator timeInterpolator = snackbarContentLayout.c;
                long j2 = (long) i3;
                duration.setInterpolator(timeInterpolator).setStartDelay(j2).start();
                if (snackbarContentLayout.b.getVisibility() == 0) {
                    snackbarContentLayout.b.setAlpha(c44.DEFAULT_ASPECT_RATIO);
                    snackbarContentLayout.b.animate().alpha(1.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
                    return;
                }
                return;
            case 2:
                il0 il02 = this.b;
                tv3 tv32 = il02.j;
                int i4 = il02.b;
                SnackbarContentLayout snackbarContentLayout2 = (SnackbarContentLayout) tv32;
                snackbarContentLayout2.a.setAlpha(1.0f);
                long j3 = (long) i4;
                ViewPropertyAnimator duration2 = snackbarContentLayout2.a.animate().alpha(c44.DEFAULT_ASPECT_RATIO).setDuration(j3);
                TimeInterpolator timeInterpolator2 = snackbarContentLayout2.c;
                long j4 = (long) 0;
                duration2.setInterpolator(timeInterpolator2).setStartDelay(j4).start();
                if (snackbarContentLayout2.b.getVisibility() == 0) {
                    snackbarContentLayout2.b.setAlpha(1.0f);
                    snackbarContentLayout2.b.animate().alpha(c44.DEFAULT_ASPECT_RATIO).setDuration(j3).setInterpolator(timeInterpolator2).setStartDelay(j4).start();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public /* synthetic */ al0(il0 il0, int i, int i2) {
        this.a = i2;
        this.b = il0;
    }
}
