package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* renamed from: di7  reason: default package */
public final class di7 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;

    public /* synthetic */ di7(int i) {
        this.a = i;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                view.requestApplyInsets();
                return;
            default:
                view.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = gag.a;
                t9g.c(view);
                return;
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        int i = this.a;
    }
}
