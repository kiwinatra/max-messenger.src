package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: lk0  reason: default package */
public final class lk0 extends ye {
    public final /* synthetic */ int b;
    public final /* synthetic */ mk0 c;

    public /* synthetic */ lk0(mk0 mk0, int i) {
        this.b = i;
        this.c = mk0;
    }

    public final void a(Drawable drawable) {
        switch (this.b) {
            case 0:
                mk0 mk0 = this.c;
                mk0.setIndeterminate(false);
                mk0.b(mk0.b);
                return;
            default:
                mk0 mk02 = this.c;
                if (!mk02.w) {
                    mk02.setVisibility(mk02.x);
                    return;
                }
                return;
        }
    }
}
