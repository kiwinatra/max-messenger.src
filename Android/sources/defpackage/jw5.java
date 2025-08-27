package defpackage;

import java.util.Objects;

/* renamed from: jw5  reason: default package */
public final class jw5 extends s0 {
    public final zi6 c;
    public final boolean o = false;
    public final int v;
    public final int w;

    public jw5(wv5 wv5, ecf ecf, int i, int i2) {
        super(wv5);
        this.c = ecf;
        this.v = i;
        this.w = i2;
    }

    public final void g(pye pye) {
        wv5 wv5 = this.b;
        boolean z = wv5 instanceof t2f;
        zi6 zi6 = this.c;
        if (z) {
            try {
                Object obj = ((t2f) wv5).get();
                if (obj == null) {
                    d55.a(pye);
                    return;
                }
                try {
                    Object apply = zi6.apply(obj);
                    Objects.requireNonNull(apply, "The mapper returned a null Publisher");
                    eac eac = (eac) apply;
                    if (eac instanceof t2f) {
                        try {
                            Object obj2 = ((t2f) eac).get();
                            if (obj2 == null) {
                                d55.a(pye);
                            } else {
                                pye.e(new rdd(pye, obj2));
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
            } catch (Throwable th3) {
                hd8.Z(th3);
                d55.b(th3, pye);
            }
        } else {
            wv5.c(new iw5(pye, zi6, this.o, this.v, this.w));
        }
    }
}
