package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: r4c  reason: default package */
public final class r4c extends j3h {
    public static final r4c b = new j3h(8);

    public static pa4 p1(long j, long j2) {
        return new pa4(wj6.m(tr1.n(j, ":profile/edit/admin_permission?chat_id=", "&contact_id="), j2, "&permissions_type=change_admin"));
    }

    public final void n1(long j) {
        ta4 W0 = W0();
        W0.b(":profile/add-members?chat_id=" + j, (Bundle) null);
    }

    public final void o1(long j) {
        W0().b(wj6.j(j, ":chats?id=", "&type=local"), (Bundle) null);
    }

    public final void q1(long j) {
        ta4 W0 = W0();
        W0.b(":profile/invite?id=" + j, (Bundle) null);
    }

    public final void r1(long j, String str) {
        ta4 W0 = W0();
        W0.b(":profile/members?id=" + j + "&type=" + str, (Bundle) null);
    }

    public final void s1(long j) {
        ta4 W0 = W0();
        zqd zqd = new zqd(9);
        zqd.b = ":profile";
        zqd.z(Long.valueOf(j), "id");
        zqd.z("contact", "type");
        W0.c(zqd.p(), (Bundle) null);
    }

    public final void t1() {
        Activity d;
        if (!W0().d() && (d = ((bta) W0().a()).e().x().d()) != null) {
            d.finish();
        }
    }
}
