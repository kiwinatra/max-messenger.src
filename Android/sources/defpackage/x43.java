package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: x43  reason: default package */
public final class x43 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b53 b;
    public final /* synthetic */ Drawable c;

    public /* synthetic */ x43(b53 b53, Drawable drawable, int i) {
        this.a = i;
        this.b = b53;
        this.c = drawable;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                x43.super.invalidateDrawable(this.c);
                return;
            default:
                x43.super.unscheduleDrawable(this.c);
                return;
        }
    }
}
