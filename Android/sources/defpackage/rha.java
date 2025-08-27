package defpackage;

import java.util.Collection;
import java.util.Objects;

/* renamed from: rha  reason: default package */
public final class rha extends r2 {
    public final /* synthetic */ int b;
    public final Object c;
    public final Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rha(oka oka, Object obj, Object obj2, int i) {
        super(oka);
        this.b = i;
        this.c = obj;
        this.o = obj2;
    }

    public final void w(cla cla) {
        oka oka = this.a;
        Object obj = this.o;
        Object obj2 = this.c;
        switch (this.b) {
            case 0:
                try {
                    Object obj3 = ((t2f) obj2).get();
                    Objects.requireNonNull(obj3, "The initialSupplier returned a null value");
                    oka.a(new qha(cla, obj3, (rm0) obj, 0));
                    return;
                } catch (Throwable th) {
                    hd8.Z(th);
                    p45.b(th, cla);
                    return;
                }
            case 1:
                try {
                    Object obj4 = ((t2f) obj2).get();
                    if (obj4 != null) {
                        o95 o95 = p95.a;
                        oka.a(new eia(cla, (zi6) obj, (Collection) obj4));
                        return;
                    }
                    throw p95.b("The collectionSupplier returned a null Collection.");
                } catch (Throwable th2) {
                    hd8.Z(th2);
                    p45.b(th2, cla);
                    return;
                }
            case 2:
                oka.a(new rq4(cla, (qk3) obj2, (x6) obj));
                return;
            default:
                try {
                    Object obj5 = ((t2f) obj2).get();
                    Objects.requireNonNull(obj5, "The seed supplied is null");
                    oka.a(new kka(cla, (tb4) ((sm0) obj), obj5));
                    return;
                } catch (Throwable th3) {
                    hd8.Z(th3);
                    p45.b(th3, cla);
                    return;
                }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rha(oka oka, zi6 zi6) {
        super(oka);
        this.b = 1;
        ej6 ej6 = ej6.a;
        this.o = zi6;
        this.c = ej6;
    }
}
