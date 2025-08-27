package defpackage;

import android.animation.AnimatorSet;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import java.util.Objects;

/* renamed from: li4  reason: default package */
public final class li4 extends pge {
    public final ji4 c;
    public AnimatorSet d;

    public li4(ji4 ji4) {
        this.c = ji4;
    }

    public final void a(ViewGroup viewGroup) {
        AnimatorSet animatorSet = this.d;
        ji4 ji4 = this.c;
        if (animatorSet == null) {
            ((qge) ji4.a).c(this);
            return;
        }
        qge qge = (qge) ji4.a;
        if (qge.g) {
            ni4.a.a(animatorSet);
        } else {
            animatorSet.end();
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            qge.toString();
        }
    }

    public final void b(ViewGroup viewGroup) {
        qge qge = (qge) this.c.a;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            qge.c(this);
            return;
        }
        animatorSet.start();
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(qge);
        }
    }

    public final void c(we0 we0) {
        qge qge = (qge) this.c.a;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            qge.c(this);
        } else if (Build.VERSION.SDK_INT >= 34 && qge.c.w0) {
            if (Log.isLoggable("FragmentManager", 2)) {
                qge.toString();
            }
            long a = mi4.a.a(animatorSet);
            long j = (long) (we0.c * ((float) a));
            if (j == 0) {
                j = 1;
            }
            if (j == a) {
                j = a - 1;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                animatorSet.toString();
                qge.toString();
            }
            ni4.a.b(animatorSet, j);
        }
    }

    public final void d(ViewGroup viewGroup) {
        ji4 ji4 = this.c;
        if (!ji4.b1()) {
            ata n1 = ji4.n1(viewGroup.getContext());
            this.d = n1 != null ? (AnimatorSet) n1.c : null;
            qge qge = (qge) ji4.a;
            a aVar = qge.c;
            boolean z = qge.a == 3;
            View view = aVar.S0;
            viewGroup.startViewTransition(view);
            AnimatorSet animatorSet = this.d;
            if (animatorSet != null) {
                animatorSet.addListener(new ki4(viewGroup, view, z, qge, this));
            }
            AnimatorSet animatorSet2 = this.d;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }
    }
}
