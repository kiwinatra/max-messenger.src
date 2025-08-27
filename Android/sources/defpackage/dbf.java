package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import org.apache.http.client.methods.HttpGet;

/* renamed from: dbf  reason: default package */
public final class dbf extends kne {
    public final Lazy o;
    public rla p;
    public rla q;
    public ExecutorService r;
    public boolean s = false;

    public dbf(Lazy lazy) {
        super(5);
        this.o = lazy;
    }

    public final void F(lk5 lk5) {
        ((tla) lk5).f = SystemClock.elapsedRealtime();
    }

    public final void U(tla tla, p7d p7d, y2d y2d) {
        rla rla;
        boolean z = this.s;
        Lazy lazy = this.o;
        if (z) {
            if (this.q == null) {
                qla a = ((rla) lazy.getValue()).a();
                a.c.clear();
                this.q = new rla(a);
            }
            rla = this.q;
        } else {
            if (this.p == null) {
                this.p = (rla) lazy.getValue();
            }
            rla = this.p;
        }
        if (this.r == null) {
            this.r = ((rla) lazy.getValue()).a.s();
        }
        jtc b = rla.b(y2d);
        ((ik0) tla.b).a(new o57(this, b, false, 3));
        b.f(new eud(this, tla, p7d, y2d));
    }

    public final lk5 m(zi0 zi0, yvb yvb) {
        lk5 lk5 = new lk5(zi0, yvb);
        Object obj = ((ik0) yvb).o;
        if (obj instanceof v87) {
            ((v87) obj).getClass();
            this.s = true;
        } else {
            this.s = false;
        }
        return lk5;
    }

    public final void p(lk5 lk5, p7d p7d) {
        p7d p7d2 = p7d;
        tla tla = (tla) lk5;
        tla.d = SystemClock.elapsedRealtime();
        Uri uri = ((ik0) tla.b).a.b;
        try {
            hr6 hr6 = new hr6();
            String ex0 = new ex0(false, true, -1, -1, false, false, false, -1, -1, false, false, false, (String) null).toString();
            if (ex0.length() == 0) {
                ((e4) hr6.c).u("Cache-Control");
            } else {
                ((e4) hr6.c).y("Cache-Control", ex0);
            }
            hr6.C(uri.toString());
            ((e4) hr6.c).k("Accept", "image/webp,/;q=0.8");
            hr6.r(HttpGet.METHOD_NAME, (hd8) null);
            hr6.A(UUID.randomUUID().toString());
            U(tla, p7d2, hr6.c());
        } catch (Exception e) {
            p7d2.g(e);
        }
    }

    public final HashMap v(lk5 lk5, int i) {
        tla tla = (tla) lk5;
        HashMap hashMap = new HashMap(4);
        hashMap.put("queue_time", Long.toString(tla.e - tla.d));
        hashMap.put("fetch_time", Long.toString(tla.f - tla.e));
        hashMap.put("total_time", Long.toString(tla.f - tla.d));
        hashMap.put("image_size", Integer.toString(i));
        return hashMap;
    }
}
