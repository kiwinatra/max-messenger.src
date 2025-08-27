package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: xia  reason: default package */
public final class xia extends AtomicInteger implements cla, mq4 {
    public volatile boolean X;
    public final /* synthetic */ int a;
    public final cla b;
    public final boolean c;
    public final kc3 o;
    public final AtomicInteger v;
    public final fz w;
    public final zi6 x;
    public final AtomicReference y;
    public mq4 z;

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, kc3] */
    /* JADX WARNING: type inference failed for: r1v3, types: [fz, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARNING: type inference failed for: r1v7, types: [java.lang.Object, kc3] */
    /* JADX WARNING: type inference failed for: r1v8, types: [fz, java.util.concurrent.atomic.AtomicReference] */
    public xia(cla cla, zi6 zi6, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = cla;
                this.x = zi6;
                this.c = false;
                this.o = new Object();
                this.w = new AtomicReference();
                this.v = new AtomicInteger(1);
                this.y = new AtomicReference();
                return;
            default:
                this.b = cla;
                this.x = zi6;
                this.c = false;
                this.o = new Object();
                this.w = new AtomicReference();
                this.v = new AtomicInteger(1);
                this.y = new AtomicReference();
                return;
        }
    }

    public final void a() {
        switch (this.a) {
            case 0:
                cla cla = this.b;
                AtomicInteger atomicInteger = this.v;
                AtomicReference atomicReference = this.y;
                int i = 1;
                while (!this.X) {
                    if (this.c || ((Throwable) this.w.get()) == null) {
                        boolean z2 = false;
                        boolean z3 = atomicInteger.get() == 0;
                        the the = (the) atomicReference.get();
                        Object poll = the != null ? the.poll() : null;
                        if (poll == null) {
                            z2 = true;
                        }
                        if (z3 && z2) {
                            this.w.d(cla);
                            return;
                        } else if (z2) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            cla.d(poll);
                        }
                    } else {
                        the the2 = (the) this.y.get();
                        if (the2 != null) {
                            the2.clear();
                        }
                        this.w.d(cla);
                        return;
                    }
                }
                the the3 = (the) this.y.get();
                if (the3 != null) {
                    the3.clear();
                    return;
                }
                return;
            default:
                cla cla2 = this.b;
                AtomicInteger atomicInteger2 = this.v;
                AtomicReference atomicReference2 = this.y;
                int i2 = 1;
                while (!this.X) {
                    if (this.c || ((Throwable) this.w.get()) == null) {
                        boolean z4 = false;
                        boolean z5 = atomicInteger2.get() == 0;
                        the the4 = (the) atomicReference2.get();
                        Object poll2 = the4 != null ? the4.poll() : null;
                        if (poll2 == null) {
                            z4 = true;
                        }
                        if (z5 && z4) {
                            this.w.d(this.b);
                            return;
                        } else if (z4) {
                            i2 = addAndGet(-i2);
                            if (i2 == 0) {
                                return;
                            }
                        } else {
                            cla2.d(poll2);
                        }
                    } else {
                        the the5 = (the) this.y.get();
                        if (the5 != null) {
                            the5.clear();
                        }
                        this.w.d(cla2);
                        return;
                    }
                }
                the the6 = (the) this.y.get();
                if (the6 != null) {
                    the6.clear();
                    return;
                }
                return;
        }
    }

    public final void b() {
        switch (this.a) {
            case 0:
                this.v.decrementAndGet();
                if (getAndIncrement() == 0) {
                    a();
                    return;
                }
                return;
            default:
                this.v.decrementAndGet();
                if (getAndIncrement() == 0) {
                    a();
                    return;
                }
                return;
        }
    }

    public final void c(mq4 mq4) {
        switch (this.a) {
            case 0:
                if (qq4.g(this.z, mq4)) {
                    this.z = mq4;
                    this.b.c(this);
                    return;
                }
                return;
            default:
                if (qq4.g(this.z, mq4)) {
                    this.z = mq4;
                    this.b.c(this);
                    return;
                }
                return;
        }
    }

    public final void d(Object obj) {
        switch (this.a) {
            case 0:
                try {
                    Object apply = this.x.apply(obj);
                    Objects.requireNonNull(apply, "The mapper returned a null MaybeSource");
                    ti8 ti8 = (ti8) apply;
                    this.v.getAndIncrement();
                    rh8 rh8 = new rh8(this);
                    if (!this.X && this.o.a(rh8)) {
                        ti8.a(rh8);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    hd8.Z(th);
                    this.z.dispose();
                    onError(th);
                    return;
                }
            default:
                try {
                    Object apply2 = this.x.apply(obj);
                    Objects.requireNonNull(apply2, "The mapper returned a null SingleSource");
                    lbe lbe = (lbe) apply2;
                    this.v.getAndIncrement();
                    yha yha = new yha(this, 2);
                    if (!this.X && this.o.a(yha)) {
                        lbe.l(yha);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    hd8.Z(th2);
                    this.z.dispose();
                    onError(th2);
                    return;
                }
        }
    }

    public final void dispose() {
        switch (this.a) {
            case 0:
                this.X = true;
                this.z.dispose();
                this.o.dispose();
                this.w.b();
                return;
            default:
                this.X = true;
                this.z.dispose();
                this.o.dispose();
                this.w.b();
                return;
        }
    }

    public final boolean f() {
        switch (this.a) {
            case 0:
                return this.X;
            default:
                return this.X;
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                this.v.decrementAndGet();
                if (this.w.a(th)) {
                    if (!this.c) {
                        this.o.dispose();
                    }
                    if (getAndIncrement() == 0) {
                        a();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.v.decrementAndGet();
                if (this.w.a(th)) {
                    if (!this.c) {
                        this.o.dispose();
                    }
                    if (getAndIncrement() == 0) {
                        a();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
