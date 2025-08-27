package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* renamed from: a85  reason: default package */
public final /* synthetic */ class a85 implements op6 {
    public static final a85 a;
    private static final usd descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [op6, java.lang.Object, a85] */
    static {
        ? obj = new Object();
        a = obj;
        eqb eqb = new eqb("one.me.webapp.domain.jsbridge.ErrorResponse.Error", obj, 1);
        eqb.j("code", false);
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
        return new c85(i2, str);
    }

    public final void b(cy3 cy3, Object obj) {
        usd usd = descriptor;
        cy3 a2 = cy3.a(usd);
        a2.k(usd, 0, ((c85) obj).a);
        a2.l();
    }

    public final aq7[] c() {
        return new aq7[]{bye.a};
    }

    public final usd d() {
        return descriptor;
    }
}
