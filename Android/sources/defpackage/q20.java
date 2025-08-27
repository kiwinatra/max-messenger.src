package defpackage;

import android.animation.ValueAnimator;

/* renamed from: q20  reason: default package */
public final class q20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r20 b;

    public /* synthetic */ q20(r20 r20, int i) {
        this.a = i;
        this.b = r20;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ValueAnimator valueAnimator = this.b.q;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    return;
                }
                return;
            default:
                ValueAnimator valueAnimator2 = this.b.q;
                if (valueAnimator2 != null) {
                    valueAnimator2.start();
                    return;
                }
                return;
        }
    }
}
