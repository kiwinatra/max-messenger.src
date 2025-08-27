package defpackage;

import kotlin.io.ConstantsKt;

/* renamed from: q03  reason: default package */
public final class q03 {
    public final zpf a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long[] k;
    public int[] l;

    public q03(int i2, int i3, long j2, int i4, zpf zpf) {
        boolean z = true;
        if (!(i3 == 1 || i3 == 2)) {
            z = false;
        }
        n79.g(z);
        this.d = j2;
        this.e = i4;
        this.a = zpf;
        int i5 = (((i2 % 10) + 48) << 8) | ((i2 / 10) + 48);
        this.b = (i3 == 2 ? 1667497984 : 1651965952) | i5;
        this.c = i3 == 2 ? i5 | 1650720768 : -1;
        this.k = new long[ConstantsKt.MINIMUM_BLOCK_SIZE];
        this.l = new int[ConstantsKt.MINIMUM_BLOCK_SIZE];
    }

    public final wnd a(int i2) {
        return new wnd(((this.d * ((long) 1)) / ((long) this.e)) * ((long) this.l[i2]), this.k[i2]);
    }

    public final qnd b(long j2) {
        int i2 = (int) (j2 / ((this.d * ((long) 1)) / ((long) this.e)));
        int e2 = v0g.e(this.l, i2, true, true);
        if (this.l[e2] == i2) {
            wnd a2 = a(e2);
            return new qnd(a2, a2);
        }
        wnd a3 = a(e2);
        int i3 = e2 + 1;
        return i3 < this.k.length ? new qnd(a3, a(i3)) : new qnd(a3, a3);
    }
}
