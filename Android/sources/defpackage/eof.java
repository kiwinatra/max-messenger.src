package defpackage;

import android.view.MotionEvent;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.Set;

/* renamed from: eof  reason: default package */
public final class eof extends FrameLayout {
    public dof a;

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.a != null) {
            int action = motionEvent.getAction();
            if (action == 0) {
                f3a f3a = (f3a) this.a;
                if (f3a.B0.getVisibility() == 0) {
                    ViewPropertyAnimator translationY = f3a.A0.animate().translationY((float) (-f3a.M0.q));
                    ch chVar = f3a.Y;
                    translationY.setInterpolator(chVar.a.n()).setDuration(chVar.a.b());
                }
                for (g1a g1a : (Set) f3a.a) {
                    if (g1a.A0.d == 2) {
                        of8 a2 = g1a.C0.a();
                        a2.i = true;
                        g1a.C0 = new pf8(a2);
                        g1a.c0();
                    }
                }
            } else if (action == 1) {
                f3a f3a2 = (f3a) this.a;
                if (f3a2.B0.getVisibility() == 0) {
                    ViewPropertyAnimator translationY2 = f3a2.A0.animate().translationY(c44.DEFAULT_ASPECT_RATIO);
                    ch chVar2 = f3a2.Y;
                    translationY2.setInterpolator(chVar2.a.n()).setDuration(chVar2.a.b());
                }
                f3a2.N(new zj0(0));
            } else if (action == 2) {
                for (g1a g1a2 : (Set) ((f3a) this.a).a) {
                    g1a2.D0 = false;
                    of8 a3 = g1a2.C0.a();
                    a3.a = s58.x;
                    g1a2.C0 = new pf8(a3);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setListener(dof dof) {
        this.a = dof;
    }
}
