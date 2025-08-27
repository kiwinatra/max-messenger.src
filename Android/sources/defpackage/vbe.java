package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: vbe  reason: default package */
public final class vbe extends AtomicReference implements gce, mq4 {
    public final /* synthetic */ int a;
    public final gce b;
    public final zi6 c;

    public /* synthetic */ vbe(int i, zi6 zi6, gce gce) {
        this.a = i;
        this.b = gce;
        this.c = zi6;
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                gce gce = this.b;
                try {
                    Object apply = this.c.apply(obj);
                    Objects.requireNonNull(apply, "The single returned by the mapper is null");
                    lbe lbe = (lbe) apply;
                    if (!f()) {
                        lbe.l(new fj(22, (Object) this, (Object) gce));
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    hd8.Z(th);
                    gce.onError(th);
                    return;
                }
            default:
                this.b.a(obj);
                return;
        }
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
                gce gce = this.b;
                try {
                    Object apply = this.c.apply(th);
                    Objects.requireNonNull(apply, "The nextFunction returned a null SingleSource.");
                    ((lbe) apply).l(new ui8((AtomicReference) this, gce));
                    return;
                } catch (Throwable th2) {
                    hd8.Z(th2);
                    gce.onError(new CompositeException(th, th2));
                    return;
                }
        }
    }
}
