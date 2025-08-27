package defpackage;

import android.view.View;

/* renamed from: gv7  reason: default package */
public final class gv7 implements jv7, View.OnAttachStateChangeListener {
    public lv7 a;

    public final ju7 getLifecycle() {
        return this.a;
    }

    public final void onViewAttachedToWindow(View view) {
        if (this.a.d == iu7.a) {
            this.a = new lv7(this);
        }
        this.a.e(hu7.ON_START);
    }

    public final void onViewDetachedFromWindow(View view) {
        if (this.a.d.a(iu7.c)) {
            this.a.e(hu7.ON_DESTROY);
        }
    }
}
