package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* renamed from: nze  reason: default package */
public final /* synthetic */ class nze implements op6 {
    public static final nze a;
    private static final usd descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [op6, nze, java.lang.Object] */
    static {
        ? obj = new Object();
        a = obj;
        eqb eqb = new eqb("one.me.webapp.domain.jsbridge.SuccessResponse", obj, 2);
        eqb.j("status", false);
        eqb.j("requestId", true);
        descriptor = eqb;
    }

    public final Object a(u9 u9Var) {
        usd usd = descriptor;
        u9 i = u9Var.i(usd);
        aq7[] aq7Arr = rze.c;
        qze qze = null;
        boolean z = true;
        int i2 = 0;
        String str = null;
        while (z) {
            int o = i.o(usd);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                qze = (qze) i.s(usd, 0, aq7Arr[0], qze);
                i2 |= 1;
            } else if (o == 1) {
                bye bye = bye.a;
                str = (String) i.r(usd, 1, str);
                i2 |= 2;
            } else {
                throw new UnknownFieldException(o);
            }
        }
        i.y(usd);
        return new rze(i2, qze, str);
    }

    public final void b(cy3 cy3, Object obj) {
        rze rze = (rze) obj;
        usd usd = descriptor;
        cy3 a2 = cy3.a(usd);
        a2.h(usd, 0, rze.c[0], rze.a);
        boolean s = a2.s();
        String str = rze.b;
        if (s || str != null) {
            bye bye = bye.a;
            a2.f(usd, 1, str);
        }
        a2.l();
    }

    public final aq7[] c() {
        aq7 aq7 = rze.c[0];
        bye bye = bye.a;
        return new aq7[]{aq7, bv0.a()};
    }

    public final usd d() {
        return descriptor;
    }
}
