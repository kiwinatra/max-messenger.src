package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: xh8  reason: default package */
public final class xh8 extends AtomicReference implements pi8, ya3, mq4, gce {
    public final /* synthetic */ int a;
    public final ya3 b;
    public final zi6 c;

    public /* synthetic */ xh8(ya3 ya3, zi6 zi6, int i) {
        this.a = i;
        this.b = ya3;
        this.c = zi6;
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                try {
                    Object apply = this.c.apply(obj);
                    Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                    ma3 ma3 = (ma3) apply;
                    if (!f()) {
                        ma3.j(this);
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
                    Objects.requireNonNull(apply2, "The mapper returned a null CompletableSource");
                    ma3 ma32 = (ma3) apply2;
                    if (!f()) {
                        ma32.j(this);
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
