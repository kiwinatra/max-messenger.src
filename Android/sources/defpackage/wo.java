package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* renamed from: wo  reason: default package */
public final class wo implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener a;
    public final /* synthetic */ xo b;

    public wo(xo xoVar, ro roVar) {
        this.b = xoVar;
        this.a = roVar;
    }

    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.b.N0.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.a);
        }
    }
}
