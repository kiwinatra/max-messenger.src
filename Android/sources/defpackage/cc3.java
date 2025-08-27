package defpackage;

import java.util.Set;

/* renamed from: cc3  reason: default package */
public interface cc3 {
    Object a(Class cls) {
        return g(pac.a(cls));
    }

    Set b(pac pac) {
        return (Set) e(pac).get();
    }

    m9c c(Class cls) {
        return f(pac.a(cls));
    }

    m9c e(pac pac);

    m9c f(pac pac);

    Object g(pac pac) {
        m9c f = f(pac);
        if (f == null) {
            return null;
        }
        return f.get();
    }
}
