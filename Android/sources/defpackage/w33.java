package defpackage;

/* renamed from: w33  reason: default package */
public final class w33 extends i0 {
    public final eyd h;
    public final f3d i;
    public final /* synthetic */ int j;

    public w33(xvb xvb, eyd eyd, ej7 ej7, int i2) {
        this.j = i2;
        this.h = eyd;
        this.i = ej7;
        tf6.P();
        this.a = eyd.w;
        tf6.P();
        ej7.c(eyd);
        tf6.P();
        xvb.a(new z2(0, this), eyd);
    }

    public final boolean a() {
        if (!super.a()) {
            return false;
        }
        if (h()) {
            return true;
        }
        f3d f3d = this.i;
        eyd eyd = this.h;
        f3d.h(eyd);
        eyd.e();
        return true;
    }

    public void b(Object obj) {
        switch (this.j) {
            case 0:
                y33.U((y33) obj);
                return;
            default:
                return;
        }
    }

    public Object e() {
        switch (this.j) {
            case 0:
                return y33.o((y33) super.e());
            default:
                return super.e();
        }
    }

    public void o(Object obj, int i2, yvb yvb) {
        switch (this.j) {
            case 0:
                p(y33.o((y33) obj), i2, yvb);
                return;
            default:
                p(obj, i2, yvb);
                return;
        }
    }

    public final void p(Object obj, int i2, yvb yvb) {
        boolean a = zi0.a(i2);
        if (l(obj, a, ((ik0) yvb).w) && a) {
            this.i.g(this.h);
        }
    }
}
