package defpackage;

import android.graphics.Bitmap;

/* renamed from: n87  reason: default package */
public final /* synthetic */ class n87 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o87 b;
    public final /* synthetic */ Bitmap c;
    public final /* synthetic */ ea6 o;

    public /* synthetic */ n87(o87 o87, Bitmap bitmap, ea6 ea6, int i) {
        this.a = i;
        this.b = o87;
        this.c = bitmap;
        this.o = ea6;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b(this.c, this.o);
                return;
            default:
                this.b.b(this.c, this.o);
                return;
        }
    }
}
