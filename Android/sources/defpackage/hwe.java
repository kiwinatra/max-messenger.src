package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import kotlin.sequences.SequencesKt;

/* renamed from: hwe  reason: default package */
public final class hwe extends xag {
    public static final /* synthetic */ KProperty[] z0;
    public final etc X;
    public final AtomicLong Y = new AtomicLong();
    public final xme Z;
    public final gaf b;
    public final Lazy c;
    public final Lazy o;
    public final Lazy v;
    public final etc v0;
    public final Lazy w;
    public final wie w0;
    public final Lazy x;
    public final wie x0;
    public final Lazy y;
    public final wie y0;
    public final xme z;

    static {
        Class<hwe> cls = hwe.class;
        z0 = new KProperty[]{rae.s(cls, "selectedFindJob", "getSelectedFindJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "addSetInFavoriteJob", "getAddSetInFavoriteJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "clearRecentJob", "getClearRecentJob()Lkotlinx/coroutines/Job;", 0)};
    }

    public hwe(gaf gaf, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6) {
        this.b = gaf;
        this.c = lazy;
        this.o = lazy2;
        this.v = lazy3;
        this.w = lazy4;
        this.x = lazy5;
        this.y = lazy6;
        xme a = f6e.a(new rve(CollectionsKt.emptyList(), CollectionsKt.emptyList()));
        this.z = a;
        this.X = new etc(a);
        xme a2 = f6e.a(new qve(0, 0, 7, 0));
        this.Z = a2;
        this.v0 = new etc(a2);
        this.w0 = o5a.U();
        this.x0 = o5a.U();
        this.y0 = o5a.U();
    }

    public static void j(List list, mqe mqe, ArrayList arrayList) {
        wx1 wx1 = new wx1(mqe.a, mqe);
        arrayList.add(wx1);
        list.add(wx1);
        list.addAll(mqe.v);
    }

    public static mqe k(bqe bqe, lqe lqe) {
        long j = bqe.a;
        String str = bqe.b;
        if (str == null) {
            str = "";
        }
        return new mqe(j, new mgf(str), bqe.c, (Integer) null, l(j, bqe.h), lqe, false, false, 200);
    }

    public static List l(long j, List list) {
        return SequencesKt.toList(SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(list), new duc(11)), new ove(j, j == -9223372036854775807L || j == -9223372036854775806L || j == -9223372036854775805L)));
    }

    public final void m(long j, Function1 function1) {
        aje u = ev0.u(this.a, ((osa) this.b).b(), f14.b, new fwe(function1, j, this, (Continuation) null));
        this.w0.setValue(this, z0[0], u);
    }
}
