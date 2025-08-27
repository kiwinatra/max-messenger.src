package com.my.tracker.obfuscated;

import android.app.PendingIntent;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicReference;

public final class h {
    private final AtomicReference a = new AtomicReference();
    protected boolean b = false;

    public static final class a {
        public static final boolean a;

        static {
            Class<kq> cls = kq.class;
            Class<jq> cls2 = jq.class;
            Class<iq> cls3 = iq.class;
            boolean z = false;
            try {
                if (cls3.equals(cls3) && cls2.equals(cls2) && cls.equals(cls)) {
                    z = true;
                }
            } catch (Throwable th) {
                x2.a("AppSetIdProvider: error occurred while working with App Set library classes", th);
            }
            a = z;
        }
    }

    private void b(Context context) {
        s7h s7h;
        p1 a2 = p1.a(context);
        String d = a2.d();
        int e = a2.e();
        if (!TextUtils.isEmpty(d)) {
            this.a.set(new g(d, e));
        }
        if (!a.a) {
            x2.a("AppSetIdProvider: app set library is not available");
            return;
        }
        try {
            m8g m8g = new m8g(context);
            j6h j6h = (j6h) m8g.a;
            if (j6h.Z.b(212800000, j6h.Y) == 0) {
                ur0 ur0 = new ur0();
                ur0.e = new tj5[]{o54.j};
                ur0.d = new p9a(j6h);
                ur0.c = false;
                ur0.b = 27601;
                s7h = j6h.c(0, ur0.a());
            } else {
                s7h = hsg.n(new ApiException(new Status(17, (String) null, (PendingIntent) null, (bi3) null)));
            }
            syc syc = new syc(15, m8g);
            s7h.getClass();
            s7h.k(xdf.a, syc).d(m.c, new vd0((Object) this, e, (Object) a2, (Object) d, 5));
        } catch (Throwable th) {
            x2.a("AppSetIdProvider: error occurred while trying to access app set id info", th);
        }
        a();
    }

    /* access modifiers changed from: private */
    public void a(int i, p1 p1Var, String str, kq kqVar) {
        int i2 = kqVar.b;
        if (i2 != i) {
            p1Var.a(i2);
        }
        String str2 = kqVar.a;
        if (!str2.equals(str)) {
            p1Var.f(str2);
            x2.a("AppSetIdProvider: new id value has been received: ".concat(str2));
        }
        if (TextUtils.isEmpty(str2) || i2 == -1) {
            this.a.set((Object) null);
        } else {
            this.a.set(new g(str2, i2));
        }
        synchronized (this.a) {
            this.a.notify();
        }
    }

    private void a() {
        try {
            g gVar = (g) this.a.get();
            if (gVar != null) {
                x2.a("AppSetIdProvider: app set id has been collected, value: " + gVar.a);
                return;
            }
            synchronized (this.a) {
                this.a.wait(300);
            }
            x2.a("AppSetIdProvider: timeout for collecting id has exceeded");
        } catch (Throwable th) {
            x2.a("AppSetIdProvider: attempt to block thread retrieving app set id finished unsuccessfully", th);
        }
    }

    public g a(Context context) {
        if (!this.b) {
            b(context);
            this.b = true;
        }
        return (g) this.a.get();
    }
}
