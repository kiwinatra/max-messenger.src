package defpackage;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: z88  reason: default package */
public final class z88 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;

    public z88(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
        this.e = lazy5;
        this.f = lazy6;
    }

    public final void a(qaf qaf) {
        ((ltb) ((jtb) this.a.getValue())).a.k("user.lastSentLogTime", 0L);
        ((ltb) ((jtb) this.a.getValue())).a.k("user.lastSentCriticalLogTime", 0L);
        z68.g("z88", "onLoginFail", qaf);
        if (Intrinsics.areEqual((Object) "login.blocked", (Object) qaf.b) || Intrinsics.areEqual((Object) "login.flood", (Object) qaf.b) || Intrinsics.areEqual((Object) "login.token", (Object) qaf.b)) {
            ((ltb) ((jtb) this.a.getValue())).a.l("server.loginError", qaf.b);
            ((doa) this.b.getValue()).h(true);
        } else if (Intrinsics.areEqual((Object) "session.state", (Object) qaf.b)) {
            String str = qaf.c;
            z68.c("z88", "session state error: " + str + " do nothing", new Object[0]);
        } else if (!(qaf instanceof aaf)) {
            if (Intrinsics.areEqual((Object) "proto.state", (Object) qaf.b)) {
                ((uta) ((m95) this.c.getValue())).c(new TamErrorException(qaf), true);
            }
            ((zbf) this.f.getValue()).g();
        } else if (((doa) this.b.getValue()).e() && ((jxd) ((hxd) this.d.getValue())).h == 2) {
            ((e98) this.e.getValue()).p();
        }
    }
}
