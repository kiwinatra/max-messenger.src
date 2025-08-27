package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: e5e  reason: default package */
public final class e5e implements ukb {
    public final u9 a;
    public final o5e b;
    public final zc4 c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final xme g;
    public final etc h;
    public final n6e i;
    public final dtc j;
    public final zqd k = new zqd(11);
    public d14 l;
    public boolean m;

    public e5e(u9 u9Var, o5e o5e, zc4 zc4, Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.a = u9Var;
        this.b = o5e;
        this.c = zc4;
        this.d = lazy;
        this.e = lazy2;
        this.f = lazy3;
        xme a2 = f6e.a((Object) null);
        this.g = a2;
        this.h = new etc(a2);
        n6e b2 = m5a.b(0, IntCompanionObject.MAX_VALUE, (cu0) null, 5);
        this.i = b2;
        this.j = new dtc(b2);
        if (u9Var == null) {
            throw new IllegalStateException("ShareData is null".toString());
        }
    }

    public final void a() {
        this.l = null;
    }

    public final void b(dkb dkb) {
        ((AtomicReference) this.c.v).updateAndGet(new n01(7, dkb));
    }

    public final void c(d14 d14) {
        this.l = d14;
        ev0.v(d14, ((osa) ((gaf) this.d.getValue())).b(), (f14) null, new c5e(this, (Continuation) null), 2);
    }

    public final void d(long j2) {
        ((AtomicReference) this.c.v).updateAndGet(new grd(j2));
    }
}
