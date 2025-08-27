package defpackage;

/* renamed from: cw4  reason: default package */
public final /* synthetic */ class cw4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gw4 b;
    public final /* synthetic */ iw4 c;

    public /* synthetic */ cw4(gw4 gw4, iw4 iw4, int i) {
        this.a = i;
        this.b = gw4;
        this.c = iw4;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                gw4 gw4 = this.b;
                this.c.F(gw4.a, gw4.b);
                return;
            case 1:
                gw4 gw42 = this.b;
                this.c.D(gw42.a, gw42.b);
                return;
            case 2:
                gw4 gw43 = this.b;
                this.c.B(gw43.a, gw43.b);
                return;
            default:
                gw4 gw44 = this.b;
                this.c.E(gw44.a, gw44.b);
                return;
        }
    }
}
