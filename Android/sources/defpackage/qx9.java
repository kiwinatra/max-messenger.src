package defpackage;

/* renamed from: qx9  reason: default package */
public final /* synthetic */ class qx9 implements hs6 {
    public final /* synthetic */ qrf a;

    public /* synthetic */ qx9(qrf qrf) {
        this.a = qrf;
    }

    public void a(is6 is6, gs6 gs6, long j) {
        qrf qrf = this.a;
        n79.o(qrf.x0);
        n79.n(!qrf.B0);
        p94.a();
        qrf.Z.add(new rx9(gs6, j));
        qrf.v0.put(gs6.a, new sx9(is6, j));
        if (!qrf.z0) {
            gk4 gk4 = qrf.x0;
            gk4.getClass();
            gk4.c(3, qrf.y, new je6(qrf.b, gs6.c, gs6.d, 1.0f, 0));
            qrf.z0 = true;
            return;
        }
        qrf.a();
    }
}
