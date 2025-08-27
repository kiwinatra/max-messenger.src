package defpackage;

import android.content.Context;
import android.util.ArrayMap;
import java.util.HashMap;

/* renamed from: a33  reason: default package */
public final class a33 extends qjd {
    public final boolean l = false;
    public volatile Boolean m = null;

    public a33(Context context, tn4 tn4, fn5 fn5) {
        super(context, fn5);
        this.j = tn4;
    }

    public final String A() {
        return f("server.port", this.l ? "443" : null);
    }

    public final long B() {
        return e("app.stats.session.id", 0);
    }

    public final boolean C() {
        if (this.m == null) {
            this.m = Boolean.valueOf(this.g.getBoolean("ok_push_disabled", false));
        }
        try {
            return this.m.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public final void b() {
        String z = z();
        String A = A();
        boolean c = c("server.useTls", true);
        ls7 ls7 = this.g;
        String string = ls7.getString("server.loginError", (String) null);
        String string2 = ls7.getString("device.id", (String) null);
        String string3 = ls7.getString("user.Phone.Code", (String) null);
        String f = f("user.Phone", (String) null);
        String string4 = ls7.getString("app.lastSuccessProxy", (String) null);
        String string5 = ls7.getString("app.currentProxyList", (String) null);
        int i = ls7.getInt("app.currentProxyListTtl", 299);
        String str = string5;
        boolean z2 = ls7.getBoolean("app.debugHostRotation", false);
        boolean z3 = ls7.getBoolean("app.debugUaDnsEmulation", false);
        String q = q();
        String f2 = f("app.tenor.anon.id", "");
        boolean z4 = z2;
        long j = ls7.getLong("app.last.push.state.time", 0);
        this.j.getClass();
        h2g h2g = h2g.a;
        h2g.c().getClass();
        long B = B();
        h2g h2g2 = h2g;
        ArrayMap arrayMap = new ArrayMap(1);
        ((HashMap) ls7.getAll()).forEach(new y23(0, arrayMap));
        super.b();
        l("server.host", z);
        l("server.port", A);
        i("server.useTls", c);
        l("server.loginError", string);
        l("device.id", string2);
        l("user.Phone.Code", string3);
        l("user.Phone", f);
        l("app.lastSuccessProxy", string4);
        l("app.currentProxyList", str);
        j(i, "app.currentProxyListTtl");
        i("app.debugHostRotation", z4);
        i("app.debugUaDnsEmulation", z3);
        l("user.lang", q);
        l("user.systemLang", ls7.getString("user.systemLang", (String) null));
        l("app.tenor.anon.id", f2);
        String str2 = "app.last.push.state.time";
        k(str2, Long.valueOf(j));
        this.j.getClass();
        h2g2.c().getClass();
        k("app.stats.session.id", Long.valueOf(B));
        arrayMap.forEach(new z23(0, this));
    }

    public final boolean c(String str, boolean z) {
        return this.g.getBoolean(str, z);
    }

    public final String z() {
        return f("server.host", this.l ? "api.oneme.ru" : null);
    }
}
