package defpackage;

/* renamed from: lha  reason: default package */
public final class lha implements cla, mq4 {
    public final /* synthetic */ int a;
    public final cla b;
    public final nsb c;
    public mq4 o;
    public boolean v;

    public /* synthetic */ lha(cla cla, nsb nsb, int i) {
        this.a = i;
        this.b = cla;
        this.c = nsb;
    }

    public final void b() {
        switch (this.a) {
            case 0:
                if (!this.v) {
                    this.v = true;
                    Boolean bool = Boolean.FALSE;
                    cla cla = this.b;
                    cla.d(bool);
                    cla.b();
                    return;
                }
                return;
            case 1:
                this.b.b();
                return;
            default:
                if (!this.v) {
                    this.v = true;
                    this.b.b();
                    return;
                }
                return;
        }
    }

    public final void c(mq4 mq4) {
        switch (this.a) {
            case 0:
                if (qq4.g(this.o, mq4)) {
                    this.o = mq4;
                    this.b.c(this);
                    return;
                }
                return;
            case 1:
                if (qq4.g(this.o, mq4)) {
                    this.o = mq4;
                    this.b.c(this);
                    return;
                }
                return;
            default:
                if (qq4.g(this.o, mq4)) {
                    this.o = mq4;
                    this.b.c(this);
                    return;
                }
                return;
        }
    }

    public final void d(Object obj) {
        switch (this.a) {
            case 0:
                if (!this.v) {
                    try {
                        if (this.c.test(obj)) {
                            this.v = true;
                            this.o.dispose();
                            Boolean bool = Boolean.TRUE;
                            cla cla = this.b;
                            cla.d(bool);
                            cla.b();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        hd8.Z(th);
                        this.o.dispose();
                        onError(th);
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                boolean z = this.v;
                cla cla2 = this.b;
                if (z) {
                    cla2.d(obj);
                    return;
                }
                try {
                    if (!this.c.test(obj)) {
                        this.v = true;
                        cla2.d(obj);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    hd8.Z(th2);
                    this.o.dispose();
                    cla2.onError(th2);
                    return;
                }
            default:
                if (!this.v) {
                    cla cla3 = this.b;
                    cla3.d(obj);
                    try {
                        if (this.c.test(obj)) {
                            this.v = true;
                            this.o.dispose();
                            cla3.b();
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        hd8.Z(th3);
                        this.o.dispose();
                        onError(th3);
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public final void dispose() {
        switch (this.a) {
            case 0:
                this.o.dispose();
                return;
            case 1:
                this.o.dispose();
                return;
            default:
                this.o.dispose();
                return;
        }
    }

    public final boolean f() {
        switch (this.a) {
            case 0:
                return this.o.f();
            case 1:
                return this.o.f();
            default:
                return this.o.f();
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                if (this.v) {
                    n54.D(th);
                    return;
                }
                this.v = true;
                this.b.onError(th);
                return;
            case 1:
                this.b.onError(th);
                return;
            default:
                if (!this.v) {
                    this.v = true;
                    this.b.onError(th);
                    return;
                }
                n54.D(th);
                return;
        }
    }
}
