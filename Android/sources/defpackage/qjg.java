package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* renamed from: qjg  reason: default package */
public final /* synthetic */ class qjg implements op6 {
    public static final qjg a;
    private static final usd descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [op6, java.lang.Object, qjg] */
    static {
        ? obj = new Object();
        a = obj;
        eqb eqb = new eqb("one.me.webapp.domain.jsbridge.delegates.system.WebAppSetupClosingBehaviorRequest", obj, 1);
        eqb.j("needConfirmation", false);
        descriptor = eqb;
    }

    public final Object a(u9 u9Var) {
        usd usd = descriptor;
        u9 i = u9Var.i(usd);
        boolean z = true;
        int i2 = 0;
        boolean z2 = false;
        while (z) {
            int o = i.o(usd);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                z2 = i.n(usd, 0);
                i2 = 1;
            } else {
                throw new UnknownFieldException(o);
            }
        }
        i.y(usd);
        return new sjg(i2, z2);
    }

    public final void b(cy3 cy3, Object obj) {
        usd usd = descriptor;
        cy3 a2 = cy3.a(usd);
        boolean z = ((sjg) obj).a;
        a2.c(usd, 0);
        a2.b(z);
        a2.l();
    }

    public final aq7[] c() {
        return new aq7[]{hq0.a};
    }

    public final usd d() {
        return descriptor;
    }
}
