package defpackage;

import android.util.SparseIntArray;

/* renamed from: k30  reason: default package */
public final class k30 {
    public static final /* synthetic */ int b = 0;
    public final j30 a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public k30(j30 j30) {
        this.a = j30;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k30)) {
            return false;
        }
        k30 k30 = (k30) obj;
        j30 j30 = this.a;
        return j30 == null ? k30.a == null : j30.equals(k30.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
