package defpackage;

import android.view.ViewTreeObserver;

/* renamed from: ddg  reason: default package */
public final class ddg implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ViewTreeObserver a;
    public final /* synthetic */ Runnable b;

    public ddg(ViewTreeObserver viewTreeObserver, g6 g6Var) {
        this.a = viewTreeObserver;
        this.b = g6Var;
    }

    public final boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver = this.a;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        this.b.run();
        return true;
    }
}
