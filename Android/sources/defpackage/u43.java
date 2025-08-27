package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: u43  reason: default package */
public final class u43 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v43 b;
    public final /* synthetic */ Drawable c;
    public final /* synthetic */ Runnable o;

    public /* synthetic */ u43(v43 v43, Drawable drawable, Runnable runnable, int i) {
        this.a = i;
        this.b = v43;
        this.c = drawable;
        this.o = runnable;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                u43.super.unscheduleDrawable(this.c, this.o);
                return;
            default:
                u43.super.unscheduleDrawable(this.c, this.o);
                return;
        }
    }
}
