package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: z43  reason: default package */
public final class z43 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b53 b;
    public final /* synthetic */ Drawable c;
    public final /* synthetic */ Runnable o;
    public final /* synthetic */ long v;

    public /* synthetic */ z43(b53 b53, Drawable drawable, Runnable runnable, long j, int i) {
        this.a = i;
        this.b = b53;
        this.c = drawable;
        this.o = runnable;
        this.v = j;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                z43.super.scheduleDrawable(this.c, this.o, this.v);
                return;
            default:
                z43.super.scheduleDrawable(this.c, this.o, this.v);
                return;
        }
    }
}
