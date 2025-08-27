package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: oja  reason: default package */
public final class oja extends AtomicReference implements cla, mq4 {
    public static final nja[] v = new nja[0];
    public static final nja[] w = new nja[0];
    public final AtomicBoolean a = new AtomicBoolean();
    public final AtomicReference b;
    public final AtomicReference c;
    public Throwable o;

    public oja(AtomicReference atomicReference) {
        this.b = atomicReference;
        this.c = new AtomicReference();
        lazySet(v);
    }

    public final void a(nja nja) {
        nja[] njaArr;
        nja[] njaArr2;
        do {
            njaArr = (nja[]) get();
            int length = njaArr.length;
            if (length != 0) {
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (njaArr[i] == nja) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i >= 0) {
                    njaArr2 = v;
                    if (length != 1) {
                        njaArr2 = new nja[(length - 1)];
                        System.arraycopy(njaArr, 0, njaArr2, 0, i);
                        System.arraycopy(njaArr, i + 1, njaArr2, i, (length - i) - 1);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(njaArr, njaArr2));
    }

    public final void b() {
        this.c.lazySet(qq4.a);
        for (nja nja : (nja[]) getAndSet(w)) {
            nja.a.b();
        }
    }

    public final void c(mq4 mq4) {
        qq4.e(this.c, mq4);
    }

    public final void d(Object obj) {
        for (nja nja : (nja[]) get()) {
            nja.a.d(obj);
        }
    }

    public final void dispose() {
        AtomicReference atomicReference;
        getAndSet(w);
        do {
            atomicReference = this.b;
            if (atomicReference.compareAndSet(this, (Object) null) || atomicReference.get() != this) {
                qq4.a(this.c);
            }
            atomicReference = this.b;
            break;
        } while (atomicReference.get() != this);
        qq4.a(this.c);
    }

    public final boolean f() {
        return get() == w;
    }

    public final void onError(Throwable th) {
        AtomicReference atomicReference = this.c;
        Object obj = atomicReference.get();
        qq4 qq4 = qq4.a;
        if (obj != qq4) {
            this.o = th;
            atomicReference.lazySet(qq4);
            for (nja nja : (nja[]) getAndSet(w)) {
                nja.a.onError(th);
            }
            return;
        }
        n54.D(th);
    }
}
