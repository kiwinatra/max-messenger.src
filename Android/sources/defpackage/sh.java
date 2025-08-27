package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* renamed from: sh  reason: default package */
public final class sh implements ViewTreeObserver.OnPreDrawListener {
    public final ViewGroup a;
    public final View b;
    public final View c;
    public final boolean o;
    public final cy3 v;
    public boolean w;
    public final /* synthetic */ uh x;

    public sh(uh uhVar, cy3 cy3, View view, View view2, ViewGroup viewGroup, boolean z) {
        this.x = uhVar;
        this.a = viewGroup;
        this.b = view;
        this.c = view2;
        this.o = z;
        this.v = cy3;
    }

    public final void a() {
        if (!this.w) {
            this.w = true;
            View view = this.c;
            if (view != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                }
            }
            this.x.m(this.a, this.b, this.c, this.o, true, this.v);
        }
    }

    public final boolean onPreDraw() {
        a();
        return true;
    }
}
