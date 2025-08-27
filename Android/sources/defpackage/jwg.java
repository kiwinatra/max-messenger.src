package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* renamed from: jwg  reason: default package */
public final class jwg extends ovg {
    public final qdf b;
    public final /* synthetic */ int c;
    public final Object d;

    public jwg(int i, qdf qdf) {
        super(i);
        this.b = qdf;
    }

    private final /* bridge */ /* synthetic */ void i(m8g m8g, boolean z) {
    }

    private final /* bridge */ /* synthetic */ void j(m8g m8g, boolean z) {
    }

    public final void a(Status status) {
        this.b.c(new ApiException(status));
    }

    public final void b(RuntimeException runtimeException) {
        this.b.c(runtimeException);
    }

    public final void c(kvg kvg) {
        try {
            h(kvg);
        } catch (DeadObjectException e) {
            a(qwg.e(e));
            throw e;
        } catch (RemoteException e2) {
            a(qwg.e(e2));
        } catch (RuntimeException e3) {
            this.b.c(e3);
        }
    }

    public final /* bridge */ /* synthetic */ void d(m8g m8g, boolean z) {
        int i = this.c;
    }

    public final boolean f(kvg kvg) {
        switch (this.c) {
            case 0:
                ((wvg) this.d).a.getClass();
                return true;
            default:
                wvg wvg = (wvg) kvg.h.get((f08) this.d);
                if (wvg == null) {
                    return false;
                }
                wvg.a.getClass();
                return true;
        }
    }

    public final tj5[] g(kvg kvg) {
        switch (this.c) {
            case 0:
                ((wvg) this.d).a.getClass();
                return null;
            default:
                wvg wvg = (wvg) kvg.h.get((f08) this.d);
                if (wvg != null) {
                    wvg.a.getClass();
                }
                return null;
        }
    }

    public final void h(kvg kvg) {
        switch (this.c) {
            case 0:
                fj fjVar = ((wvg) this.d).a;
                ((t0d) ((m7h) fjVar.c).b).accept(kvg.d, this.b);
                f08 f08 = (f08) ((o15) ((wvg) this.d).a.b).c;
                if (f08 != null) {
                    kvg.h.put(f08, (wvg) this.d);
                    return;
                }
                return;
            default:
                wvg wvg = (wvg) kvg.h.remove((f08) this.d);
                qdf qdf = this.b;
                if (wvg != null) {
                    ((t0d) ((m7h) wvg.b.b).o).accept(kvg.d, qdf);
                    o15 o15 = (o15) wvg.a.b;
                    o15.b = null;
                    o15.c = null;
                    return;
                }
                qdf.d(Boolean.FALSE);
                return;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public jwg(f08 f08, qdf qdf) {
        this(4, qdf);
        this.c = 1;
        this.d = f08;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public jwg(wvg wvg, qdf qdf) {
        this(3, qdf);
        this.c = 0;
        this.d = wvg;
    }
}
