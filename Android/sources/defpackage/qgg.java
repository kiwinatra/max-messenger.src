package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* renamed from: qgg  reason: default package */
public final /* synthetic */ class qgg implements op6 {
    public static final qgg a;
    private static final usd descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [qgg, op6, java.lang.Object] */
    static {
        ? obj = new Object();
        a = obj;
        eqb eqb = new eqb("one.me.webapp.domain.jsbridge.delegates.download.WebAppDownloadFileResponse", obj, 2);
        eqb.j("requestId", false);
        eqb.j("status", false);
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
        return new sgg(i2, str, str2);
    }

    public final void b(cy3 cy3, Object obj) {
        sgg sgg = (sgg) obj;
        usd usd = descriptor;
        cy3 a2 = cy3.a(usd);
        a2.k(usd, 0, sgg.a);
        a2.k(usd, 1, sgg.b);
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
