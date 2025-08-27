package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: cka  reason: default package */
public final class cka extends AtomicInteger implements cla {
    public final cla a;
    public final mw1 b;
    public final oka c;
    public final nsb o;
    public long v;

    public cka(cla cla, long j, nsb nsb, mw1 mw1, oka oka) {
        this.a = cla;
        this.b = mw1;
        this.c = oka;
        this.o = nsb;
        this.v = j;
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            int i = 1;
            while (!this.b.f()) {
                this.c.a(this);
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }
    }

    public final void b() {
        this.a.b();
    }

    public final void c(mq4 mq4) {
        mw1 mw1 = this.b;
        mw1.getClass();
        qq4.c(mw1, mq4);
    }

    public final void d(Object obj) {
        this.a.d(obj);
    }

    public final void onError(Throwable th) {
        long j = this.v;
        if (j != LongCompanionObject.MAX_VALUE) {
            this.v = j - 1;
        }
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        cla cla = this.a;
        if (i == 0) {
            cla.onError(th);
            return;
        }
        try {
            if (!this.o.test(th)) {
                cla.onError(th);
            } else {
                a();
            }
        } catch (Throwable th2) {
            hd8.Z(th2);
            cla.onError(new CompositeException(th, th2));
        }
    }
}
