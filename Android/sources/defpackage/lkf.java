package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: lkf  reason: default package */
public class lkf {
    public static final kkf d = new Object();
    public boolean a;
    public long b;
    public long c;

    public lkf a() {
        this.a = false;
        return this;
    }

    public lkf b() {
        this.c = 0;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public lkf d(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public lkf g(long j, TimeUnit timeUnit) {
        if (j >= 0) {
            this.c = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(wj6.i(j, "timeout < 0: ").toString());
    }

    public long h() {
        return this.c;
    }
}
