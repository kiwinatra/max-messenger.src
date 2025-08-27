package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* renamed from: khg  reason: default package */
public final /* synthetic */ class khg implements op6 {
    public static final khg a;
    private static final usd descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [op6, java.lang.Object, khg] */
    static {
        ? obj = new Object();
        a = obj;
        eqb eqb = new eqb("one.me.webapp.domain.jsbridge.delegates.link.WebAppOpenLinkRequest", obj, 1);
        eqb.j("url", false);
        descriptor = eqb;
    }

    public final Object a(u9 u9Var) {
        usd usd = descriptor;
        u9 i = u9Var.i(usd);
        String str = null;
        boolean z = true;
        int i2 = 0;
        while (z) {
            int o = i.o(usd);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                str = i.v(usd, 0);
                i2 = 1;
            } else {
                throw new UnknownFieldException(o);
            }
        }
        i.y(usd);
        return new mhg(i2, str);
    }

    public final void b(cy3 cy3, Object obj) {
        usd usd = descriptor;
        cy3 a2 = cy3.a(usd);
        a2.k(usd, 0, ((mhg) obj).a);
        a2.l();
    }

    public final aq7[] c() {
        return new aq7[]{bye.a};
    }

    public final usd d() {
        return descriptor;
    }
}
