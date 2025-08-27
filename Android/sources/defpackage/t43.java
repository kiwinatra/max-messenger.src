package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: t43  reason: default package */
public final class t43 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v43 b;
    public final /* synthetic */ Drawable c;
    public final /* synthetic */ Runnable o;
    public final /* synthetic */ long v;

    public /* synthetic */ t43(v43 v43, Drawable drawable, Runnable runnable, long j, int i) {
        this.a = i;
        this.b = v43;
        this.c = drawable;
        this.o = runnable;
        this.v = j;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                t43.super.scheduleDrawable(this.c, this.o, this.v);
                return;
            default:
                t43.super.scheduleDrawable(this.c, this.o, this.v);
                return;
        }
    }
}
