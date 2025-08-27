package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: fng  reason: default package */
public final class fng {
    public static int f;
    public ArrayList a;
    public int b;
    public int c;
    public ArrayList d;
    public int e;

    public final void a(ArrayList arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                fng fng = (fng) arrayList.get(i);
                if (this.e == fng.b) {
                    c(this.c, fng);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(gw7 gw7, int i) {
        int n;
        int n2;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        uj3 uj3 = (uj3) ((tj3) arrayList.get(0)).T;
        gw7.t();
        uj3.b(gw7, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((tj3) arrayList.get(i2)).b(gw7, false);
        }
        if (i == 0 && uj3.z0 > 0) {
            bs0.d(uj3, gw7, arrayList, 0);
        }
        if (i == 1 && uj3.A0 > 0) {
            bs0.d(uj3, gw7, arrayList, 1);
        }
        try {
            gw7.p();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            tj3 tj3 = (tj3) arrayList.get(i3);
            pf6 pf6 = new pf6(22);
            new WeakReference(tj3);
            gw7.n(tj3.I);
            gw7.n(tj3.J);
            gw7.n(tj3.K);
            gw7.n(tj3.L);
            gw7.n(tj3.M);
            this.d.add(pf6);
        }
        if (i == 0) {
            n = gw7.n(uj3.I);
            n2 = gw7.n(uj3.K);
            gw7.t();
        } else {
            n = gw7.n(uj3.J);
            n2 = gw7.n(uj3.L);
            gw7.t();
        }
        return n2 - n;
    }

    public final void c(int i, fng fng) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            tj3 tj3 = (tj3) it.next();
            ArrayList arrayList = fng.a;
            if (!arrayList.contains(tj3)) {
                arrayList.add(tj3);
            }
            int i2 = fng.b;
            if (i == 0) {
                tj3.n0 = i2;
            } else {
                tj3.o0 = i2;
            }
        }
        this.e = fng.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String l = wj6.l(sb, this.b, "] <");
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            StringBuilder m = g63.m(l, " ");
            m.append(((tj3) it.next()).h0);
            l = m.toString();
        }
        return tr1.j(l, " >");
    }
}
