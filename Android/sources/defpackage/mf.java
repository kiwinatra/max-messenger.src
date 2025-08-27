package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* renamed from: mf  reason: default package */
public final class mf implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ mf(View view, int i) {
        this.a = i;
        this.b = view;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        View view2 = this.b;
        switch (this.a) {
            case 0:
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = gag.a;
                t9g.c(view);
                return;
            default:
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = gag.a;
                t9g.c(view2);
                return;
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        int i = this.a;
    }
}
