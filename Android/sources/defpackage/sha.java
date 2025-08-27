package defpackage;

import java.util.Objects;

/* renamed from: sha  reason: default package */
public final class sha extends lbe implements kj6 {
    public final oka a;
    public final t2f b;
    public final rm0 c;

    public sha(oka oka, fj6 fj6, rm0 rm0) {
        this.a = oka;
        this.b = fj6;
        this.c = rm0;
    }

    public final jha d() {
        return new rha(this.a, this.b, this.c, 0);
    }

    public final void m(gce gce) {
        try {
            Object obj = this.b.get();
            Objects.requireNonNull(obj, "The initialSupplier returned a null value");
            this.a.a(new qha(gce, obj, this.c, 1));
        } catch (Throwable th) {
            hd8.Z(th);
            p45.c(th, gce);
        }
    }
}
