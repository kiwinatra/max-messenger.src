package defpackage;

import android.util.SparseBooleanArray;

/* renamed from: xq5  reason: default package */
public final class xq5 {
    public final SparseBooleanArray a;

    public xq5(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final boolean a(int... iArr) {
        for (int i : iArr) {
            if (this.a.get(i)) {
                return true;
            }
        }
        return false;
    }

    public final int b(int i) {
        SparseBooleanArray sparseBooleanArray = this.a;
        n79.i(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq5)) {
            return false;
        }
        xq5 xq5 = (xq5) obj;
        int i = v0g.a;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (i >= 24) {
            return sparseBooleanArray.equals(xq5.a);
        }
        if (sparseBooleanArray.size() != xq5.a.size()) {
            return false;
        }
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            if (b(i2) != xq5.b(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = v0g.a;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (i >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            size = (size * 31) + b(i2);
        }
        return size;
    }
}
