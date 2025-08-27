package defpackage;

import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: cw5  reason: default package */
public final class cw5 extends AtomicInteger implements rye, gx5 {
    public final zi6 X;
    public final AtomicLong Y;
    public final bw5 Z;
    public final fz a = new AtomicReference();
    public final int b;
    public final int c;
    public gbe o;
    public rye v;
    public long v0;
    public volatile boolean w;
    public int w0;
    public volatile boolean x;
    public Object x0;
    public boolean y;
    public volatile int y0;
    public final pye z;

    /* JADX WARNING: type inference failed for: r4v1, types: [fz, java.util.concurrent.atomic.AtomicReference] */
    public cw5(pye pye, zi6 zi6, int i, int i2) {
        this.c = i2;
        this.b = i;
        this.z = pye;
        this.X = zi6;
        this.Y = new AtomicLong();
        this.Z = new bw5(0, this);
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            pye pye = this.z;
            int i = this.c;
            gbe gbe = this.o;
            fz fzVar = this.a;
            AtomicLong atomicLong = this.Y;
            int i2 = this.b;
            int i3 = i2 - (i2 >> 1);
            boolean z2 = this.y;
            int i4 = 1;
            while (true) {
                if (this.x) {
                    gbe.clear();
                    this.x0 = null;
                } else {
                    int i5 = this.y0;
                    if (fzVar.get() == null || !(i == 1 || (i == 2 && i5 == 0))) {
                        if (i5 == 0) {
                            boolean z3 = this.w;
                            try {
                                Object poll = gbe.poll();
                                boolean z4 = poll == null;
                                if (z3 && z4) {
                                    fzVar.e(pye);
                                    return;
                                } else if (!z4) {
                                    if (!z2) {
                                        int i6 = this.w0 + 1;
                                        if (i6 == i3) {
                                            this.w0 = 0;
                                            this.v.g((long) i3);
                                        } else {
                                            this.w0 = i6;
                                        }
                                    }
                                    try {
                                        Object apply = this.X.apply(poll);
                                        Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                                        lbe lbe = (lbe) apply;
                                        this.y0 = 1;
                                        lbe.l(this.Z);
                                    } catch (Throwable th) {
                                        hd8.Z(th);
                                        this.v.cancel();
                                        gbe.clear();
                                        fzVar.a(th);
                                        fzVar.e(pye);
                                        return;
                                    }
                                }
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                hd8.Z(th3);
                                this.v.cancel();
                                fzVar.a(th3);
                                fzVar.e(pye);
                                return;
                            }
                        } else if (i5 == 2) {
                            long j = this.v0;
                            if (j != atomicLong.get()) {
                                Object obj = this.x0;
                                this.x0 = null;
                                pye.d(obj);
                                this.v0 = j + 1;
                                this.y0 = 0;
                            }
                        }
                    }
                }
                i4 = addAndGet(-i4);
                if (i4 == 0) {
                    return;
                }
            }
            gbe.clear();
            this.x0 = null;
            fzVar.e(pye);
        }
    }

    public final void b() {
        this.w = true;
        a();
    }

    public final void cancel() {
        this.x = true;
        this.v.cancel();
        bw5 bw5 = this.Z;
        bw5.getClass();
        qq4.a(bw5);
        this.a.b();
        if (getAndIncrement() == 0) {
            this.o.clear();
            this.x0 = null;
        }
    }

    public final void d(Object obj) {
        if (obj == null || this.o.offer(obj)) {
            a();
            return;
        }
        this.v.cancel();
        onError(new QueueOverflowException());
    }

    public final void e(rye rye) {
        if (tye.e(this.v, rye)) {
            this.v = rye;
            if (rye instanceof zac) {
                zac zac = (zac) rye;
                int p = zac.p(7);
                if (p == 1) {
                    this.o = zac;
                    this.y = true;
                    this.w = true;
                    this.z.e(this);
                    a();
                    return;
                } else if (p == 2) {
                    this.o = zac;
                    this.z.e(this);
                    this.v.g((long) this.b);
                    return;
                }
            }
            this.o = new she(this.b);
            this.z.e(this);
            this.v.g((long) this.b);
        }
    }

    public final void g(long j) {
        h88.c(this.Y, j);
        a();
    }

    public final void onError(Throwable th) {
        if (this.a.a(th)) {
            if (this.c == 1) {
                bw5 bw5 = this.Z;
                bw5.getClass();
                qq4.a(bw5);
            }
            this.w = true;
            a();
        }
    }
}
