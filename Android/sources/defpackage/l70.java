package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: l70  reason: default package */
public final class l70 implements iha {
    public final /* synthetic */ c65 a;
    public final /* synthetic */ m70 b;

    public l70(m70 m70, c65 c65) {
        this.b = m70;
        this.a = c65;
    }

    public final void a(Object obj) {
        du0 du0 = (du0) obj;
        Objects.requireNonNull(du0);
        m70 m70 = this.b;
        if (m70.l == this.a) {
            Objects.toString(m70.h);
            du0.toString();
            if (m70.h != du0) {
                m70.h = du0;
                m70.d();
            }
        }
    }

    public final void onError(Throwable th) {
        m70 m70 = this.b;
        if (m70.l == this.a) {
            Executor executor = m70.j;
            wsb wsb = m70.k;
            if (executor != null && wsb != null) {
                executor.execute(new c(9, wsb, th));
            }
        }
    }
}
