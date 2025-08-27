package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.WindowInsetsAnimation;

/* renamed from: h0h  reason: default package */
public final class h0h {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public h0h(s4h s4h) {
        this.a = 0;
        this.c = new Handler(Looper.getMainLooper());
        this.b = s4h;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "Bounds{lower=" + ((wh7) this.b) + " upper=" + ((wh7) this.c) + "}";
            default:
                return super.toString();
        }
    }

    public h0h(wh7 wh7, wh7 wh72) {
        this.a = 1;
        this.b = wh7;
        this.c = wh72;
    }

    public h0h(WindowInsetsAnimation.Bounds bounds) {
        this.a = 1;
        this.b = wh7.c(bounds.getLowerBound());
        this.c = wh7.c(bounds.getUpperBound());
    }
}
