package defpackage;

/* renamed from: r75  reason: default package */
public abstract class r75 extends q2 {
    public abstract void Z(gf6 gf6, Object obj);

    public final void a0(Iterable iterable) {
        gf6 E = E();
        try {
            for (Object Z : iterable) {
                Z(E, Z);
                E.m();
            }
        } finally {
            S(E);
        }
    }

    public final void c0(Object obj) {
        gf6 E = E();
        try {
            Z(E, obj);
            E.m();
        } finally {
            S(E);
        }
    }

    public final long d0(Object obj) {
        gf6 E = E();
        try {
            Z(E, obj);
            return E.m();
        } finally {
            S(E);
        }
    }
}
