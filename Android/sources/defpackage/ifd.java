package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: ifd  reason: default package */
public final class ifd implements Runnable {
    public final Runnable a;
    public final mw1 b;
    public final long c;
    public long o;
    public long v;
    public long w;
    public final /* synthetic */ jfd x;

    public ifd(jfd jfd, long j, Runnable runnable, long j2, mw1 mw1, long j3) {
        this.x = jfd;
        this.a = runnable;
        this.b = mw1;
        this.c = j3;
        this.v = j2;
        this.w = j;
    }

    public final void run() {
        long j;
        this.a.run();
        mw1 mw1 = this.b;
        if (!mw1.f()) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            jfd jfd = this.x;
            jfd.getClass();
            long a2 = lfd.a(timeUnit);
            long j2 = lfd.b;
            long j3 = this.v;
            int i = ((a2 + j2) > j3 ? 1 : ((a2 + j2) == j3 ? 0 : -1));
            long j4 = this.c;
            if (i < 0 || a2 >= j3 + j4 + j2) {
                j = a2 + j4;
                long j5 = this.o + 1;
                this.o = j5;
                this.w = j - (j4 * j5);
            } else {
                long j6 = this.w;
                long j7 = this.o + 1;
                this.o = j7;
                j = (j7 * j4) + j6;
            }
            this.v = a2;
            qq4.c(mw1, jfd.b(this, j - a2, timeUnit));
        }
    }
}
