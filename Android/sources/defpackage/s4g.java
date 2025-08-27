package defpackage;

/* renamed from: s4g  reason: default package */
public final /* synthetic */ class s4g implements zi6, qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t4g b;

    public /* synthetic */ s4g(t4g t4g, int i) {
        this.a = i;
        this.b = t4g;
    }

    public void accept(Object obj) {
        int i = this.a;
        t4g t4g = this.b;
        switch (i) {
            case 1:
                mq4 mq4 = (mq4) obj;
                synchronized (t4g) {
                    t4g.h.a(mq4);
                }
                return;
            default:
                j4g j4g = (j4g) obj;
                ryg.k0(new na3(4, t4g.b.a(), new r4g(j4g, 2)).m(), m58.f, new r4g(j4g, 0), new ivc(11, j4g));
                return;
        }
    }

    public Object apply(Object obj) {
        lbe lbe;
        t4g t4g = this.b;
        int i = this.a;
        j4g j4g = (j4g) obj;
        t4g.getClass();
        switch (i) {
            case 0:
                if (!j4g.b || !wc8.i(j4g.d)) {
                    z68.c("t4g", "convertVideo: start convert = %s", j4g);
                    if (!cvg.A(j4g.c)) {
                        lbe = lbe.h(j4g);
                    } else {
                        sv3 c = ((wj0) t4g.a).c(j4g.a.a);
                        if (c == null) {
                            lbe = lbe.g(new RuntimeException("failed to prepare videoConversion files"));
                        } else if (c.b == 0) {
                            lbe = lbe.g(new RuntimeException("content is zero length"));
                        } else {
                            String str = c.e;
                            if (cvg.A(str)) {
                                lbe = new mka(1, new fkd(t4g, j4g, c, 6)).n(t4g.g.a).j(t4g.f);
                            } else {
                                lf6 a2 = j4g.a();
                                a2.o = str;
                                lbe = lbe.h(new j4g(a2));
                            }
                        }
                    }
                    return new tbe(new tbe(new wbe(new tbe(lbe, new s4g(t4g, 2), 3), new s4g(t4g, 3), 0), new r4g(j4g, 1), 1), new s4g(t4g, 2), 3);
                }
                z68.c("t4g", "convertVideo: exists result = %s", j4g);
                return lbe.h(j4g);
            default:
                return new mka(1, new hzf(5, t4g, j4g)).n(t4g.e.a).j(t4g.f);
        }
    }
}
