package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: pha  reason: default package */
public final class pha extends jha {
    public final gh3 a;
    public final int b = 1;
    public final qk3 c;
    public final AtomicInteger o;

    public pha(bka bka) {
        gga gga = m58.f;
        this.a = bka;
        this.c = gga;
        this.o = new AtomicInteger();
    }

    public final void w(cla cla) {
        gh3 gh3 = this.a;
        gh3.a(cla);
        if (this.o.incrementAndGet() == this.b) {
            gh3.D(this.c);
        }
    }
}
