package defpackage;

import kotlin.Pair;

/* renamed from: bed  reason: default package */
public abstract class bed {
    public static final long[] a = {-9187201950435737345L, -1};

    static {
        new qz9(0);
    }

    public static final int a(int i) {
        if (i == 7) {
            return 6;
        }
        return i - (i / 8);
    }

    public static final qz9 b(Pair... pairArr) {
        qz9 qz9 = new qz9(pairArr.length);
        for (Pair pair : pairArr) {
            qz9.k(pair.component1(), pair.component2());
        }
        return qz9;
    }

    public static final int c(int i) {
        if (i == 0) {
            return 6;
        }
        return (i * 2) + 1;
    }

    public static final int d(int i) {
        if (i > 0) {
            return -1 >>> Integer.numberOfLeadingZeros(i);
        }
        return 0;
    }

    public static final int e(int i) {
        if (i == 7) {
            return 8;
        }
        return ((i - 1) / 7) + i;
    }
}
