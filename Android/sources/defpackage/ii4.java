package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: ii4  reason: default package */
public final class ii4 extends pge {
    public final ji4 c;

    public ii4(ji4 ji4) {
        this.c = ji4;
    }

    public final void a(ViewGroup viewGroup) {
        ji4 ji4 = this.c;
        qge qge = (qge) ji4.a;
        View view = qge.c.S0;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        ((qge) ji4.a).c(this);
        if (Log.isLoggable("FragmentManager", 2)) {
            qge.toString();
        }
    }

    public final void b(ViewGroup viewGroup) {
        ji4 ji4 = this.c;
        boolean b1 = ji4.b1();
        qge qge = (qge) ji4.a;
        if (b1) {
            qge.c(this);
            return;
        }
        Context context = viewGroup.getContext();
        View view = qge.c.S0;
        ata n1 = ji4.n1(context);
        if (n1 != null) {
            Animation animation = (Animation) n1.b;
            if (animation == null) {
                throw new IllegalStateException("Required value was null.".toString());
            } else if (qge.a != 1) {
                view.startAnimation(animation);
                qge.c(this);
            } else {
                viewGroup.startViewTransition(view);
                pc6 pc6 = new pc6(animation, viewGroup, view);
                pc6.setAnimationListener(new hi4(qge, viewGroup, view, this));
                view.startAnimation(pc6);
                if (Log.isLoggable("FragmentManager", 2)) {
                    qge.toString();
                }
            }
        } else {
            throw new IllegalStateException("Required value was null.".toString());
        }
    }
}
