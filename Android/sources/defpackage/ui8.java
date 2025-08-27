package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ui8  reason: default package */
public final class ui8 implements gce {
    public final /* synthetic */ int a = 0;
    public final AtomicReference b;
    public final gce c;

    public ui8(AtomicReference atomicReference, gce gce) {
        this.b = atomicReference;
        this.c = gce;
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.c.a(obj);
                return;
            default:
                this.c.a(obj);
                return;
        }
    }

    public final void c(mq4 mq4) {
        switch (this.a) {
            case 0:
                qq4.e(this.b, mq4);
                return;
            default:
                qq4.c(this.b, mq4);
                return;
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                this.c.onError(th);
                return;
            default:
                this.c.onError(th);
                return;
        }
    }

    public ui8(gce gce, AtomicReference atomicReference) {
        this.c = gce;
        this.b = atomicReference;
    }
}
