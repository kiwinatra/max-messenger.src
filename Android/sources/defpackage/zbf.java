package defpackage;

import android.os.SystemClock;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.HttpStatus;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: zbf  reason: default package */
public final class zbf implements qh3, gxd {
    public static final List h = Arrays.asList(new Short[]{6, 1, 89, 5});
    public final kwd a;
    public final hs7 b;
    public final hs7 c;
    public final hs7 d;
    public final hs7 e;
    public final AtomicReference f = new AtomicReference();
    public final AtomicLong g = new AtomicLong(0);

    static {
        s9a s9a = x3b.c;
        s9a s9a2 = x3b.c;
        s9a s9a3 = x3b.c;
        s9a s9a4 = x3b.c;
    }

    public zbf(kwd kwd, hs7 hs7, hs7 hs72, hs7 hs73, hs7 hs74, hxd hxd) {
        this.a = kwd;
        this.b = hs7;
        this.c = hs72;
        this.d = hs73;
        this.e = hs74;
        ((jxd) hxd).d.add(this);
        ((nh3) hs74.get()).a().c(this);
        if (((ltb) ((jtb) hs7.get())).a.s() != -1) {
            g();
        }
    }

    public final void a() {
        e();
    }

    public final void b() {
        z68.c("zbf", "onConnectionTypeChange", new Object[0]);
        xvd xvd = (xvd) this.f.get();
        if (xvd != null) {
            hs7 hs7 = this.e;
            if (!((nh3) hs7.get()).a().e()) {
                xvd.m(false);
                xvd.f(true, false);
            } else if (((nh3) hs7.get()).g()) {
                xvd.m(true);
            }
        }
    }

    public final void c(int i) {
        AtomicReference atomicReference = this.f;
        if (i == 0) {
            z68.n("zbf", (IOException) null, "onNoNet", Arrays.copyOf(new Object[0], 0));
            xvd xvd = (xvd) atomicReference.get();
            if (xvd != null) {
                h(xvd);
            }
        } else if (i == 1) {
            z68.c("zbf", "onDisconnected", new Object[0]);
            xvd xvd2 = (xvd) atomicReference.get();
            if (xvd2 == null) {
                z68.f("zbf", "onDisconnected, has NO active session!", (Throwable) null);
            } else {
                h(xvd2);
            }
        } else if (i == 2) {
            z68.c("zbf", "onConnected", new Object[0]);
        } else if (i == 3) {
            z68.c("zbf", "onLoggedIn", new Object[0]);
        } else {
            throw new IllegalStateException(wj6.h(i, "Unknown session state="));
        }
    }

    public final boolean d(fbf fbf, s9f s9f) {
        if (!((doa) this.c.get()).f()) {
            return false;
        }
        if (!(!h.contains(Short.valueOf(fbf.N())))) {
            return false;
        }
        s9f.h(new qaf("session.forbidden.opcode.in.external.auth", "forbidden opcode in external authorization", (String) null));
        return true;
    }

    public final void e() {
        xvd xvd = (xvd) this.f.get();
        if (xvd != null) {
            hs7 hs7 = this.e;
            if (((nh3) hs7.get()).a().e() && ((nh3) hs7.get()).g()) {
                xvd.m(true);
            }
        }
    }

    public final void f() {
        xvd xvd = (xvd) this.f.get();
        if (xvd != null) {
            cud cud = ((ltb) ((jtb) this.b.get())).b;
            cud.getClass();
            int r = (int) cud.r(PmsKey.f29disconnecttimeout, (long) HttpStatus.SC_MULTIPLE_CHOICES);
            if (r > 0 && ((doa) this.c.get()).e()) {
                hs7 hs7 = this.d;
                if (!((fn4) hs7.get()).d() && !((fn4) hs7.get()).c()) {
                    ((fn4) hs7.get()).getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    AtomicLong atomicLong = this.g;
                    boolean z = elapsedRealtime - atomicLong.get() > ((long) r) * 1000;
                    if (atomicLong.get() > 0 && z && xvd.t.size() == 0) {
                        z68.c("zbf", "disconnectIfNeeded: timeout expired, disconnect", new Object[0]);
                        xvd.m(false);
                        xvd.f(true, false);
                    }
                }
            }
        }
    }

    public final void g() {
        this.f.getAndUpdate(new n01(9, this));
    }

    public final void h(xvd xvd) {
        z68.c("zbf", "updateSessionn", new Object[0]);
        hs7 hs7 = this.e;
        if (!((nh3) hs7.get()).a().e()) {
            z68.n("zbf", (IOException) null, "updateSessionn, seems there is NO net", Arrays.copyOf(new Object[0], 0));
            xvd.m(false);
        } else if (!((nh3) hs7.get()).g()) {
            z68.n("zbf", (IOException) null, "updateSessionn, connection is NOT permitted", Arrays.copyOf(new Object[0], 0));
            xvd.m(false);
        } else {
            xvd.m(true);
        }
    }
}
