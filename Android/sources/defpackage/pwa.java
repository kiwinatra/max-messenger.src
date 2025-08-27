package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import one.me.android.MainActivity;
import ru.ok.tamtam.android.services.NotificationTamService;

/* renamed from: pwa  reason: default package */
public final class pwa {
    public final Context a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public tea h;
    public NotificationManager i;
    public final String j;
    public final String k;

    public pwa(String str, String str2, Context context, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6) {
        this.a = context;
        this.d = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.e = lazy4;
        this.f = lazy6;
        this.g = lazy5;
        c();
        this.j = str;
        this.k = str2;
    }

    public final void a(int i2) {
        ((jwa) this.d.getValue()).getClass();
        b(i2, (String) null);
    }

    public final void b(int i2, String str) {
        Locale locale = Locale.ENGLISH;
        z68.c("pwa", "cancel: notificationId = " + i2 + ", notificationTag = " + str, new Object[0]);
        i(true).b.cancel(str, i2);
    }

    public final void c() {
        try {
            ((oca) this.e.getValue()).f();
        } catch (Throwable th) {
            z68.f("pwa", "fail to create missing channels", th);
            ((m95) this.f.getValue()).a(th);
        }
    }

    public final List d(String str) {
        try {
            if (this.i == null) {
                this.i = (NotificationManager) this.a.getSystemService("notification");
                c();
            }
            List asList = Arrays.asList(this.i.getActiveNotifications());
            if (cvg.A(str)) {
                return asList;
            }
            if ((asList instanceof Collection) && asList.isEmpty()) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (Object next : asList) {
                try {
                    if (str.equals(((StatusBarNotification) next).getTag())) {
                        arrayList.add(next);
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return Collections.emptyList();
        }
    }

    public final pca e(yk2 yk2, int i2, int i3) {
        int i4 = NotificationTamService.X;
        Context context = this.a;
        Intent intent = new Intent(context, NotificationTamService.class);
        intent.setAction("ru.ok.tamtam.action.DIRECT_REPLY");
        intent.putExtra("ru.ok.tamtam.extra.CHAT_SERVER_ID", yk2.c);
        intent.putExtra("ru.ok.tamtam.extra.PUSH_ID", yk2.a);
        intent.putExtra("ru.ok.tamtam.extra.EVENT_KEY", yk2.b);
        intent.putExtra("ru.ok.tamtam.extra.MESSAGE_SERVER_ID", yk2.l);
        PendingIntent service = PendingIntent.getService(context, i2, intent, ld9.W(ld9.v(134217728), intent));
        HashSet hashSet = new HashSet();
        a1d a1d = new a1d("ru.ok.tamtam.extra.TEXT_REPLY", context.getString(tmc.tt_reply), (CharSequence[]) null, true, 0, new Bundle(), hashSet);
        pca pca = new pca(i3, context.getString(tmc.tt_reply), service);
        pca.f = new ArrayList();
        pca.f.add(a1d);
        pca.g = 1;
        pca.h = false;
        return pca;
    }

    public final Intent f(boolean z) {
        zb8.b.getClass();
        Intent j2 = j(zb8.o1((String) null, z));
        if (z) {
            j2.putExtra("push_action", "push_action_open_chats");
        }
        return j2;
    }

    public final pca g(yk2 yk2, int i2, int i3) {
        int i4 = NotificationTamService.X;
        Context context = this.a;
        Intent intent = new Intent(context, NotificationTamService.class);
        intent.setAction("ru.ok.tamtam.action.MARK_AS_READ");
        intent.putExtra("ru.ok.tamtam.extra.CHAT_SERVER_ID", yk2.c);
        intent.putExtra("ru.ok.tamtam.extra.MARK", yk2.m);
        intent.putExtra("ru.ok.tamtam.extra.PUSH_ID", yk2.a);
        intent.putExtra("ru.ok.tamtam.extra.EVENT_KEY", yk2.b);
        intent.putExtra("ru.ok.tamtam.extra.MESSAGE_SERVER_ID", yk2.l);
        pca pca = new pca(i3, context.getString(tmc.tt_mark_as_read), PendingIntent.getService(context, i2, intent, ld9.W(ld9.v(201326592), intent)));
        pca.g = 2;
        pca.h = false;
        return pca;
    }

    public final eda h(boolean z, String str, boolean z2) {
        String str2;
        boolean z3;
        Uri uri;
        c();
        eda eda = new eda(this.a, str);
        Lazy lazy = this.d;
        ((jwa) lazy.getValue()).getClass();
        eda.F.icon = sfc.ic_notification;
        ((jwa) lazy.getValue()).c();
        eda.x = -16745729;
        eda.i(16, true);
        eda.f(((jwa) lazy.getValue()).a.getString(rkc.oneme_app_name));
        eda.z = str;
        hq hqVar = ((ltb) ((jtb) this.b.getValue())).c;
        Lazy lazy2 = this.c;
        if (((udg) ((xq) lazy2.getValue())).c()) {
            z3 = hqVar.g.getBoolean("app.notification.in.app.vibrate", true);
            str2 = hqVar.c("app.notification.in.app.sound", true) ? hqVar.D("app.notification.ringtone") : null;
        } else {
            z3 = hqVar.C();
            str2 = hqVar.D("app.notification.ringtone");
        }
        int i2 = 0;
        boolean z4 = hqVar.g.getBoolean("app.notification.important.priority", true) && !((udg) ((xq) lazy2.getValue())).c();
        int d2 = hqVar.d("app.notification.led.color", hqVar.v());
        if (z) {
            if (z3) {
                i2 = 2;
            } else {
                eda.F.vibrate = new long[0];
            }
            if (str2 == null || "_NONE_".equals(str2)) {
                eda.p((Uri) null);
            } else {
                if ("DEFAULT".equals(str2)) {
                    ((jwa) lazy.getValue()).getClass();
                    uri = Settings.System.DEFAULT_NOTIFICATION_URI;
                } else {
                    uri = Uri.parse(str2);
                }
                eda.p(uri);
            }
            eda.g(i2);
        }
        if (d2 != 0) {
            Notification notification = eda.F;
            notification.ledARGB = d2;
            notification.ledOnMS = 1000;
            notification.ledOffMS = 1000;
            notification.flags = (notification.flags & -2) | 1;
        }
        if (z4) {
            eda.k = 2;
        }
        eda.u = z2;
        return eda;
    }

    public final tea i(boolean z) {
        if (this.h == null) {
            this.h = new tea(this.a);
        }
        if (z) {
            c();
        }
        return this.h;
    }

    public final Intent j(pa4 pa4) {
        zb8.b.getClass();
        Context context = this.a;
        String str = this.j;
        String str2 = this.k;
        Intent intent = new Intent(context, MainActivity.class);
        intent.setAction("CUSTOM_DEEP_LINK");
        zb8.b.getClass();
        intent.setData(Uri.parse(str + "://" + str2 + "/" + pa4.b));
        return intent;
    }

    public final void k(eda eda, Intent intent, Intent intent2, int i2, String str) {
        Context context = this.a;
        eda.g = ld9.x(context, i2, intent);
        if (intent2 != null) {
            eda.F.deleteIntent = PendingIntent.getService(context, i2, intent2, ld9.W(ld9.v(134217728), intent2));
        }
        Notification b2 = eda.b();
        ((jwa) this.d.getValue()).getClass();
        i(true).a(str, i2, b2);
        z68.l("pwa", "notify: tag = %s, id = %d, %s", str, Integer.valueOf(i2), b2);
    }

    public final void l() {
        try {
            oca oca = (oca) this.e.getValue();
            oca.c.getClass();
            NotificationChannel g2 = oca.g("ru.oneme.app.new.activeCalls");
            nca a2 = oca.a();
            if (g2 == null) {
                oca.e(a2);
            } else if (!(g2.getSound() == null && !g2.shouldVibrate() && g2.getAudioAttributes() == null && g2.getImportance() == 2)) {
                oca.i().deleteNotificationChannel("ru.oneme.app.new.activeCalls");
                oca.e(a2);
            }
            z68.c("pwa", "recreateActiveCallChannelIfNeeded: created = $created", new Object[0]);
        } catch (Throwable th) {
            z68.f("pwa", "recreateActiveCallChannelIfNeeded", th);
        }
    }
}
