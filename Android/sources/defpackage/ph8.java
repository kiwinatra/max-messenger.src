package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ph8  reason: default package */
public final class ph8 extends AtomicInteger implements pi8, rye {
    public final pye a;
    public final AtomicLong b = new AtomicLong();
    public final AtomicReference c = new AtomicReference(lea.a);
    public final mw1 o = new mw1(2);
    public final ti8[] v;
    public int w;
    public long x;

    public ph8(pye pye, ti8[] ti8Arr) {
        this.a = pye;
        this.v = ti8Arr;
    }

    public final void a(Object obj) {
        this.c.lazySet(obj);
        d();
    }

    public final void b() {
        this.c.lazySet(lea.a);
        d();
    }

    public final void c(mq4 mq4) {
        mw1 mw1 = this.o;
        mw1.getClass();
        qq4.c(mw1, mq4);
    }

    public final void cancel() {
        mw1 mw1 = this.o;
        mw1.getClass();
        qq4.a(mw1);
    }

    public final void d() {
        if (getAndIncrement() == 0) {
            AtomicReference atomicReference = this.c;
            do {
                mw1 mw1 = this.o;
                if (mw1.f()) {
                    atomicReference.lazySet((Object) null);
                    return;
                }
                Object obj = atomicReference.get();
                if (obj != null) {
                    lea lea = lea.a;
                    pye pye = this.a;
                    if (obj != lea) {
                        long j = this.x;
                        if (j != this.b.get()) {
                            this.x = j + 1;
                            atomicReference.lazySet((Object) null);
                            pye.d(obj);
                        }
                    } else {
                        atomicReference.lazySet((Object) null);
                    }
                    if (!mw1.f()) {
                        int i = this.w;
                        ti8[] ti8Arr = this.v;
                        if (i == ti8Arr.length) {
                            pye.b();
                            return;
                        } else {
                            this.w = i + 1;
                            ti8Arr[i].a(this);
                        }
                    }
                }
            } while (decrementAndGet() != 0);
        }
    }

    public final void g(long j) {
        if (tye.d(j)) {
            h88.c(this.b, j);
            d();
        }
    }

    public final void onError(Throwable th) {
        this.a.onError(th);
    }
}
