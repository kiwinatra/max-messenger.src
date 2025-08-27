package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: tia  reason: default package */
public final class tia extends vl0 implements cla {
    public final cla a;
    public final fz b = new AtomicReference();
    public final zi6 c;
    public final boolean o;
    public final kc3 v = new Object();
    public mq4 w;
    public volatile boolean x;

    /* JADX WARNING: type inference failed for: r1v1, types: [fz, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, kc3] */
    public tia(cla cla, zi6 zi6, boolean z) {
        this.a = cla;
        this.c = zi6;
        this.o = z;
        lazySet(1);
    }

    public final void b() {
        if (decrementAndGet() == 0) {
            this.b.d(this.a);
        }
    }

    public final void c(mq4 mq4) {
        if (qq4.g(this.w, mq4)) {
            this.w = mq4;
            this.a.c(this);
        }
    }

    public final void clear() {
    }

    public final void d(Object obj) {
        try {
            Object apply = this.c.apply(obj);
            Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
            ma3 ma3 = (ma3) apply;
            getAndIncrement();
            pbe pbe = new pbe(this);
            if (!this.x && this.v.a(pbe)) {
                ma3.j(pbe);
            }
        } catch (Throwable th) {
            hd8.Z(th);
            this.w.dispose();
            onError(th);
        }
    }

    public final void dispose() {
        this.x = true;
        this.w.dispose();
        this.v.dispose();
        this.b.b();
    }

    public final boolean f() {
        return this.w.f();
    }

    public final boolean isEmpty() {
        return true;
    }

    public final void onError(Throwable th) {
        if (!this.b.a(th)) {
            return;
        }
        if (!this.o) {
            this.x = true;
            this.w.dispose();
            this.v.dispose();
            this.b.d(this.a);
        } else if (decrementAndGet() == 0) {
            this.b.d(this.a);
        }
    }

    public final int p(int i) {
        return 2;
    }

    public final Object poll() {
        return null;
    }
}
