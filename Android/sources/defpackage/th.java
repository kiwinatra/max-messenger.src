package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Chronometer;
import java.util.WeakHashMap;

/* renamed from: th  reason: default package */
public final class th extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ View c;
    public final /* synthetic */ View o;
    public final /* synthetic */ View v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public th(npg npg, boolean z, Chronometer chronometer, View view, View view2, View view3) {
        this.x = npg;
        this.b = z;
        this.v = chronometer;
        this.c = view;
        this.o = view2;
        this.w = view3;
    }

    public void onAnimationCancel(Animator animator) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                uh uhVar = (uh) this.w;
                View view = this.c;
                if (view != null) {
                    uhVar.n(view);
                }
                View view2 = this.o;
                if (view2 != null && view2.getParent() == (viewGroup = (ViewGroup) this.v)) {
                    viewGroup.removeView(view2);
                }
                uhVar.k((cy3) this.x, this);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        Object obj = this.w;
        View view = this.c;
        Object obj2 = this.x;
        View view2 = this.v;
        boolean z = this.b;
        switch (this.a) {
            case 0:
                uh uhVar = (uh) obj;
                if (!uhVar.v && uhVar.y != null) {
                    if (view != null && (!z || uhVar.X)) {
                        ((ViewGroup) view2).removeView(view);
                    }
                    uhVar.k((cy3) obj2, this);
                    if (z && view != null) {
                        uhVar.n(view);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (z) {
                    Chronometer chronometer = (Chronometer) view2;
                    chronometer.setRotation(c44.DEFAULT_ASPECT_RATIO);
                    chronometer.setVisibility(8);
                    a4a a4a = (a4a) ((npg) obj2).b;
                    if (a4a != null) {
                        b4a b4a = a4a.a;
                        b4a.D0.i();
                        WeakHashMap weakHashMap = gag.a;
                        t9g.c((View) b4a.c);
                    }
                } else {
                    view.setVisibility(8);
                    this.o.setVisibility(8);
                    ((View) obj).setVisibility(8);
                }
                animator.removeAllListeners();
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                Chronometer chronometer = (Chronometer) this.v;
                boolean z = this.b;
                if (z) {
                    chronometer.setBase(SystemClock.elapsedRealtime());
                    chronometer.stop();
                    this.c.setVisibility(0);
                    this.o.setVisibility(0);
                    ((View) this.w).setVisibility(0);
                } else {
                    chronometer.setBase(SystemClock.elapsedRealtime());
                    chronometer.start();
                    chronometer.setVisibility(0);
                }
                a4a a4a = (a4a) ((npg) this.x).b;
                if (a4a != null) {
                    b4a b4a = a4a.a;
                    float rotation = b4a.F0.getRotation();
                    if (z) {
                        npg npg = b4a.W0;
                        npg.getClass();
                        npg.t(b4a.I0.getRotation(), rotation, b4a.V0.y, b4a.J0, b4a.M0);
                        return;
                    }
                    npg npg2 = b4a.W0;
                    float rotation2 = b4a.O0.getRotation();
                    View[] viewArr = {b4a.O0};
                    npg2.getClass();
                    npg.t(rotation2, rotation, (he) null, viewArr);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public th(uh uhVar, cy3 cy3, View view, View view2, ViewGroup viewGroup, boolean z) {
        this.c = view;
        this.o = view2;
        this.v = viewGroup;
        this.w = uhVar;
        this.x = cy3;
        this.b = z;
    }
}
