package defpackage;

/* renamed from: h1g  reason: default package */
public final class h1g implements znd {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;

    public h1g(long[] jArr, long[] jArr2, long j, long j2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
    }

    public final long a() {
        return this.d;
    }

    public final long b(long j) {
        return this.a[t0g.f(this.b, j, true)];
    }

    public final boolean c() {
        return true;
    }

    public final pnd e(long j) {
        long[] jArr = this.a;
        int f = t0g.f(jArr, j, true);
        long j2 = jArr[f];
        long[] jArr2 = this.b;
        vnd vnd = new vnd(j2, jArr2[f]);
        if (j2 >= j || f == jArr.length - 1) {
            return new pnd(vnd, vnd);
        }
        int i = f + 1;
        return new pnd(vnd, new vnd(jArr[i], jArr2[i]));
    }

    public final long f() {
        return this.c;
    }
}
