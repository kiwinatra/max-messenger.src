package defpackage;

/* renamed from: we7  reason: default package */
public final class we7 implements snd {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final boolean o;

    public we7(long j, long[] jArr, long[] jArr2) {
        n79.g(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.o = z;
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
        return this.o;
    }

    public final qnd e(long j) {
        if (!this.o) {
            wnd wnd = wnd.c;
            return new qnd(wnd, wnd);
        }
        long[] jArr = this.b;
        int f = v0g.f(jArr, j, true);
        long j2 = jArr[f];
        long[] jArr2 = this.a;
        wnd wnd2 = new wnd(j2, jArr2[f]);
        if (j2 == j || f == jArr.length - 1) {
            return new qnd(wnd2, wnd2);
        }
        int i = f + 1;
        return new qnd(wnd2, new wnd(jArr[i], jArr2[i]));
    }

    public final long f() {
        return this.c;
    }
}
