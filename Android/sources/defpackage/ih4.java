package defpackage;

import androidx.work.WorkRequest;

/* renamed from: ih4  reason: default package */
public final class ih4 implements rnd {
    public final /* synthetic */ kh4 a;

    public ih4(kh4 kh4) {
        this.a = kh4;
    }

    public final boolean c() {
        return true;
    }

    public final pnd e(long j) {
        kh4 kh4 = this.a;
        long j2 = kh4.c;
        long j3 = kh4.b;
        vnd vnd = new vnd(j, t0g.k(((((j2 - j3) * ((((long) ((ixe) kh4.v0).f) * j) / 1000000)) / kh4.v) + j3) - WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, j3, j2 - 1));
        return new pnd(vnd, vnd);
    }

    public final long f() {
        kh4 kh4 = this.a;
        return (kh4.v * 1000000) / ((long) ((ixe) kh4.v0).f);
    }
}
