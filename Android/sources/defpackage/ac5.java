package defpackage;

/* renamed from: ac5  reason: default package */
public final /* synthetic */ class ac5 implements h08 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dob b;

    public /* synthetic */ ac5(dob dob, int i) {
        this.a = i;
        this.b = dob;
    }

    public final void invoke(Object obj) {
        rob rob = (rob) obj;
        switch (this.a) {
            case 0:
                rob.G(this.b.f);
                return;
            case 1:
                rob.r(this.b.f);
                return;
            case 2:
                rob.t((sqf) this.b.i.w);
                return;
            case 3:
                dob dob = this.b;
                boolean z = dob.g;
                rob.getClass();
                rob.d(dob.g);
                return;
            case 4:
                dob dob2 = this.b;
                rob.l(dob2.e, dob2.l);
                return;
            case 5:
                rob.h(this.b.e);
                return;
            case 6:
                rob.c(this.b.m);
                return;
            case 7:
                rob.n(sc5.t1(this.b));
                return;
            default:
                rob.x(this.b.n);
                return;
        }
    }
}
