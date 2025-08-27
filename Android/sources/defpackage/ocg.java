package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* renamed from: ocg  reason: default package */
public final class ocg implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ qcg c;
    public final /* synthetic */ ViewTreeObserver o;
    public final /* synthetic */ View v;

    public /* synthetic */ ocg(View view, qcg qcg, ViewTreeObserver viewTreeObserver, ViewGroup viewGroup, int i) {
        this.a = i;
        this.b = view;
        this.c = qcg;
        this.o = viewTreeObserver;
        this.v = viewGroup;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                this.b.removeOnAttachStateChangeListener(this);
                boolean isAttachedToWindow = view.isAttachedToWindow();
                View view2 = this.v;
                ViewTreeObserver viewTreeObserver = this.o;
                qcg qcg = this.c;
                if (!isAttachedToWindow) {
                    rcg.a(qcg, viewTreeObserver, (ViewGroup) view2);
                    return;
                }
                view.addOnAttachStateChangeListener(new ocg(view, qcg, viewTreeObserver, (ViewGroup) view2, 2));
                return;
            default:
                return;
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                return;
            case 1:
                this.b.removeOnAttachStateChangeListener(this);
                rcg.a(this.c, this.o, (ViewGroup) this.v);
                return;
            default:
                this.b.removeOnAttachStateChangeListener(this);
                rcg.a(this.c, this.o, (ViewGroup) this.v);
                return;
        }
    }
}
