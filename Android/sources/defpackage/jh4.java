package defpackage;

import androidx.work.WorkRequest;
import java.math.BigInteger;

/* renamed from: jh4  reason: default package */
public final class jh4 implements snd {
    public final /* synthetic */ kh4 a;

    public jh4(kh4 kh4) {
        this.a = kh4;
    }

    public final boolean c() {
        return true;
    }

    public final qnd e(long j) {
        kh4 kh4 = this.a;
        BigInteger valueOf = BigInteger.valueOf((((long) ((ixe) kh4.v0).f) * j) / 1000000);
        long j2 = kh4.c;
        long j3 = kh4.b;
        wnd wnd = new wnd(j, v0g.k((valueOf.multiply(BigInteger.valueOf(j2 - j3)).divide(BigInteger.valueOf(kh4.v)).longValue() + j3) - WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, kh4.b, j2 - 1));
        return new qnd(wnd, wnd);
    }

    public final long f() {
        kh4 kh4 = this.a;
        return (kh4.v * 1000000) / ((long) ((ixe) kh4.v0).f);
    }
}
