package defpackage;

import java.util.Objects;
import java.util.concurrent.CountDownLatch;

/* renamed from: ma3  reason: default package */
public abstract class ma3 {
    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.concurrent.CountDownLatch, up0, ya3] */
    public final void a() {
        ? countDownLatch = new CountDownLatch(1);
        j(countDownLatch);
        countDownLatch.d();
    }

    public final na3 f(ma3 ma3) {
        Objects.requireNonNull(ma3, "other is null");
        return new na3(0, this, ma3);
    }

    public final bb3 g(x6 x6Var) {
        return new bb3(this, m58.f, x6Var);
    }

    public final bb3 h(qk3 qk3) {
        return new bb3(this, qk3, m58.e);
    }

    public final xa3 i(lfd lfd) {
        Objects.requireNonNull(lfd, "scheduler is null");
        return new xa3(this, lfd, 0);
    }

    public final void j(ya3 ya3) {
        Objects.requireNonNull(ya3, "observer is null");
        try {
            k(ya3);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            hd8.Z(th);
            n54.D(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void k(ya3 ya3);

    public final xa3 l(lfd lfd) {
        Objects.requireNonNull(lfd, "scheduler is null");
        return new xa3(this, lfd, 1);
    }

    public final jha m() {
        return this instanceof kj6 ? ((kj6) this).d() : new gb3(0, this);
    }
}
