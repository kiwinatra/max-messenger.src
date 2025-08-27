package defpackage;

import android.view.View;

/* renamed from: uff  reason: default package */
public final /* synthetic */ class uff implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vff b;

    public /* synthetic */ uff(vff vff, int i) {
        this.a = i;
        this.b = vff;
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
