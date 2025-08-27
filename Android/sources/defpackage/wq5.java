package defpackage;

import android.util.SparseBooleanArray;

/* renamed from: wq5  reason: default package */
public final class wq5 {
    public final SparseBooleanArray a;

    public wq5(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final int a(int i) {
        SparseBooleanArray sparseBooleanArray = this.a;
        y64.i(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wq5)) {
            return false;
        }
        wq5 wq5 = (wq5) obj;
        int i = t0g.a;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (i >= 24) {
            return sparseBooleanArray.equals(wq5.a);
        }
        if (sparseBooleanArray.size() != wq5.a.size()) {
            return false;
        }
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            if (a(i2) != wq5.a(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = t0g.a;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (i >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            size = (size * 31) + a(i2);
        }
        return size;
    }
}
