package defpackage;

import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: hw5  reason: default package */
public final class hw5 extends AtomicReference implements gx5, mq4 {
    public final long a;
    public final iw5 b;
    public final int c;
    public final int o;
    public volatile boolean v;
    public volatile gbe w;
    public long x;
    public int y;

    public hw5(iw5 iw5, int i, long j) {
        this.a = j;
        this.b = iw5;
        this.o = i;
        this.c = i >> 2;
    }

    public final void a(long j) {
        if (this.y != 1) {
            long j2 = this.x + j;
            if (j2 >= ((long) this.c)) {
                this.x = 0;
                ((rye) get()).g(j2);
                return;
            }
            this.x = j2;
        }
    }

    public final void b() {
        this.v = true;
        this.b.c();
    }

    public final void d(Object obj) {
        if (this.y != 2) {
            iw5 iw5 = this.b;
            if (iw5.get() != 0 || !iw5.compareAndSet(0, 1)) {
                gbe gbe = this.w;
                if (gbe == null) {
                    gbe = new she(iw5.v);
                    this.w = gbe;
                }
                if (!gbe.offer(obj)) {
                    iw5.onError(new QueueOverflowException());
                    return;
                } else if (iw5.getAndIncrement() != 0) {
                    return;
                }
            } else {
                long j = iw5.Y.get();
                gbe gbe2 = this.w;
                if (j == 0 || (gbe2 != null && !gbe2.isEmpty())) {
                    if (gbe2 == null) {
                        gbe2 = new she(iw5.v);
                        this.w = gbe2;
                    }
                    if (!gbe2.offer(obj)) {
                        iw5.onError(new QueueOverflowException());
                    }
                } else {
                    iw5.a.d(obj);
                    if (j != LongCompanionObject.MAX_VALUE) {
                        iw5.Y.decrementAndGet();
                    }
                    a(1);
                }
                if (iw5.decrementAndGet() == 0) {
                    return;
                }
            }
            iw5.f();
            return;
        }
        this.b.c();
    }

    public final void dispose() {
        tye.a(this);
    }

    public final void e(rye rye) {
        if (tye.c(this, rye)) {
            if (rye instanceof zac) {
                zac zac = (zac) rye;
                int p = zac.p(7);
                if (p == 1) {
                    this.y = p;
                    this.w = zac;
                    this.v = true;
                    this.b.c();
                    return;
                } else if (p == 2) {
                    this.y = p;
                    this.w = zac;
                }
            }
            rye.g((long) this.o);
        }
    }

    public final boolean f() {
        return get() == tye.a;
    }

    public final void onError(Throwable th) {
        lazySet(tye.a);
        iw5 iw5 = this.b;
        if (iw5.y.a(th)) {
            this.v = true;
            if (!iw5.c) {
                iw5.Z.cancel();
                for (hw5 hw5 : (hw5[]) iw5.X.getAndSet(iw5.B0)) {
                    hw5.getClass();
                    tye.a(hw5);
                }
            }
            iw5.c();
        }
    }
}
