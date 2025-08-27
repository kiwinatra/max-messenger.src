package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: kwd  reason: default package */
public final class kwd {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public static mz8 e(j3h j3h, tb7 tb7, mz8 mz8, dkf dkf) {
        ikf V0 = j3h.V0();
        int x = j3h.x();
        Object m = V0.q() ? null : V0.m(x);
        int b2 = (j3h.k() || V0.q()) ? -1 : V0.f(x, dkf).b(t0g.D(j3h.h()) - dkf.f());
        for (int i = 0; i < tb7.size(); i++) {
            mz8 mz82 = (mz8) tb7.get(i);
            if (f(mz82, m, j3h.k(), j3h.c0(), j3h.I(), b2)) {
                return mz82;
            }
        }
        if (tb7.isEmpty() && mz8 != null) {
            if (f(mz8, m, j3h.k(), j3h.c0(), j3h.I(), b2)) {
                return mz8;
            }
        }
        return null;
    }

    public static boolean f(mz8 mz8, Object obj, boolean z, int i, int i2, int i3) {
        if (!mz8.a.equals(obj)) {
            return false;
        }
        int i4 = mz8.b;
        return (z && i4 == i && mz8.c == i2) || (!z && i4 == -1 && mz8.e == i3);
    }

    public void a(cs csVar, mz8 mz8, ikf ikf) {
        if (mz8 != null) {
            if (ikf.b(mz8.a) != -1) {
                csVar.F(mz8, ikf);
                return;
            }
            ikf ikf2 = (ikf) ((wb7) this.c).get(mz8);
            if (ikf2 != null) {
                csVar.F(mz8, ikf2);
            }
        }
    }

    public dc0 b() {
        String str = ((lk4) this.a) == null ? " surface" : "";
        if (((List) this.b) == null) {
            str = str.concat(" sharedSurfaces");
        }
        if (((Integer) this.d) == null) {
            str = tr1.j(str, " mirrorMode");
        }
        if (((Integer) this.e) == null) {
            str = tr1.j(str, " surfaceGroupId");
        }
        if (((vy4) this.f) == null) {
            str = tr1.j(str, " dynamicRange");
        }
        if (str.isEmpty()) {
            return new dc0((lk4) this.a, (List) this.b, (String) this.c, ((Integer) this.d).intValue(), ((Integer) this.e).intValue(), (vy4) this.f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public dfb c() {
        return new dfb((Uri) this.a, (Uri) this.b, (d44) this.c, (h05) this.d, (Uri) this.e, (Uri) this.f);
    }

    public s7h d(s7h s7h) {
        return s7h.j(new fs(2), new lc5(20, (Object) this));
    }

    public void g(Bundle bundle, String str, String str2) {
        int i;
        String str3;
        String str4;
        boolean g;
        int i2;
        PackageInfo packageInfo;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        hp5 hp5 = (hp5) this.a;
        hp5.a();
        bundle.putString("gmp_app_id", hp5.c.b);
        jv3 jv3 = (jv3) this.b;
        synchronized (jv3) {
            try {
                if (jv3.c == 0) {
                    packageInfo = ((Context) jv3.b).getPackageManager().getPackageInfo("com.google.android.gms", 0);
                    if (packageInfo != null) {
                        jv3.c = packageInfo.versionCode;
                    }
                }
            } catch (PackageManager.NameNotFoundException e2) {
                e2.toString();
                packageInfo = null;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
            i = jv3.c;
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((jv3) this.b).d());
        jv3 jv32 = (jv3) this.b;
        synchronized (jv32) {
            try {
                if (((String) jv32.w) == null) {
                    jv32.h();
                }
                str3 = (String) jv32.w;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        bundle.putString("app_ver_name", str3);
        hp5 hp52 = (hp5) this.a;
        hp52.a();
        try {
            str4 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(hp52.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str4 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str4);
        try {
            String str5 = ((fb0) hsg.c(((lp5) ((mp5) this.f)).d())).a;
            if (!TextUtils.isEmpty(str5)) {
                bundle.putString("Goog-Firebase-Installations-Auth", str5);
            }
        } catch (InterruptedException | ExecutionException unused2) {
        }
        bundle.putString("appid", (String) hsg.c(((lp5) ((mp5) this.f)).c()));
        bundle.putString("cliv", "fcm-24.0.1");
        ux6 ux6 = (ux6) ((m9c) this.e).get();
        tj4 tj4 = (tj4) ((m9c) this.d).get();
        if (ux6 != null && tj4 != null) {
            pf4 pf4 = (pf4) ux6;
            synchronized (pf4) {
                long currentTimeMillis = System.currentTimeMillis();
                vx6 vx6 = (vx6) pf4.a.get();
                synchronized (vx6) {
                    g = vx6.g(currentTimeMillis);
                }
                if (g) {
                    synchronized (vx6) {
                        String d2 = vx6.d(System.currentTimeMillis());
                        vx6.a.edit().putString("last-used-date", d2).commit();
                        vx6.f(d2);
                    }
                    i2 = 3;
                } else {
                    i2 = 1;
                }
            }
            if (i2 != 1) {
                bundle.putString("Firebase-Client-Log-Type", Integer.toString(tr1.y(i2)));
                bundle.putString("Firebase-Client", tj4.a());
            }
        }
    }

    public s7h h(Bundle bundle, String str, String str2) {
        int i;
        try {
            g(bundle, str, str2);
            m9d m9d = (m9d) this.c;
            ila ila = m9d.c;
            int g = ila.g();
            ep4 ep4 = ep4.o;
            if (g < 12000000) {
                return ila.h() != 0 ? m9d.a(bundle).k(ep4, new o9g(m9d, bundle)) : hsg.n(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            m7h g2 = m7h.g(m9d.b);
            synchronized (g2) {
                i = g2.c;
                g2.c = i + 1;
            }
            return g2.h(new w6h(i, 1, bundle, 1)).j(ep4, nfd.Y);
        } catch (InterruptedException | ExecutionException e2) {
            return hsg.n(e2);
        }
    }

    public void i(ikf ikf) {
        cs a2 = wb7.a();
        if (((tb7) this.b).isEmpty()) {
            a(a2, (mz8) this.e, ikf);
            if (!cjf.n((mz8) this.f, (mz8) this.e)) {
                a(a2, (mz8) this.f, ikf);
            }
            if (!cjf.n((mz8) this.d, (mz8) this.e) && !cjf.n((mz8) this.d, (mz8) this.f)) {
                a(a2, (mz8) this.d, ikf);
            }
        } else {
            for (int i = 0; i < ((tb7) this.b).size(); i++) {
                a(a2, (mz8) ((tb7) this.b).get(i), ikf);
            }
            if (!((tb7) this.b).contains((mz8) this.d)) {
                a(a2, (mz8) this.d, ikf);
            }
        }
        this.c = a2.h();
    }
}
