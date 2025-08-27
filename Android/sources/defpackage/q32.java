package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* renamed from: q32  reason: default package */
public final class q32 extends xag {
    public aje X;
    public final ArrayList Y = new ArrayList();
    public final s85 Z = new s85(0);
    public final long b;
    public final Lazy c;
    public final Lazy o;
    public final Lazy v;
    public final Lazy w;
    public final Lazy x;
    public final Lazy y;
    public final m7f z = new m7f();

    public q32(long j) {
        jxb jxb = jxb.a;
        Lazy c2 = jxb.c();
        Lazy e = jxb.e();
        Lazy f = jxb.f();
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new lj1(27));
        Lazy g = jxb.g();
        Lazy d = jxb.d();
        this.b = j;
        this.c = c2;
        this.o = e;
        this.v = f;
        this.w = lazy;
        this.x = g;
        this.y = d;
    }

    public final a32 j() {
        return (a32) ((my2) ((qx2) this.c.getValue())).o(this.b).a.getValue();
    }

    public final void k() {
        ArrayList arrayList = this.Y;
        List list = CollectionsKt.toList(arrayList);
        arrayList.clear();
        aje aje = this.X;
        if ((aje == null || !aje.isActive()) && !list.isEmpty()) {
            this.X = xag.g(this, ((osa) ((gaf) this.v.getValue())).b().plus(caa.a), (f14) null, new p32(this, list, (Continuation) null), 2);
        }
    }
}
