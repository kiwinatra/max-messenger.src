package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: r43  reason: default package */
public final class r43 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v43 b;
    public final /* synthetic */ Drawable c;

    public /* synthetic */ r43(v43 v43, Drawable drawable, int i) {
        this.a = i;
        this.b = v43;
        this.c = drawable;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                r43.super.invalidateDrawable(this.c);
                return;
            default:
                r43.super.unscheduleDrawable(this.c);
                return;
        }
    }
}
