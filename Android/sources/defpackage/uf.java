package defpackage;

import android.animation.Animator;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.WindowManager;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.messages.suggests.SuggestsFragment;
import ru.ok.messages.video.widgets.FloatingVideoView;

/* renamed from: uf  reason: default package */
public final class uf implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void A(Animator animator) {
    }

    private final void B(Animator animator) {
    }

    private final void C(Animator animator) {
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

    private final void f(Animator animator) {
    }

    private final void g(Animator animator) {
    }

    private final void h(Animator animator) {
    }

    private final void i(Animator animator) {
    }

    private final void j(Animator animator) {
    }

    private final void k(Animator animator) {
    }

    private final void l(Animator animator) {
    }

    private final void m(Animator animator) {
    }

    private final void n(Animator animator) {
    }

    private final void o(Animator animator) {
    }

    private final void p(Animator animator) {
    }

    private final void q(Animator animator) {
    }

    private final void r(Animator animator) {
    }

    private final void s(Animator animator) {
    }

    private final void t(Animator animator) {
    }

    private final void u(Animator animator) {
    }

    private final void v(Animator animator) {
    }

    private final void w(Animator animator) {
    }

    private final void x(Animator animator) {
    }

    private final void y(Animator animator) {
    }

    private final void z(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                return;
            case 1:
                ((g60) this.b).x0 = false;
                return;
            case 2:
                rd5 rd5 = (rd5) this.b;
                rd5.y0 = null;
                rd5.requestLayout();
                return;
            case 3:
                return;
            case 4:
                d99 d99 = (d99) this.b;
                d99.O0 = null;
                d99.G0.setForeground((Drawable) null);
                d99.U().setAlpha(150);
                return;
            case 5:
                xmb xmb = (xmb) this.b;
                xmb.b.l(xmb.a.getX(), xmb.a.getY());
                xmb.c();
                return;
            case 6:
                nqc nqc = (nqc) this.b;
                nqc.a = false;
                nqc.b = null;
                return;
            case 7:
            case 8:
            case 9:
            case 10:
                return;
            default:
                ((y6g) this.b).A0 = null;
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                return;
            case 1:
                g60 g60 = (g60) obj;
                g60.x0 = false;
                g60.w0 = null;
                return;
            case 2:
                rd5 rd5 = (rd5) obj;
                rd5.y0 = null;
                rd5.requestLayout();
                return;
            case 3:
                int i = FloatingVideoView.C0;
                FloatingVideoView floatingVideoView = (FloatingVideoView) obj;
                floatingVideoView.getClass();
                a33 a33 = ym.v.c().a;
                WindowManager.LayoutParams layoutParams = floatingVideoView.z0;
                int i2 = layoutParams.x;
                int i3 = layoutParams.y;
                a33.j(i2, "app.video.pip.pos.x");
                a33.j(i3, "app.video.pip.pos.y");
                return;
            case 4:
                d99 d99 = (d99) obj;
                d99.O0 = null;
                d99.G0.setForeground((Drawable) null);
                d99.U().setAlpha(150);
                return;
            case 5:
                xmb xmb = (xmb) obj;
                xmb.b.l(xmb.a.getX(), xmb.a.getY());
                xmb.c();
                return;
            case 6:
                nqc nqc = (nqc) obj;
                nqc.a = false;
                nqc.b = null;
                return;
            case 7:
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 8:
                ((f1f) obj).w = null;
                return;
            case 9:
                ((SuggestsFragment) obj).U2(false);
                return;
            case 10:
                ViewGroup viewGroup = (ViewGroup) obj;
                viewGroup.removeView(viewGroup.findViewById(mhc.swipe_fade));
                return;
            default:
                ((y6g) obj).A0 = null;
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((OneMeButton) this.b).setClickable(false);
                return;
            case 1:
                ((g60) this.b).setVisibility(0);
                return;
            default:
                return;
        }
    }
}
