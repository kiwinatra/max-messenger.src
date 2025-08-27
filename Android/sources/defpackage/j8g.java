package defpackage;

/* renamed from: j8g  reason: default package */
public final /* synthetic */ class j8g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ npg b;
    public final /* synthetic */ z94 c;

    public /* synthetic */ j8g(npg npg, z94 z94, int i) {
        this.a = i;
        this.b = npg;
        this.c = z94;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                npg npg = this.b;
                z94 z94 = this.c;
                npg.getClass();
                synchronized (z94) {
                }
                int i = t0g.a;
                vb4 vb4 = ((mc5) npg.c).a.z0;
                vb4.Q(vb4.M((mz8) vb4.o.e), 1020, new db4(26));
                return;
            default:
                npg npg2 = this.b;
                npg2.getClass();
                int i2 = t0g.a;
                sc5 sc5 = ((mc5) npg2.c).a;
                sc5.getClass();
                vb4 vb42 = sc5.z0;
                sd P = vb42.P();
                vb42.Q(P, 1015, new db4(22, (Object) P, (Object) this.c));
                return;
        }
    }
}
