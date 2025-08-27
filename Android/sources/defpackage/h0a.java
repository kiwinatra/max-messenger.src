package defpackage;

/* renamed from: h0a  reason: default package */
public final /* synthetic */ class h0a implements qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0a b;

    public /* synthetic */ h0a(j0a j0a, int i) {
        this.a = i;
        this.b = j0a;
    }

    public final void accept(Object obj) {
        j0a j0a = this.b;
        switch (this.a) {
            case 0:
                Long l = (Long) obj;
                j0a.getClass();
                z68.a("j0a", "hideControls");
                r7g a2 = j0a.w0.a();
                a2.a = false;
                r7g r7g = new r7g(a2);
                j0a.w0 = r7g;
                ((o4a) j0a.a).m(r7g);
                i0a i0a = j0a.z;
                if (i0a != null) {
                    i0a.i0(false);
                    return;
                }
                return;
            case 1:
                f4g f4g = (f4g) obj;
                ntc ntc = j0a.y0;
                if (ntc != null) {
                    ntc.d = f4g;
                    z68.c("ntc", "sendVideoRePlayStat", new Object[0]);
                    int i = ntc.b;
                    ntc.f("replay", (Object) null, (String) null, (String) null, i == 1, ntc.a(), i == 5, i == 3 ? "auto" : null);
                }
                String str = j0a.x0.c;
                ((m48) j0a.b).t(f4g, j0a);
                r7g a3 = j0a.w0.a();
                a3.n = f4g;
                a3.p = null;
                a3.q = null;
                r7g r7g2 = new r7g(a3);
                j0a.w0 = r7g2;
                o4a o4a = (o4a) j0a.a;
                o4a.m(r7g2);
                j0a.l0();
                o4a.i(j0a);
                return;
            case 2:
                j0a.a0((Throwable) obj);
                return;
            case 3:
                Long l2 = (Long) obj;
                j0a.getClass();
                r7g a4 = j0a.w0.a();
                k20 k20 = j0a.x0;
                jtb jtb = j0a.y;
                a4.h = ld8.x0(jtb, k20);
                r7g r7g3 = new r7g(a4);
                j0a.w0 = r7g3;
                ((o4a) j0a.a).m(r7g3);
                if (!ld8.a0(jtb, j0a.x0)) {
                    jbd.c(j0a.C0);
                    j0a.g0();
                    return;
                }
                return;
            default:
                Long l3 = (Long) obj;
                r7g a5 = j0a.w0.a();
                m48 m48 = (m48) j0a.b;
                a5.k = m48.f();
                a5.l = m48.d();
                a5.q = null;
                a5.p = null;
                r7g r7g4 = new r7g(a5);
                j0a.w0 = r7g4;
                ((o4a) j0a.a).m(r7g4);
                return;
        }
    }
}
