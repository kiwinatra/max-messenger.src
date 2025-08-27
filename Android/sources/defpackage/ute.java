package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KProperty;

/* renamed from: ute  reason: default package */
public final class ute extends xag {
    public static final /* synthetic */ KProperty[] w0 = {rae.s(ute.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;", 0)};
    public final AtomicReference X;
    public final AtomicReference Y;
    public final wie Z;
    public final long b;
    public final gaf c;
    public final Lazy o;
    public final Lazy v;
    public aje v0;
    public final xme w;
    public final etc x;
    public final s85 y = new s85(0);
    public final xme z;

    public ute(long j, Lazy lazy, z8e z8e, Lazy lazy2, gaf gaf) {
        this.b = j;
        this.c = gaf;
        this.o = lazy;
        this.v = lazy2;
        xme a = f6e.a(kld.c);
        this.w = a;
        this.x = new etc(a);
        xme a2 = f6e.a((Object) null);
        this.z = a2;
        this.X = new AtomicReference(CollectionsKt.emptyList());
        this.Y = new AtomicReference(new pte((String) null, 3));
        this.Z = o5a.U();
        bs0.K(bs0.F(new ps5(bs0.Y(new zjb(kv0.h(((moe) z8e.a.getValue()).m), z8e, 5), 1), new ote(this, (Continuation) null), 5), ((osa) gaf).b()), this.a);
        bs0.K(new ps5(bs0.v(new eu5(a2, 0), 200), new p2c(2, this, ute.class, "searchStickersByQuery", "searchStickersByQuery(Ljava/lang/String;)V", 4, 12), 5), this.a);
    }

    public static final gpe j(ute ute, boe boe) {
        boe boe2 = boe;
        ute.getClass();
        long j = boe2.a;
        String str = boe2.y;
        if (cvg.A(str)) {
            str = boe2.o;
        }
        long j2 = boe2.Z;
        return new gpe(j, j2, j2, str, boe2.v0, boe2.b, boe2.c, false, false, 0, 3872);
    }

    public final boolean k() {
        pte pte = (pte) this.Y.get();
        String str = pte.a;
        return (pte.b == 0 || str == null || str.length() == 0 || !(((kld) this.x.a.getValue()).b.isEmpty() ^ true)) ? false : true;
    }
}
