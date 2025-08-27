package defpackage;

import java.util.Comparator;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: jha  reason: default package */
public abstract class jha implements oka {
    public static ala A(long j, TimeUnit timeUnit, lfd lfd) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(lfd, "scheduler is null");
        return new ala(Math.max(j, 0), timeUnit, lfd);
    }

    public static jha f(oka... okaArr) {
        int length = okaArr.length;
        jha jha = pia.a;
        if (length == 0) {
            return jha;
        }
        if (okaArr.length == 1) {
            jha jha2 = okaArr[0];
            Objects.requireNonNull(jha2, "source is null");
            return jha2 instanceof jha ? jha2 : new gb3(7, jha2);
        }
        if (okaArr.length != 0) {
            jha = okaArr.length == 1 ? q(okaArr[0]) : new gb3(4, okaArr);
        }
        return new wha(jha, (zi6) m58.c, wv5.a, 2);
    }

    public static cia k(Throwable th) {
        Objects.requireNonNull(th, "throwable is null");
        return new cia(new fj6(th), 1);
    }

    public static gb3 n(Iterable iterable) {
        Objects.requireNonNull(iterable, "source is null");
        return new gb3(5, iterable);
    }

    public static hja o(long j, long j2, TimeUnit timeUnit, lfd lfd) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(lfd, "scheduler is null");
        return new hja(Math.max(0, j), Math.max(0, j2), timeUnit, lfd);
    }

    public static hja p(long j, TimeUnit timeUnit) {
        return o(j, j, timeUnit, xfd.a());
    }

    public static ija q(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new ija(obj);
    }

    public static jha r(yia yia, jha jha) {
        return new gb3(4, new oka[]{yia, jha}).m(m58.c, 2);
    }

    public final oha B() {
        iq.h0(16, "capacityHint");
        return new oha(this);
    }

    public final wbe C(Comparator comparator) {
        return B().i(new ch2(13, comparator));
    }

    public final void a(cla cla) {
        Objects.requireNonNull(cla, "observer is null");
        try {
            w(cla);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            hd8.Z(th);
            n54.D(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final yia e(Class cls) {
        return new yia(this, new ch2(12, cls), 3);
    }

    public final jha g(zi6 zi6) {
        iq.h0(2, "bufferSize");
        if (!(this instanceof sdd)) {
            return new wha(this, zi6, 2, 1);
        }
        Object obj = ((sdd) this).get();
        return obj == null ? pia.a : new oa3(3, obj, zi6);
    }

    public final oa3 h(zi6 zi6) {
        iq.h0(2, "bufferSize");
        return new oa3(this, zi6);
    }

    public final bia i(long j, TimeUnit timeUnit) {
        lfd a = xfd.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(a, "scheduler is null");
        return new bia(this, j, timeUnit, a, 0);
    }

    public final iia j(qk3 qk3) {
        return new iia(this, m58.f, qk3, m58.e);
    }

    public final jha l(zi6 zi6) {
        return m(zi6, IntCompanionObject.MAX_VALUE);
    }

    public final jha m(zi6 zi6, int i) {
        int i2 = wv5.a;
        iq.h0(i, "maxConcurrency");
        iq.h0(i2, "bufferSize");
        if (!(this instanceof sdd)) {
            return new wha((oka) this, zi6, i, i2);
        }
        Object obj = ((sdd) this).get();
        return obj == null ? pia.a : new oa3(3, obj, zi6);
    }

    public final lja s(lfd lfd) {
        int i = wv5.a;
        Objects.requireNonNull(lfd, "scheduler is null");
        iq.h0(i, "bufferSize");
        return new lja(this, lfd, i);
    }

    public final bka t() {
        iq.h0(1, "bufferSize");
        sx6 sx6 = new sx6(16);
        AtomicReference atomicReference = new AtomicReference();
        return new bka(new yja(atomicReference, sx6), this, atomicReference, sx6);
    }

    public final dka u(long j, nsb nsb) {
        if (j >= 0) {
            return new dka(this, j, nsb);
        }
        throw new IllegalArgumentException(wj6.i(j, "times >= 0 required but it was "));
    }

    public final or7 v(qk3 qk3) {
        or7 or7 = new or7(qk3, m58.g, m58.e);
        a(or7);
        return or7;
    }

    public abstract void w(cla cla);

    public final pka x(lfd lfd) {
        Objects.requireNonNull(lfd, "scheduler is null");
        return new pka(this, lfd, 0);
    }

    public final rka y(long j) {
        if (j >= 0) {
            return new rka(this, j);
        }
        throw new IllegalArgumentException(wj6.i(j, "count >= 0 required but it was "));
    }

    public final bia z(long j, TimeUnit timeUnit) {
        lfd a = xfd.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(a, "scheduler is null");
        return new bia(this, j, timeUnit, a, 1);
    }
}
