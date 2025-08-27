package defpackage;

/* renamed from: xu  reason: default package */
public final /* synthetic */ class xu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ se2 b;

    public /* synthetic */ xu(se2 se2, int i) {
        this.a = i;
        this.b = se2;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                cv cvVar = this.b.x;
                return;
            default:
                cv cvVar2 = this.b.x;
                if (cvVar2 != null) {
                    ((gh2) cvVar2).s();
                    return;
                }
                return;
        }
    }
}
