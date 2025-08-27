package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bw5  reason: default package */
public final class bw5 extends AtomicReference implements gce, cla {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ bw5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void a(Object obj) {
        switch (this.a) {
            case 0:
                cw5 cw5 = (cw5) this.b;
                cw5.x0 = obj;
                cw5.y0 = 2;
                cw5.a();
                return;
            case 1:
                xha xha = (xha) this.b;
                xha.Y = obj;
                xha.Z = 2;
                xha.a();
                return;
            default:
                ((gce) this.b).a(obj);
                return;
        }
    }

    public void b() {
        eka eka = (eka) this.b;
        qq4.a(eka.w);
        if (eka.getAndIncrement() == 0) {
            eka.c.d(eka.a);
        }
    }

    public final void c(mq4 mq4) {
        switch (this.a) {
            case 0:
                qq4.c(this, mq4);
                return;
            case 1:
                qq4.c(this, mq4);
                return;
            case 2:
                qq4.e(this, mq4);
                return;
            default:
                qq4.e(this, mq4);
                return;
        }
    }

    public void d(Object obj) {
        ((eka) this.b).a();
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                cw5 cw5 = (cw5) this.b;
                if (cw5.a.a(th)) {
                    if (cw5.c != 3) {
                        cw5.v.cancel();
                    }
                    cw5.y0 = 0;
                    cw5.a();
                    return;
                }
                return;
            case 1:
                xha xha = (xha) this.b;
                if (xha.a.a(th)) {
                    if (xha.c != 3) {
                        xha.v.dispose();
                    }
                    xha.Z = 0;
                    xha.a();
                    return;
                }
                return;
            case 2:
                eka eka = (eka) this.b;
                qq4.a(eka.w);
                fz fzVar = eka.c;
                if (fzVar.a(th) && eka.getAndIncrement() == 0) {
                    fzVar.d(eka.a);
                    return;
                }
                return;
            default:
                ((gce) this.b).onError(th);
                return;
        }
    }

    public bw5(eka eka) {
        this.a = 2;
        this.b = eka;
    }
}
