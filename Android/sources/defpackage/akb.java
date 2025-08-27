package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KProperty;

/* renamed from: akb  reason: default package */
public final class akb extends xag {
    public static final /* synthetic */ KProperty[] w = {rae.s(akb.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;", 0)};
    public final etc b;
    public final ju3 c;
    public final xme o = f6e.a((Object) null);
    public final wie v = o5a.U();

    public akb(cp3 cp3, Lazy lazy, Lazy lazy2) {
        zjb zjb = new zjb(cp3.c(), this, 0);
        List emptyList = CollectionsKt.emptyList();
        this.b = bs0.X(zjb, this.a, z6e.a, emptyList);
        ju3 ju3 = new ju3(this.a, cp3.c(), (he) null, lazy, lazy2);
        this.c = ju3;
        cp3.d();
        bs0.K(new ps5(ju3.i, new wjb(this, (Continuation) null), 5), this.a);
    }

    public static final List j(akb akb, po3 po3) {
        ArrayList arrayList;
        ArrayList arrayList2;
        po3 po32 = po3;
        akb.getClass();
        if (po3.b()) {
            return CollectionsKt.emptyList();
        }
        List createListBuilder = CollectionsKt.createListBuilder();
        List list = po32.a;
        if (list != null) {
            Iterable<zo3> iterable = list;
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            for (zo3 zo3 : iterable) {
                long j = zo3.a;
                CharSequence charSequence = zo3.v;
                mgf mgf = charSequence != null ? new mgf(charSequence) : null;
                hhb hhb = r6;
                hhb hhb2 = new hhb(j, j, zo3.b, mgf, zo3.x, false, zo3.z, new dkb(j, ckb.b), zo3.X);
                arrayList.add(hhb);
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            createListBuilder.addAll(arrayList);
        }
        List list2 = po32.c;
        if (list2 != null) {
            Iterable iterable2 = list2;
            arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
            Iterator it = iterable2.iterator();
            while (it.hasNext()) {
                zo3 zo32 = (zo3) it.next();
                long j2 = zo32.a;
                CharSequence charSequence2 = zo32.v;
                Iterator it2 = it;
                hhb hhb3 = r4;
                hhb hhb4 = new hhb(j2, j2, zo32.b, charSequence2 != null ? new mgf(charSequence2) : null, zo32.x, false, zo32.z, new dkb(j2, ckb.c), zo32.X);
                arrayList2.add(hhb3);
                it = it2;
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            createListBuilder.addAll(arrayList2);
        }
        return CollectionsKt.build(createListBuilder);
    }
}
