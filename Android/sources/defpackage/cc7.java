package defpackage;

import java.util.Objects;

/* renamed from: cc7  reason: default package */
public final class cc7 extends jb7 {
    public final /* bridge */ /* synthetic */ jb7 c(Object obj) {
        j(obj);
        return this;
    }

    public final void j(Object obj) {
        obj.getClass();
        a(obj);
    }

    public final void k(Iterable iterable) {
        iterable.getClass();
        e(iterable);
    }

    public final dc7 l() {
        int i = this.b;
        if (i == 0) {
            int i2 = dc7.c;
            return q0d.X;
        } else if (i != 1) {
            dc7 o = dc7.o(i, this.c);
            this.b = o.size();
            this.a = true;
            return o;
        } else {
            Object obj = this.c[0];
            Objects.requireNonNull(obj);
            int i3 = dc7.c;
            return new mde(obj);
        }
    }
}
