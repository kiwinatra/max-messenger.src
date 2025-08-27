package defpackage;

import kotlin.Lazy;
import kotlin.coroutines.jvm.internal.Boxing;
import org.apache.http.cookie.ClientCookie;

/* renamed from: coa  reason: default package */
public final class coa {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;

    public coa(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
    }

    public final x23 a() {
        return (x23) this.b.getValue();
    }

    public final Object b(String str, i98 i98) {
        String str2;
        long j;
        long o = ((qjd) a()).o();
        long j2 = ((qjd) a()).g.getLong("user.contactsLastSync", 0);
        long e = ((qjd) a()).e("user.presenceLastSync", 0);
        String name = coa.class.getName();
        String U = iq.U(Boxing.boxLong(o));
        String U2 = iq.U(Boxing.boxLong(j2));
        String U3 = iq.U(Boxing.boxLong(e));
        StringBuilder r = rae.r("LoginTamTask: chatsLastSync = ", U, ", contactLastSync = ", U2, ", presenceLastSync = ");
        r.append(U3);
        z68.c(name, r.toString(), new Object[0]);
        Lazy lazy = this.c;
        akd akd = (akd) ((bud) lazy.getValue());
        akd.getClass();
        zjd zjd = zjd.a;
        String string = akd.g.getString("hash", (String) null);
        if (((akd) ((bud) lazy.getValue())).g.getInt(ClientCookie.VERSION_ATTR, 1) < 6) {
            ((akd) ((bud) lazy.getValue())).j(6, ClientCookie.VERSION_ATTR);
            j = 0;
            str2 = null;
        } else {
            j = o;
            str2 = string;
        }
        return ((ocf) this.a.getValue()).e(new k88(str, ((fn4) this.d.getValue()).d(), j, j2, e, str2, ((qjd) a()).g.getLong("user.callsLastSync", 0), ((qjd) a()).g.getLong("app.last.login.time", 0), ((qjd) a()).g.getLong("user.draftsLastSync", -1)), i98);
    }
}
