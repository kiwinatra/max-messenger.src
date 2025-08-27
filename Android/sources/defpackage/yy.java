package defpackage;

/* renamed from: yy  reason: default package */
public final class yy implements on0 {
    public int a;
    public int b;
    public Object c;
    public Object o;

    public yy(int i, float[] fArr, float[] fArr2, int i2) {
        this.a = i;
        y64.g(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.c = fArr;
        this.o = fArr2;
        this.b = i2;
    }

    public hrf a() {
        return new hrf((String) this.c, this.a, this.b, (String) this.o);
    }

    public void b(String str) {
        String l = vq9.l(str);
        boolean z = l == null || vq9.h(l);
        n79.f("Not an audio MIME type: " + l, z);
        this.c = l;
    }

    public void c(String str) {
        String l = vq9.l(str);
        boolean z = l == null || vq9.k(l);
        n79.f("Not a video MIME type: " + l, z);
        this.o = l;
    }

    public void e() {
        byte[] bArr = t0g.f;
        g1g g1g = (g1g) this.o;
        g1g.getClass();
        g1g.F(bArr.length, bArr);
    }

    public nn0 f(gf4 gf4, long j) {
        gf4 gf42 = gf4;
        long j2 = gf42.o;
        int min = (int) Math.min((long) this.b, gf42.c - j2);
        g1g g1g = (g1g) this.o;
        g1g.E(min);
        gf42.q(g1g.a, 0, min, false);
        int i = g1g.c;
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (g1g.c() >= 188) {
            byte[] bArr = g1g.a;
            int i2 = g1g.b;
            while (i2 < i && bArr[i2] != 71) {
                i2++;
            }
            int i3 = i2 + 188;
            if (i3 > i) {
                break;
            }
            long B = hsg.B(g1g, i2, this.a);
            if (B != -9223372036854775807L) {
                long b2 = ((qkf) this.c).b(B);
                if (b2 > j) {
                    return j5 == -9223372036854775807L ? new nn0(-1, b2, j2) : new nn0(0, -9223372036854775807L, j2 + j4);
                }
                if (100000 + b2 > j) {
                    return new nn0(0, -9223372036854775807L, j2 + ((long) i2));
                }
                j5 = b2;
                j4 = (long) i2;
            }
            g1g.H(i3);
            j3 = (long) i3;
        }
        return j5 != -9223372036854775807L ? new nn0(-2, j5, j2 + j3) : nn0.d;
    }
}
