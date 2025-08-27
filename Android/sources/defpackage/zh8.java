package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: zh8  reason: default package */
public final class zh8 extends AtomicReference implements pi8, mq4, gce {
    public final /* synthetic */ int a;
    public final pi8 b;
    public final zi6 c;

    public /* synthetic */ zh8(pi8 pi8, zi6 zi6, int i) {
        this.a = i;
        this.b = pi8;
        this.c = zi6;
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                try {
                    Object apply = this.c.apply(obj);
                    Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                    lbe lbe = (lbe) apply;
                    if (!f()) {
                        lbe.l(new p7d(16, (Object) this, (Object) this.b));
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    hd8.Z(th);
                    onError(th);
                    return;
                }
            default:
                try {
                    Object apply2 = this.c.apply(obj);
                    Objects.requireNonNull(apply2, "The mapper returned a null MaybeSource");
                    ti8 ti8 = (ti8) apply2;
                    if (!f()) {
                        ti8.a(new xe8(25, this, this.b));
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    hd8.Z(th2);
                    onError(th2);
                    return;
                }
        }
    }

    public void b() {
        this.b.b();
    }

    public final void c(mq4 mq4) {
        switch (this.a) {
            case 0:
                if (qq4.e(this, mq4)) {
                    this.b.c(this);
                    return;
                }
                return;
            default:
                if (qq4.e(this, mq4)) {
                    this.b.c(this);
                    return;
                }
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
