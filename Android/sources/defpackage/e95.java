package defpackage;

/* renamed from: e95  reason: default package */
public final class e95 implements kcd {
    public final ca6 a;
    public final dm4 b = new dm4(12);
    public long[] c;
    public boolean o;
    public h95 v;
    public boolean w;
    public int x;
    public long y = -9223372036854775807L;

    public e95(h95 h95, ca6 ca6, boolean z) {
        this.a = ca6;
        this.v = h95;
        this.c = h95.b;
        a(h95, z);
    }

    public final void a(h95 h95, boolean z) {
        int i = this.x;
        long j = -9223372036854775807L;
        long j2 = i == 0 ? -9223372036854775807L : this.c[i - 1];
        this.o = z;
        this.v = h95;
        long[] jArr = h95.b;
        this.c = jArr;
        long j3 = this.y;
        if (j3 != -9223372036854775807L) {
            int b2 = t0g.b(jArr, j3, true);
            this.x = b2;
            if (this.o && b2 == this.c.length) {
                j = j3;
            }
            this.y = j;
        } else if (j2 != -9223372036854775807L) {
            this.x = t0g.b(jArr, j2, false);
        }
    }

    public final void b() {
    }

    public final boolean c() {
        return true;
    }

    public final int e(long j) {
        int max = Math.max(this.x, t0g.b(this.c, j, true));
        int i = max - this.x;
        this.x = max;
        return i;
    }

    public final int f(xe8 xe8, aa4 aa4, int i) {
        int i2 = this.x;
        boolean z = i2 == this.c.length;
        if (z && !this.o) {
            aa4.b = 4;
            return -4;
        } else if ((i & 2) != 0 || !this.w) {
            xe8.c = this.a;
            this.w = true;
            return -5;
        } else if (z) {
            return -3;
        } else {
            if ((i & 1) == 0) {
                this.x = i2 + 1;
            }
            if ((i & 4) == 0) {
                byte[] l = this.b.l(this.v.a[i2]);
                aa4.B(l.length);
                aa4.o.put(l);
            }
            aa4.w = this.c[i2];
            aa4.b = 1;
            return -4;
        }
    }
}
