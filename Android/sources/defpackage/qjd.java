package defpackage;

import android.content.Context;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: qjd  reason: default package */
public abstract class qjd extends y2 implements x23 {
    public final om0 h = om0.H();
    public volatile jz2 i;
    public tn4 j;
    public Locale k;

    public qjd(Context context, fn5 fn5) {
        super(context, "user.prefs", fn5);
    }

    public synchronized void b() {
        super.b();
        this.i = null;
        this.h.d(Long.valueOf(s()));
    }

    public final long m() {
        return e("server.timeDelta", 0) + System.currentTimeMillis();
    }

    public final synchronized long n() {
        jz2 jz2;
        try {
            if (this.i == null) {
                this.i = new jz2(new ifb(25, this), new y3a(26, (Object) this));
            }
            jz2 = this.i;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return jz2.b + ((long) ((AtomicInteger) jz2.c).getAndIncrement());
    }

    public final long o() {
        return e("user.chatsLastSync", 0);
    }

    public final String p() {
        return this.g.getString("user.deviceAvatarPath", (String) null);
    }

    public final String q() {
        return f("user.lang", "ru");
    }

    public final long r() {
        return this.g.getLong("user.stickersLastSync", 0);
    }

    public final long s() {
        return e("user.Id", -1);
    }

    public final jha t() {
        aja aja = new aja(0, new ivc(1, this));
        om0 om0 = this.h;
        om0.getClass();
        return jha.f(aja, om0);
    }

    public final Locale u() {
        if (this.k == null) {
            this.k = new Locale(q());
        }
        return this.k;
    }

    public final void v(long j2) {
        if (j2 > o()) {
            z68.c(this.e, "setChatsLastSync %d", Long.valueOf(j2));
            k("user.chatsLastSync", Long.valueOf(j2));
        }
    }

    public final void w(boolean z) {
        i("app.forceConnection", z);
    }

    public final void x(long j2) {
        k("app.last.login.time", Long.valueOf(j2));
    }

    public final void y(Long l) {
        k("user.Id", l);
        this.h.d(l);
    }
}
