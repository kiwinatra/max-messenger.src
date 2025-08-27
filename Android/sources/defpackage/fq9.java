package defpackage;

import android.util.SparseArray;

/* renamed from: fq9  reason: default package */
public final class fq9 {
    public final SparseArray a;
    public juf b;

    public fq9(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(juf juf, int i, int i2) {
        int a2 = juf.a(i);
        SparseArray sparseArray = this.a;
        fq9 fq9 = sparseArray == null ? null : (fq9) sparseArray.get(a2);
        if (fq9 == null) {
            fq9 = new fq9(1);
            sparseArray.put(juf.a(i), fq9);
        }
        if (i2 > i) {
            fq9.a(juf, i + 1, i2);
        } else {
            fq9.b = juf;
        }
    }
}
