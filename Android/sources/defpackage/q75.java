package defpackage;

/* renamed from: q75  reason: default package */
public abstract class q75 extends q2 {
    public abstract void Z(gf6 gf6, Object obj);

    public final int a0(Object obj) {
        gf6 E = E();
        try {
            Z(E, obj);
            return E.n();
        } finally {
            S(E);
        }
    }

    public final void c0(Iterable iterable) {
        gf6 E = E();
        try {
            for (Object Z : iterable) {
                Z(E, Z);
                E.n();
            }
        } finally {
            S(E);
        }
    }
}
