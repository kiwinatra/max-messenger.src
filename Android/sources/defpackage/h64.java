package defpackage;

/* renamed from: h64  reason: default package */
public final /* synthetic */ class h64 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n64 b;

    public /* synthetic */ h64(n64 n64, int i) {
        this.a = i;
        this.b = n64;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.t();
                return;
            default:
                this.b.s(false);
                return;
        }
    }
}
