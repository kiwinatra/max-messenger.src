package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* renamed from: he1  reason: default package */
public final class he1 extends xag {
    public static final /* synthetic */ KProperty[] x0;
    public String X = "";
    public final xme Y;
    public final xme Z;
    public final h9b b;
    public final gaf c;
    public final ap1 o;
    public final Lazy v;
    public final ll1 v0;
    public final Lazy w;
    public final s85 w0;
    public final Lazy x = LazyKt.lazy(LazyThreadSafetyMode.NONE, new v11(14));
    public final wie y = o5a.U();
    public final wie z = o5a.U();

    static {
        Class<he1> cls = he1.class;
        x0 = new KProperty[]{rae.s(cls, "openOpponentChat", "getOpenOpponentChat()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "openOpponentProfile", "getOpenOpponentProfile()Lkotlinx/coroutines/Job;", 0)};
    }

    public he1(Lazy lazy, h9b h9b, gaf gaf, ap1 ap1) {
        Object value;
        List createListBuilder;
        Lazy lazy2 = rjd.c;
        Lazy lazy3 = rjd.r;
        this.b = h9b;
        this.c = gaf;
        this.o = ap1;
        this.v = lazy3;
        this.w = lazy2;
        xme a = f6e.a(oe1.e);
        this.Y = a;
        this.Z = a;
        this.v0 = new ll1();
        this.w0 = new s85(0);
        ev0.v(this.a, ((osa) gaf).e(), (f14) null, new ae1(this, (Continuation) null), 2);
        bs0.K(new ps5(((k21) ap1.f).k, new be1(this, (Continuation) null), 5), this.a);
        bs0.K(new i21(ap1.c.e, new h11(ap1.c(), lazy, 1), new ce1((Object) lazy, (Object) this, (Continuation) null, 0), 4), this.a);
        do {
            value = a.getValue();
            createListBuilder = CollectionsKt.createListBuilder();
            int i = qqa.u0;
            int i2 = sqa.j0;
            cqa cqa = cqa.b;
            cqa cqa2 = cqa;
            createListBuilder.add(new gqa(i, cqa2, Integer.valueOf(i2), Integer.valueOf(pqa.v), 154));
            cqa cqa3 = cqa;
            createListBuilder.add(new gqa(qqa.t0, cqa3, Integer.valueOf(sqa.g0), Integer.valueOf(pqa.d), 154));
        } while (!a.b(value, oe1.a((oe1) value, (List) null, CollectionsKt.build(createListBuilder), (CharSequence) null, 5)));
    }

    public static final void j(he1 he1, Collection collection) {
        Object value;
        oe1 oe1;
        ArrayList arrayList;
        he1 he12 = he1;
        xme xme = he12.Y;
        do {
            value = xme.getValue();
            oe1 = (oe1) value;
            Iterable<y8b> iterable = collection;
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            for (y8b y8b : iterable) {
                ze1 id = y8b.a.getId();
                jm1 jm1 = y8b.b;
                String o2 = jm1.o();
                if (o2 == null) {
                    o2 = "";
                }
                String str = o2;
                String name = jm1.getName();
                CharSequence i = jm1.i();
                cf1 cf1 = y8b.a;
                arrayList.add(new sd1(id, name, i, str, cf1.m(), cf1.l(), Integer.valueOf((!cf1.l() || !cf1.m()) ? cf1.l() ? sqa.P0 : cf1.m() ? sqa.R0 : sqa.U0 : sqa.S0)));
            }
        } while (!xme.b(value, oe1.a(oe1, CollectionsKt.sortedWith(arrayList, (Comparator) he12.x.getValue()), (List) null, (CharSequence) null, 14)));
    }

    public final void k(Bundle bundle) {
        ze1 ze1;
        if (bundle != null && (ze1 = (ze1) bundle.getParcelable("call_participant_id")) != null && !Intrinsics.areEqual((Object) ze1, (Object) ze1.c)) {
            this.o.e(ze1, false);
        }
    }
}
