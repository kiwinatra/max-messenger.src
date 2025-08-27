package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: hja  reason: default package */
public final class hja extends jha {
    public final lfd a;
    public final long b;
    public final long c;
    public final TimeUnit o;

    public hja(long j, long j2, TimeUnit timeUnit, lfd lfd) {
        this.b = j;
        this.c = j2;
        this.o = timeUnit;
        this.a = lfd;
    }

    public final void w(cla cla) {
        gja gja = new gja(cla);
        cla.c(gja);
        lfd lfd = this.a;
        if (lfd instanceof vqf) {
            ((vqf) lfd).getClass();
            uqf uqf = new uqf();
            qq4.e(gja, uqf);
            gja gja2 = gja;
            uqf.c(gja2, this.b, this.c, this.o);
            return;
        }
        gja gja3 = gja;
        qq4.e(gja, lfd.e(gja3, this.b, this.c, this.o));
    }
}
