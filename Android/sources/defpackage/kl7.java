package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: kl7  reason: default package */
public final class kl7 extends jfd implements Runnable {
    public final kc3 a;
    public final jl7 b;
    public final ll7 c;
    public final AtomicBoolean o = new AtomicBoolean();

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, kc3] */
    public kl7(jl7 jl7) {
        ll7 ll7;
        ll7 ll72;
        this.b = jl7;
        this.a = new Object();
        if (jl7.c.b) {
            ll7 = ml7.h;
        } else {
            while (true) {
                if (jl7.b.isEmpty()) {
                    ll72 = new ll7(jl7.w);
                    jl7.c.a(ll72);
                    break;
                }
                ll72 = (ll7) jl7.b.poll();
                if (ll72 != null) {
                    break;
                }
            }
            ll7 = ll72;
        }
        this.c = ll7;
    }

    public final mq4 b(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.a.b) {
            return p45.a;
        }
        return this.c.d(runnable, j, timeUnit, this.a);
    }

    public final void dispose() {
        if (this.o.compareAndSet(false, true)) {
            this.a.dispose();
            if (ml7.i) {
                this.c.d(this, 0, TimeUnit.NANOSECONDS, (nq4) null);
                return;
            }
            jl7 jl7 = this.b;
            jl7.getClass();
            ll7 ll7 = this.c;
            ll7.c = System.nanoTime() + jl7.a;
            jl7.b.offer(ll7);
        }
    }

    public final boolean f() {
        return this.o.get();
    }

    public final void run() {
        jl7 jl7 = this.b;
        jl7.getClass();
        ll7 ll7 = this.c;
        ll7.c = System.nanoTime() + jl7.a;
        jl7.b.offer(ll7);
    }
}
