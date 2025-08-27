package defpackage;

/* renamed from: k8g  reason: default package */
public final /* synthetic */ class k8g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m8g b;
    public final /* synthetic */ z94 c;

    public /* synthetic */ k8g(m8g m8g, z94 z94, int i) {
        this.a = i;
        this.b = m8g;
        this.c = z94;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                m8g m8g = this.b;
                m8g.getClass();
                int i = v0g.a;
                tc5 tc5 = ((nc5) m8g.b).a;
                tc5.getClass();
                wb4 wb4 = tc5.A0;
                td J = wb4.J();
                wb4.K(J, 1015, new kb4(J, this.c, 1));
                return;
            default:
                m8g m8g2 = this.b;
                z94 z94 = this.c;
                m8g2.getClass();
                synchronized (z94) {
                }
                int i2 = v0g.a;
                wb4 wb42 = ((nc5) m8g2.b).a.A0;
                td g = wb42.g((nz8) wb42.o.v);
                wb42.K(g, 1020, new ib4(2, g, z94));
                return;
        }
    }
}
