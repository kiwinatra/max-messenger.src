package defpackage;

import android.content.Intent;
import android.service.notification.StatusBarNotification;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: nj0  reason: default package */
public final class nj0 implements o68 {
    public final jtb a;
    public final q68 b;

    public nj0(ltb ltb, q68 q68) {
        this.a = ltb;
        this.b = q68;
    }

    public final void a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b((ha9) it.next());
        }
    }

    public final void b(ha9 ha9) {
        l20 a2 = ha9.a(g20.v0);
        if (a2 != null && a2.n.b()) {
            if (ha9.w == ((ltb) this.a).a.s()) {
                r68 r68 = (r68) this.b;
                r68.getClass();
                r68.b.b(Long.valueOf(ha9.z ^ ha9.b).hashCode(), "NOTIFICATION_LOCATION_TIMEOUT");
            }
        }
    }

    public final void c() {
        pwa pwa = ((r68) this.b).b;
        for (StatusBarNotification id : pwa.d("NOTIFICATION_LOCATION_TIMEOUT")) {
            pwa.b(id.getId(), "NOTIFICATION_LOCATION_TIMEOUT");
        }
    }

    public final void d(long j, long j2, long j3) {
        r68 r68 = (r68) this.b;
        r68.getClass();
        z68.c("r68", "notifyLocationTimeout: chatId = %d, messageId = %d, time = %d", Long.valueOf(j), Long.valueOf(j3), Long.valueOf(j2));
        pwa pwa = r68.b;
        pwa.getClass();
        zb8 zb8 = zb8.b;
        Long valueOf = Long.valueOf(j2);
        Long valueOf2 = Long.valueOf(j3);
        zb8.getClass();
        Intent j4 = pwa.j(zb8.n1(j, valueOf, valueOf2));
        r68.c.getClass();
        eda h = pwa.h(true, "ru.oneme.app.misc", false);
        String string = r68.a.getString(tmc.tt_location_max_timeout);
        h.e(string);
        cda cda = new cda(0);
        cda.f = eda.c(string);
        h.q(cda);
        r68.b.k(h, j4, (Intent) null, Long.valueOf(j ^ j3).hashCode(), "NOTIFICATION_LOCATION_TIMEOUT");
    }
}
