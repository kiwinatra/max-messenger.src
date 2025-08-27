package defpackage;

import android.util.SparseArray;

/* renamed from: ov0  reason: default package */
public final class ov0 implements xf5, n03 {
    public static final qf4 X;
    public static final yl4 Y = new yl4(16, false);
    public final tf5 a;
    public final int b;
    public final ea6 c;
    public final SparseArray o = new SparseArray();
    public boolean v;
    public fj w;
    public long x;
    public snd y;
    public ea6[] z;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, qf4] */
    static {
        ? obj = new Object();
        obj.b = new ece(10);
        X = obj;
    }

    public ov0(tf5 tf5, int i, ea6 ea6) {
        this.a = tf5;
        this.b = i;
        this.c = ea6;
    }

    public final zpf B(int i, int i2) {
        SparseArray sparseArray = this.o;
        mv0 mv0 = (mv0) sparseArray.get(i);
        if (mv0 == null) {
            n79.n(this.z == null);
            mv0 = new mv0(i, i2, i2 == this.b ? this.c : null);
            fj fjVar = this.w;
            long j = this.x;
            if (fjVar == null) {
                mv0.e = mv0.c;
            } else {
                mv0.f = j;
                zpf v2 = fjVar.v(i2);
                mv0.e = v2;
                ea6 ea6 = mv0.d;
                if (ea6 != null) {
                    v2.e(ea6);
                }
            }
            sparseArray.put(i, mv0);
        }
        return mv0;
    }

    public final void M(snd snd) {
        this.y = snd;
    }

    public final p03 a() {
        snd snd = this.y;
        if (snd instanceof p03) {
            return (p03) snd;
        }
        return null;
    }

    public final void b(fj fjVar, long j, long j2) {
        this.w = fjVar;
        this.x = j2;
        boolean z2 = this.v;
        tf5 tf5 = this.a;
        if (!z2) {
            tf5.U(this);
            if (j != -9223372036854775807L) {
                tf5.d(0, j);
            }
            this.v = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        tf5.d(0, j);
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.o;
            if (i < sparseArray.size()) {
                mv0 mv0 = (mv0) sparseArray.valueAt(i);
                if (fjVar == null) {
                    mv0.e = mv0.c;
                } else {
                    mv0.f = j2;
                    zpf v2 = fjVar.v(mv0.a);
                    mv0.e = v2;
                    ea6 ea6 = mv0.d;
                    if (ea6 != null) {
                        v2.e(ea6);
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
        ea6[] ea6Arr = new ea6[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            ea6 ea6 = ((mv0) sparseArray.valueAt(i)).d;
            n79.o(ea6);
            ea6Arr[i] = ea6;
        }
        this.z = ea6Arr;
    }
}
