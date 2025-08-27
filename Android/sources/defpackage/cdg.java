package defpackage;

import android.view.ViewTreeObserver;

/* renamed from: cdg  reason: default package */
public final class cdg implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ViewTreeObserver a;
    public final /* synthetic */ edg b;

    public cdg(ViewTreeObserver viewTreeObserver, edg edg) {
        this.a = viewTreeObserver;
        this.b = edg;
    }

    public final void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver = this.a;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        this.b.b();
    }
}
