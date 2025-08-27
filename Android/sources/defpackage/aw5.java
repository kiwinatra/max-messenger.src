package defpackage;

import java.util.Objects;

/* renamed from: aw5  reason: default package */
public final class aw5 extends lbe implements ij6 {
    public final wv5 a;
    public final t2f b;
    public final rm0 c;

    public aw5(wv5 wv5, fj6 fj6, rm0 rm0) {
        this.a = wv5;
        this.b = fj6;
        this.c = rm0;
    }

    public final wv5 b() {
        return new yv5(this.a, this.b, this.c, 0);
    }

    public final void m(gce gce) {
        try {
            Object obj = this.b.get();
            Objects.requireNonNull(obj, "The initialSupplier returned a null value");
            this.a.c(new zv5(gce, obj, this.c));
        } catch (Throwable th) {
            hd8.Z(th);
            p45.c(th, gce);
        }
    }
}
