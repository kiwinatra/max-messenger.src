package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* renamed from: y75  reason: default package */
public final /* synthetic */ class y75 implements op6 {
    public static final y75 a;
    private static final usd descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [op6, y75, java.lang.Object] */
    static {
        ? obj = new Object();
        a = obj;
        eqb eqb = new eqb("one.me.webapp.domain.jsbridge.ErrorResponse", obj, 2);
        eqb.j("requestId", false);
        eqb.j("error", false);
        descriptor = eqb;
    }

    public final Object a(u9 u9Var) {
        usd usd = descriptor;
        u9 i = u9Var.i(usd);
        String str = null;
        boolean z = true;
        int i2 = 0;
        c85 c85 = null;
        while (z) {
            int o = i.o(usd);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                str = i.v(usd, 0);
                i2 |= 1;
            } else if (o == 1) {
                c85 = (c85) i.s(usd, 1, a85.a, c85);
                i2 |= 2;
            } else {
                throw new UnknownFieldException(o);
            }
        }
        i.y(usd);
        return new d85(i2, str, c85);
    }

    public final void b(cy3 cy3, Object obj) {
        d85 d85 = (d85) obj;
        usd usd = descriptor;
        cy3 a2 = cy3.a(usd);
        a2.k(usd, 0, d85.a);
        a2.h(usd, 1, a85.a, d85.b);
        a2.l();
    }

    public final aq7[] c() {
        return new aq7[]{bye.a, a85.a};
    }

    public final usd d() {
        return descriptor;
    }
}
