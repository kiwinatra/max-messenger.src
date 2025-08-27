package defpackage;

import java.util.Collection;
import java.util.Objects;

/* renamed from: yv5  reason: default package */
public final class yv5 extends s0 {
    public final /* synthetic */ int c;
    public final t2f o;
    public final Object v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yv5(wv5 wv5, t2f t2f, Object obj, int i) {
        super(wv5);
        this.c = i;
        this.o = t2f;
        this.v = obj;
    }

    public final void g(pye pye) {
        wv5 wv5 = this.b;
        Object obj = this.v;
        t2f t2f = this.o;
        switch (this.c) {
            case 0:
                try {
                    Object obj2 = t2f.get();
                    Objects.requireNonNull(obj2, "The initial value supplied is null");
                    wv5.c(new xv5(pye, obj2, (rm0) obj));
                    return;
                } catch (Throwable th) {
                    hd8.Z(th);
                    d55.b(th, pye);
                    return;
                }
            case 1:
                try {
                    Object obj3 = t2f.get();
                    if (obj3 != null) {
                        o95 o95 = p95.a;
                        wv5.c(new ew5(pye, (zi6) obj, (Collection) obj3));
                        return;
                    }
                    throw p95.b("The collectionSupplier returned a null Collection.");
                } catch (Throwable th2) {
                    hd8.Z(th2);
                    d55.b(th2, pye);
                    return;
                }
            default:
                try {
                    Object obj4 = t2f.get();
                    Objects.requireNonNull(obj4, "The seed supplied is null");
                    wv5.c(new ax5(pye, (sm0) obj, obj4, wv5.a));
                    return;
                } catch (Throwable th3) {
                    hd8.Z(th3);
                    d55.b(th3, pye);
                    return;
                }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yv5(nw5 nw5, q0a q0a) {
        super(nw5);
        this.c = 1;
        ej6 ej6 = ej6.a;
        this.v = q0a;
        this.o = ej6;
    }
}
