package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: lm5  reason: default package */
public final class lm5 {
    public final Context a;
    public final pwa b;
    public final jwa c;
    public final ed4 d;
    public final int e = tmc.tt_notification_file_downloading_title;
    public final int f = tmc.tt_worker_draft_sync;
    public final int g = tmc.tt_worker_gif_upload;
    public final int h = tmc.tt_worker_attach_upload;

    public lm5(Context context, pwa pwa, jwa jwa, ed4 ed4) {
        this.a = context;
        this.b = pwa;
        this.c = jwa;
        this.d = ed4;
    }

    public final Notification a(String str, String str2, Long l, boolean z, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        pwa pwa = this.b;
        pwa.c();
        this.d.getClass();
        eda h2 = pwa.h(true, "ru.oneme.app.fileUpload", true);
        h2.e = eda.c(str);
        h2.f = eda.c(str2);
        long longValue = l != null ? l.longValue() : 0;
        Notification notification = h2.F;
        notification.when = longValue;
        this.c.getClass();
        notification.icon = z ? nad.K1 : nad.G1;
        boolean z2 = i == -1;
        h2.o = 100;
        h2.p = i;
        h2.q = z2;
        h2.k = 0;
        h2.g(0);
        h2.p((Uri) null);
        h2.i(2, true);
        h2.i(16, false);
        h2.b.add(new qca(0, this.a.getString(tmc.tt_worker_cancel), pendingIntent2));
        h2.v = "progress";
        h2.g = pendingIntent;
        return h2.b();
    }

    public final Notification b(long j, Long l, Long l2, String str, String str2, int i, boolean z, PendingIntent pendingIntent) {
        Intent intent;
        int hashCode = Long.hashCode(j);
        long j2 = 0;
        int i2 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        pwa pwa = this.b;
        if (i2 == 0) {
            intent = pwa.f(false);
        } else {
            long longValue = l != null ? l.longValue() : 0;
            if (l2 != null) {
                j2 = l2.longValue();
            }
            pwa.getClass();
            zb8 zb8 = zb8.b;
            Long valueOf = Long.valueOf(longValue);
            Long valueOf2 = Long.valueOf(j2);
            zb8.getClass();
            intent = pwa.j(zb8.n1(j, valueOf, valueOf2));
        }
        return a(str, str2, l, z, i, ld9.x(this.a, hashCode, intent), pendingIntent);
    }
}
