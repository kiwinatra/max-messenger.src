package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: kbf  reason: default package */
public final class kbf implements jbf {
    public final Lazy a = xd3.f;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;

    public kbf(Lazy lazy) {
        this.f = lazy;
        this.c = LazyKt.lazy(new a2d(3));
        this.d = LazyKt.lazy(new a2d(4));
        this.b = LazyKt.lazy(new a2d(5));
        this.e = LazyKt.lazy(new a2d(6));
        this.g = LazyKt.lazy(new a2d(7));
    }

    public final lfd a() {
        return (lfd) this.b.getValue();
    }

    public final lfd b() {
        return (lfd) this.c.getValue();
    }

    public final lfd c() {
        return (lfd) this.f.getValue();
    }
}
