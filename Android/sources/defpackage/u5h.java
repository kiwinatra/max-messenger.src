package defpackage;

import android.os.RemoteException;
import android.util.Log;

/* renamed from: u5h  reason: default package */
public final class u5h extends a6h {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ qdf c;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u5h(a7h a7h, qdf qdf, String str, qdf qdf2) {
        super(qdf);
        this.v = a7h;
        this.o = str;
        this.c = qdf2;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.IInterface, s2h] */
    public final void a() {
        switch (this.b) {
            case 0:
                qdf qdf = this.c;
                a7h a7h = (a7h) this.v;
                String str = (String) this.o;
                try {
                    a7h.a.m.m0(a7h.b, a7h.a(a7h, str), new t6h(a7h, qdf, str));
                    return;
                } catch (RemoteException e) {
                    kn5 kn5 = a7h.e;
                    Object[] objArr = {str};
                    if (Log.isLoggable("PlayCore", 6)) {
                        kn5.e(kn5.a, "requestUpdateInfo(%s)", objArr);
                    } else {
                        kn5.getClass();
                    }
                    qdf.c(new RuntimeException(e));
                    return;
                }
            default:
                synchronized (((x7h) this.v).f) {
                    try {
                        x7h x7h = (x7h) this.v;
                        qdf qdf2 = this.c;
                        x7h.e.add(qdf2);
                        qdf2.a.i(new fdg(2, x7h, qdf2));
                        if (((x7h) this.v).k.getAndIncrement() > 0) {
                            ((x7h) this.v).b.d("Already connected to the service.", new Object[0]);
                        }
                        x7h.b((x7h) this.v, (a6h) this.o);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u5h(x7h x7h, qdf qdf, qdf qdf2, u5h u5h) {
        super(qdf);
        this.v = x7h;
        this.c = qdf2;
        this.o = u5h;
    }
}
