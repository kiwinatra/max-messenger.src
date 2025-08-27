package defpackage;

import java.util.ArrayList;

/* renamed from: q79  reason: default package */
public final class q79 implements p44 {
    public static final ld3 b;
    public final ArrayList a = new ArrayList();

    static {
        q5a q5a = q5a.a;
        vx8 vx8 = new vx8(29);
        q5a.getClass();
        mw0 mw0 = new mw0(vx8, q5a);
        d5d d5d = d5d.a;
        p79 p79 = new p79(0);
        d5d.getClass();
        b = new ld3(mw0, new mw0(p79, d5d));
    }

    public final long c(long j) {
        int i = 0;
        long j2 = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                break;
            }
            long j3 = ((q44) arrayList.get(i)).b;
            long j4 = ((q44) arrayList.get(i)).d;
            if (j < j3) {
                j2 = j2 == -9223372036854775807L ? j3 : Math.min(j2, j3);
            } else {
                if (j < j4) {
                    j2 = j2 == -9223372036854775807L ? j4 : Math.min(j2, j4);
                }
                i++;
            }
        }
        if (j2 != -9223372036854775807L) {
            return j2;
        }
        return Long.MIN_VALUE;
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean e(q44 q44, long j) {
        long j2 = q44.b;
        n79.g(j2 != -9223372036854775807L);
        n79.g(q44.c != -9223372036854775807L);
        boolean z = j2 <= j && j < q44.d;
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((q44) arrayList.get(size)).b) {
                arrayList.add(size + 1, q44);
                return z;
            }
        }
        arrayList.add(0, q44);
        return z;
    }

    public final tb7 g(long j) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j >= ((q44) arrayList.get(0)).b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    q44 q44 = (q44) arrayList.get(i);
                    if (j >= q44.b && j < q44.d) {
                        arrayList2.add(q44);
                    }
                    if (j < q44.b) {
                        break;
                    }
                }
                k0d x = tb7.x(b, arrayList2);
                qb7 o = tb7.o();
                for (int i2 = 0; i2 < x.size(); i2++) {
                    o.f(((q44) x.get(i2)).a);
                }
                return o.j();
            }
        }
        return tb7.s();
    }

    public final long k(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((q44) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        long j2 = ((q44) arrayList.get(0)).b;
        for (int i = 0; i < arrayList.size(); i++) {
            long j3 = ((q44) arrayList.get(i)).b;
            long j4 = ((q44) arrayList.get(i)).d;
            if (j4 > j) {
                if (j3 > j) {
                    break;
                }
                j2 = Math.max(j2, j3);
            } else {
                j2 = Math.max(j2, j4);
            }
        }
        return j2;
    }

    public final void m(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i < arrayList.size()) {
                int i2 = (j > ((q44) arrayList.get(i)).b ? 1 : (j == ((q44) arrayList.get(i)).b ? 0 : -1));
                if (i2 > 0 && j > ((q44) arrayList.get(i)).d) {
                    arrayList.remove(i);
                    i--;
                } else if (i2 < 0) {
                    return;
                }
                i++;
            } else {
                return;
            }
        }
    }
}
