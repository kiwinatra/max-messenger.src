package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;

/* renamed from: l86  reason: default package */
public final class l86 extends xag {
    public final xme X;
    public final etc Y;
    public final AtomicReference Z = new AtomicReference((Object) null);
    public final long b;
    public final Context c;
    public final u82 o;
    public final gaf v;
    public final xme v0;
    public final Lazy w;
    public final etc w0;
    public final Lazy x;
    public final xme y;
    public final etc z;

    public l86(long j) {
        i66 i66 = i66.a;
        u82 u82 = (u82) i66.getAccessor().g(u82.class);
        gaf gaf = (gaf) i66.getAccessor().g(gaf.class);
        Lazy h = i66.getAccessor().h(qx2.class);
        Lazy h2 = i66.getAccessor().h(e0b.class);
        Lazy h3 = i66.getAccessor().h(xva.class);
        this.b = j;
        this.c = (Context) i66.getAccessor().g(Context.class);
        this.o = u82;
        this.v = gaf;
        this.w = h2;
        this.x = h;
        xme a = f6e.a((Object) null);
        this.y = a;
        this.z = new etc(a);
        xme a2 = f6e.a(Boolean.FALSE);
        this.X = a2;
        this.Y = new etc(a2);
        xme a3 = f6e.a(SetsKt.emptySet());
        this.v0 = a3;
        this.w0 = new etc(a3);
        bs0.K(bs0.F(new ps5(((ia2) u82).j(), new u76(this, h3, (Continuation) null), 5), ((osa) gaf).a()), this.a);
    }
}
