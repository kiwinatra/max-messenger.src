package defpackage;

import android.util.SparseArray;

/* renamed from: nv0  reason: default package */
public final class nv0 implements wf5 {
    public static final yl4 X = new yl4(15, false);
    public final sf5 a;
    public final int b;
    public final ca6 c;
    public final SparseArray o = new SparseArray();
    public boolean v;
    public dm4 w;
    public long x;
    public rnd y;
    public ca6[] z;

    public nv0(sf5 sf5, int i, ca6 ca6) {
        this.a = sf5;
        this.b = i;
        this.c = ca6;
    }

    public final ypf B(int i, int i2) {
        ypf xx4;
        SparseArray sparseArray = this.o;
        lv0 lv0 = (lv0) sparseArray.get(i);
        if (lv0 == null) {
            int i3 = 0;
            y64.j(this.z == null);
            lv0 = new lv0(i, i2, i2 == this.b ? this.c : null);
            dm4 dm4 = this.w;
            long j = this.x;
            if (dm4 == null) {
                lv0.e = lv0.c;
            } else {
                lv0.f = j;
                while (true) {
                    int[] iArr = (int[]) dm4.b;
                    if (i3 >= iArr.length) {
                        xx4 = new xx4();
                        break;
                    }
                    if (lv0.a == iArr[i3]) {
                        xx4 = ((icd[]) dm4.c)[i3];
                        break;
                    }
                    i3++;
                }
                lv0.e = xx4;
                ca6 ca6 = lv0.d;
                if (ca6 != null) {
                    xx4.d(ca6);
                }
            }
            sparseArray.put(i, lv0);
        }
        return lv0;
    }

    public final void K(rnd rnd) {
        this.y = rnd;
    }

    public final o03 a() {
        rnd rnd = this.y;
        if (rnd instanceof o03) {
            return (o03) rnd;
        }
        return null;
    }

    public final void b(dm4 dm4, long j, long j2) {
        ypf xx4;
        this.w = dm4;
        this.x = j2;
        boolean z2 = this.v;
        sf5 sf5 = this.a;
        if (!z2) {
            sf5.g(this);
            if (j != -9223372036854775807L) {
                sf5.d(0, j);
            }
            this.v = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        sf5.d(0, j);
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.o;
            if (i < sparseArray.size()) {
                lv0 lv0 = (lv0) sparseArray.valueAt(i);
                if (dm4 == null) {
                    lv0.e = lv0.c;
                } else {
                    lv0.f = j2;
                    int i2 = 0;
                    while (true) {
                        int[] iArr = (int[]) dm4.b;
                        if (i2 >= iArr.length) {
                            xx4 = new xx4();
                            break;
                        }
                        if (lv0.a == iArr[i2]) {
                            xx4 = ((icd[]) dm4.c)[i2];
                            break;
                        }
                        i2++;
                    }
                    lv0.e = xx4;
                    ca6 ca6 = lv0.d;
                    if (ca6 != null) {
                        xx4.d(ca6);
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void c() {
        this.a.release();
    }

    public final void v() {
        SparseArray sparseArray = this.o;
        ca6[] ca6Arr = new ca6[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            ca6 ca6 = ((lv0) sparseArray.valueAt(i)).d;
            y64.k(ca6);
            ca6Arr[i] = ca6;
        }
        this.z = ca6Arr;
    }
}
