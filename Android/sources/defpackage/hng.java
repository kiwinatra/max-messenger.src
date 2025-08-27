package defpackage;

/* renamed from: hng  reason: default package */
public final class hng {
    public final qz9 a = new qz9(1);
    public final qz9 b = new qz9(1);

    public final xag a(Class cls) {
        String m = a81.m("one.me.sdk.arch.ViewModelStore:key:", cls.getCanonicalName());
        qz9 qz9 = this.a;
        xag xag = (xag) qz9.c(m);
        if (cls.isInstance(xag)) {
            Object cast = cls.cast(xag);
            if (cast != null) {
                return (xag) cast;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        qz9 qz92 = this.b;
        wag wag = (wag) qz92.c(m);
        Object c = qz92.c(m);
        if (c != null) {
            xag a2 = ((wag) c).a(cls);
            qz9.k(m, a2);
            return a2;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
