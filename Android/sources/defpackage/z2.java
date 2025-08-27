package defpackage;

import java.io.Closeable;

/* renamed from: z2  reason: default package */
public final class z2 extends zi0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z2(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    public final void d() {
        switch (this.b) {
            case 0:
                w33 w33 = (w33) this.c;
                synchronized (w33) {
                    cvg.q(w33.g());
                }
                return;
            default:
                try {
                    tf6.P();
                    ux9 ux9 = (ux9) this.c;
                    synchronized (ux9) {
                        if (ux9.g == this) {
                            ux9.g = null;
                            ux9.f = null;
                            ux9.b(ux9.c);
                            ux9.c = null;
                            ux9.i(3);
                        }
                    }
                    tf6.P();
                    return;
                } catch (Throwable th) {
                    tf6.P();
                    throw th;
                }
        }
    }

    public final void f(Throwable th) {
        switch (this.b) {
            case 0:
                w33 w33 = (w33) this.c;
                eyd eyd = w33.h;
                if (w33.j(th, eyd.w)) {
                    w33.i.f(eyd, th);
                    return;
                }
                return;
            default:
                try {
                    if (tf6.X()) {
                        tf6.e("MultiplexProducer#onFailure");
                    }
                    ((ux9) this.c).f(this, th);
                    if (tf6.X()) {
                        tf6.C();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (tf6.X()) {
                        tf6.C();
                    }
                    throw th2;
                }
        }
    }

    public final void h(int i, Object obj) {
        switch (this.b) {
            case 0:
                w33 w33 = (w33) this.c;
                w33.o(obj, i, w33.h);
                return;
            default:
                Closeable closeable = (Closeable) obj;
                try {
                    if (tf6.X()) {
                        tf6.e("MultiplexProducer#onNewResult");
                    }
                    ((ux9) this.c).g(this, closeable, i);
                    if (tf6.X()) {
                        tf6.C();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (tf6.X()) {
                        tf6.C();
                    }
                    throw th;
                }
        }
    }

    public final void j(float f) {
        switch (this.b) {
            case 0:
                ((w33) this.c).k(f);
                return;
            default:
                try {
                    if (tf6.X()) {
                        tf6.e("MultiplexProducer#onProgressUpdate");
                    }
                    ((ux9) this.c).h(this, f);
                    if (tf6.X()) {
                        tf6.C();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (tf6.X()) {
                        tf6.C();
                    }
                    throw th;
                }
        }
    }
}
