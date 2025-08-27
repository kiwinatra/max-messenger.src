package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: fg0  reason: default package */
public final class fg0 {
    public final xsg a = new xsg();
    public final c15 b = new c15();
    public final c15 c = new c15();
    public final boolean d = false;
    public final ap0 e = new ap0(14);
    public final ap0 f = new ap0(14);
    public final lc2 g = new Object();
    public final lc2 h = new Object();
    public final etg i = new Object();
    public final etg j = new Object();
    public final CopyOnWriteArraySet k = new CopyOnWriteArraySet();
    public final boolean l = false;
    public boolean m;
    public boolean n;
    public double o;
    public double p;

    public static boolean b(xsg xsg, double d2, double d3, double d4, dg0 dg0) {
        if (d2 > d4 && d4 > 0.0d) {
            return xsg.a(dg0, true);
        }
        if (d2 >= d3 || d3 <= 0.0d) {
            return false;
        }
        return xsg.a(dg0, false);
    }

    public final void a() {
        boolean a2;
        boolean a3;
        ue1 q;
        boolean z = this.a.b == 0;
        double d2 = this.b.b;
        xsg xsg = this.a;
        double d3 = (double) this.i.a;
        double d4 = (double) this.j.a;
        dg0 dg0 = dg0.b;
        boolean b2 = b(xsg, d2, d3, d4, dg0);
        double d5 = this.c.b;
        xsg xsg2 = this.a;
        double d6 = this.i.b;
        double d7 = this.j.b;
        dg0 dg02 = dg0.c;
        boolean b3 = b2 | b(xsg2, d5, d6, d7, dg02);
        boolean z2 = this.n;
        dg0 dg03 = dg0.a;
        boolean a4 = b3 | (z2 ? this.a.a(dg03, this.m) : this.a.a(dg03, false));
        boolean z3 = this.l;
        dg0 dg04 = dg0.v;
        dg0 dg05 = dg0.o;
        if (!z3 || Double.isNaN(this.o) || Double.isNaN(this.p)) {
            a2 = a4 | this.a.a(dg04, false);
            a3 = this.a.a(dg05, false);
        } else {
            a2 = a4 | b(this.a, this.o, (double) this.i.a, (double) this.j.a, dg05);
            a3 = b(this.a, this.p, this.i.b, this.j.b, dg04);
        }
        if (a2 || a3) {
            xsg xsg3 = this.a;
            boolean z4 = xsg3.b == 0;
            HashSet hashSet = new HashSet();
            dg0[] values = dg0.values();
            int i2 = 0;
            while (true) {
                boolean[] zArr = xsg3.a;
                if (i2 >= zArr.length) {
                    break;
                }
                if (zArr[i2]) {
                    hashSet.add(values[i2]);
                }
                i2++;
            }
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                eg0 eg0 = (eg0) it.next();
                if (z4 != z) {
                    if (z4) {
                        eg0.getClass();
                    } else {
                        eg0.getClass();
                    }
                }
                tug tug = (tug) eg0;
                hz0 hz0 = tug.b;
                hz0.X.A.a.getClass();
                if (!hz0.y0 && hz0.r1.H(xnf.c) && (q = hz0.q()) != null) {
                    if (!tug.a && (hashSet.contains(dg0) || hashSet.contains(dg02))) {
                        tug.a = true;
                        hz0.x.i(fqc.i(q, true));
                    } else if (tug.a && !hashSet.contains(dg0) && !hashSet.contains(dg02)) {
                        tug.a = false;
                        hz0.x.i(fqc.i(q, false));
                    }
                }
            }
        }
    }
}
