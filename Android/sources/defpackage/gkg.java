package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* renamed from: gkg  reason: default package */
public final /* synthetic */ class gkg implements op6 {
    public static final gkg a;
    private static final usd descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [gkg, op6, java.lang.Object] */
    static {
        ? obj = new Object();
        a = obj;
        eqb eqb = new eqb("one.me.webapp.domain.jsbridge.delegates.storage.WebAppStorageGetKeyRequest", obj, 3);
        eqb.j("queryId", false);
        eqb.j("requestId", false);
        eqb.j("key", false);
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
                str2 = i.v(usd, 1);
                i2 |= 2;
            } else if (o == 2) {
                str3 = i.v(usd, 2);
                i2 |= 4;
            } else {
                throw new UnknownFieldException(o);
            }
        }
        i.y(usd);
        return new ikg(str, i2, str2, str3);
    }

    public final void b(cy3 cy3, Object obj) {
        ikg ikg = (ikg) obj;
        usd usd = descriptor;
        cy3 a2 = cy3.a(usd);
        bye bye = bye.a;
        a2.f(usd, 0, ikg.a);
        a2.k(usd, 1, ikg.b);
        a2.k(usd, 2, ikg.c);
        a2.l();
    }

    public final aq7[] c() {
        bye bye = bye.a;
        return new aq7[]{bv0.a(), bye, bye};
    }

    public final usd d() {
        return descriptor;
    }
}
