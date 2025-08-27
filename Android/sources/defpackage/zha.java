package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: zha  reason: default package */
public final class zha extends AtomicReference implements Runnable, mq4 {
    public final Object a;
    public final long b;
    public final aia c;
    public final AtomicBoolean o = new AtomicBoolean();

    public zha(Object obj, long j, aia aia) {
        this.a = obj;
        this.b = j;
        this.c = aia;
    }

    public final void dispose() {
        qq4.a(this);
    }

    public final boolean f() {
        return get() == qq4.a;
    }

    public final void run() {
        if (this.o.compareAndSet(false, true)) {
            aia aia = this.c;
            long j = this.b;
            Object obj = this.a;
            if (j == aia.x) {
                aia.a.d(obj);
                qq4.a(this);
            }
        }
    }
}
