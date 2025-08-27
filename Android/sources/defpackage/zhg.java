package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* renamed from: zhg  reason: default package */
public final /* synthetic */ class zhg implements op6 {
    public static final zhg a;
    private static final usd descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [op6, zhg, java.lang.Object] */
    static {
        ? obj = new Object();
        a = obj;
        eqb eqb = new eqb("one.me.webapp.domain.jsbridge.delegates.phone.WebAppRequestPhoneResponse", obj, 2);
        eqb.j("requestId", false);
        eqb.j("phone", false);
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
                str = i.v(usd, 0);
                i2 |= 1;
            } else if (o == 1) {
                str2 = i.v(usd, 1);
                i2 |= 2;
            } else {
                throw new UnknownFieldException(o);
            }
        }
        i.y(usd);
        return new big(i2, str, str2);
    }

    public final void b(cy3 cy3, Object obj) {
        big big = (big) obj;
        usd usd = descriptor;
        cy3 a2 = cy3.a(usd);
        a2.k(usd, 0, big.a);
        a2.k(usd, 1, big.b);
        a2.l();
    }

    public final aq7[] c() {
        bye bye = bye.a;
        return new aq7[]{bye, bye};
    }

    public final usd d() {
        return descriptor;
    }
}
