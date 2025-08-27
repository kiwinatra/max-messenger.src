package defpackage;

import android.util.SparseBooleanArray;

/* renamed from: oob  reason: default package */
public final class oob implements jv0 {
    public final wq5 a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        y64.j(!false);
        new wq5(sparseBooleanArray);
    }

    public oob(wq5 wq5) {
        this.a = wq5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oob)) {
            return false;
        }
        return this.a.equals(((oob) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
