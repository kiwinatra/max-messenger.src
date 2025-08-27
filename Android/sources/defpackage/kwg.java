package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* renamed from: kwg  reason: default package */
public final class kwg extends ovg {
    public final jb7 b;
    public final qdf c;
    public final js9 d;

    public kwg(int i, jb7 jb7, qdf qdf, js9 js9) {
        super(i);
        this.c = qdf;
        this.b = jb7;
        this.d = js9;
        if (i == 2 && jb7.a) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    public final void a(Status status) {
        this.d.getClass();
        this.c.c(b0h.r(status));
    }

    public final void b(RuntimeException runtimeException) {
        this.c.c(runtimeException);
    }

    public final void c(kvg kvg) {
        qdf qdf = this.c;
        try {
            this.b.g(kvg.d, qdf);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(qwg.e(e2));
        } catch (RuntimeException e3) {
            qdf.c(e3);
        }
    }

    public final void d(m8g m8g, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        qdf qdf = this.c;
        ((Map) m8g.b).put(qdf, valueOf);
        qdf.a.i(new n6h(m8g, qdf));
    }

    public final boolean f(kvg kvg) {
        return this.b.a;
    }

    public final tj5[] g(kvg kvg) {
        return (tj5[]) this.b.c;
    }
}
