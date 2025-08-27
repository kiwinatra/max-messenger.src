package defpackage;

/* renamed from: ktf  reason: default package */
public final class ktf implements pn0 {
    public final rkf a;
    public final l8b b = new l8b();
    public final int c;
    public final int o = 112800;

    public ktf(int i, rkf rkf) {
        this.c = i;
        this.a = rkf;
    }

    public final void e() {
        byte[] bArr = v0g.f;
        l8b l8b = this.b;
        l8b.getClass();
        l8b.E(bArr.length, bArr);
    }

    public final nn0 o(hf4 hf4, long j) {
        hf4 hf42 = hf4;
        long j2 = hf42.o;
        int min = (int) Math.min((long) this.o, hf42.c - j2);
        l8b l8b = this.b;
        l8b.D(min);
        hf42.q(l8b.a, 0, min, false);
        int i = l8b.c;
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (l8b.a() >= 188) {
            byte[] bArr = l8b.a;
            int i2 = l8b.b;
            while (i2 < i && bArr[i2] != 71) {
                i2++;
            }
            int i3 = i2 + 188;
            if (i3 > i) {
                break;
            }
            long U = ryg.U(l8b, i2, this.c);
            if (U != -9223372036854775807L) {
                long b2 = this.a.b(U);
                if (b2 > j) {
                    return j5 == -9223372036854775807L ? new nn0(-1, b2, j2) : new nn0(0, -9223372036854775807L, j2 + j4);
                }
                if (100000 + b2 > j) {
                    return new nn0(0, -9223372036854775807L, j2 + ((long) i2));
                }
                j5 = b2;
                j4 = (long) i2;
            }
            l8b.G(i3);
            j3 = (long) i3;
        }
        return j5 != -9223372036854775807L ? new nn0(-2, j5, j2 + j3) : nn0.e;
    }
}
