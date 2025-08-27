package defpackage;

import java.util.Set;

/* renamed from: psf  reason: default package */
public final class psf implements osf {
    public final Set a;
    public final tc0 b;
    public final qsf c;

    public psf(Set set, tc0 tc0, qsf qsf) {
        this.a = set;
        this.b = tc0;
        this.c = qsf;
    }

    public final pk4 a(String str, l65 l65, krf krf) {
        Set set = this.a;
        if (set.contains(l65)) {
            return new pk4(this.b, str, l65, krf, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{l65, set}));
    }
}
