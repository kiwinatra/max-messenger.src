package defpackage;

/* renamed from: fsf  reason: default package */
public final class fsf extends bsf {
    public final /* synthetic */ int a = 1;
    public gsf b;

    public /* synthetic */ fsf() {
    }

    public void a(yrf yrf) {
        switch (this.a) {
            case 1:
                gsf gsf = this.b;
                if (!gsf.T0) {
                    gsf.O();
                    gsf.T0 = true;
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void c(yrf yrf) {
        switch (this.a) {
            case 1:
                gsf gsf = this.b;
                int i = gsf.S0 - 1;
                gsf.S0 = i;
                if (i == 0) {
                    gsf.T0 = false;
                    gsf.o();
                }
                yrf.D(this);
                return;
            default:
                return;
        }
    }

    public void g(yrf yrf) {
        switch (this.a) {
            case 0:
                gsf gsf = this.b;
                gsf.Q0.remove(yrf);
                if (!gsf.w()) {
                    gsf.A(gsf, xff.o, false);
                    gsf.D0 = true;
                    gsf.A(gsf, xff.c, false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public fsf(gsf gsf) {
        this.b = gsf;
    }
}
