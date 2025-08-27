package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.functions.Function0;

/* renamed from: qma  reason: default package */
public final class qma implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public static final Handler w = new Handler(Looper.getMainLooper());
    public final View a;
    public final boolean b;
    public final Function0 c;
    public ViewTreeObserver o;
    public boolean v;

    public qma(View view, boolean z, of5 of5) {
        this.a = view;
        this.b = z;
        this.c = of5;
        this.o = view.getViewTreeObserver();
    }

    public final boolean onPreDraw() {
        boolean z = true;
        if (!this.v) {
            boolean booleanValue = ((Boolean) this.c.invoke()).booleanValue();
            if (booleanValue || this.b) {
                this.v = true;
                w.post(new o99(11, this));
            }
            z = booleanValue;
        }
        if (!z) {
            z68.i("OneShotOnPreDrawListener", "skipping frame", (Throwable) null);
        }
        return z;
    }

    public final void onViewAttachedToWindow(View view) {
        this.o = view.getViewTreeObserver();
    }

    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.o.isAlive();
        View view2 = this.a;
        if (isAlive) {
            this.o.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
