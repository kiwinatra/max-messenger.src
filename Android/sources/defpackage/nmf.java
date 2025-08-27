package defpackage;

import java.util.ArrayList;

/* renamed from: nmf  reason: default package */
public final class nmf extends gcg {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public int c;
    public final /* synthetic */ Object d;

    public nmf(nqe nqe) {
        this.d = nqe;
        this.b = false;
        this.c = 0;
    }

    public void a() {
        switch (this.a) {
            case 0:
                this.b = true;
                return;
            default:
                return;
        }
    }

    public final void b() {
        switch (this.a) {
            case 0:
                ((omf) this.d).a.setVisibility(0);
                return;
            default:
                if (!this.b) {
                    this.b = true;
                    fcg fcg = (fcg) ((nqe) this.d).e;
                    if (fcg != null) {
                        fcg.b();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void c() {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    ((omf) this.d).a.setVisibility(this.c);
                    return;
                }
                return;
            default:
                int i = this.c + 1;
                this.c = i;
                nqe nqe = (nqe) this.d;
                if (i == ((ArrayList) nqe.c).size()) {
                    fcg fcg = (fcg) nqe.e;
                    if (fcg != null) {
                        fcg.c();
                    }
                    this.c = 0;
                    this.b = false;
                    nqe.b = false;
                    return;
                }
                return;
        }
    }

    public nmf(omf omf, int i) {
        this.d = omf;
        this.c = i;
        this.b = false;
    }
}
