package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: bbf  reason: default package */
public final class bbf implements np9 {
    public static final dre l = new dre(18);
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public final Lazy i;
    public final String j = bbf.class.getName();
    public final Lazy k = LazyKt.lazy(new dle(22));

    public bbf(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7, Lazy lazy8, Lazy lazy9) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy5;
        this.e = lazy6;
        this.f = lazy7;
        this.g = lazy8;
        this.h = LazyKt.lazy(new bp1(lazy4, lazy5, 3));
        this.i = lazy9;
    }

    public final cbf a() {
        return (cbf) this.b.getValue();
    }
}
