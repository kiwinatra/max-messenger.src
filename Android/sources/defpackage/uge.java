package defpackage;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: uge  reason: default package */
public final class uge extends qi0 {
    public final Object i;
    public final x4d j;
    public final v6f k;
    public final zy l = new zy(4, (byte) 0);
    public final ArrayDeque m = new ArrayDeque();
    public pa8 n;
    public pa8 o;
    public long p;
    public long q;
    public long r;
    public float s;
    public long t;
    public boolean u;

    public uge(x4d x4d) {
        this.j = x4d;
        Object obj = new Object();
        this.i = obj;
        this.k = new v6f(obj);
        n();
    }

    public final ByteBuffer a() {
        ByteBuffer a = m() ? this.k.a() : super.a();
        synchronized (this.i) {
            try {
                if (!this.m.isEmpty()) {
                    if (this.l.f() <= this.p || d()) {
                        rae.w(this.m.remove());
                        l(this.l.h());
                        throw null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a;
    }

    public final void b(ByteBuffer byteBuffer) {
        int i2;
        ByteBuffer byteBuffer2 = byteBuffer;
        long j2 = this.t;
        j60 j60 = this.b;
        long a0 = v0g.a0(j2, 1000000, ((long) j60.a) * ((long) j60.d), RoundingMode.FLOOR);
        float b = this.j.b(a0);
        synchronized (this.i) {
            if (b != this.s) {
                pa8 pa8 = this.o;
                long b2 = pa8.b(pa8.b - 1);
                pa8 pa82 = this.n;
                long b3 = a0 - pa82.b(pa82.b - 1);
                this.n.a(a0);
                pa8 pa83 = this.o;
                if (m()) {
                    v6f v6f = this.k;
                    synchronized (v6f.b) {
                        b3 = v6f.c.g(b3);
                    }
                }
                pa83.a(b3 + b2);
                this.s = b;
                if (m()) {
                    v6f v6f2 = this.k;
                    synchronized (v6f2.b) {
                        vfe vfe = v6f2.c;
                        if (vfe.c != b) {
                            vfe.c = b;
                            vfe.i = true;
                        }
                    }
                    v6f v6f3 = this.k;
                    synchronized (v6f3.b) {
                        vfe vfe2 = v6f3.c;
                        if (vfe2.d != b) {
                            vfe2.d = b;
                            vfe2.i = true;
                        }
                    }
                }
                this.k.flush();
                this.u = false;
                super.a();
            }
        }
        int limit = byteBuffer.limit();
        long a = this.j.a(a0);
        if (a != -9223372036854775807L) {
            long j3 = a - a0;
            j60 j602 = this.b;
            i2 = (int) v0g.a0(j3, ((long) j602.a) * ((long) j602.d), 1000000, RoundingMode.CEILING);
            int i3 = this.b.d;
            int i4 = i3 - (i2 % i3);
            if (i4 != i3) {
                i2 += i4;
            }
            byteBuffer2.limit(Math.min(limit, byteBuffer.position() + i2));
        } else {
            i2 = -1;
        }
        long position = (long) byteBuffer.position();
        if (m()) {
            this.k.b(byteBuffer2);
            if (i2 != -1 && ((long) byteBuffer.position()) - position == ((long) i2)) {
                this.k.c();
                this.u = true;
            }
        } else {
            ByteBuffer k2 = k(byteBuffer.remaining());
            if (byteBuffer.hasRemaining()) {
                k2.put(byteBuffer2);
            }
            k2.flip();
        }
        this.t = (((long) byteBuffer.position()) - position) + this.t;
        o();
        byteBuffer2.limit(limit);
    }

    public final boolean d() {
        return super.d() && this.k.d();
    }

    public final long f(long j2) {
        long j3 = 0;
        double d = 0.0d;
        while (j3 < j2) {
            x4d x4d = this.j;
            long a = x4d.a(j3);
            if (a == -9223372036854775807L) {
                a = LongCompanionObject.MAX_VALUE;
            }
            d += ((double) (Math.min(a, j2) - j3)) / ((double) x4d.b(j3));
            j3 = a;
        }
        return Math.round(d);
    }

    public final j60 g(j60 j60) {
        return this.k.e(j60);
    }

    public final void h() {
        n();
        this.k.flush();
    }

    public final void i() {
        if (!this.u) {
            this.k.c();
            this.u = true;
        }
    }

    public final void j() {
        n();
        this.k.reset();
    }

    public final void l(long j2) {
        long j3;
        int i2 = this.n.b - 1;
        while (i2 > 0 && this.n.b(i2) > j2) {
            i2--;
        }
        pa8 pa8 = this.n;
        if (i2 == pa8.b - 1) {
            if (this.q < pa8.b(i2)) {
                this.q = this.n.b(i2);
                this.r = this.o.b(i2);
            }
            j3 = j2 - this.q;
            if (m()) {
                v6f v6f = this.k;
                synchronized (v6f.b) {
                    j3 = v6f.c.g(j3);
                }
            }
        } else {
            int i3 = i2 + 1;
            j3 = Math.round((((double) (this.o.b(i3) - this.o.b(i2))) / ((double) (this.n.b(i3) - this.n.b(i2)))) * ((double) (j2 - this.q)));
        }
        this.q = j2;
        this.r += j3;
    }

    public final boolean m() {
        boolean z;
        synchronized (this.i) {
            z = this.s != 1.0f;
        }
        return z;
    }

    public final void n() {
        synchronized (this.i) {
            pa8 pa8 = new pa8(1);
            this.n = pa8;
            this.o = new pa8(1);
            pa8.a(0);
            this.o.a(0);
            this.p = 0;
            this.q = 0;
            this.r = 0;
            this.s = 1.0f;
        }
        this.t = 0;
        this.u = false;
    }

    public final void o() {
        long j2;
        synchronized (this.i) {
            if (m()) {
                v6f v6f = this.k;
                synchronized (v6f.b) {
                    vfe vfe = v6f.c;
                    long j3 = vfe.n;
                    tfe tfe = vfe.j;
                    tfe.getClass();
                    j2 = j3 - ((long) ((tfe.l * tfe.c) * 2));
                }
                j60 j60 = this.b;
                long a0 = v0g.a0(j2, 1000000, ((long) j60.a) * ((long) j60.d), RoundingMode.FLOOR);
                pa8 pa8 = this.n;
                this.p = pa8.b(pa8.b - 1) + a0;
            } else {
                long j4 = this.t;
                j60 j602 = this.b;
                this.p = v0g.a0(j4, 1000000, ((long) j602.a) * ((long) j602.d), RoundingMode.FLOOR);
            }
        }
    }
}
