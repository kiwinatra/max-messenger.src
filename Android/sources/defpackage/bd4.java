package defpackage;

import android.util.SparseIntArray;

/* renamed from: bd4  reason: default package */
public abstract class bd4 {
    public static final SparseIntArray a = new SparseIntArray(0);

    public static final pqb a() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return new pqb(0, min > 16777216 ? (min / 4) * 3 : min / 2, a, -1);
    }
}
