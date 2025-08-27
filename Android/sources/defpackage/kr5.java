package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: kr5  reason: default package */
public final class kr5 extends AnimatorListenerAdapter {
    public boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ er7 c;
    public final /* synthetic */ qr5 o;

    public kr5(qr5 qr5, boolean z, er7 er7) {
        this.o = qr5;
        this.b = z;
        this.c = er7;
    }

    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        qr5 qr5 = this.o;
        qr5.r = 0;
        qr5.l = null;
        if (!this.a) {
            boolean z = this.b;
            qr5.s.a(z ? 8 : 4, z);
            er7 er7 = this.c;
            if (er7 != null) {
                ((iq) er7.b).Q();
            }
        }
    }

    public final void onAnimationStart(Animator animator) {
        qr5 qr5 = this.o;
        qr5.s.a(0, this.b);
        qr5.r = 1;
        qr5.l = animator;
        this.a = false;
    }
}
