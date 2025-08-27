package defpackage;

/* renamed from: i8g  reason: default package */
public final /* synthetic */ class i8g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object o;

    public /* synthetic */ i8g(Object obj, int i, long j, int i2) {
        this.a = i2;
        this.o = obj;
        this.b = i;
        this.c = j;
    }

    public final void run() {
        long j = this.c;
        int i = this.b;
        Object obj = this.o;
        switch (this.a) {
            case 0:
                npg npg = (npg) obj;
                npg.getClass();
                int i2 = t0g.a;
                vb4 vb4 = ((mc5) npg.c).a.z0;
                sd M = vb4.M((mz8) vb4.o.e);
                vb4.Q(M, 1018, new ob4(M, i, j));
                return;
            default:
                m8g m8g = (m8g) obj;
                m8g.getClass();
                int i3 = v0g.a;
                wb4 wb4 = ((nc5) m8g.b).a.A0;
                td g = wb4.g((nz8) wb4.o.v);
                wb4.K(g, 1018, new hb4(g, i, j));
                return;
        }
    }
}
