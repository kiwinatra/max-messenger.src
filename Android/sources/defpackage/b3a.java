package defpackage;

import android.view.View;

/* renamed from: b3a  reason: default package */
public final /* synthetic */ class b3a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e3a b;

    public /* synthetic */ b3a(e3a e3a, int i) {
        this.a = i;
        this.b = e3a;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                e3a e3a = this.b;
                e3a.y.requestLayout();
                e3a.z.requestLayout();
                e3a.x.requestLayout();
                e3a.X.requestLayout();
                e3a.Z.requestLayout();
                return;
            default:
                ((View) this.b.c).setVisibility(0);
                return;
        }
    }
}
