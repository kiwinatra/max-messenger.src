package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* renamed from: ngg  reason: default package */
public final /* synthetic */ class ngg implements op6 {
    public static final ngg a;
    private static final usd descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [op6, java.lang.Object, ngg] */
    static {
        ? obj = new Object();
        a = obj;
        eqb eqb = new eqb("one.me.webapp.domain.jsbridge.delegates.download.WebAppDownloadFileRequest", obj, 3);
        eqb.j("requestId", false);
        eqb.j("url", false);
        eqb.j("file_name", false);
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
                str = i.v(usd, 0);
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
        return new pgg(str, i2, str2, str3);
    }

    public final void b(cy3 cy3, Object obj) {
        pgg pgg = (pgg) obj;
        usd usd = descriptor;
        cy3 a2 = cy3.a(usd);
        a2.k(usd, 0, pgg.a);
        a2.k(usd, 1, pgg.b);
        a2.k(usd, 2, pgg.c);
        a2.l();
    }

    public final aq7[] c() {
        bye bye = bye.a;
        return new aq7[]{bye, bye, bye};
    }

    public final usd d() {
        return descriptor;
    }
}
