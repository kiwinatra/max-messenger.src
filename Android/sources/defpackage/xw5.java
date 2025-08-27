package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: xw5  reason: default package */
public final class xw5 extends AtomicInteger implements gx5, rye {
    public final vw5 X;
    public final rye Y;
    public long Z;
    public rye a;
    public long b;
    public final AtomicReference c = new AtomicReference();
    public final AtomicLong o = new AtomicLong();
    public final AtomicLong v = new AtomicLong();
    public final boolean w = false;
    public volatile boolean x;
    public boolean y;
    public final pye z;

    public xw5(ftd ftd, ctd ctd, ww5 ww5) {
        this.z = ftd;
        this.X = ctd;
        this.Y = ww5;
    }

    public final void a() {
        int i = 1;
        long j = 0;
        rye rye = null;
        do {
            rye rye2 = (rye) this.c.get();
            if (rye2 != null) {
                rye2 = (rye) this.c.getAndSet((Object) null);
            }
            long j2 = this.o.get();
            if (j2 != 0) {
                j2 = this.o.getAndSet(0);
            }
            long j3 = this.v.get();
            if (j3 != 0) {
                j3 = this.v.getAndSet(0);
            }
            rye rye3 = this.a;
            if (this.x) {
                if (rye3 != null) {
                    rye3.cancel();
                    this.a = null;
                }
                if (rye2 != null) {
                    rye2.cancel();
                }
            } else {
                long j4 = this.b;
                if (j4 != LongCompanionObject.MAX_VALUE) {
                    j4 = h88.d(j4, j2);
                    if (j4 != LongCompanionObject.MAX_VALUE) {
                        j4 -= j3;
                        if (j4 < 0) {
                            n54.D(new IllegalStateException(wj6.i(j4, "More produced than requested: ")));
                            j4 = 0;
                        }
                    }
                    this.b = j4;
                }
                if (rye2 != null) {
                    if (rye3 != null && this.w) {
                        rye3.cancel();
                    }
                    this.a = rye2;
                    if (j4 != 0) {
                        j = h88.d(j, j4);
                        rye = rye2;
                    }
                } else if (!(rye3 == null || j2 == 0)) {
                    j = h88.d(j, j2);
                    rye = rye3;
                }
            }
            i = addAndGet(-i);
        } while (i != 0);
        if (j != 0) {
            rye.g(j);
        }
    }

    public final void b() {
        this.Y.cancel();
        this.z.b();
    }

    public final void c(rye rye) {
        if (this.x) {
            rye.cancel();
            return;
        }
        Objects.requireNonNull(rye, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            rye rye2 = (rye) this.c.getAndSet(rye);
            if (rye2 != null && this.w) {
                rye2.cancel();
            }
            if (getAndIncrement() == 0) {
                a();
                return;
            }
            return;
        }
        rye rye3 = this.a;
        if (rye3 != null && this.w) {
            rye3.cancel();
        }
        this.a = rye;
        long j = this.b;
        if (decrementAndGet() != 0) {
            a();
        }
        if (j != 0) {
            rye.g(j);
        }
    }

    public final void cancel() {
        if (!this.x) {
            this.x = true;
            if (getAndIncrement() == 0) {
                a();
            }
        }
        this.Y.cancel();
    }

    public final void d(Object obj) {
        this.Z++;
        this.z.d(obj);
    }

    public void e(rye rye) {
        c(rye);
    }

    public final void g(long j) {
        if (tye.d(j) && !this.y) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                h88.c(this.o, j);
                if (getAndIncrement() == 0) {
                    a();
                    return;
                }
                return;
            }
            long j2 = this.b;
            if (j2 != LongCompanionObject.MAX_VALUE) {
                long d = h88.d(j2, j);
                this.b = d;
                if (d == LongCompanionObject.MAX_VALUE) {
                    this.y = true;
                }
            }
            rye rye = this.a;
            if (decrementAndGet() != 0) {
                a();
            }
            if (rye != null) {
                rye.g(j);
            }
        }
    }

    public final void onError(Throwable th) {
        c(d55.a);
        long j = this.Z;
        long j2 = 0;
        if (j != 0) {
            this.Z = 0;
            if (!this.y) {
                if (get() != 0 || !compareAndSet(0, 1)) {
                    h88.c(this.v, j);
                    if (getAndIncrement() == 0) {
                        a();
                    }
                } else {
                    long j3 = this.b;
                    if (j3 != LongCompanionObject.MAX_VALUE) {
                        long j4 = j3 - j;
                        if (j4 < 0) {
                            n54.D(new IllegalStateException(wj6.i(j4, "More produced than requested: ")));
                        } else {
                            j2 = j4;
                        }
                        this.b = j2;
                    }
                    if (decrementAndGet() != 0) {
                        a();
                    }
                }
            }
        }
        this.Y.g(1);
        this.X.d(th);
    }
}
