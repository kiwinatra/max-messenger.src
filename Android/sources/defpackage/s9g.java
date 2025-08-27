package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.WeakHashMap;

/* renamed from: s9g  reason: default package */
public final class s9g implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
    public final WeakHashMap a = new WeakHashMap();

    public final void onGlobalLayout() {
    }

    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
