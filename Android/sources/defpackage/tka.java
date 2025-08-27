package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: tka  reason: default package */
public final class tka extends AtomicInteger implements cla, mq4, Runnable {
    public Throwable X;
    public volatile boolean Y;
    public volatile boolean Z;
    public final cla a;
    public final long b = 3;
    public final TimeUnit c;
    public final jfd o;
    public final boolean v;
    public boolean v0;
    public final AtomicReference w;
    public final qk3 x;
    public mq4 y;
    public volatile boolean z;

    public tka(cla cla, TimeUnit timeUnit, jfd jfd) {
        this.a = cla;
        this.c = timeUnit;
        this.o = jfd;
        this.v = false;
        this.w = new AtomicReference();
        this.x = null;
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            AtomicReference atomicReference = this.w;
            cla cla = this.a;
            int i = 1;
            while (!this.Y) {
                boolean z2 = this.z;
                Throwable th = this.X;
                if (!z2 || th == null) {
                    boolean z3 = atomicReference.get() == null;
                    if (z2) {
                        if (!z3) {
                            Object andSet = atomicReference.getAndSet((Object) null);
                            if (this.v) {
                                cla.d(andSet);
                            } else {
                                qk3 qk3 = this.x;
                                if (qk3 != null) {
                                    try {
                                        qk3.accept(andSet);
                                    } catch (Throwable th2) {
                                        hd8.Z(th2);
                                        cla.onError(th2);
                                        this.o.dispose();
                                        return;
                                    }
                                }
                            }
                        }
                        cla.b();
                        this.o.dispose();
                        return;
                    }
                    if (z3) {
                        if (this.Z) {
                            this.v0 = false;
                            this.Z = false;
                        }
                    } else if (!this.v0 || this.Z) {
                        cla.d(atomicReference.getAndSet((Object) null));
                        this.Z = false;
                        this.v0 = true;
                        this.o.b(this, this.b, this.c);
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    if (this.x != null) {
                        Object andSet2 = atomicReference.getAndSet((Object) null);
                        if (andSet2 != null) {
                            try {
                                this.x.accept(andSet2);
                            } catch (Throwable th3) {
                                hd8.Z(th3);
                                th = new CompositeException(th, th3);
                            }
                        }
                    } else {
                        atomicReference.lazySet((Object) null);
                    }
                    cla.onError(th);
                    this.o.dispose();
                    return;
                }
            }
            AtomicReference atomicReference2 = this.w;
            qk3 qk32 = this.x;
            if (qk32 != null) {
                Object andSet3 = atomicReference2.getAndSet((Object) null);
                if (andSet3 != null) {
                    try {
                        qk32.accept(andSet3);
                    } catch (Throwable th4) {
                        hd8.Z(th4);
                        n54.D(th4);
                    }
                }
            } else {
                atomicReference2.lazySet((Object) null);
            }
        }
    }

    public final void b() {
        this.z = true;
        a();
    }

    public final void c(mq4 mq4) {
        if (qq4.g(this.y, mq4)) {
            this.y = mq4;
            this.a.c(this);
        }
    }

    public final void d(Object obj) {
        Object andSet = this.w.getAndSet(obj);
        qk3 qk3 = this.x;
        if (!(qk3 == null || andSet == null)) {
            try {
                qk3.accept(andSet);
            } catch (Throwable th) {
                hd8.Z(th);
                this.y.dispose();
                this.X = th;
                this.z = true;
            }
        }
        a();
    }

    public final void dispose() {
        this.Y = true;
        this.y.dispose();
        this.o.dispose();
        if (getAndIncrement() == 0) {
            AtomicReference atomicReference = this.w;
            qk3 qk3 = this.x;
            if (qk3 != null) {
                Object andSet = atomicReference.getAndSet((Object) null);
                if (andSet != null) {
                    try {
                        qk3.accept(andSet);
                    } catch (Throwable th) {
                        hd8.Z(th);
                        n54.D(th);
                    }
                }
            } else {
                atomicReference.lazySet((Object) null);
            }
        }
    }

    public final boolean f() {
        return this.Y;
    }

    public final void onError(Throwable th) {
        this.X = th;
        this.z = true;
        a();
    }

    public final void run() {
        this.Z = true;
        a();
    }
}
