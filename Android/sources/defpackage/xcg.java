package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: xcg  reason: default package */
public final class xcg implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ViewTreeObserver c;
    public final /* synthetic */ adg o;
    public final /* synthetic */ View v;

    public /* synthetic */ xcg(View view, ViewTreeObserver viewTreeObserver, adg adg, View view2, int i) {
        this.a = i;
        this.b = view;
        this.c = viewTreeObserver;
        this.o = adg;
        this.v = view2;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                this.b.removeOnAttachStateChangeListener(this);
                boolean isAttachedToWindow = view.isAttachedToWindow();
                View view2 = this.v;
                adg adg = this.o;
                ViewTreeObserver viewTreeObserver = this.c;
                if (!isAttachedToWindow) {
                    bs6.a(adg, view2, viewTreeObserver);
                    return;
                } else {
                    view.addOnAttachStateChangeListener(new xcg(view, viewTreeObserver, adg, view2, 1));
                    return;
                }
            default:
                return;
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                return;
            default:
                this.b.removeOnAttachStateChangeListener(this);
                bs6.a(this.o, this.v, this.c);
                return;
        }
    }
}
