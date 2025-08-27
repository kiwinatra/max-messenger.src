package defpackage;

/* renamed from: f95  reason: default package */
public final class f95 implements lcd {
    public final ea6 a;
    public final fj b = new fj(10, (byte) 0);
    public long[] c;
    public boolean o;
    public i95 v;
    public boolean w;
    public int x;
    public long y = -9223372036854775807L;

    public f95(i95 i95, ea6 ea6, boolean z) {
        this.a = ea6;
        this.v = i95;
        this.c = i95.b;
        a(i95, z);
    }

    public final void a(i95 i95, boolean z) {
        int i = this.x;
        long j = -9223372036854775807L;
        long j2 = i == 0 ? -9223372036854775807L : this.c[i - 1];
        this.o = z;
        this.v = i95;
        long[] jArr = i95.b;
        this.c = jArr;
        long j3 = this.y;
        if (j3 != -9223372036854775807L) {
            int b2 = v0g.b(jArr, j3, true);
            this.x = b2;
            if (this.o && b2 == this.c.length) {
                j = j3;
            }
            this.y = j;
        } else if (j2 != -9223372036854775807L) {
            this.x = v0g.b(jArr, j2, false);
        }
    }

    public final void b() {
    }

    public final boolean c() {
        return true;
    }

    public final int e(long j) {
        int max = Math.max(this.x, v0g.b(this.c, j, true));
        int i = max - this.x;
        this.x = max;
        return i;
    }

    public final int f(ox0 ox0, ba4 ba4, int i) {
        int i2 = this.x;
        boolean z = i2 == this.c.length;
        if (z && !this.o) {
            ba4.b = 4;
            return -4;
        } else if ((i & 2) != 0 || !this.w) {
            ox0.b = this.a;
            this.w = true;
            return -5;
        } else if (z) {
            return -3;
        } else {
            if ((i & 1) == 0) {
                this.x = i2 + 1;
            }
            if ((i & 4) == 0) {
                byte[] p = this.b.p(this.v.a[i2]);
                ba4.B(p.length);
                ba4.v.put(p);
            }
            ba4.x = this.c[i2];
            ba4.b = 1;
            return -4;
        }
    }
}
