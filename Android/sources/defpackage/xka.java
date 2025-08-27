package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: xka  reason: default package */
public final class xka extends AtomicLong implements cla, mq4, yka {
    public final cla a;
    public final long b;
    public final TimeUnit c;
    public final jfd o;
    public final mw1 v = new mw1(2);
    public final AtomicReference w = new AtomicReference();

    public xka(cla cla, long j, TimeUnit timeUnit, jfd jfd) {
        this.a = cla;
        this.b = j;
        this.c = timeUnit;
        this.o = jfd;
    }

    public final void a(long j) {
        if (compareAndSet(j, LongCompanionObject.MAX_VALUE)) {
            qq4.a(this.w);
            this.a.onError(new TimeoutException(p95.e(this.b, this.c)));
            this.o.dispose();
        }
    }

    public final void b() {
        if (getAndSet(LongCompanionObject.MAX_VALUE) != LongCompanionObject.MAX_VALUE) {
            mw1 mw1 = this.v;
            mw1.getClass();
            qq4.a(mw1);
            this.a.b();
            this.o.dispose();
        }
    }

    public final void c(mq4 mq4) {
        qq4.e(this.w, mq4);
    }

    public final void d(Object obj) {
        long j = get();
        if (j != LongCompanionObject.MAX_VALUE) {
            long j2 = 1 + j;
            if (compareAndSet(j, j2)) {
                mw1 mw1 = this.v;
                ((mq4) mw1.get()).dispose();
                this.a.d(obj);
                mq4 b2 = this.o.b(new ex5(j2, (yka) this), this.b, this.c);
                mw1.getClass();
                qq4.c(mw1, b2);
            }
        }
    }

    public final void dispose() {
        qq4.a(this.w);
        this.o.dispose();
    }

    public final boolean f() {
        return qq4.b((mq4) this.w.get());
    }

    public final void onError(Throwable th) {
        if (getAndSet(LongCompanionObject.MAX_VALUE) != LongCompanionObject.MAX_VALUE) {
            mw1 mw1 = this.v;
            mw1.getClass();
            qq4.a(mw1);
            this.a.onError(th);
            this.o.dispose();
            return;
        }
        n54.D(th);
    }
}
