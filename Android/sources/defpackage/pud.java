package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: pud  reason: default package */
public final class pud extends gvd {
    public final long B0;

    public pud(oud oud) {
        super(oud);
        this.B0 = oud.p;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, m20] */
    public final ga9 A() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.z0.size());
        for (n2 n2Var : this.z0) {
            hud hud = this.a;
            if (hud == null) {
                hud = null;
            }
            u7b b = ((kvb) hud.g0.getValue()).b(n2Var, this.A0);
            if (b != null) {
                n2 n2Var2 = (n2) b.a;
                l20 l20 = (l20) b.b;
                if (!(n2Var2 == null || l20 == null)) {
                    arrayList2.add(n2Var2);
                    arrayList.add(l20);
                }
            }
        }
        this.z0 = arrayList2;
        ? obj = new Object();
        obj.a = arrayList;
        w28 c = obj.c();
        ga9 ga9 = new ga9();
        ga9.n = c;
        String str = this.x0;
        if (!cvg.A(str)) {
            ga9.g = str;
        }
        List list = this.y0;
        Collection collection = list;
        if (collection != null && !collection.isEmpty()) {
            ga9.F = list;
        }
        ga9.H = this.w0;
        return ga9;
    }

    public final void z() {
        long j;
        ha9 r;
        a32 a32;
        a32 G = e().G(this.c);
        if (G != null && (r = o().r(j)) != null && r.Y != qe9.DELETED) {
            o().z(r, oa9.SENDING);
            w28 w28 = A().n;
            List list = w28 != null ? (List) w28.b : null;
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            List list2 = list;
            hud hud = this.a;
            if (hud == null) {
                hud = null;
            }
            ((sz4) hud.H.getValue()).a(this.B0, this.c, this.x0, this.y0, qe9.EDITED, list2, true);
            rl a = a();
            long j2 = G.b.a;
            List list3 = r.o() ? (List) r.x0.b : null;
            a32 a322 = G;
            ((jna) a).J(this.c, this.B0, j2, r.c, this.x0, r.y, r.Y, list3, true, r.P0);
            ha9 r2 = o().r((j = this.B0));
            if (r2 != null) {
                int size = this.z0.size();
                int i = 0;
                while (i < size) {
                    if (!(this.z0.get(i) instanceof l00)) {
                        n2 n2Var = (n2) this.z0.get(i);
                        String str = r2.x0.F(i).q;
                        hud hud2 = this.a;
                        if (hud2 == null) {
                            hud2 = null;
                        }
                        a32 = a322;
                        ((gl5) hud2.b.getValue()).c(n2Var, this.B0, a32.a, str);
                    } else {
                        a32 = a322;
                    }
                    i++;
                    a322 = a32;
                }
            }
        }
    }
}
