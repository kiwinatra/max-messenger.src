package defpackage;

/* renamed from: g70  reason: default package */
public final /* synthetic */ class g70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wsb b;
    public final /* synthetic */ z94 c;

    public /* synthetic */ g70(wsb wsb, z94 z94, int i) {
        this.a = i;
        this.b = wsb;
        this.c = z94;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                wsb wsb = this.b;
                wsb.getClass();
                int i = t0g.a;
                sc5 sc5 = ((mc5) wsb.b).a;
                sc5.getClass();
                vb4 vb4 = sc5.z0;
                sd P = vb4.P();
                vb4.Q(P, 1007, new nb4(18, P, this.c));
                return;
            default:
                wsb wsb2 = this.b;
                z94 z94 = this.c;
                wsb2.getClass();
                synchronized (z94) {
                }
                int i2 = t0g.a;
                vb4 vb42 = ((mc5) wsb2.b).a.z0;
                vb42.Q(vb42.M((mz8) vb42.o.e), 1013, new db4(27));
                return;
        }
    }
}
