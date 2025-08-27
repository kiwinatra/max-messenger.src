package defpackage;

/* renamed from: i1g  reason: default package */
public final class i1g implements aod {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long o;
    public final int v;

    public i1g(long[] jArr, long[] jArr2, long j, long j2, int i) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.o = j2;
        this.v = i;
    }

    public final long a() {
        return this.o;
    }

    public final long b(long j) {
        return this.a[v0g.f(this.b, j, true)];
    }

    public final boolean c() {
        return true;
    }

    public final qnd e(long j) {
        long[] jArr = this.a;
        int f = v0g.f(jArr, j, true);
        long j2 = jArr[f];
        long[] jArr2 = this.b;
        wnd wnd = new wnd(j2, jArr2[f]);
        if (j2 >= j || f == jArr.length - 1) {
            return new qnd(wnd, wnd);
        }
        int i = f + 1;
        return new qnd(wnd, new wnd(jArr[i], jArr2[i]));
    }

    public final long f() {
        return this.c;
    }

    public final int h() {
        return this.v;
    }
}
