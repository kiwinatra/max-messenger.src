package defpackage;

/* renamed from: wi8  reason: default package */
public final class wi8 extends qk4 implements pi8, gce {
    public final /* synthetic */ int c;
    public mq4 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wi8(cla cla, int i) {
        super(cla);
        this.c = i;
    }

    public void b() {
        if ((get() & 54) == 0) {
            lazySet(2);
            this.a.b();
        }
    }

    public final void c(mq4 mq4) {
        switch (this.c) {
            case 0:
                if (qq4.g(this.o, mq4)) {
                    this.o = mq4;
                    this.a.c(this);
                    return;
                }
                return;
            default:
                if (qq4.g(this.o, mq4)) {
                    this.o = mq4;
                    this.a.c(this);
                    return;
                }
                return;
        }
    }

    public final void dispose() {
        switch (this.c) {
            case 0:
                super.dispose();
                this.o.dispose();
                return;
            default:
                super.dispose();
                this.o.dispose();
                return;
        }
    }

    public final void onError(Throwable th) {
        switch (this.c) {
            case 0:
                if ((get() & 54) != 0) {
                    n54.D(th);
                    return;
                }
                lazySet(2);
                this.a.onError(th);
                return;
            default:
                if ((get() & 54) != 0) {
                    n54.D(th);
                    return;
                }
                lazySet(2);
                this.a.onError(th);
                return;
        }
    }
}
