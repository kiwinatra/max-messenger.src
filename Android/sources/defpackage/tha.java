package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: tha  reason: default package */
public final class tha extends AtomicReference implements cla {
    public final /* synthetic */ int a;
    public final cla b;
    public final AtomicInteger c;

    public /* synthetic */ tha(cla cla, AtomicInteger atomicInteger, int i) {
        this.a = i;
        this.b = cla;
        this.c = atomicInteger;
    }

    public final void b() {
        switch (this.a) {
            case 0:
                uha uha = (uha) this.c;
                uha.z = false;
                uha.a();
                return;
            default:
                vha vha = (vha) this.c;
                vha.x = false;
                vha.a();
                return;
        }
    }

    public final void c(mq4 mq4) {
        switch (this.a) {
            case 0:
                qq4.c(this, mq4);
                return;
            default:
                qq4.c(this, mq4);
                return;
        }
    }

    public final void d(Object obj) {
        switch (this.a) {
            case 0:
                this.b.d(obj);
                return;
            default:
                this.b.d(obj);
                return;
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                uha uha = (uha) this.c;
                if (uha.o.a(th)) {
                    if (!uha.w) {
                        uha.y.dispose();
                    }
                    uha.z = false;
                    uha.a();
                    return;
                }
                return;
            default:
                ((vha) this.c).dispose();
                this.b.onError(th);
                return;
        }
    }
}
