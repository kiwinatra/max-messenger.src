package defpackage;

import java.util.NoSuchElementException;

/* renamed from: nha  reason: default package */
public final class nha implements cla, mq4 {
    public final /* synthetic */ int a = 1;
    public final gce b;
    public mq4 c;
    public boolean o;
    public Object v;

    public nha(gce gce) {
        this.b = gce;
    }

    public final void b() {
        switch (this.a) {
            case 0:
                if (!this.o) {
                    this.o = true;
                    this.b.a(Boolean.FALSE);
                    return;
                }
                return;
            default:
                if (!this.o) {
                    this.o = true;
                    Object obj = this.v;
                    this.v = null;
                    if (obj == null) {
                        obj = null;
                    }
                    gce gce = this.b;
                    if (obj != null) {
                        gce.a(obj);
                        return;
                    } else {
                        gce.onError(new NoSuchElementException());
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public final void c(mq4 mq4) {
        switch (this.a) {
            case 0:
                if (qq4.g(this.c, mq4)) {
                    this.c = mq4;
                    this.b.c(this);
                    return;
                }
                return;
            default:
                if (qq4.g(this.c, mq4)) {
                    this.c = mq4;
                    this.b.c(this);
                    return;
                }
                return;
        }
    }

    public final void d(Object obj) {
        switch (this.a) {
            case 0:
                if (!this.o) {
                    try {
                        if (((nsb) this.v).test(obj)) {
                            this.o = true;
                            this.c.dispose();
                            this.b.a(Boolean.TRUE);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        hd8.Z(th);
                        this.c.dispose();
                        onError(th);
                        return;
                    }
                } else {
                    return;
                }
            default:
                if (!this.o) {
                    if (this.v != null) {
                        this.o = true;
                        this.c.dispose();
                        this.b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                        return;
                    }
                    this.v = obj;
                    return;
                }
                return;
        }
    }

    public final void dispose() {
        switch (this.a) {
            case 0:
                this.c.dispose();
                return;
            default:
                this.c.dispose();
                return;
        }
    }

    public final boolean f() {
        switch (this.a) {
            case 0:
                return this.c.f();
            default:
                return this.c.f();
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                if (this.o) {
                    n54.D(th);
                    return;
                }
                this.o = true;
                this.b.onError(th);
                return;
            default:
                if (this.o) {
                    n54.D(th);
                    return;
                }
                this.o = true;
                this.b.onError(th);
                return;
        }
    }

    public nha(gce gce, nsb nsb) {
        this.b = gce;
        this.v = nsb;
    }
}
