package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: yh8  reason: default package */
public final class yh8 extends AtomicReference implements cla, pi8, mq4, gce {
    public final /* synthetic */ int a;
    public final cla b;
    public final zi6 c;

    public /* synthetic */ yh8(cla cla, zi6 zi6, int i) {
        this.a = i;
        this.b = cla;
        this.c = zi6;
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                try {
                    Object apply = this.c.apply(obj);
                    Objects.requireNonNull(apply, "The mapper returned a null Publisher");
                    oka oka = (oka) apply;
                    if (!f()) {
                        oka.a(this);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    hd8.Z(th);
                    this.b.onError(th);
                    return;
                }
            default:
                try {
                    Object apply2 = this.c.apply(obj);
                    Objects.requireNonNull(apply2, "The mapper returned a null Publisher");
                    oka oka2 = (oka) apply2;
                    if (!f()) {
                        oka2.a(this);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    hd8.Z(th2);
                    this.b.onError(th2);
                    return;
                }
        }
    }

    public final void b() {
        switch (this.a) {
            case 0:
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

    public final void dispose() {
        switch (this.a) {
            case 0:
                qq4.a(this);
                return;
            default:
                qq4.a(this);
                return;
        }
    }

    public final boolean f() {
        switch (this.a) {
            case 0:
                return qq4.b((mq4) get());
            default:
                return qq4.b((mq4) get());
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                this.b.onError(th);
                return;
            default:
                this.b.onError(th);
                return;
        }
    }
}
