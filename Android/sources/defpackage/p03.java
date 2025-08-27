package defpackage;

import java.util.Arrays;

/* renamed from: p03  reason: default package */
public final class p03 implements snd {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] o;
    public final long[] v;
    public final long w;

    public p03(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.o = jArr2;
        this.v = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length > 0) {
            this.w = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.w = 0;
        }
    }

    public final boolean c() {
        return true;
    }

    public final qnd e(long j) {
        long[] jArr = this.v;
        int f = v0g.f(jArr, j, true);
        long j2 = jArr[f];
        long[] jArr2 = this.c;
        wnd wnd = new wnd(j2, jArr2[f]);
        if (j2 >= j || f == this.a - 1) {
            return new qnd(wnd, wnd);
        }
        int i = f + 1;
        return new qnd(wnd, new wnd(jArr[i], jArr2[i]));
    }

    public final long f() {
        return this.w;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.v) + ", durationsUs=" + Arrays.toString(this.o) + ")";
    }
}
