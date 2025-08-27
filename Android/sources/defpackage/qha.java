package defpackage;

/* renamed from: qha  reason: default package */
public final class qha implements cla, mq4 {
    public final /* synthetic */ int a;
    public final rm0 b;
    public final Object c;
    public mq4 o;
    public boolean v;
    public final Object w;

    public /* synthetic */ qha(Object obj, Object obj2, rm0 rm0, int i) {
        this.a = i;
        this.w = obj;
        this.b = rm0;
        this.c = obj2;
    }

    public final void b() {
        switch (this.a) {
            case 0:
                if (!this.v) {
                    this.v = true;
                    Object obj = this.c;
                    cla cla = (cla) this.w;
                    cla.d(obj);
                    cla.b();
                    return;
                }
                return;
            default:
                if (!this.v) {
                    this.v = true;
                    ((gce) this.w).a(this.c);
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
                    ((cla) this.w).c(this);
                    return;
                }
                return;
            default:
                if (qq4.g(this.o, mq4)) {
                    this.o = mq4;
                    ((gce) this.w).c(this);
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
                        this.b.accept(this.c, obj);
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
            default:
                if (!this.v) {
                    try {
                        this.b.accept(this.c, obj);
                        return;
                    } catch (Throwable th2) {
                        hd8.Z(th2);
                        this.o.dispose();
                        onError(th2);
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
            default:
                this.o.dispose();
                return;
        }
    }

    public final boolean f() {
        switch (this.a) {
            case 0:
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
                ((cla) this.w).onError(th);
                return;
            default:
                if (this.v) {
                    n54.D(th);
                    return;
                }
                this.v = true;
                ((gce) this.w).onError(th);
                return;
        }
    }
}
