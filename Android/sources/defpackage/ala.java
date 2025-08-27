package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: ala  reason: default package */
public final class ala extends jha {
    public final lfd a;
    public final long b;
    public final TimeUnit c;

    public ala(long j, TimeUnit timeUnit, lfd lfd) {
        this.b = j;
        this.c = timeUnit;
        this.a = lfd;
    }

    public final void w(cla cla) {
        fb3 fb3 = new fb3(1, cla);
        cla.c(fb3);
        mq4 d = this.a.d(fb3, this.b, this.c);
        while (!fb3.compareAndSet((Object) null, d)) {
            if (fb3.get() != null) {
                if (fb3.get() == qq4.a) {
                    d.dispose();
                    return;
                }
                return;
            }
        }
    }
}
