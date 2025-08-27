package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.reflect.KProperty;
import one.me.android.root.RootController;
import ru.ok.messages.calls.views.IncomingCallControlsView;

/* renamed from: yy3  reason: default package */
public final class yy3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yy3(int i, Object obj) {
        this.a = i;
        this.c = obj;
        this.b = false;
    }

    public void onAnimationCancel(Animator animator) {
        Object obj = this.c;
        switch (this.a) {
            case 0:
                zy3 zy3 = (zy3) obj;
                zy3.b = null;
                zy3.h.invoke(Boolean.valueOf(this.b));
                return;
            case 1:
                this.b = true;
                return;
            case 2:
                this.b = true;
                return;
            case 4:
                KProperty[] kPropertyArr = RootController.z;
                ((RootController) obj).h0(this.b);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        int i = 0;
        Object obj = this.c;
        switch (this.a) {
            case 0:
                zy3 zy3 = (zy3) obj;
                zy3.b = null;
                zy3.h.invoke(Boolean.valueOf(this.b));
                return;
            case 1:
                if (this.b) {
                    this.b = false;
                    return;
                }
                jh5 jh5 = (jh5) obj;
                if (((Float) jh5.I0.getAnimatedValue()).floatValue() == c44.DEFAULT_ASPECT_RATIO) {
                    jh5.J0 = 0;
                    jh5.l(0);
                    return;
                }
                jh5.J0 = 2;
                jh5.B0.invalidate();
                return;
            case 2:
                if (!this.b) {
                    IncomingCallControlsView incomingCallControlsView = (IncomingCallControlsView) obj;
                    incomingCallControlsView.k(incomingCallControlsView.w, incomingCallControlsView.z, 1700, true);
                    return;
                }
                return;
            case 3:
                pk4 pk4 = (pk4) obj;
                ok8 ok8 = (ok8) ((mbc) pk4.d);
                ok8.getClass();
                boolean z = this.b;
                if (z) {
                    i = 8;
                }
                ok8.L0.setVisibility(i);
                ok8.K0.setVisibility(i);
                ((b4a) pk4.a).i0(z ? v3a.b : v3a.a);
                pk4.e = null;
                return;
            default:
                KProperty[] kPropertyArr = RootController.z;
                ((RootController) obj).h0(this.b);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((zy3) this.c).i.invoke(Boolean.valueOf(this.b));
                return;
            case 3:
                ((ok8) ((mbc) ((pk4) this.c).d)).v((Float) null, this.b);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public /* synthetic */ yy3(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }
}
