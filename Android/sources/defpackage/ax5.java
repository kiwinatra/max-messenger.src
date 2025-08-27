package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: ax5  reason: default package */
public final class ax5 extends AtomicInteger implements gx5, rye {
    public rye X;
    public Object Y;
    public int Z;
    public final pye a;
    public final sm0 b;
    public final she c;
    public final AtomicLong o = new AtomicLong();
    public final int v;
    public final int w;
    public volatile boolean x;
    public volatile boolean y;
    public Throwable z;

    public ax5(pye pye, sm0 sm0, Object obj, int i) {
        this.a = pye;
        this.b = sm0;
        this.Y = obj;
        this.v = i;
        this.w = i - (i >> 2);
        she she = new she(i);
        this.c = she;
        she.offer(obj);
    }

    public final void a() {
        int i;
        int i2;
        Throwable th;
        if (getAndIncrement() == 0) {
            pye pye = this.a;
            she she = this.c;
            int i3 = this.w;
            int i4 = this.Z;
            int i5 = 1;
            do {
                long j = this.o.get();
                long j2 = 0;
                while (true) {
                    i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                    if (i == 0) {
                        i2 = i5;
                        break;
                    } else if (this.x) {
                        she.clear();
                        return;
                    } else {
                        boolean z2 = this.y;
                        if (!z2 || (th = this.z) == null) {
                            AtomicLong atomicLong = she.o;
                            i2 = i5;
                            long j3 = atomicLong.get();
                            int i6 = ((int) j3) & she.a;
                            Object obj = she.get(i6);
                            long j4 = j;
                            if (obj == null) {
                                obj = null;
                            } else {
                                atomicLong.lazySet(j3 + 1);
                                she.lazySet(i6, (Object) null);
                            }
                            boolean z3 = obj == null;
                            if (z2 && z3) {
                                pye.b();
                                return;
                            } else if (z3) {
                                break;
                            } else {
                                pye.d(obj);
                                j2++;
                                i4++;
                                if (i4 == i3) {
                                    this.X.g((long) i3);
                                    i4 = 0;
                                }
                                i5 = i2;
                                j = j4;
                            }
                        } else {
                            she.clear();
                            pye.onError(th);
                            return;
                        }
                    }
                }
                if (i == 0 && this.y) {
                    Throwable th2 = this.z;
                    if (th2 != null) {
                        she.clear();
                        pye.onError(th2);
                        return;
                    } else if (she.isEmpty()) {
                        pye.b();
                        return;
                    }
                }
                if (j2 != 0) {
                    h88.P(this.o, j2);
                }
                this.Z = i4;
                i5 = addAndGet(-i2);
            } while (i5 != 0);
        }
    }

    public final void b() {
        if (!this.y) {
            this.y = true;
            a();
        }
    }

    public final void cancel() {
        this.x = true;
        this.X.cancel();
        if (getAndIncrement() == 0) {
            this.c.clear();
        }
    }

    public final void d(Object obj) {
        if (!this.y) {
            try {
                Object apply = this.b.apply(this.Y, obj);
                Objects.requireNonNull(apply, "The accumulator returned a null value");
                this.Y = apply;
                this.c.offer(apply);
                a();
            } catch (Throwable th) {
                hd8.Z(th);
                this.X.cancel();
                onError(th);
            }
        }
    }

    public final void e(rye rye) {
        if (tye.e(this.X, rye)) {
            this.X = rye;
            this.a.e(this);
            rye.g((long) (this.v - 1));
        }
    }

    public final void g(long j) {
        if (tye.d(j)) {
            h88.c(this.o, j);
            a();
        }
    }

    public final void onError(Throwable th) {
        if (this.y) {
            n54.D(th);
            return;
        }
        this.z = th;
        this.y = true;
        a();
    }
}
