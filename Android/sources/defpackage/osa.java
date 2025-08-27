package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;

/* renamed from: osa  reason: default package */
public final class osa implements gaf {
    public final Lazy a = xd3.f;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;

    public osa(Lazy lazy) {
        this.b = lazy;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.c = LazyKt.lazy(lazyThreadSafetyMode, new nsa(this, 0));
        this.d = LazyKt.lazy(lazyThreadSafetyMode, new nsa(this, 1));
        this.e = LazyKt.lazy(lazyThreadSafetyMode, new nsa(this, 2));
        this.f = LazyKt.lazy(lazyThreadSafetyMode, new pna(19));
        this.g = LazyKt.lazy(lazyThreadSafetyMode, new nsa(this, 3));
        this.h = LazyKt.lazy(lazyThreadSafetyMode, new nsa(this, 4));
    }

    public final q04 a() {
        return (q04) this.c.getValue();
    }

    public final q04 b() {
        return (q04) this.d.getValue();
    }

    public final gc8 c() {
        return (gc8) this.f.getValue();
    }

    public final aua d() {
        return (aua) this.a.getValue();
    }

    public final q04 e() {
        return (q04) this.g.getValue();
    }
}
