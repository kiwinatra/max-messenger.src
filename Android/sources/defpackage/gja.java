package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: gja  reason: default package */
public final class gja extends AtomicReference implements mq4, Runnable {
    public final cla a;
    public long b;

    public gja(cla cla) {
        this.a = cla;
    }

    public final void dispose() {
        qq4.a(this);
    }

    public final boolean f() {
        return get() == qq4.a;
    }

    public final void run() {
        if (get() != qq4.a) {
            long j = this.b;
            this.b = 1 + j;
            this.a.d(Long.valueOf(j));
        }
    }
}
