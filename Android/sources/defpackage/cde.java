package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: cde  reason: default package */
public final class cde extends lbe {
    public final lbe a;
    public final long b;
    public final TimeUnit c;
    public final lfd o;
    public final lbe v = null;

    public cde(wbe wbe, long j, TimeUnit timeUnit, lfd lfd) {
        this.a = wbe;
        this.b = j;
        this.c = timeUnit;
        this.o = lfd;
    }

    public final void m(gce gce) {
        gce gce2 = gce;
        bde bde = new bde(gce2, this.v, this.b, this.c);
        gce.c(bde);
        qq4.c(bde.b, this.o.d(bde, this.b, this.c));
        this.a.l(bde);
    }
}
