package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: p16  reason: default package */
public final class p16 implements ukb {
    public final zc4 a;
    public final Lazy b;
    public final Lazy c;
    public final n6e d;
    public final dtc e;
    public d14 f;
    public boolean g;

    public p16(zc4 zc4, Lazy lazy, Lazy lazy2) {
        this.a = zc4;
        this.b = lazy;
        this.c = lazy2;
        n6e b2 = m5a.b(0, IntCompanionObject.MAX_VALUE, (cu0) null, 5);
        this.d = b2;
        this.e = new dtc(b2);
    }

    public final void a() {
        this.f = null;
    }

    public final void b(dkb dkb) {
        ((AtomicReference) this.a.v).updateAndGet(new n01(7, dkb));
    }

    public final void c(d14 d14) {
        this.f = d14;
    }

    public final void d(long j) {
        ((AtomicReference) this.a.v).updateAndGet(new grd(j));
    }
}
