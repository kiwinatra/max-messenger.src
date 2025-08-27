package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KProperty;

/* renamed from: gwe  reason: default package */
public final class gwe extends xag {
    public static final /* synthetic */ KProperty[] B0;
    public final Lazy A0;
    public final Lazy X;
    public final wie Y = o5a.U();
    public final wie Z = o5a.U();
    public final ete b;
    public final long c;
    public final Context o;
    public final gaf v;
    public final wie v0 = o5a.U();
    public final Lazy w;
    public final xme w0;
    public final Lazy x;
    public final etc x0;
    public final Lazy y;
    public final etc y0;
    public final Lazy z;
    public final s85 z0;

    static {
        Class<gwe> cls = gwe.class;
        B0 = new KProperty[]{rae.s(cls, "clearJob", "getClearJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "deleteStickersJob", "getDeleteStickersJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "deleteSetJob", "getDeleteSetJob()Lkotlinx/coroutines/Job;", 0)};
    }

    public gwe(ete ete, long j, Context context, gaf gaf, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5) {
        bs5 bs5;
        bs5 bs52;
        ete ete2 = ete;
        long j2 = j;
        gaf gaf2 = gaf;
        this.b = ete2;
        this.c = j2;
        this.o = context;
        this.v = gaf2;
        this.w = lazy;
        this.x = lazy2;
        this.y = lazy3;
        this.z = lazy4;
        this.X = lazy5;
        xme a = f6e.a(CollectionsKt.emptyList());
        this.w0 = a;
        this.x0 = new etc(a);
        ete ete3 = ete.SET;
        if (ete2 != ete3 || j2 == -1) {
            bs5 = new sbd(new awe(new sve(ete2 == ete.RECENT ? new igf(n1b.q) : new igf(n1b.e), (String) null, (String) null, j(false)), (Continuation) null));
        } else {
            bs5 = new zjb(new i21(kv0.h(((vqe) lazy5.getValue()).b(j2)), kv0.h(((ai5) lazy4.getValue()).d(j2)), zve.a, 4), this, 9);
        }
        osa osa = (osa) gaf2;
        this.y0 = bs0.X(bs0.F(bs5, osa.b()), this.a, z6e.a, (Object) null);
        this.z0 = new s85(0);
        this.A0 = LazyKt.lazy(new lce(7, this));
        if (ete2 == ete3 && j2 == -1) {
            String name = gwe.class.getName();
            a67 a67 = z68.b;
            if (a67 != null && a67.c()) {
                a67.d(w78.w, name, "Try load stickers from stickerSet by invalid id: -1", (Throwable) null);
            }
            bs52 = s45.a;
        } else {
            int ordinal = ete.ordinal();
            if (ordinal == 0) {
                bs52 = kv0.h(((moe) lazy.getValue()).a());
            } else if (ordinal == 1) {
                bs52 = kv0.h(((vi5) lazy3.getValue()).a());
            } else if (ordinal == 2) {
                bs52 = new kyd(kv0.h(((vqe) lazy5.getValue()).b(j2)), 6);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        bs0.K(bs0.F(new ps5(bs52, new p2c(2, this, gwe.class, "processStickers", "processStickers(Ljava/util/List;)V", 4, 18), 5), osa.b()), this.a);
    }

    public final List j(boolean z2) {
        List createListBuilder = CollectionsKt.createListBuilder();
        ete ete = ete.SET;
        ete ete2 = this.b;
        if (ete2 != ete) {
            createListBuilder.add(new ow3(m1b.u, (ngf) new igf(n1b.z), Integer.valueOf(cad.G), Integer.valueOf(jya.F), 4));
        } else {
            createListBuilder.add(new ow3(m1b.i, (ngf) new igf(n1b.f), Integer.valueOf(cad.v), Integer.valueOf(jya.F), 4));
            if (z2) {
                createListBuilder.add(new ow3(m1b.j, (ngf) new igf(n1b.m), Integer.valueOf(jya.I), Integer.valueOf(cad.y), Integer.valueOf(jya.E)));
            }
        }
        int ordinal = ete2.ordinal();
        Integer valueOf = ordinal != 0 ? ordinal != 1 ? null : Integer.valueOf(m1b.t) : Integer.valueOf(m1b.w);
        if (valueOf != null) {
            createListBuilder.add(new ow3(valueOf.intValue(), (ngf) new igf(n1b.D), Integer.valueOf(jya.I), Integer.valueOf(cad.y), Integer.valueOf(jya.E)));
        }
        return CollectionsKt.build(createListBuilder);
    }

    public final bx9 k() {
        return (bx9) this.A0.getValue();
    }

    public final String l(int i) {
        return this.o.getResources().getQuantityString(gza.a, i, new Object[]{Integer.valueOf(i)});
    }
}
