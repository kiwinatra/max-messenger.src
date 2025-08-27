package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: u3b  reason: default package */
public final class u3b implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View a;
    public ViewTreeObserver b;
    public final Runnable c;

    public u3b(View view, Runnable runnable) {
        this.a = view;
        this.b = view.getViewTreeObserver();
        this.c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            u3b u3b = new u3b(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(u3b);
            view.addOnAttachStateChangeListener(u3b);
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    public final boolean onPreDraw() {
        boolean isAlive = this.b.isAlive();
        View view = this.a;
        if (isAlive) {
            this.b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.c.run();
        return true;
    }

    public final void onViewAttachedToWindow(View view) {
        this.b = view.getViewTreeObserver();
    }

    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.b.isAlive();
        View view2 = this.a;
        if (isAlive) {
            this.b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
