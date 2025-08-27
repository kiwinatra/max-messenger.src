package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;

/* renamed from: nxb  reason: default package */
public final class nxb {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public final Lazy i;
    public final Lazy j;
    public final Lazy k;
    public final Lazy l = LazyKt.lazy(new lgb(29));

    public nxb() {
        lgb lgb = new lgb(25);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = LazyKt.lazy(lazyThreadSafetyMode, lgb);
        this.b = LazyKt.lazy(lazyThreadSafetyMode, new mxb(0));
        this.c = LazyKt.lazy(lazyThreadSafetyMode, new mxb(1));
        this.d = LazyKt.lazy(lazyThreadSafetyMode, new mxb(2));
        this.e = LazyKt.lazy(lazyThreadSafetyMode, new mxb(3));
        this.f = LazyKt.lazy(lazyThreadSafetyMode, new mxb(4));
        this.g = LazyKt.lazy(lazyThreadSafetyMode, new mxb(5));
        this.h = LazyKt.lazy(lazyThreadSafetyMode, new mxb(6));
        this.i = LazyKt.lazy(lazyThreadSafetyMode, new lgb(26));
        this.j = LazyKt.lazy(lazyThreadSafetyMode, new lgb(27));
        this.k = LazyKt.lazy(lazyThreadSafetyMode, new lgb(28));
    }

    public final ow3 a() {
        return (ow3) this.a.getValue();
    }
}
