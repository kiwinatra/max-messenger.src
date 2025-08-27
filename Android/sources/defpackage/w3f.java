package defpackage;

import android.view.Surface;

/* renamed from: w3f  reason: default package */
public final /* synthetic */ class w3f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tk3 b;
    public final /* synthetic */ Surface c;

    public /* synthetic */ w3f(tk3 tk3, Surface surface, int i) {
        this.a = i;
        this.b = tk3;
        this.c = surface;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.accept(new nc0(3, this.c));
                return;
            default:
                this.b.accept(new nc0(4, this.c));
                return;
        }
    }
}
