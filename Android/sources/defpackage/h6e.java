package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: h6e  reason: default package */
public final class h6e implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View a;
    public ViewTreeObserver b;
    public final Runnable c;
    public final boolean o = true;

    public h6e(View view, Runnable runnable) {
        this.a = view;
        this.b = view.getViewTreeObserver();
        this.c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        h6e h6e = new h6e(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(h6e);
        view.addOnAttachStateChangeListener(h6e);
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
        return this.o;
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
