package defpackage;

/* renamed from: ex1  reason: default package */
public final /* synthetic */ class ex1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ obd b;

    public /* synthetic */ ex1(obd obd, int i) {
        this.a = i;
        this.b = obd;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a();
                return;
            case 1:
                obd obd = this.b;
                if (obd != null) {
                    obd.a();
                    return;
                }
                return;
            default:
                this.b.a();
                return;
        }
    }
}
