package defpackage;

import android.animation.Animator;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: ecg  reason: default package */
public final class ecg {
    public final WeakReference a;

    public ecg(View view) {
        this.a = new WeakReference(view);
    }

    public final void a(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void b() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(fcg fcg) {
        View view = (View) this.a.get();
        if (view == null) {
            return;
        }
        if (fcg != null) {
            view.animate().setListener(new z6(fcg, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    public final void e(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
