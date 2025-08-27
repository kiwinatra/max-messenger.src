package defpackage;

import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KProperty;

/* renamed from: oa8  reason: default package */
public final class oa8 extends xag {
    public static final /* synthetic */ KProperty[] Y = {rae.s(oa8.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;", 0)};
    public qn7 X;
    public final kva b;
    public final gaf c;
    public final Lazy o = LazyKt.lazy(new x98(this, 0));
    public final LinkedBlockingQueue v = new LinkedBlockingQueue(1);
    public final xme w = f6e.a(CollectionsKt.emptyList());
    public final LinkedBlockingQueue x = new LinkedBlockingQueue(1);
    public final xme y = f6e.a(CollectionsKt.emptyList());
    public final wie z = o5a.U();

    public oa8(kva kva, gaf gaf) {
        this.b = kva;
        this.c = gaf;
        qm7 b2 = kv0.b();
        b2.h0();
        this.X = b2;
        xag.g(this, ((osa) gaf).b(), (f14) null, new ca8(this, (Continuation) null), 2);
        j();
    }

    public final void j() {
        if (this.X.e0()) {
            pm7 pm7 = (pm7) this.z.getValue(this, Y[0]);
            gaf gaf = this.c;
            jx3 jx3 = this.a;
            this.X = (pm7 == null || !pm7.isActive()) ? ev0.v(jx3, ((osa) gaf).b(), (f14) null, new ha8(this, (Continuation) null), 2) : ev0.v(jx3, ((osa) gaf).b(), (f14) null, new ga8(this, (Continuation) null), 2);
        }
    }
}
