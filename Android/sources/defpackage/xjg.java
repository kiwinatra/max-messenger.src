package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* renamed from: xjg  reason: default package */
public final /* synthetic */ class xjg implements op6 {
    public static final xjg a;
    private static final usd descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [xjg, op6, java.lang.Object] */
    static {
        ? obj = new Object();
        a = obj;
        eqb eqb = new eqb("one.me.webapp.domain.jsbridge.delegates.storage.WebAppStorageClearRequest", obj, 2);
        eqb.j("queryId", false);
        eqb.j("requestId", false);
        descriptor = eqb;
    }

    public final Object a(u9 u9Var) {
        usd usd = descriptor;
        u9 i = u9Var.i(usd);
        String str = null;
        boolean z = true;
        int i2 = 0;
        String str2 = null;
        while (z) {
            int o = i.o(usd);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                bye bye = bye.a;
                str = (String) i.r(usd, 0, str);
                i2 |= 1;
            } else if (o == 1) {
                str2 = i.v(usd, 1);
                i2 |= 2;
            } else {
                throw new UnknownFieldException(o);
            }
        }
        i.y(usd);
        return new zjg(i2, str, str2);
    }

    public final void b(cy3 cy3, Object obj) {
        zjg zjg = (zjg) obj;
        usd usd = descriptor;
        cy3 a2 = cy3.a(usd);
        bye bye = bye.a;
        a2.f(usd, 0, zjg.a);
        a2.k(usd, 1, zjg.b);
        a2.l();
    }

    public final aq7[] c() {
        return new aq7[]{bv0.a(), bye.a};
    }

    public final usd d() {
        return descriptor;
    }
}
