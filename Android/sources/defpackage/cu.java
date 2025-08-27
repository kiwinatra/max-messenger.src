package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;

/* renamed from: cu  reason: default package */
public final class cu extends qm implements lcf {
    public final int o;
    public final long[] v;

    public cu(long[] jArr, int i, long j) {
        super(j);
        this.o = i;
        this.v = jArr;
    }

    public final void e(ibf ibf) {
        du duVar = (du) ibf;
        int i = this.o;
        int y = tr1.y(i);
        rm rmVar = null;
        if (y == 1) {
            rm rmVar2 = this.c;
            if (rmVar2 == null) {
                rmVar2 = null;
            }
            moe moe = (moe) rmVar2.r.getValue();
            List<coe> list = duVar.c;
            ArrayList arrayList = new ArrayList();
            for (coe r : list) {
                arrayList.add(qe8.r(r));
            }
            moe.h(arrayList);
            rm rmVar3 = this.c;
            if (rmVar3 == null) {
                rmVar3 = null;
            }
            ai5 ai5 = (ai5) rmVar3.u.getValue();
            Iterable<coe> iterable = duVar.c;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            for (coe coe : iterable) {
                arrayList2.add(Long.valueOf(coe.k));
            }
            ai5.i(arrayList2);
        } else if (y == 2) {
            rm rmVar4 = this.c;
            if (rmVar4 == null) {
                rmVar4 = null;
            }
            vqe vqe = (vqe) rmVar4.s.getValue();
            List<cqe> list2 = duVar.o;
            vqe.getClass();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (cqe cqe : list2) {
                arrayList3.addAll(((moe) vqe.b).f(cqe.h));
                arrayList4.add(vqe.g(cqe));
            }
            if (!arrayList3.isEmpty()) {
                cjf.N(arrayList3);
                Iterator it = cjf.Q(arrayList3).iterator();
                while (it.hasNext()) {
                    vqe.c.c(2, (List) it.next());
                }
            }
            if (!arrayList4.isEmpty()) {
                ere ere = vqe.a;
                ere.getClass();
                ryg.k0(new na3(4, new yia(jha.n(arrayList4), new dre(3), 3).B(), new tqe(ere, 1)).m(), m58.f, new x52(29, arrayList4), new uh5(6, arrayList4));
            }
            rm rmVar5 = this.c;
            if (rmVar5 == null) {
                rmVar5 = null;
            }
            ai5 ai52 = (ai5) rmVar5.u.getValue();
            Iterable<cqe> iterable2 = duVar.o;
            ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
            for (cqe cqe2 : iterable2) {
                arrayList5.add(Long.valueOf(cqe2.a));
            }
            ai52.i(arrayList5);
        }
        rm rmVar6 = this.c;
        if (rmVar6 != null) {
            rmVar = rmVar6;
        }
        rmVar.b().c(new eu(i, this.a, ArraysKt.toList(this.v)));
    }

    public final fbf g() {
        return new yt(this.v, this.o);
    }

    public final void h(qaf qaf) {
        z68.f("cu", qaf.toString(), (Throwable) null);
    }
}
