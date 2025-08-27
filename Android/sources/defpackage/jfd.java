package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: jfd  reason: default package */
public abstract class jfd implements mq4 {
    public mq4 a(Runnable runnable) {
        return b(runnable, 0, TimeUnit.NANOSECONDS);
    }

    public abstract mq4 b(Runnable runnable, long j, TimeUnit timeUnit);

    public final mq4 c(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        long j3 = j;
        TimeUnit timeUnit2 = timeUnit;
        mw1 mw1 = new mw1(2);
        mw1 mw12 = new mw1(mw1);
        long nanos = timeUnit2.toNanos(j2);
        long a = lfd.a(TimeUnit.NANOSECONDS);
        mq4 b = b(new ifd(this, timeUnit2.toNanos(j3) + a, runnable, a, mw12, nanos), j3, timeUnit2);
        if (b == p45.a) {
            return b;
        }
        qq4.c(mw1, b);
        return mw12;
    }
}
