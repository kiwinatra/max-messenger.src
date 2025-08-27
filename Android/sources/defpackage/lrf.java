package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: lrf  reason: default package */
public final class lrf {
    public final Context a;
    public final hrf b;
    public final boolean c = false;
    public final boolean d = false;
    public final long e;
    public final m56 f;
    public final tt g;
    public final wc8 h;
    public final v5g i;
    public final f43 j;
    public final b0a k;
    public final Looper l;
    public final rx0 m;
    public final c7f n;
    public final k7f o;
    public final bpa p;
    public final wd5 q;
    public prf r;
    public g0a s;
    public gd3 t;
    public String u;
    public int v;
    public ru9 w;

    static {
        cs8.a("media3.transformer");
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [wd5, java.lang.Object] */
    public lrf(Context context, hrf hrf, long j2, m56 m56, wc8 wc8, fk4 fk4, cf4 cf4, wie wie, Looper looper) {
        rx0 rx0 = rx0.o;
        c7f c7f = c7f.a;
        this.a = context;
        this.b = hrf;
        this.e = j2;
        this.f = m56;
        this.g = null;
        this.h = wc8;
        this.i = fk4;
        this.j = cf4;
        this.k = wie;
        this.l = looper;
        this.m = rx0;
        this.n = c7f;
        this.v = 0;
        this.o = c7f.a(looper, (Handler.Callback) null);
        this.p = new bpa(11, this);
        ? obj = new Object();
        obj.b();
        this.q = obj;
    }

    public static void a(lrf lrf) {
        lrf.v = 0;
        gd3 gd3 = lrf.t;
        gd3.getClass();
        String str = lrf.u;
        str.getClass();
        lrf lrf2 = lrf;
        lrf2.f(gd3, new g0a(str, lrf.k, lrf.p, 0, false, (ea6) null, lrf.e), lrf.p, 0);
    }

    public static void b(lrf lrf) {
        lrf.getClass();
        jrf jrf = new jrf(0, (Object) lrf);
        m56 m56 = lrf.f;
        m56.j(-1, jrf);
        m56.h();
        lrf.v = 0;
    }

    public final void c() {
        g();
        prf prf = this.r;
        if (prf != null) {
            try {
                if (!prf.z) {
                    prf.g();
                    prf.j.b((Object) null, 4, 1, 0).b();
                    prf.g.getClass();
                    prf.p.b();
                    prf.p.c();
                    RuntimeException runtimeException = prf.w;
                    if (runtimeException != null) {
                        throw runtimeException;
                    }
                }
            } finally {
                this.r = null;
            }
        }
    }

    public final int d(jq5 jq5) {
        int e2;
        g();
        int i2 = this.v;
        if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
            return 3;
        }
        if (i2 == 5 || i2 == 6) {
            if (this.w != null) {
                gd3 gd3 = this.t;
                n79.j(gd3);
                long j2 = ((e05) ((f05) gd3.a.get(0)).a.get(0)).a.e.b;
                ru9 ru9 = this.w;
                float f2 = ((float) (ru9.b - j2)) / ((float) ru9.a);
                if (this.v == 5) {
                    prf prf = this.r;
                    if (!(prf == null || (e2 = prf.e(jq5)) == 0 || e2 == 1)) {
                        if (e2 == 2) {
                            jq5.b = Math.round(((float) jq5.b) * f2);
                        } else if (e2 == 3) {
                            return 3;
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                } else {
                    float f3 = 100.0f * f2;
                    prf prf2 = this.r;
                    if (prf2 == null) {
                        jq5.b = Math.round(f3);
                    } else {
                        int e3 = prf2.e(jq5);
                        if (e3 == 0 || e3 == 1) {
                            jq5.b = Math.round(f3);
                        } else if (e3 == 2) {
                            jq5.b = Math.round(((1.0f - f2) * ((float) jq5.b)) + f3);
                        } else if (e3 == 3) {
                            return 3;
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                }
                return 2;
            }
            return 1;
        }
        prf prf3 = this.r;
        if (prf3 == null) {
            return 0;
        }
        return prf3.e(jq5);
    }

    public final void e(gd3 gd3, String str) {
        g();
        this.t = gd3;
        this.u = str;
        this.q.b();
        if (this.c) {
            gd3 gd32 = this.t;
            n79.j(gd32);
            if (gd32.a.size() <= 1 && ((f05) this.t.a.get(0)).a.size() <= 1) {
                this.v = 5;
                gd3 gd33 = this.t;
                n79.j(gd33);
                e05 e05 = (e05) ((f05) gd33.a.get(0)).a.get(0);
                ir8 ir8 = e05.a;
                sq8 sq8 = ir8.e;
                long j2 = sq8.b;
                xq8 xq8 = ir8.b;
                n79.j(xq8);
                byd o2 = gsg.o(this.a, j2, xq8.a.toString());
                vy vyVar = new vy(this, sq8.d, j2, e05);
                k7f k7f = this.o;
                Objects.requireNonNull(k7f);
                o5a.b(o2, vyVar, new zc3(k7f, 1));
                return;
            }
        }
        String str2 = str;
        gd3 gd34 = gd3;
        f(gd34, new g0a(str2, this.k, this.p, 0, this.d, (ea6) null, this.e), this.p, 0);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [ni3, java.lang.Object] */
    public final void f(gd3 gd3, g0a g0a, bpa bpa, long j2) {
        gd3 gd32 = gd3;
        n79.m("There is already an export in progress.", this.r == null);
        hrf hrf = this.b;
        if (gd32.g != 0) {
            yy a2 = hrf.a();
            a2.b = gd32.g;
            hrf = a2.a();
        }
        hrf hrf2 = hrf;
        m56 m56 = this.f;
        k7f k7f = this.o;
        ? obj = new Object();
        obj.a = gd32;
        obj.b = m56;
        obj.c = k7f;
        obj.d = hrf2;
        obj.f = hrf2;
        obj.e = new AtomicInteger();
        tt ttVar = this.g;
        if (ttVar == null) {
            Context context = this.a;
            ttVar = new d23(context, new m7h(context), this.n);
        }
        tt ttVar2 = ttVar;
        LinkedHashMap linkedHashMap = p94.a;
        synchronized (p94.class) {
            p94.a.clear();
            SystemClock.elapsedRealtime();
        }
        prf prf = r1;
        prf prf2 = new prf(this.a, gd3, hrf2, ttVar2, this.h, this.i, this.j, g0a, bpa, obj, this.o, this.m, this.n, j2);
        prf prf3 = prf;
        this.r = prf3;
        prf3.g();
        prf3.j.f(1);
        synchronized (prf3.r) {
            prf3.x = 1;
            prf3.y = 0;
        }
    }

    public final void g() {
        if (Looper.myLooper() != this.l) {
            throw new IllegalStateException("Transformer is accessed on the wrong thread.");
        }
    }
}
