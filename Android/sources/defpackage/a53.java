package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: a53  reason: default package */
public final class a53 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b53 b;
    public final /* synthetic */ Drawable c;
    public final /* synthetic */ Runnable o;

    public /* synthetic */ a53(b53 b53, Drawable drawable, Runnable runnable, int i) {
        this.a = i;
        this.b = b53;
        this.c = drawable;
        this.o = runnable;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                a53.super.unscheduleDrawable(this.c, this.o);
                return;
            default:
                a53.super.unscheduleDrawable(this.c, this.o);
                return;
        }
    }
}
