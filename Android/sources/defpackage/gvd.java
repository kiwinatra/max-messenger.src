package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: gvd  reason: default package */
public class gvd extends ivd {
    public final boolean A0;
    public final String x0;
    public final List y0;
    public List z0;

    public gvd(fvd fvd) {
        super(fvd);
        this.x0 = fvd.m;
        this.y0 = fvd.n;
        this.z0 = fvd.l;
        this.A0 = fvd.o;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, m20] */
    public ga9 A() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.z0.size());
        Iterator it = this.z0.iterator();
        while (true) {
            hud hud = null;
            if (!it.hasNext()) {
                break;
            }
            n2 n2Var = (n2) it.next();
            if (n2Var instanceof l00) {
                arrayList2.add(n2Var);
                arrayList.add(((l00) n2Var).c);
            } else {
                hud hud2 = this.a;
                if (hud2 != null) {
                    hud = hud2;
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
        }
        String str = this.x0;
        if ((str == null || str.length() == 0) && arrayList2.isEmpty()) {
            return null;
        }
        this.z0 = arrayList2;
        ? obj = new Object();
        obj.a = arrayList;
        w28 c = obj.c();
        ga9 ga9 = new ga9();
        ga9.n = c;
        if (!cvg.A(str)) {
            ga9.g = str;
        }
        List list = this.y0;
        Collection collection = list;
        if (collection != null && !collection.isEmpty()) {
            ga9.F = list;
        }
        return ga9;
    }

    public final long B(long j, a32 a32) {
        ha9 ha9;
        int i;
        int i2;
        a32 a322 = a32;
        long B = super.B(j, a32);
        ha9 r = p().r(j);
        if (r == null) {
            return 0;
        }
        int size = this.z0.size();
        int i3 = 0;
        while (i3 < size) {
            n2 n2Var = (n2) this.z0.get(i3);
            String str = r.x0.F(i3).q;
            if (n2Var instanceof df5) {
                jqg v = v();
                df5 df5 = (df5) n2Var;
                i2 = size;
                i = i3;
                ha9 = r;
                ff5 ff5 = r5;
                ff5 ff52 = new ff5(((ltb) q()).a.n(), df5.b, str, j, a322.a, df5.w);
                v.b(ff5);
            } else {
                ha9 = r;
                i2 = size;
                i = i3;
                if (!(n2Var instanceof l00)) {
                    hud hud = this.a;
                    if (hud == null) {
                        hud = null;
                    }
                    ((gl5) hud.b.getValue()).c(n2Var, j, a322.a, str);
                }
            }
            i3 = i + 1;
            long j2 = j;
            size = i2;
            r = ha9;
        }
        return B;
    }
}
