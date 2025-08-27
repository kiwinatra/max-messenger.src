package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* renamed from: due  reason: default package */
public final class due {
    public final Lazy a;
    public final Lazy b;
    public final jx3 c;
    public final xme d;
    public final etc e;
    public final AtomicReference f = new AtomicReference(0L);
    public aje g;

    public due(Lazy lazy, Lazy lazy2, moe moe, gaf gaf) {
        this.a = lazy;
        this.b = lazy2;
        jx3 a2 = e14.a(((osa) gaf).b());
        this.c = a2;
        xme a3 = f6e.a(CollectionsKt.emptyList());
        this.d = a3;
        this.e = new etc(a3);
        bs0.K(new ps5(new zjb(kv0.h(moe.m), this, 8), new zte(this, (Continuation) null), 5), a2);
    }
}
