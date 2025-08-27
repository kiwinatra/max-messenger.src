package defpackage;

/* renamed from: ei8  reason: default package */
public final class ei8 implements pi8, mq4, cla {
    public final /* synthetic */ int a;
    public final ya3 b;
    public mq4 c;

    public /* synthetic */ ei8(ya3 ya3, int i) {
        this.a = i;
        this.b = ya3;
    }

    public void a(Object obj) {
        this.c = qq4.a;
        this.b.b();
    }

    public final void b() {
        switch (this.a) {
            case 0:
                this.c = qq4.a;
                this.b.b();
                return;
            default:
                this.b.b();
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
            default:
                this.c = mq4;
                this.b.c(this);
                return;
        }
    }

    public void d(Object obj) {
    }

    public final void dispose() {
        switch (this.a) {
            case 0:
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
            default:
                this.b.onError(th);
                return;
        }
    }
}
