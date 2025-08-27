package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: s43  reason: default package */
public final class s43 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v43 b;
    public final /* synthetic */ Drawable c;

    public /* synthetic */ s43(v43 v43, Drawable drawable, int i) {
        this.a = i;
        this.b = v43;
        this.c = drawable;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                s43.super.invalidateDrawable(this.c);
                return;
            default:
                s43.super.unscheduleDrawable(this.c);
                return;
        }
    }
}
