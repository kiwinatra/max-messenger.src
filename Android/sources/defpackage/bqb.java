package defpackage;

import android.util.Pair;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: bqb  reason: default package */
public final class bqb extends ikf {
    public final HashMap X = new HashMap();
    public final int b;
    public final a9e c;
    public final int o;
    public final int v;
    public final int[] w;
    public final int[] x;
    public final ikf[] y;
    public final Object[] z;

    public bqb(Collection collection, a9e a9e) {
        this.c = a9e;
        this.b = a9e.b.length;
        int size = collection.size();
        this.w = new int[size];
        this.x = new int[size];
        this.y = new ikf[size];
        this.z = new Object[size];
        Iterator it = collection.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            xz8 xz8 = (xz8) it.next();
            this.y[i3] = xz8.b();
            this.x[i3] = i;
            this.w[i3] = i2;
            i += this.y[i3].p();
            i2 += this.y[i3].i();
            this.z[i3] = xz8.a();
            this.X.put(this.z[i3], Integer.valueOf(i3));
            i3++;
        }
        this.o = i;
        this.v = i2;
    }

    public final int a(boolean z2) {
        if (this.b == 0) {
            return -1;
        }
        int i = 0;
        if (z2) {
            int[] iArr = this.c.b;
            i = iArr.length > 0 ? iArr[0] : -1;
        }
        do {
            ikf[] ikfArr = this.y;
            if (ikfArr[i].q()) {
                i = r(i, z2);
            } else {
                return ikfArr[i].a(z2) + this.x[i];
            }
        } while (i != -1);
        return -1;
    }

    public final int b(Object obj) {
        int b2;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.X.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        if (intValue == -1 || (b2 = this.y[intValue].b(obj3)) == -1) {
            return -1;
        }
        return this.w[intValue] + b2;
    }

    public final int c(boolean z2) {
        int i;
        int i2 = this.b;
        if (i2 == 0) {
            return -1;
        }
        if (z2) {
            int[] iArr = this.c.b;
            i = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
        } else {
            i = i2 - 1;
        }
        do {
            ikf[] ikfArr = this.y;
            if (ikfArr[i].q()) {
                i = s(i, z2);
            } else {
                return ikfArr[i].c(z2) + this.x[i];
            }
        } while (i != -1);
        return -1;
    }

    public final int e(int i, int i2, boolean z2) {
        int[] iArr = this.x;
        int c2 = t0g.c(i + 1, iArr);
        int i3 = iArr[c2];
        ikf[] ikfArr = this.y;
        int e = ikfArr[c2].e(i - i3, i2 == 2 ? 0 : i2, z2);
        if (e != -1) {
            return i3 + e;
        }
        int r = r(c2, z2);
        while (r != -1 && ikfArr[r].q()) {
            r = r(r, z2);
        }
        if (r != -1) {
            return ikfArr[r].a(z2) + iArr[r];
        } else if (i2 == 2) {
            return a(z2);
        } else {
            return -1;
        }
    }

    public final dkf g(int i, dkf dkf, boolean z2) {
        int[] iArr = this.w;
        int c2 = t0g.c(i + 1, iArr);
        int i2 = this.x[c2];
        this.y[c2].g(i - iArr[c2], dkf, z2);
        dkf.c += i2;
        if (z2) {
            Object obj = this.z[c2];
            Object obj2 = dkf.b;
            obj2.getClass();
            dkf.b = Pair.create(obj, obj2);
        }
        return dkf;
    }

    public final dkf h(Object obj, dkf dkf) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.X.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        int i = this.x[intValue];
        this.y[intValue].h(obj3, dkf);
        dkf.c += i;
        dkf.b = obj;
        return dkf;
    }

    public final int i() {
        return this.v;
    }

    public final int l(int i, int i2, boolean z2) {
        int[] iArr = this.x;
        int c2 = t0g.c(i + 1, iArr);
        int i3 = iArr[c2];
        ikf[] ikfArr = this.y;
        int l = ikfArr[c2].l(i - i3, i2 == 2 ? 0 : i2, z2);
        if (l != -1) {
            return i3 + l;
        }
        int s = s(c2, z2);
        while (s != -1 && ikfArr[s].q()) {
            s = s(s, z2);
        }
        if (s != -1) {
            return ikfArr[s].c(z2) + iArr[s];
        } else if (i2 == 2) {
            return c(z2);
        } else {
            return -1;
        }
    }

    public final Object m(int i) {
        int[] iArr = this.w;
        int c2 = t0g.c(i + 1, iArr);
        return Pair.create(this.z[c2], this.y[c2].m(i - iArr[c2]));
    }

    public final gkf n(int i, gkf gkf, long j) {
        int[] iArr = this.x;
        int c2 = t0g.c(i + 1, iArr);
        int i2 = iArr[c2];
        int i3 = this.w[c2];
        this.y[c2].n(i - i2, gkf, j);
        Object obj = this.z[c2];
        if (!gkf.A0.equals(gkf.a)) {
            obj = Pair.create(obj, gkf.a);
        }
        gkf.a = obj;
        gkf.x0 += i3;
        gkf.y0 += i3;
        return gkf;
    }

    public final int p() {
        return this.o;
    }

    public final int r(int i, boolean z2) {
        if (z2) {
            a9e a9e = this.c;
            int i2 = a9e.c[i] + 1;
            int[] iArr = a9e.b;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        } else if (i < this.b - 1) {
            return i + 1;
        } else {
            return -1;
        }
    }

    public final int s(int i, boolean z2) {
        if (z2) {
            a9e a9e = this.c;
            int i2 = a9e.c[i] - 1;
            if (i2 >= 0) {
                return a9e.b[i2];
            }
            return -1;
        } else if (i > 0) {
            return i - 1;
        } else {
            return -1;
        }
    }
}
