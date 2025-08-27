package defpackage;

/* renamed from: ve7  reason: default package */
public final class ve7 implements rnd {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final boolean d;

    public ve7(long j, long[] jArr, long[] jArr2) {
        y64.g(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.d = z;
        if (!z || jArr2[0] <= 0) {
            this.a = jArr;
            this.b = jArr2;
        } else {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.a = jArr3;
            long[] jArr4 = new long[i];
            this.b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.c = j;
    }

    public final boolean c() {
        return this.d;
    }

    public final pnd e(long j) {
        if (!this.d) {
            vnd vnd = vnd.c;
            return new pnd(vnd, vnd);
        }
        long[] jArr = this.b;
        int f = t0g.f(jArr, j, true);
        long j2 = jArr[f];
        long[] jArr2 = this.a;
        vnd vnd2 = new vnd(j2, jArr2[f]);
        if (j2 == j || f == jArr.length - 1) {
            return new pnd(vnd2, vnd2);
        }
        int i = f + 1;
        return new pnd(vnd2, new vnd(jArr[i], jArr2[i]));
    }

    public final long f() {
        return this.c;
    }
}
