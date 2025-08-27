package defpackage;

/* renamed from: wd6  reason: default package */
public final /* synthetic */ class wd6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xd6 b;

    public /* synthetic */ wd6(xd6 xd6, int i) {
        this.a = i;
        this.b = xd6;
    }

    public final void run() {
        int i = this.a;
        xd6 xd6 = this.b;
        switch (i) {
            case 0:
                xd6.z = false;
                if (xd6.w != null) {
                    xd6.w.stopCapture();
                }
                xd6.X = false;
                return;
            default:
                xd6.z = false;
                if (xd6.w != null) {
                    xd6.w.stopCapture();
                }
                xd6.w = null;
                xd6.X = false;
                if (xd6.v != null) {
                    xd6.v.dispose();
                }
                xd6.v = null;
                return;
        }
    }
}
