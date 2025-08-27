package defpackage;

import android.util.SparseArray;

/* renamed from: jze  reason: default package */
public final class jze implements tf5 {
    public final tf5 a;
    public final gze b;
    public jk3 c;

    public jze(tf5 tf5, gze gze) {
        this.a = tf5;
        this.b = gze;
    }

    public final void U(xf5 xf5) {
        jk3 jk3 = new jk3(xf5, this.b);
        this.c = jk3;
        this.a.U(jk3);
    }

    public final void d(long j, long j2) {
        jk3 jk3 = this.c;
        if (jk3 != null) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = (SparseArray) jk3.c;
                if (i >= sparseArray.size()) {
                    break;
                }
                ize ize = ((kze) sparseArray.valueAt(i)).h;
                if (ize != null) {
                    ize.reset();
                }
                i++;
            }
        }
        this.a.d(j, j2);
    }

    public final int g(vf5 vf5, yl4 yl4) {
        return this.a.g(vf5, yl4);
    }

    public final tf5 m() {
        return this.a;
    }

    public final boolean n(vf5 vf5) {
        return this.a.n(vf5);
    }

    public final void release() {
        this.a.release();
    }
}
