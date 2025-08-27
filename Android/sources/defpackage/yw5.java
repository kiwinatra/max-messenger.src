package defpackage;

import java.util.Collection;
import java.util.Objects;

/* renamed from: yw5  reason: default package */
public final class yw5 extends s0 {
    public final /* synthetic */ int c;
    public final Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yw5(wv5 wv5, Object obj, int i) {
        super(wv5);
        this.c = i;
        this.o = obj;
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [gx5, rk4] */
    public final void g(pye pye) {
        wv5 wv5 = this.b;
        Object obj = this.o;
        switch (this.c) {
            case 0:
                ftd ftd = new ftd(pye);
                iq.h0(8, "capacityHint");
                ctd ctd = new ctd(new lvf());
                try {
                    Object apply = ((zi6) obj).apply(ctd);
                    Objects.requireNonNull(apply, "handler returned a null Publisher");
                    eac eac = (eac) apply;
                    ww5 ww5 = new ww5(wv5);
                    xw5 xw5 = new xw5(ftd, ctd, ww5);
                    ww5.o = xw5;
                    pye.e(xw5);
                    ((wv5) eac).f(ww5);
                    ww5.d(0);
                    return;
                } catch (Throwable th) {
                    hd8.Z(th);
                    d55.b(th, pye);
                    return;
                }
            default:
                try {
                    Object obj2 = ((t2f) obj).get();
                    if (obj2 != null) {
                        o95 o95 = p95.a;
                        Collection collection = (Collection) obj2;
                        ? rk4 = new rk4(pye);
                        rk4.b = collection;
                        wv5.c(rk4);
                        return;
                    }
                    throw p95.b("The collectionSupplier returned a null Collection.");
                } catch (Throwable th2) {
                    hd8.Z(th2);
                    d55.b(th2, pye);
                    return;
                }
        }
    }
}
