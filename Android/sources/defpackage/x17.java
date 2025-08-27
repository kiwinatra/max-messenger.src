package defpackage;

/* renamed from: x17  reason: default package */
public final /* synthetic */ class x17 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d27 b;

    public /* synthetic */ x17(d27 d27, int i) {
        this.a = i;
        this.b = d27;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.l();
                return;
            default:
                d27 d27 = this.b;
                d27.L0 = true;
                d27.l();
                return;
        }
    }
}
