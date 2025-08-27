package defpackage;

import android.os.SystemClock;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.List;

/* renamed from: eob  reason: default package */
public final class eob {
    public static final nz8 u = new nz8(new Object());
    public final jkf a;
    public final nz8 b;
    public final long c;
    public final long d;
    public final int e;
    public final ExoPlaybackException f;
    public final boolean g;
    public final upf h;
    public final mqf i;
    public final List j;
    public final nz8 k;
    public final boolean l;
    public final int m;
    public final int n;
    public final gob o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    public eob(jkf jkf, nz8 nz8, long j2, long j3, int i2, ExoPlaybackException exoPlaybackException, boolean z, upf upf, mqf mqf, List list, nz8 nz82, boolean z2, int i3, int i4, gob gob, long j4, long j5, long j6, long j7, boolean z3) {
        this.a = jkf;
        this.b = nz8;
        this.c = j2;
        this.d = j3;
        this.e = i2;
        this.f = exoPlaybackException;
        this.g = z;
        this.h = upf;
        this.i = mqf;
        this.j = list;
        this.k = nz82;
        this.l = z2;
        this.m = i3;
        this.n = i4;
        this.o = gob;
        this.q = j4;
        this.r = j5;
        this.s = j6;
        this.t = j7;
        this.p = z3;
    }

    public static eob i(mqf mqf) {
        ckf ckf = jkf.a;
        nz8 nz8 = u;
        return new eob(ckf, nz8, -9223372036854775807L, 0, 1, (ExoPlaybackException) null, false, upf.d, mqf, k0d.v, nz8, false, 1, 0, gob.d, 0, 0, 0, 0, false);
    }

    public final eob a() {
        return new eob(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, j(), SystemClock.elapsedRealtime(), this.p);
    }

    public final eob b(nz8 nz8) {
        jkf jkf = this.a;
        return new eob(jkf, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, nz8, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final eob c(nz8 nz8, long j2, long j3, long j4, long j5, upf upf, mqf mqf, List list) {
        long j6 = j2;
        upf upf2 = upf;
        mqf mqf2 = mqf;
        List list2 = list;
        jkf jkf = this.a;
        return new eob(jkf, nz8, j3, j4, this.e, this.f, this.g, upf2, mqf2, list2, this.k, this.l, this.m, this.n, this.o, this.q, j5, j6, SystemClock.elapsedRealtime(), this.p);
    }

    public final eob d(int i2, int i3, boolean z) {
        boolean z2 = z;
        jkf jkf = this.a;
        return new eob(jkf, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z2, i2, i3, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final eob e(ExoPlaybackException exoPlaybackException) {
        jkf jkf = this.a;
        return new eob(jkf, this.b, this.c, this.d, this.e, exoPlaybackException, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final eob f(gob gob) {
        jkf jkf = this.a;
        return new eob(jkf, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, gob, this.q, this.r, this.s, this.t, this.p);
    }

    public final eob g(int i2) {
        jkf jkf = this.a;
        return new eob(jkf, this.b, this.c, this.d, i2, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final eob h(jkf jkf) {
        return new eob(jkf, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final long j() {
        long j2;
        long j3;
        if (!k()) {
            return this.s;
        }
        do {
            j2 = this.t;
            j3 = this.s;
        } while (j2 != this.t);
        return v0g.S(v0g.h0(j3) + ((long) (((float) (SystemClock.elapsedRealtime() - j2)) * this.o.a)));
    }

    public final boolean k() {
        return this.e == 3 && this.l && this.n == 0;
    }
}
