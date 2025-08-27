package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: oca  reason: default package */
public final class oca {
    public final Context a;
    public final jwa b;
    public final ed4 c;
    public final eta d;
    public final jtb e;
    public NotificationManager f;

    public oca(Context context, jwa jwa, ed4 ed4, eta eta, jtb jtb) {
        this.a = context;
        this.b = jwa;
        this.c = ed4;
        this.d = eta;
        this.e = jtb;
    }

    public final nca a() {
        this.c.getClass();
        return new nca("ru.oneme.app.new.activeCalls", this.a.getString(tmc.tt_notif_category_active_calls), false, false, (Uri) null, false, (long[]) null, false, 2, false);
    }

    public final nca b() {
        ltb ltb = (ltb) this.e;
        boolean z = !ltb.c.D("app.notification.chats.ringtone").equals("_NONE_");
        Uri h = h(false);
        this.c.getClass();
        return new nca("ru.oneme.app.chats", this.a.getString(tmc.tt_notif_category_chats), z, ltb.c.g.getBoolean("app.notification.chats.vibrate", true), h, ltb.c.g.getBoolean("app.notification.important.priority", true), (long[]) null, false, -1000, true);
    }

    public final nca c() {
        ltb ltb = (ltb) this.e;
        boolean z = !ltb.c.D("app.notification.ringtone").equals("_NONE_");
        Uri h = h(true);
        this.c.getClass();
        return new nca("ru.oneme.app.dialogs", this.a.getString(tmc.tt_notif_category_dialogs), z, ltb.c.C(), h, ltb.c.g.getBoolean("app.notification.important.priority", true), (long[]) null, false, -1000, true);
    }

    public final nca d() {
        this.b.getClass();
        this.c.getClass();
        return new nca("ru.oneme.app.inapp.2", this.a.getString(tmc.tt_notif_category_inapp), true, ((ltb) this.e).c.g.getBoolean("app.notification.in.app.vibrate", true), (Uri) null, false, new long[]{0, 100}, false, -1000, true);
    }

    public final void e(nca nca) {
        StringBuilder sb = new StringBuilder("createChannel: ");
        String str = nca.a;
        sb.append(str);
        z68.c("oca", sb.toString(), new Object[0]);
        int i = nca.c ? nca.f ? 4 : 3 : 2;
        int i2 = 5;
        if (nca.h) {
            i = 5;
        }
        int i3 = nca.i;
        if (i3 != -1000) {
            i = i3;
        }
        NotificationChannel notificationChannel = new NotificationChannel(str, nca.b, i);
        Uri uri = nca.e;
        if (uri != null) {
            this.c.getClass();
            boolean equals = str.equals("ru.oneme.app.new.incomingCalls.");
            AudioAttributes.Builder contentType = new AudioAttributes.Builder().setContentType(4);
            if (equals) {
                i2 = 6;
            }
            notificationChannel.setSound(uri, contentType.setUsage(i2).build());
        } else {
            notificationChannel.setSound((Uri) null, (AudioAttributes) null);
        }
        notificationChannel.enableVibration(nca.d);
        long[] jArr = nca.g;
        if (jArr != null && jArr.length > 0) {
            notificationChannel.setVibrationPattern(jArr);
        }
        notificationChannel.enableLights(true);
        this.b.c();
        notificationChannel.setLightColor(-16745729);
        String b2 = this.d.b(str);
        if (b2 != null) {
            notificationChannel.setGroup(b2);
        }
        notificationChannel.setShowBadge(nca.j);
        i().createNotificationChannel(notificationChannel);
    }

