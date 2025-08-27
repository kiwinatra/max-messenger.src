package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: k18  reason: default package */
public final class k18 implements m18 {
    public final Context b;
    public final pwa c;
    public final jwa d;
    public final ed4 e;
    public final yaf f;

    public k18(Context context, pwa pwa, jwa jwa, ed4 ed4, yaf yaf) {
        this.b = context;
        this.c = pwa;
        this.d = jwa;
        this.e = ed4;
        this.f = yaf;
    }

    public final Notification a(long j, PendingIntent pendingIntent) {
        String str;
        this.c.c();
        pwa pwa = this.c;
        this.e.getClass();
        eda h = pwa.h(true, "ru.oneme.app.liveLocation", true);
        h.e = eda.c(this.b.getString(tmc.tt_live_location));
        yaf yaf = this.f;
        r62 r62 = (r62) yaf.b.getValue();
        if (r62 == null) {
            str = "";
        } else {
            a32 G = r62.G(j);
            if (G.N()) {
                Context context = yaf.a;
                int i = jad.h;
                G.l0();
                str = context.getString(i, new Object[]{G.X});
            } else {
                Context context2 = yaf.a;
                int i2 = jad.g;
                G.l0();
                str = context2.getString(i2, new Object[]{G.X});
            }
        }
        h.f = eda.c(str);
        h.k = 0;
        this.d.getClass();
        h.F.icon = nad.H1;
        h.g(0);
        h.p((Uri) null);
        h.i(16, false);
        h.b.add(new qca(0, this.b.getString(tmc.tt_worker_cancel), pendingIntent));
        this.c.getClass();
        h.g = ld9.x(this.b, 10, (Intent) null);
        h.v = "service";
        return h.b();
    }
}
