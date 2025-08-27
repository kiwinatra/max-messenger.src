package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: eg5  reason: default package */
public final class eg5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public final /* synthetic */ View c;

    public eg5(View view) {
        this.c = view;
    }

    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationCancel(animator);
                this.b = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    this.c.setVisibility(4);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                if (!this.b) {
                    this.c.setVisibility(4);
                }
                this.b = false;
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                if (this.b) {
                    this.c.setVisibility(0);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public eg5(View view, boolean z) {
        this.b = z;
        this.c = view;
    }
}
