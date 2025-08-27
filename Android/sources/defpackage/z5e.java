package defpackage;

import android.view.View;

/* renamed from: z5e  reason: default package */
public final /* synthetic */ class z5e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a6e b;

    public /* synthetic */ z5e(a6e a6e, int i) {
        this.a = i;
        this.b = a6e;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ((View) this.b.getParent()).performClick();
                return;
            default:
                ((View) this.b.getParent()).performClick();
                return;
        }
    }
}
