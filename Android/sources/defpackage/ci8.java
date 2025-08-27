package defpackage;

/* renamed from: ci8  reason: default package */
public final class ci8 implements gce, mq4, pi8 {
    public final /* synthetic */ int a;
    public final pi8 b;
    public mq4 c;

    public /* synthetic */ ci8(pi8 pi8, int i) {
        this.a = i;
        this.b = pi8;
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.c = qq4.a;
                this.b.a(obj);
                return;
            case 1:
                this.c = qq4.a;
                this.b.b();
                return;
            default:
                this.b.a(Boolean.FALSE);
                return;
        }
    }

    public void b() {
        switch (this.a) {
            case 1:
                this.c = qq4.a;
                this.b.b();
                return;
            default:
                this.b.a(Boolean.TRUE);
                return;
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
            case 1:
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

    public final void dispose() {
        switch (this.a) {
            case 0:
                this.c.dispose();
                this.c = qq4.a;
                return;
            case 1:
                this.c.dispose();
                this.c = qq4.a;
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
            case 1:
                return this.c.f();
            default:
                return this.c.f();
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                this.c = qq4.a;
                this.b.onError(th);
                return;
            case 1:
                this.c = qq4.a;
                this.b.onError(th);
                return;
            default:
                this.b.onError(th);
                return;
        }
    }
}
