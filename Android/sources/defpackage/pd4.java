package defpackage;

import com.google.android.exoplayer2.source.BehindLiveWindowException;

/* renamed from: pd4  reason: default package */
public final class pd4 {
    public final /* synthetic */ int a;
    public final long b;
    public final long c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public /* synthetic */ pd4(long j, Object obj, Object obj2, Object obj3, long j2, Object obj4, int i) {
        this.a = i;
        this.b = j;
        this.e = obj;
        this.f = obj2;
        this.c = j2;
        this.d = obj3;
        this.g = obj4;
    }

    public pd4 a(long j, w2d w2d) {
        long j2;
        long j3 = j;
        p64 c2 = ((w2d) this.e).c();
        p64 c3 = w2d.c();
        if (c2 == null) {
            return new pd4(j, w2d, (ll0) this.f, (nv0) this.d, this.c, c2, 0);
        } else if (!c2.A()) {
            return new pd4(j, w2d, (ll0) this.f, (nv0) this.d, this.c, c3, 0);
        } else {
            long D = c2.D(j3);
            if (D == 0) {
                return new pd4(j, w2d, (ll0) this.f, (nv0) this.d, this.c, c3, 0);
            }
            long C = c2.C();
            long b2 = c2.b(C);
            long j4 = D + C;
            long j5 = j4 - 1;
            long i = c2.i(j5, j3) + c2.b(j5);
            long C2 = c3.C();
            p64 p64 = c2;
            long b3 = c3.b(C2);
            int i2 = (i > b3 ? 1 : (i == b3 ? 0 : -1));
            long j6 = C;
            long j7 = this.c;
            if (i2 != 0) {
                if (i2 < 0) {
                    throw new BehindLiveWindowException();
                } else if (b3 < b2) {
                    j2 = j7 - (c3.u(b2, j3) - j6);
                    return new pd4(j, w2d, (ll0) this.f, (nv0) this.d, j2, c3, 0);
                } else {
                    j4 = p64.u(b3, j3);
                }
            }
            j2 = (j4 - C2) + j7;
            return new pd4(j, w2d, (ll0) this.f, (nv0) this.d, j2, c3, 0);
        }
    }

    public pd4 b(long j, x2d x2d) {
        long j2;
        long j3 = j;
        q64 c2 = ((x2d) this.e).c();
        q64 c3 = x2d.c();
        if (c2 == null) {
            return new pd4(j, x2d, (ml0) this.f, (n03) this.d, this.c, c2, 1);
        } else if (!c2.A()) {
            return new pd4(j, x2d, (ml0) this.f, (n03) this.d, this.c, c3, 1);
        } else {
            long D = c2.D(j3);
            if (D == 0) {
                return new pd4(j, x2d, (ml0) this.f, (n03) this.d, this.c, c3, 1);
            }
            n79.o(c3);
            long C = c2.C();
            long b2 = c2.b(C);
            long j4 = D + C;
            long j5 = j4 - 1;
            long i = c2.i(j5, j3) + c2.b(j5);
            long C2 = c3.C();
            q64 q64 = c2;
            long b3 = c3.b(C2);
            int i2 = (i > b3 ? 1 : (i == b3 ? 0 : -1));
            long j6 = C;
            long j7 = this.c;
            if (i2 != 0) {
                if (i2 < 0) {
                    throw new androidx.media3.exoplayer.source.BehindLiveWindowException();
                } else if (b3 < b2) {
                    j2 = j7 - (c3.u(b2, j3) - j6);
                    return new pd4(j, x2d, (ml0) this.f, (n03) this.d, j2, c3, 1);
                } else {
                    j4 = q64.u(b3, j3);
                }
            }
            j2 = (j4 - C2) + j7;
            return new pd4(j, x2d, (ml0) this.f, (n03) this.d, j2, c3, 1);
        }
    }

    public long c(long j) {
        q64 q64 = (q64) this.g;
        n79.o(q64);
        return q64.l(this.b, j) + this.c;
    }

    public final long d(long j) {
        switch (this.a) {
            case 0:
                p64 p64 = (p64) this.g;
                long j2 = this.b;
                return (p64.E(j2, j) + (p64.l(j2, j) + this.c)) - 1;
            default:
                long c2 = c(j);
                q64 q64 = (q64) this.g;
                n79.o(q64);
                return (q64.E(this.b, j) + c2) - 1;
        }
    }

    public long e() {
        q64 q64 = (q64) this.g;
        n79.o(q64);
        return q64.D(this.b);
    }

    public final long f(long j) {
        switch (this.a) {
            case 0:
                return ((p64) this.g).i(j - this.c, this.b) + g(j);
            default:
                long g2 = g(j);
                q64 q64 = (q64) this.g;
                n79.o(q64);
                return q64.i(j - this.c, this.b) + g2;
        }
    }

    public final long g(long j) {
        switch (this.a) {
            case 0:
                return ((p64) this.g).b(j - this.c);
            default:
                q64 q64 = (q64) this.g;
                n79.o(q64);
                return q64.b(j - this.c);
        }
    }

    public boolean h(long j, long j2) {
        q64 q64 = (q64) this.g;
        n79.o(q64);
        return q64.A() || j2 == -9223372036854775807L || f(j) <= j2;
    }
}
