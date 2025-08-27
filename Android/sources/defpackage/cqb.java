package defpackage;

import android.util.Pair;
import java.util.HashMap;

/* renamed from: cqb  reason: default package */
public final class cqb extends jkf {
    public static final /* synthetic */ int n = 0;
    public final int e;
    public final b9e f;
    public final int g;
    public final int h;
    public final int[] i;
    public final int[] j;
    public final jkf[] k;
    public final Object[] l;
    public final HashMap m;

    public cqb(jkf[] jkfArr, Object[] objArr, b9e b9e) {
        this.f = b9e;
        this.e = b9e.b.length;
        int length = jkfArr.length;
        this.k = jkfArr;
        this.i = new int[length];
        this.j = new int[length];
        this.l = objArr;
        this.m = new HashMap();
        int length2 = jkfArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 < length2) {
            jkf jkf = jkfArr[i2];
            this.k[i5] = jkf;
            this.j[i5] = i3;
            this.i[i5] = i4;
            i3 += jkf.p();
            i4 += this.k[i5].i();
            this.m.put(objArr[i5], Integer.valueOf(i5));
            i2++;
            i5++;
        }
        this.g = i3;
        this.h = i4;
    }

    public final int a(boolean z) {
        if (this.e == 0) {
            return -1;
        }
        int i2 = 0;
        if (z) {
            int[] iArr = this.f.b;
            i2 = iArr.length > 0 ? iArr[0] : -1;
        }
        do {
            jkf[] jkfArr = this.k;
            if (jkfArr[i2].q()) {
                i2 = r(i2, z);
            } else {
                return jkfArr[i2].a(z) + this.j[i2];
            }
        } while (i2 != -1);
        return -1;
    }

    public final int b(Object obj) {
        int b;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.m.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        if (intValue == -1 || (b = this.k[intValue].b(obj3)) == -1) {
            return -1;
        }
        return this.i[intValue] + b;
    }

    public final int c(boolean z) {
        int i2;
        int i3 = this.e;
        if (i3 == 0) {
            return -1;
        }
        if (z) {
            int[] iArr = this.f.b;
            i2 = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
        } else {
            i2 = i3 - 1;
        }
        do {
            jkf[] jkfArr = this.k;
            if (jkfArr[i2].q()) {
                i2 = s(i2, z);
            } else {
                return jkfArr[i2].c(z) + this.j[i2];
            }
        } while (i2 != -1);
        return -1;
    }

    public final int e(int i2, int i3, boolean z) {
        int[] iArr = this.j;
        int i4 = 0;
        int e2 = v0g.e(iArr, i2 + 1, false, false);
        int i5 = iArr[e2];
        jkf[] jkfArr = this.k;
        jkf jkf = jkfArr[e2];
        int i6 = i2 - i5;
        if (i3 != 2) {
            i4 = i3;
        }
        int e3 = jkf.e(i6, i4, z);
        if (e3 != -1) {
            return i5 + e3;
        }
        int r = r(e2, z);
        while (r != -1 && jkfArr[r].q()) {
            r = r(r, z);
        }
        if (r != -1) {
            return jkfArr[r].a(z) + iArr[r];
        } else if (i3 == 2) {
            return a(z);
        } else {
            return -1;
        }
    }

    public final ekf g(int i2, ekf ekf, boolean z) {
        int[] iArr = this.i;
        int e2 = v0g.e(iArr, i2 + 1, false, false);
        int i3 = this.j[e2];
        this.k[e2].g(i2 - iArr[e2], ekf, z);
        ekf.c += i3;
        if (z) {
            Object obj = this.l[e2];
            Object obj2 = ekf.b;
            obj2.getClass();
            ekf.b = Pair.create(obj, obj2);
        }
        return ekf;
    }

    public final ekf h(Object obj, ekf ekf) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.m.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        int i2 = this.j[intValue];
        this.k[intValue].h(obj3, ekf);
        ekf.c += i2;
        ekf.b = obj;
        return ekf;
    }

    public final int i() {
        return this.h;
    }

    public final int l(int i2, int i3, boolean z) {
        int[] iArr = this.j;
        int i4 = 0;
        int e2 = v0g.e(iArr, i2 + 1, false, false);
        int i5 = iArr[e2];
        jkf[] jkfArr = this.k;
        jkf jkf = jkfArr[e2];
        int i6 = i2 - i5;
        if (i3 != 2) {
            i4 = i3;
        }
        int l2 = jkf.l(i6, i4, z);
        if (l2 != -1) {
            return i5 + l2;
        }
        int s = s(e2, z);
        while (s != -1 && jkfArr[s].q()) {
            s = s(s, z);
        }
        if (s != -1) {
            return jkfArr[s].c(z) + iArr[s];
        } else if (i3 == 2) {
            return c(z);
        } else {
            return -1;
        }
    }

    public final Object m(int i2) {
        int[] iArr = this.i;
        int e2 = v0g.e(iArr, i2 + 1, false, false);
        return Pair.create(this.l[e2], this.k[e2].m(i2 - iArr[e2]));
    }

    public final hkf n(int i2, hkf hkf, long j2) {
        int[] iArr = this.j;
        int e2 = v0g.e(iArr, i2 + 1, false, false);
        int i3 = iArr[e2];
        int i4 = this.i[e2];
        this.k[e2].n(i2 - i3, hkf, j2);
        Object obj = this.l[e2];
        if (!hkf.q.equals(hkf.a)) {
            obj = Pair.create(obj, hkf.a);
        }
        hkf.a = obj;
        hkf.n += i4;
        hkf.o += i4;
        return hkf;
    }

    public final int p() {
        return this.g;
    }

    public final int r(int i2, boolean z) {
        if (z) {
            b9e b9e = this.f;
            int i3 = b9e.c[i2] + 1;
            int[] iArr = b9e.b;
            if (i3 < iArr.length) {
                return iArr[i3];
            }
            return -1;
        } else if (i2 < this.e - 1) {
            return i2 + 1;
        } else {
            return -1;
        }
    }

    public final int s(int i2, boolean z) {
        if (z) {
            b9e b9e = this.f;
            int i3 = b9e.c[i2] - 1;
            if (i3 >= 0) {
                return b9e.b[i3];
            }
            return -1;
        } else if (i2 > 0) {
            return i2 - 1;
        } else {
            return -1;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public cqb(java.util.Collection r7, defpackage.b9e r8) {
        /*
            r6 = this;
            int r0 = r7.size()
            jkf[] r0 = new defpackage.jkf[r0]
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
            r3 = r2
        L_0x000c:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0022
            java.lang.Object r4 = r1.next()
            yz8 r4 = (defpackage.yz8) r4
            int r5 = r3 + 1
            jkf r4 = r4.b()
            r0[r3] = r4
            r3 = r5
            goto L_0x000c
        L_0x0022:
            int r1 = r7.size()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.util.Iterator r7 = r7.iterator()
        L_0x002c:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x0042
            java.lang.Object r3 = r7.next()
            yz8 r3 = (defpackage.yz8) r3
            int r4 = r2 + 1
            java.lang.Object r3 = r3.a()
            r1[r2] = r3
            r2 = r4
            goto L_0x002c
        L_0x0042:
            r6.<init>(r0, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqb.<init>(java.util.Collection, b9e):void");
    }
}
