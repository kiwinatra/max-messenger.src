package defpackage;

/* renamed from: y60  reason: default package */
public final /* synthetic */ class y60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p7d b;
    public final /* synthetic */ z94 c;

    public /* synthetic */ y60(p7d p7d, z94 z94, int i) {
        this.a = i;
        this.b = p7d;
        this.c = z94;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                p7d p7d = this.b;
                p7d.getClass();
                int i = v0g.a;
                tc5 tc5 = ((nc5) p7d.c).a;
                tc5.getClass();
                wb4 wb4 = tc5.A0;
                td J = wb4.J();
                wb4.K(J, 1007, new kb4(J, this.c, 2));
                return;
            default:
                p7d p7d2 = this.b;
                z94 z94 = this.c;
                p7d2.getClass();
                synchronized (z94) {
                }
                int i2 = v0g.a;
                wb4 wb42 = ((nc5) p7d2.c).a.A0;
                td g = wb42.g((nz8) wb42.o.v);
                wb42.K(g, 1013, new kb4(g, z94, 0));
                return;
        }
    }
}
