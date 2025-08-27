package defpackage;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: jbd  reason: default package */
public abstract class jbd {
    public static final nob a = new nob((Object) xfd.b());

    public static ao1 a(x6 x6Var, lfd lfd, x6 x6Var2, qk3 qk3, lfd lfd2) {
        xa3 l = new qa3(0, new ibd(x6Var, 1)).l(lfd);
        if (lfd2 != null) {
            l = l.i(lfd2);
        }
        if (x6Var2 == null) {
            x6Var2 = new ue4(13);
        }
        ao1 ao1 = new ao1(0, qk3, x6Var2);
        l.j(ao1);
        return ao1;
    }

    public static ao1 b(Callable callable, lfd lfd, qk3 qk3, qk3 qk32, lfd lfd2) {
        fce j = new mka(1, new fbd(callable, 1)).n(lfd).j(lfd2);
        if (qk32 == null) {
            qk32 = new qbb(17);
        }
        ao1 ao1 = new ao1(3, qk3, qk32);
        j.l(ao1);
        return ao1;
    }

    public static void c(mq4 mq4) {
        if (!d(mq4)) {
            mq4.dispose();
        }
    }

    public static boolean d(mq4 mq4) {
        return mq4 == null || mq4.f();
    }

    public static or7 e(long j, x6 x6Var, ykb ykb) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        lfd a2 = xfd.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(a2, "scheduler is null");
        pia pia = pia.a;
        gga gga = m58.f;
        dj6 dj6 = m58.e;
        qbb qbb = new qbb(18);
        qk3 qk3 = ykb;
        if (ykb == null) {
            qk3 = new qbb(19);
        }
        or7 or7 = new or7(qbb, qk3, dj6);
        Objects.requireNonNull(or7, "observer is null");
        try {
            hia hia = new hia(or7, gga, gga, x6Var);
            Objects.requireNonNull(hia, "observer is null");
            pia.a(new dia(new btd(hia), j, timeUnit, a2.b()));
            return or7;
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            hd8.Z(th);
            n54.D(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
