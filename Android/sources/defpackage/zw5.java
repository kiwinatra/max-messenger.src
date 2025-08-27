package defpackage;

import java.util.Objects;

/* renamed from: zw5  reason: default package */
public final class zw5 extends wv5 {
    public final Object b;
    public final zi6 c;

    public zw5(Object obj, ecf ecf) {
        this.b = obj;
        this.c = ecf;
    }

    public final void g(pye pye) {
        try {
            Object apply = this.c.apply(this.b);
            Objects.requireNonNull(apply, "The mapper returned a null Publisher");
            eac eac = (eac) apply;
            if (eac instanceof t2f) {
                try {
                    Object obj = ((t2f) eac).get();
                    if (obj == null) {
                        d55.a(pye);
                    } else {
                        pye.e(new rdd(pye, obj));
                    }
                } catch (Throwable th) {
                    hd8.Z(th);
                    d55.b(th, pye);
                }
            } else {
                ((wv5) eac).f(pye);
            }
        } catch (Throwable th2) {
            hd8.Z(th2);
            d55.b(th2, pye);
        }
    }
}
