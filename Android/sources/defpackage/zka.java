package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: zka  reason: default package */
public final class zka extends r2 {
    public final long b;
    public final TimeUnit c;
    public final lfd o;
    public final oka v = null;

    public zka(jha jha, long j, TimeUnit timeUnit, lfd lfd) {
        super(jha);
        this.b = j;
        this.c = timeUnit;
        this.o = lfd;
    }

    public final void w(cla cla) {
        oka oka = this.v;
        oka oka2 = this.a;
        lfd lfd = this.o;
        if (oka == null) {
            cla cla2 = cla;
            xka xka = new xka(cla2, this.b, this.c, lfd.b());
            cla.c(xka);
            mq4 b2 = xka.o.b(new ex5(0, (yka) xka), xka.b, xka.c);
            mw1 mw1 = xka.v;
            mw1.getClass();
            qq4.c(mw1, b2);
            oka2.a(xka);
            return;
        }
        cla cla3 = cla;
        wka wka = new wka(cla3, this.b, this.c, lfd.b());
        cla.c(wka);
        mq4 b3 = wka.o.b(new ex5(0, (yka) wka), wka.b, wka.c);
        mw1 mw12 = wka.v;
        mw12.getClass();
        qq4.c(mw12, b3);
        oka2.a(wka);
    }
}
