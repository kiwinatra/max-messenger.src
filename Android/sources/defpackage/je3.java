package defpackage;

import java.util.Objects;
import java.util.Set;

/* renamed from: je3  reason: default package */
public interface je3 {
    static void I(pz9 pz9, je3 je3, je3 je32, la0 la0) {
        if (Objects.equals(la0, x97.N)) {
            w3d w3d = (w3d) je32.k(la0, (Object) null);
            w3d w3d2 = (w3d) je3.k(la0, (Object) null);
            ie3 v = je32.v(la0);
            if (w3d != null) {
                if (w3d2 != null) {
                    jq5 jq5 = w3d.a;
                    if (jq5 == null) {
                        jq5 = w3d2.a;
                    }
                    x3d x3d = w3d.b;
                    if (x3d == null) {
                        x3d = w3d2.b;
                    }
                    int i = w3d.c;
                    if (i == 0) {
                        i = w3d2.c;
                    }
                    w3d2 = new w3d(jq5, x3d, i);
                }
                pz9.e(la0, v, w3d);
                return;
            }
            w3d = w3d2;
            pz9.e(la0, v, w3d);
            return;
        }
        pz9.e(la0, je32.v(la0), je32.n(la0));
    }

    static c5b L(je3 je3, je3 je32) {
        if (je3 == null && je32 == null) {
            return c5b.c;
        }
        pz9 d = je32 != null ? pz9.d(je32) : pz9.c();
        if (je3 != null) {
            for (la0 I : je3.l()) {
                I(d, je32, je3, I);
            }
        }
        return c5b.a(d);
    }

    void b(ba baVar);

    Object k(la0 la0, Object obj);

    Set l();

    Object n(la0 la0);

    Set o(la0 la0);

    Object q(la0 la0, ie3 ie3);

    boolean u(la0 la0);

    ie3 v(la0 la0);
}
