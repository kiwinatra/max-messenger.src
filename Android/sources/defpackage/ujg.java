package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* renamed from: ujg  reason: default package */
public final /* synthetic */ class ujg implements op6 {
    public static final ujg a;
    private static final usd descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [ujg, op6, java.lang.Object] */
    static {
        ? obj = new Object();
        a = obj;
        eqb eqb = new eqb("one.me.webapp.domain.jsbridge.WebAppShareRequest", obj, 3);
        eqb.j("url", true);
        eqb.j("title", true);
        eqb.j("text", true);
        descriptor = eqb;
    }

    public final Object a(u9 u9Var) {
        usd usd = descriptor;
        u9 i = u9Var.i(usd);
        String str = null;
        boolean z = true;
        int i2 = 0;
        String str2 = null;
        String str3 = null;
        while (z) {
            int o = i.o(usd);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                bye bye = bye.a;
                str = (String) i.r(usd, 0, str);
                i2 |= 1;
            } else if (o == 1) {
                bye bye2 = bye.a;
                str2 = (String) i.r(usd, 1, str2);
                i2 |= 2;
            } else if (o == 2) {
                bye bye3 = bye.a;
                str3 = (String) i.r(usd, 2, str3);
                i2 |= 4;
            } else {
                throw new UnknownFieldException(o);
            }
        }
        i.y(usd);
        return new wjg(str, i2, str2, str3);
    }

    public final void b(cy3 cy3, Object obj) {
        wjg wjg = (wjg) obj;
        usd usd = descriptor;
        cy3 a2 = cy3.a(usd);
        if (a2.s() || wjg.a != null) {
            bye bye = bye.a;
            a2.f(usd, 0, wjg.a);
        }
        if (a2.s() || wjg.b != null) {
            bye bye2 = bye.a;
            a2.f(usd, 1, wjg.b);
        }
        if (a2.s() || wjg.c != null) {
            bye bye3 = bye.a;
            a2.f(usd, 2, wjg.c);
        }
        a2.l();
    }

    public final aq7[] c() {
        bye bye = bye.a;
        return new aq7[]{bv0.a(), bv0.a(), bv0.a()};
    }

    public final usd d() {
        return descriptor;
    }
}
