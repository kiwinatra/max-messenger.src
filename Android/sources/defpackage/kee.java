package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: kee  reason: default package */
public final class kee implements z49 {
    public final long a;
    public final ij2 b;
    public final gaf c;
    public final long d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final AtomicInteger h;
    public final xme i;
    public final xme j;
    public final etc k;
    public final etc l;

    public kee(long j2, ij2 ij2, x23 x23, Lazy lazy, Lazy lazy2, Lazy lazy3, gaf gaf, Lazy lazy4) {
        this.a = j2;
        this.b = ij2;
        this.c = gaf;
        this.d = ((qjd) x23).s();
        this.e = lazy;
        this.f = lazy2;
        this.g = lazy3;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.h = atomicInteger;
        xme a2 = f6e.a(Integer.valueOf(atomicInteger.get()));
        this.i = a2;
        osa osa = (osa) gaf;
        jx3 a3 = e14.a(osa.a());
        xme a4 = f6e.a((Object) null);
        this.j = a4;
        xme a5 = f6e.a((Object) null);
        this.k = new etc(a5);
        this.l = bs0.X(bs0.b0(a2, new uu5((Continuation) null, (Object) this, 8)), a3, z6e.a, CollectionsKt.emptyList());
        ev0.v(a3, (CoroutineContext) null, (f14) null, new iee(lazy, this, lazy4, (Continuation) null), 3);
        bs0.K(bs0.F(new ps5(new zjb(bs0.w(bs0.v(a4, 200)), this, 6), new zqa(a5, 12), 5), osa.b()), a3);
    }

    public final void a(String str) {
        this.j.setValue(str);
    }

    public final bs5 b() {
        return this.k;
    }

    public final boolean c() {
        return false;
    }

    public final void d() {
        Integer valueOf = Integer.valueOf(this.h.incrementAndGet());
        xme xme = this.i;
        xme.getClass();
        xme.m((Object) null, valueOf);
    }

    public final etc getMembers() {
        return this.l;
    }
}
