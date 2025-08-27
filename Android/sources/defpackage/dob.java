package defpackage;

import com.google.android.exoplayer2.ExoPlaybackException;
import java.util.List;

/* renamed from: dob  reason: default package */
public final class dob {
    public static final mz8 t = new mz8(new Object());
    public final ikf a;
    public final mz8 b;
    public final long c;
    public final long d;
    public final int e;
    public final ExoPlaybackException f;
    public final boolean g;
    public final tpf h;
    public final mqf i;
    public final List j;
    public final mz8 k;
    public final boolean l;
    public final int m;
    public final fob n;
    public final boolean o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;

    public dob(ikf ikf, mz8 mz8, long j2, long j3, int i2, ExoPlaybackException exoPlaybackException, boolean z, tpf tpf, mqf mqf, List list, mz8 mz82, boolean z2, int i3, fob fob, long j4, long j5, long j6, boolean z3, boolean z4) {
        this.a = ikf;
        this.b = mz8;
        this.c = j2;
        this.d = j3;
        this.e = i2;
        this.f = exoPlaybackException;
        this.g = z;
        this.h = tpf;
        this.i = mqf;
        this.j = list;
        this.k = mz82;
        this.l = z2;
        this.m = i3;
        this.n = fob;
        this.q = j4;
        this.r = j5;
        this.s = j6;
        this.o = z3;
        this.p = z4;
    }

    public static dob h(mqf mqf) {
        bkf bkf = ikf.a;
        mz8 mz8 = t;
        return new dob(bkf, mz8, -9223372036854775807L, 0, 1, (ExoPlaybackException) null, false, tpf.o, mqf, k0d.v, mz8, false, 0, fob.o, 0, 0, 0, false, false);
    }

    public final dob a(mz8 mz8) {
        ikf ikf = this.a;
        return new dob(ikf, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, mz8, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public final dob b(mz8 mz8, long j2, long j3, long j4, long j5, tpf tpf, mqf mqf, List list) {
        long j6 = j2;
        tpf tpf2 = tpf;
        mqf mqf2 = mqf;
        List list2 = list;
        ikf ikf = this.a;
        return new dob(ikf, mz8, j3, j4, this.e, this.f, this.g, tpf2, mqf2, list2, this.k, this.l, this.m, this.n, this.q, j5, j6, this.o, this.p);
    }

    public final dob c(boolean z) {
        ikf ikf = this.a;
        return new dob(ikf, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, z, this.p);
    }

    public final dob d(int i2, boolean z) {
        boolean z2 = z;
        ikf ikf = this.a;
        return new dob(ikf, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z2, i2, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public final dob e(ExoPlaybackException exoPlaybackException) {
        ikf ikf = this.a;
        return new dob(ikf, this.b, this.c, this.d, this.e, exoPlaybackException, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public final dob f(int i2) {
        ikf ikf = this.a;
        return new dob(ikf, this.b, this.c, this.d, i2, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public final dob g(ikf ikf) {
        return new dob(ikf, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }
}
