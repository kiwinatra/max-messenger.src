package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;

/* renamed from: rp4  reason: default package */
public final class rp4 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;

    public rp4(sp4 sp4) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        this.a = LazyKt.lazy(lazyThreadSafetyMode, new pp4(sp4, 1));
        this.b = LazyKt.lazy(lazyThreadSafetyMode, new qp4(this, sp4, 0));
        this.c = LazyKt.lazy(lazyThreadSafetyMode, new pp4(sp4, 2));
        this.d = LazyKt.lazy(lazyThreadSafetyMode, new qp4(this, sp4, 1));
        this.e = LazyKt.lazy(lazyThreadSafetyMode, new pp4(sp4, this));
        this.f = LazyKt.lazy(lazyThreadSafetyMode, new qp4(this, sp4, 2));
    }

    public final vu0 a() {
        return (vu0) this.b.getValue();
    }
}
