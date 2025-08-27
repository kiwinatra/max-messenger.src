package defpackage;

/* renamed from: up8  reason: default package */
public final /* synthetic */ class up8 implements vp8, xx8 {
    public final /* synthetic */ pob a;

    public /* synthetic */ up8(pob pob) {
        this.a = pob;
    }

    public void a(bx8 bx8, int i) {
        bx8.h(i, this.a);
    }

    public void c(np8 np8) {
        boolean z;
        if (np8.isConnected()) {
            pob pob = np8.s;
            pob pob2 = this.a;
            if (!v0g.a(pob, pob2)) {
                np8.s = pob2;
                pob pob3 = np8.t;
                pob I0 = np8.I0(np8.r, pob2);
                np8.t = I0;
                if (!I0.equals(pob3)) {
                    k0d k0d = np8.p;
                    k0d a2 = e63.a(np8.o, np8.q, np8.t);
                    np8.p = a2;
                    z = !a2.equals(k0d);
                    np8.h.m(13, new ap8(np8, 19));
                } else {
                    z = false;
                }
                if (z) {
                    np8.a.F0(new ap8(np8, 0));
                }
            }
        }
    }
}
