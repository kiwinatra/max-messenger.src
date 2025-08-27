package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: ix5  reason: default package */
public final class ix5 extends wv5 {
    public final lfd b;
    public final long c;
    public final TimeUnit o;

    public ix5(long j, TimeUnit timeUnit, lfd lfd) {
        this.c = j;
        this.o = timeUnit;
        this.b = lfd;
    }

    public final void g(pye pye) {
        hx5 hx5 = new hx5(pye);
        pye.e(hx5);
        mq4 d = this.b.d(hx5, this.c, this.o);
        while (!hx5.compareAndSet((Object) null, d)) {
            if (hx5.get() != null) {
                if (hx5.get() == qq4.a) {
                    d.dispose();
                    return;
                }
                return;
            }
        }
    }
}
