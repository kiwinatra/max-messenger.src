package defpackage;

/* renamed from: gi8  reason: default package */
public final class gi8 implements pi8, mq4, cla {
    public final /* synthetic */ int a;
    public mq4 b;
    public final Object c;

    public /* synthetic */ gi8(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    public void a(Object obj) {
        this.b = qq4.a;
        ((gce) this.c).a(Boolean.FALSE);
    }

    public final void b() {
        switch (this.a) {
            case 0:
                this.b = qq4.a;
                ((gce) this.c).a(Boolean.TRUE);
                return;
            default:
                ((cla) this.c).b();
                return;
        }
    }

    public final void c(mq4 mq4) {
        switch (this.a) {
            case 0:
                if (qq4.g(this.b, mq4)) {
                    this.b = mq4;
                    ((gce) this.c).c(this);
                    return;
                }
                return;
            default:
                this.b = mq4;
                ((cla) this.c).c(this);
                return;
        }
    }

    public void d(Object obj) {
    }

    public final void dispose() {
        switch (this.a) {
            case 0:
                this.b.dispose();
                this.b = qq4.a;
                return;
            default:
                this.b.dispose();
                return;
        }
    }

    public final boolean f() {
        switch (this.a) {
            case 0:
                return this.b.f();
            default:
                return this.b.f();
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                this.b = qq4.a;
                ((gce) this.c).onError(th);
                return;
            default:
                ((cla) this.c).onError(th);
                return;
        }
    }
}
