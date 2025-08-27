package defpackage;

/* renamed from: y17  reason: default package */
public final /* synthetic */ class y17 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e27 b;

    public /* synthetic */ y17(e27 e27, int i) {
        this.a = i;
        this.b = e27;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.q();
                return;
            default:
                e27 e27 = this.b;
                e27.L0 = true;
                e27.q();
                return;
        }
    }
}