    public final void f() {
        List<NotificationChannelGroup> notificationChannelGroups;
        eta eta = this.d;
        if (eta.e == null) {
            eta.e = (NotificationManager) eta.a.getSystemService("notification");
        }
        NotificationManager notificationManager = eta.e;
        if (!(notificationManager == null || (notificationChannelGroups = notificationManager.getNotificationChannelGroups()) == null)) {
            Iterable<NotificationChannelGroup> iterable = notificationChannelGroups;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            for (NotificationChannelGroup id : iterable) {
                arrayList.add(id.getId());
            }
            if (!arrayList.contains("ru.oneme.app.notifications.group.chats")) {
                eta.a(jad.C, "ru.oneme.app.notifications.group.chats");
            }
            if (!arrayList.contains("ru.oneme.app.notifications.group.other")) {
                eta.a(jad.D, "ru.oneme.app.notifications.group.other");
            }
            if (!arrayList.contains("ru.oneme.app.notifications.group.calls")) {
                eta.a(jad.B, "ru.oneme.app.notifications.group.calls");
            }
        }
        List<NotificationChannel> notificationChannels = i().getNotificationChannels();
        HashSet hashSet = new HashSet();
        for (NotificationChannel id2 : notificationChannels) {
            hashSet.add(id2.getId());
        }
        this.c.getClass();
        if (!hashSet.contains("ru.oneme.app.chats")) {
            e(b());
            hashSet.add("ru.oneme.app.chats");
        }
        if (!hashSet.contains("ru.oneme.app.dialogs")) {
            e(c());
            hashSet.add("ru.oneme.app.dialogs");
        }
        boolean contains = hashSet.contains("ru.oneme.app.misc");
        jtb jtb = this.e;
        Context context = this.a;
        if (!contains) {
            ltb ltb = (ltb) jtb;
            e(new nca("ru.oneme.app.misc", context.getString(tmc.tt_notif_category_misc), !ltb.c.D("app.notification.ringtone").equals("_NONE_"), ltb.c.C(), h(true), false, (long[]) null, false, -1000, false));
            hashSet.add("ru.oneme.app.misc");
        }
        if (!hashSet.contains("ru.oneme.app.inapp.2")) {
            e(d());
            hashSet.add("ru.oneme.app.inapp.2");
        }
        if (!hashSet.contains("ru.oneme.app.fileUpload")) {
            e(new nca("ru.oneme.app.fileUpload", context.getString(tmc.tt_notif_category_file_loading), false, false, (Uri) null, false, (long[]) null, false, -1000, false));
            hashSet.add("ru.oneme.app.fileUpload");
        }
        if (!hashSet.contains("ru.oneme.app.media")) {
            e(new nca("ru.oneme.app.media", context.getString(tmc.tt_notif_category_media), true, false, (Uri) null, false, (long[]) null, false, -1000, false));
            hashSet.add("ru.oneme.app.media");
        }
        if (hashSet.contains("ru.oneme.app.incomingCalls")) {
            try {
                i().deleteNotificationChannel("ru.oneme.app.incomingCalls");
            } catch (Throwable unused) {
            }
        }
        if (hashSet.contains("ru.oneme.app.activeCalls")) {
            try {
                i().deleteNotificationChannel("ru.oneme.app.activeCalls");
            } catch (Throwable unused2) {
            }
        }
        if (!hashSet.contains("ru.oneme.app.new.incomingCalls.")) {
            e(new nca("ru.oneme.app.new.incomingCalls.", context.getString(tmc.tt_notif_category_incoming_calls), false, ((ltb) jtb).c.C(), (Uri) null, true, (long[]) null, true, -1000, false));
            hashSet.add("ru.oneme.app.new.incomingCalls.");
        }
        if (!hashSet.contains("ru.oneme.app.new.activeCalls")) {
            e(a());
            hashSet.add("ru.oneme.app.new.activeCalls");
        }
        if (!hashSet.contains("ru.oneme.app.liveLocation")) {
            e(new nca("ru.oneme.app.liveLocation", context.getString(tmc.tt_notif_category_live_location), false, false, (Uri) null, false, (long[]) null, false, -1000, false));
            hashSet.add("ru.oneme.app.liveLocation");
        }
    }

    public final NotificationChannel g(String str) {
        if (cvg.A(str)) {
            return null;
        }
        for (NotificationChannel next : i().getNotificationChannels()) {
            if (str.equals(next.getId())) {
                return next;
            }
        }
        return null;
    }

    public final Uri h(boolean z) {
        ltb ltb = (ltb) this.e;
        String D = z ? ltb.c.D("app.notification.ringtone") : ltb.c.D("app.notification.chats.ringtone");
        if (!"DEFAULT".equals(D)) {
            return Uri.parse(D);
        }
        this.b.getClass();
        return Settings.System.DEFAULT_NOTIFICATION_URI;
    }

    public final NotificationManager i() {
        if (this.f == null) {
            this.f = (NotificationManager) this.a.getSystemService("notification");
        }
        return this.f;
    }
}
