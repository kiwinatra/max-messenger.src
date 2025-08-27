package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ya6  reason: default package */
public final class ya6 implements ukb {
    public final Set a;
    public final nb6 b;
    public final zc4 c;
    public final d19 d;
    public final Long e;
    public final boolean f;
    public final Context g;
    public final Lazy h;
    public final Lazy i;
    public final Lazy j;
    public final Lazy k;
    public final xme l;
    public final etc m;
    public List n = CollectionsKt.emptyList();
    public final n6e o;
    public final dtc p;
    public final zqd q;
    public final xme r;
    public final etc s;
    public final Lazy t;
    public final Lazy u;
    public d14 v;
    public boolean w;

    public ya6(Set set, nb6 nb6, zc4 zc4, d19 d19, Long l2, boolean z, Context context, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4) {
        this.a = set;
        this.b = nb6;
        this.c = zc4;
        this.d = d19;
        this.e = l2;
        this.f = z;
        this.g = context;
        this.h = lazy;
        this.i = lazy2;
        this.j = lazy3;
        this.k = lazy4;
        xme a2 = f6e.a((Object) null);
        this.l = a2;
        this.m = new etc(a2);
        n6e b2 = m5a.b(0, IntCompanionObject.MAX_VALUE, cu0.b, 1);
        this.o = b2;
        this.p = new dtc(b2);
        this.q = new zqd(11);
        xme a3 = f6e.a(Boolean.TRUE);
        this.r = a3;
        this.s = new etc(a3);
        sa6 sa6 = new sa6(this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.t = LazyKt.lazy(lazyThreadSafetyMode, sa6);
        this.u = LazyKt.lazy(lazyThreadSafetyMode, new sa6(this, 1));
        if (!(!set.isEmpty())) {
            throw new IllegalStateException("You must specify messages to forward!".toString());
        }
    }

    public final void a() {
        this.v = null;
    }

    public final void b(dkb dkb) {
        ((AtomicReference) this.c.v).updateAndGet(new n01(7, dkb));
    }

    public final void c(d14 d14) {
        this.v = d14;
        ev0.v(d14, ((osa) ((gaf) this.h.getValue())).b(), (f14) null, new xa6(this, (Continuation) null), 2);
    }

    public final void d(long j2) {
        ((AtomicReference) this.c.v).updateAndGet(new grd(j2));
    }
}
