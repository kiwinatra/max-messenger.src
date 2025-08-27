package defpackage;

import java.util.Iterator;

/* renamed from: nw5  reason: default package */
public final class nw5 extends s0 {
    public final zi6 c;
    public final int o;

    public nw5(qh8 qh8, q0a q0a, int i) {
        super(qh8);
        this.c = q0a;
        this.o = i;
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
                    Iterator it = ((Iterable) zi6.apply(obj)).iterator();
                    try {
                        if (!it.hasNext()) {
                            d55.a(pye);
                        } else {
                            pye.e(new pw5(pye, it));
                        }
                    } catch (Throwable th) {
                        hd8.Z(th);
                        d55.b(th, pye);
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
            wv5.c(new mw5(pye, zi6, this.o));
        }
    }
}
