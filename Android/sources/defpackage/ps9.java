package defpackage;

import android.util.Pair;

/* renamed from: ps9  reason: default package */
public final class ps9 implements aod {
    public final long[] a;
    public final long[] b;
    public final long c;

    public ps9(long j, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? v0g.S(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair d(long j, long[] jArr, long[] jArr2) {
        int f = v0g.f(jArr, j, true);
        long j2 = jArr[f];
        long j3 = jArr2[f];
        int i = f + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (((double) j) - ((double) j2)) / ((double) (j4 - j2))) * ((double) (jArr2[i] - j3)))) + j3));
    }

    public final long a() {
        return -1;
    }

    public final long b(long j) {
        return v0g.S(((Long) d(j, this.a, this.b).second).longValue());
    }

    public final boolean c() {
        return true;
    }

    public final qnd e(long j) {
        Pair d = d(v0g.h0(v0g.k(j, 0, this.c)), this.b, this.a);
        wnd wnd = new wnd(v0g.S(((Long) d.first).longValue()), ((Long) d.second).longValue());
        return new qnd(wnd, wnd);
    }

    public final long f() {
        return this.c;
    }

    public final int h() {
        return -2147483647;
    }
}
