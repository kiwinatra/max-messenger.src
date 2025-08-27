package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: kw5  reason: default package */
public final class kw5 extends AtomicInteger implements gx5, rye {
    public rye X;
    public volatile boolean Y;
    public final pye a;
    public final boolean b;
    public final int c;
    public final AtomicLong o = new AtomicLong();
    public final kc3 v = new Object();
    public final AtomicInteger w = new AtomicInteger(1);
    public final fz x = new AtomicReference();
    public final zi6 y;
    public final AtomicReference z = new AtomicReference();

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, kc3] */
    /* JADX WARNING: type inference failed for: r1v3, types: [fz, java.util.concurrent.atomic.AtomicReference] */
    public kw5(pye pye, zi6 zi6, boolean z2, int i) {
        this.a = pye;
        this.y = zi6;
        this.b = z2;
        this.c = i;
    }

    public final void a() {
        the the = (the) this.z.get();
        if (the != null) {
            the.clear();
        }
    }

    public final void b() {
        this.w.decrementAndGet();
        c();
    }

    public final void c() {
        if (getAndIncrement() == 0) {
            f();
        }
    }

    public final void cancel() {
        this.Y = true;
        this.X.cancel();
        this.v.dispose();
        this.x.b();
    }

    public final void d(Object obj) {
        try {
            Object apply = this.y.apply(obj);
            Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
            lbe lbe = (lbe) apply;
            this.w.getAndIncrement();
            yha yha = new yha(this, 1);
            if (!this.Y && this.v.a(yha)) {
                lbe.l(yha);
            }
        } catch (Throwable th) {
            hd8.Z(th);
            this.X.cancel();
            onError(th);
        }
    }

    public final void e(rye rye) {
        if (tye.e(this.X, rye)) {
            this.X = rye;
            this.a.e(this);
            int i = this.c;
            if (i == Integer.MAX_VALUE) {
                rye.g(LongCompanionObject.MAX_VALUE);
            } else {
                rye.g((long) i);
            }
        }
    }

    public final void f() {
        int i;
        boolean z2;
        pye pye = this.a;
        AtomicInteger atomicInteger = this.w;
        AtomicReference atomicReference = this.z;
        int i2 = 1;
        do {
            long j = this.o.get();
            long j2 = 0;
            while (true) {
                i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                z2 = false;
                if (i == 0) {
                    break;
                } else if (this.Y) {
                    a();
                    return;
                } else if (this.b || ((Throwable) this.x.get()) == null) {
                    boolean z3 = atomicInteger.get() == 0;
                    the the = (the) atomicReference.get();
                    Object poll = the != null ? the.poll() : null;
                    boolean z4 = poll == null;
                    if (z3 && z4) {
                        this.x.e(pye);
                        return;
                    } else if (z4) {
                        break;
                    } else {
                        pye.d(poll);
                        j2++;
                    }
                } else {
                    a();
                    this.x.e(this.a);
                    return;
                }
            }
            if (i == 0) {
                if (this.Y) {
                    a();
                    return;
                } else if (this.b || ((Throwable) this.x.get()) == null) {
                    boolean z5 = atomicInteger.get() == 0;
                    the the2 = (the) atomicReference.get();
                    if (the2 == null || the2.isEmpty()) {
                        z2 = true;
                    }
                    if (z5 && z2) {
                        this.x.e(pye);
                        return;
                    }
                } else {
                    a();
                    this.x.e(pye);
                    return;
                }
            }
            if (j2 != 0) {
                h88.P(this.o, j2);
                if (this.c != Integer.MAX_VALUE) {
                    this.X.g(j2);
                }
            }
            i2 = addAndGet(-i2);
        } while (i2 != 0);
    }

    public final void g(long j) {
        if (tye.d(j)) {
            h88.c(this.o, j);
            c();
        }
    }

    public final the h() {
        AtomicReference atomicReference = this.z;
        the the = (the) atomicReference.get();
        if (the != null) {
            return the;
        }
        the the2 = new the(wv5.a);
        while (!atomicReference.compareAndSet((Object) null, the2)) {
            if (atomicReference.get() != null) {
                return (the) atomicReference.get();
            }
        }
        return the2;
    }

    public final void onError(Throwable th) {
        this.w.decrementAndGet();
        if (this.x.a(th)) {
            if (!this.b) {
                this.v.dispose();
            }
            c();
        }
    }
}
