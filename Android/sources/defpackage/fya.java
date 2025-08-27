package defpackage;

/* renamed from: fya  reason: default package */
public final /* synthetic */ class fya implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gya b;

    public /* synthetic */ fya(gya gya, int i) {
        this.a = i;
        this.b = gya;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                gya gya = this.b;
                if (!gya.c.get()) {
                    gya.b.execute(new c70((Object) gya, true, 11));
                    return;
                }
                return;
            default:
                gya gya2 = this.b;
                if (!gya2.c.get()) {
                    gya2.b.execute(new c70((Object) gya2, false, 11));
                    return;
                }
                return;
        }
    }
}
