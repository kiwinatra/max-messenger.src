package defpackage;

/* renamed from: ps3  reason: default package */
public final /* synthetic */ class ps3 implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qs3 b;
    public final /* synthetic */ dm3 c;

    public /* synthetic */ ps3(qs3 qs3, dm3 dm3, int i) {
        this.a = i;
        this.b = qs3;
        this.c = dm3;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                qs3 qs3 = this.b;
                if (qs3.K0.n() == 0) {
                    this.c.l1(qs3.K0);
                    return;
                }
                return;
            default:
                this.c.p0(this.b.K0);
                return;
        }
    }
}
