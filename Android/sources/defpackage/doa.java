package defpackage;

import android.accounts.Account;
import kotlin.Lazy;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: doa  reason: default package */
public final class doa {
    public final u4 a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;

    public doa(Lazy lazy, Lazy lazy2, u4 u4Var, Lazy lazy3) {
        this.a = u4Var;
        this.b = lazy;
        this.c = lazy2;
        this.d = lazy3;
    }

    public final void a(String str, String str2, boolean z) {
        new Account(str, this.a.a);
        ((ltb) c()).d.n(b().a(), str2, z);
        b().getClass();
    }

    public final w4 b() {
        return (w4) this.c.getValue();
    }

    public final jtb c() {
        return (jtb) this.b.getValue();
    }

    public final zq0 d() {
        boolean e = e();
        boolean z = false;
        boolean c2 = ((ltb) c()).d.c("auth.account.external", false);
        if (e && c2) {
            z = true;
        }
        return new zq0(e, z);
    }

    public final boolean e() {
        if (((ltb) c()).a.s() != -1) {
            String string = ((ltb) c()).d.g.getString("auth.token", (String) null);
            if (string != null && string.length() != 0) {
                return true;
            }
            w4 b2 = b();
            b2.a();
            b2.a.getClass();
        }
        return false;
    }

    public final boolean f() {
        return e() && ((ltb) c()).d.c("auth.account.external", false);
    }

    public final String g() {
        String string;
        if (((ltb) c()).a.s() == 0 || (string = ((ltb) c()).d.g.getString("auth.token", (String) null)) == null || string.length() == 0) {
            return null;
        }
        String string2 = ((ltb) c()).d.g.getString("auth.token", (String) null);
        if (string2 != null && string2.length() != 0) {
            return string2;
        }
        w4 b2 = b();
        b2.a();
        b2.a.getClass();
        return null;
    }

    public final void h(boolean z) {
        z68.c("doa", "removeAccount", new Object[0]);
        ((ltb) c()).d.b();
        b().b();
        if (z) {
            int i = wud.o;
            boolean f = f();
            Duration.Companion companion = Duration.Companion;
            wud.c = DurationKt.toDuration(System.nanoTime(), DurationUnit.NANOSECONDS);
            ((jqg) this.d.getValue()).a(new wud(f));
        }
    }

    public final void i(String str, boolean z) {
        ((ltb) c()).d.n(b().a(), str, z);
        b().getClass();
    }
}
