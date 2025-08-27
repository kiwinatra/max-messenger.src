package defpackage;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import one.me.sdk.transfer.exceptions.TamHttpErrorException;
import one.me.sdk.transfer.exceptions.TamHttpUrlExpiredException;

/* renamed from: ecf  reason: default package */
public final /* synthetic */ class ecf implements zi6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gcf b;
    public final /* synthetic */ int c;

    public /* synthetic */ ecf(gcf gcf) {
        this.a = 4;
        this.b = gcf;
        this.c = 1;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                wv5 wv5 = (wv5) obj;
                gcf gcf = this.b;
                gcf.getClass();
                ecf ecf = new ecf(gcf, this.c, 1);
                wv5.getClass();
                int i = wv5.a;
                iq.h0(i, "maxConcurrency");
                iq.h0(i, "bufferSize");
                if (!(wv5 instanceof sdd)) {
                    return new jw5(wv5, ecf, i, i);
                }
                Object obj2 = ((sdd) wv5).get();
                return obj2 == null ? fw5.b : new zw5(obj2, ecf);
            case 1:
                Throwable th = (Throwable) obj;
                gcf gcf2 = this.b;
                gcf2.getClass();
                if (gcf.d(th) && !gcf.a(((jxd) ((hxd) gcf2.a.getValue())).h)) {
                    z68.c("gcf", "retryWhenCommonError: no connection, await for connection available", new Object[0]);
                    return new s0(new gw5(2, new iia(gcf2.b(), new dre(19), m58.f, m58.e)));
                } else if (gcf.c(th)) {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    int i2 = wv5.a;
                    lfd a2 = xfd.a();
                    Objects.requireNonNull(timeUnit, "unit is null");
                    Objects.requireNonNull(a2, "scheduler is null");
                    return new ix5(Math.max(0, (long) this.c), timeUnit, a2);
                } else {
                    int i3 = wv5.a;
                    Objects.requireNonNull(th, "throwable is null");
                    return new gw5(0, new fj6(th));
                }
            case 2:
                gcf gcf3 = this.b;
                gcf3.getClass();
                return ((jha) obj).l(new ecf(gcf3, this.c, 3));
            case 3:
                Throwable th2 = (Throwable) obj;
                gcf gcf4 = this.b;
                gcf4.getClass();
                if (gcf.d(th2) && !gcf.a(((jxd) ((hxd) gcf4.a.getValue())).h)) {
                    z68.c("gcf", "retryWhenCommonErrorObs: no connection, await for connection available", new Object[0]);
                    return new iia(gcf4.b(), new dre(21), m58.f, m58.e);
                } else if (!gcf.c(th2)) {
                    return jha.k(th2);
                } else {
                    z68.b("gcf", "retryWhenCommonErrorObs: common error", th2);
                    return jha.A((long) this.c, TimeUnit.SECONDS, xfd.a());
                }
            default:
                Throwable th3 = (Throwable) obj;
                if (!(th3 instanceof TamHttpErrorException)) {
                    return jha.k(th3);
                }
                if (th3 instanceof TamHttpUrlExpiredException) {
                    z68.f("icf", "retryWhenTamHttpError: skipped retry on TamHttpUrlExpiredException", (Throwable) null);
                    return jha.k(th3);
                }
                TamHttpErrorException tamHttpErrorException = (TamHttpErrorException) th3;
                if (b59.J(tamHttpErrorException.a)) {
                    z68.f("icf", "retryWhenTamHttpError: critical upload error=" + tamHttpErrorException, (Throwable) null);
                    return jha.k(th3);
                }
                gcf gcf5 = this.b;
                if (!gcf.a(((jxd) ((hxd) gcf5.a.getValue())).h)) {
                    z68.c("icf", "retryWhenTamHttpError: no connection, await for connection available", new Object[0]);
                    return new iia(gcf5.b(), new dre(22), m58.f, m58.e);
                }
                z68.f("icf", "retryWhenTamHttpError: http error", tamHttpErrorException);
                return jha.A((long) this.c, TimeUnit.SECONDS, xfd.a());
        }
    }

    public /* synthetic */ ecf(gcf gcf, int i, int i2) {
        this.a = i2;
        this.b = gcf;
        this.c = i;
    }
}
