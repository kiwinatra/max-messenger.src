package defpackage;

import java.util.Objects;
import java.util.concurrent.CountDownLatch;

/* renamed from: lbe  reason: default package */
public abstract class lbe {
    public static qbe g(Throwable th) {
        Objects.requireNonNull(th, "throwable is null");
        return new qbe(new fj6(th), 1);
    }

    public static mka h(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new mka(3, obj);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.concurrent.CountDownLatch, up0, gce] */
    public final Object f() {
        ? countDownLatch = new CountDownLatch(1);
        l(countDownLatch);
        return countDownLatch.d();
    }

    public final wbe i(zi6 zi6) {
        Objects.requireNonNull(zi6, "mapper is null");
        return new wbe(this, zi6, 1);
    }

    public final fce j(lfd lfd) {
        Objects.requireNonNull(lfd, "scheduler is null");
        return new fce(this, lfd, 0);
    }

    public final dx5 k(ecf ecf) {
        return new dx5(new yw5(this instanceof ij6 ? ((ij6) this).b() : new gw5(3, this), ecf, 0), 0);
    }

    public final void l(gce gce) {
        Objects.requireNonNull(gce, "observer is null");
        try {
            m(gce);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            hd8.Z(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void m(gce gce);

    public final fce n(lfd lfd) {
        Objects.requireNonNull(lfd, "scheduler is null");
        return new fce(this, lfd, 1);
    }

    public final jha o() {
        return this instanceof kj6 ? ((kj6) this).d() : new gb3(8, this);
    }
}
