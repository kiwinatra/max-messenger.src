package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: ou7  reason: default package */
public final class ou7 {
    public final ju7 a;
    public final iu7 b;
    public final yp4 c;
    public final rb3 d;

    public ou7(ju7 ju7, iu7 iu7, yp4 yp4, pm7 pm7) {
        this.a = ju7;
        this.b = iu7;
        this.c = yp4;
        rb3 rb3 = new rb3(1, this, pm7);
        this.d = rb3;
        if (((lv7) ju7).d == iu7.a) {
            pm7.b((CancellationException) null);
            a();
            return;
        }
        ju7.a(rb3);
    }

    public final void a() {
        this.a.b(this.d);
        yp4 yp4 = this.c;
        yp4.b = true;
        yp4.a();
    }
}
