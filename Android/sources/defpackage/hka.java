package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: hka  reason: default package */
public abstract class hka extends AtomicReference implements cla, mq4, Runnable {
    public final cla a;
    public final long b;
    public final TimeUnit c;
    public final lfd o;
    public final qk3 v;
    public final AtomicReference w = new AtomicReference();
    public mq4 x;

    public hka(btd btd, long j, TimeUnit timeUnit, lfd lfd) {
        this.a = btd;
        this.b = j;
        this.c = timeUnit;
        this.o = lfd;
        this.v = null;
    }

    public abstract void a();

    public final void b() {
        qq4.a(this.w);
        a();
    }

    public final void c(mq4 mq4) {
        if (qq4.g(this.x, mq4)) {
            this.x = mq4;
            this.a.c(this);
            long j = this.b;
            qq4.c(this.w, this.o.e(this, j, j, this.c));
        }
    }

    public final void d(Object obj) {
        qk3 qk3;
        Object andSet = getAndSet(obj);
        if (andSet != null && (qk3 = this.v) != null) {
            try {
                qk3.accept(andSet);
            } catch (Throwable th) {
                hd8.Z(th);
                qq4.a(this.w);
                this.x.dispose();
                this.a.onError(th);
            }
        }
    }

    public final void dispose() {
        qq4.a(this.w);
        this.x.dispose();
    }

    public final void e() {
        Object andSet = getAndSet((Object) null);
        if (andSet != null) {
            this.a.d(andSet);
        }
    }

    public final boolean f() {
        return this.x.f();
    }

    public final void onError(Throwable th) {
        qq4.a(this.w);
        this.a.onError(th);
    }

    public void run() {
        e();
    }
}
