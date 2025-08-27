package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: z95  reason: default package */
public final class z95 extends AtomicReference implements Runnable, mq4 {
    public final mw1 a = new mw1(2);
    public final mw1 b = new mw1(2);

    public z95(Runnable runnable) {
        super(runnable);
    }

    public final void dispose() {
        if (getAndSet((Object) null) != null) {
            mw1 mw1 = this.a;
            mw1.getClass();
            qq4.a(mw1);
            mw1 mw12 = this.b;
            mw12.getClass();
            qq4.a(mw12);
        }
    }

    public final boolean f() {
        return get() == null;
    }

    public final void run() {
        mw1 mw1 = this.b;
        mw1 mw12 = this.a;
        qq4 qq4 = qq4.a;
        Runnable runnable = (Runnable) get();
        if (runnable != null) {
            try {
                runnable.run();
                lazySet((Object) null);
                mw12.lazySet(qq4);
                mw1.lazySet(qq4);
            } catch (Throwable th) {
                n54.D(th);
                throw th;
            }
        }
    }
}
