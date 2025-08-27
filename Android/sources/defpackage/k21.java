package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.reflect.KProperty;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: k21  reason: default package */
public final class k21 implements a21 {
    public static final /* synthetic */ KProperty[] p;
    public final cp1 a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public final Lazy i;
    public final xme j;
    public final xme k;
    public final Lazy l;
    public final wie m = o5a.U();
    public final wie n = o5a.U();
    public Long o;

    static {
        Class<k21> cls = k21.class;
        p = new KProperty[]{rae.s(cls, "eventsJob", "getEventsJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "observeJob", "getObserveJob()Lkotlinx/coroutines/Job;", 0)};
    }

    public k21(cp1 cp1, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7, Lazy lazy8) {
        this.a = cp1;
        this.b = lazy;
        this.c = lazy2;
        this.d = lazy3;
        this.e = lazy4;
        this.f = lazy5;
        this.g = lazy6;
        this.h = lazy7;
        this.i = lazy8;
        xme a2 = f6e.a(y11.f);
        this.j = a2;
        this.k = a2;
        this.l = LazyKt.lazy(new ur(2, lazy5));
    }

    public final aje a(lj6 lj6, long j2) {
        Duration.Companion companion = Duration.Companion;
        bs5 F = bs0.F(new wb(15, new ps5(new on2(new ps5(gt5.d(lj6, DurationKt.toDuration(1, DurationUnit.SECONDS)), new c21(j2, this, (Continuation) null), 5), 28), new d21(this, (Continuation) null), 5), new e21(this, (Continuation) null, 0)), (q04) this.l.getValue());
        f14 f14 = f14.a;
        return ev0.v(this.a, (CoroutineContext) null, f14.b, new zs5(F, (Continuation) null), 1);
    }
}
