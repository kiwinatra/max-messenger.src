package defpackage;

import android.os.Handler;

/* renamed from: ivb  reason: default package */
public final class ivb implements jv7 {
    public static final ivb y = new ivb();
    public int a;
    public int b;
    public boolean c = true;
    public boolean o = true;
    public Handler v;
    public final lv7 w = new lv7(this);
    public final o99 x = new o99(20, this);

    public final void a() {
        int i = this.b + 1;
        this.b = i;
        if (i != 1) {
            return;
        }
        if (this.c) {
            this.w.e(hu7.ON_RESUME);
            this.c = false;
            return;
        }
        this.v.removeCallbacks(this.x);
    }

    public final ju7 getLifecycle() {
        return this.w;
    }
}
