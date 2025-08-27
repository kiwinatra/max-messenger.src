package defpackage;

import android.view.animation.Animation;
import androidx.mediarouter.app.d;

/* renamed from: fv8  reason: default package */
public final class fv8 implements Animation.AnimationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fv8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        switch (this.a) {
            case 0:
                ((d) this.b).k(true);
                return;
            default:
                dw8 dw8 = ((bw8) this.b).v0;
                dw8.H0 = false;
                dw8.o();
                return;
        }
    }

    public final void onAnimationRepeat(Animation animation) {
        int i = this.a;
    }

    public final void onAnimationStart(Animation animation) {
        switch (this.a) {
            case 0:
                return;
            default:
                ((bw8) this.b).v0.H0 = true;
                return;
        }
    }
}
