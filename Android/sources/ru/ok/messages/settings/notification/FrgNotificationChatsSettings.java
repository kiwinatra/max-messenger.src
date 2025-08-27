package ru.ok.messages.settings.notification;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import java.util.ArrayList;
import ru.ok.messages.settings.FrgBaseSettings;
import ru.ok.messages.views.dialogs.FrgDlgChatsNotification;

public class FrgNotificationChatsSettings extends FrgBaseSettings implements ch6 {
    public final hq E1 = ym.v.c().c;

    /* JADX WARNING: type inference failed for: r4v3, types: [l0g, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v7, types: [l0g, java.lang.Object] */
    public final void C(int i, Object obj) {
        int i2 = lic.setting_notification_vibrate;
        hq hqVar = this.E1;
        if (i == i2) {
            Boolean bool = (Boolean) obj;
            hqVar.i("app.notification.chats.vibrate", bool.booleanValue());
            rl d = this.q1.d();
            ? obj2 = new Object();
            obj2.n = bool;
            d.a(new n0g(obj2));
        } else if (i == lic.setting_notification_group_chats_calls) {
            int i3 = ((Boolean) obj).booleanValue() ? 1 : 2;
            hqVar.getClass();
            hqVar.l("app.group.chat.call.notification.status", wzf.e(i3));
            rl d2 = this.q1.d();
            ? obj3 = new Object();
            obj3.r = i3;
            d2.a(new n0g(obj3));
        }
    }

    public final void E(int i, Object obj) {
        if (i == lic.setting_notification_ringtone) {
            gsg.F(this, this.E1.D("app.notification.chats.ringtone"));
        } else if (i == lic.setting_notification_show_chats_msg) {
            new FrgDlgChatsNotification().Y2(N1(), "ru.ok.messages.views.dialogs.FrgDlgChatsNotification");
        }
    }

    public final String V2() {
        return "SETTINGS_CHATS_NOTIFICATIONS";
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [l0g, java.lang.Object] */
    public final void b3(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 102) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            String uri2 = uri == null ? "_NONE_" : uri.toString();
            hq hqVar = this.E1;
            hqVar.l("app.notification.chats.ringtone", uri2);
            rl d = this.q1.d();
            ? obj = new Object();
            obj.g = hqVar.D("app.notification.chats.ringtone");
            d.a(new n0g(obj));
            k3();
        }
    }

    public final ArrayList i3() {
        ArrayList arrayList = new ArrayList();
        int i = lic.setting_notification_show_chats_msg;
        String S1 = S1(qad.U5);
        Context O1 = O1();
        hq hqVar = this.E1;
        fyd fyd = new fyd(i, S1, FrgNotificationSettings.l3(hqVar.n(), O1), (String) null, (Object) null, 1);
        boolean z = true;
        fyd.X = true;
        arrayList.add(fyd);
        ((qra) ((id3) this.p1.b)).f().a().getClass();
        arrayList.add(fyd.c(lic.setting_notification_ringtone, S1(qad.K5), fhf.d(O1(), hqVar.D("app.notification.chats.ringtone"), Settings.System.DEFAULT_NOTIFICATION_URI.toString())));
        int i2 = lic.setting_notification_vibrate;
        String S12 = S1(qad.j6);
        ls7 ls7 = hqVar.g;
        arrayList.add(fyd.a(S12, i2, (String) null, ls7.getBoolean("app.notification.chats.vibrate", true)));
        String string = ls7.getString("app.group.chat.call.notification.status", (String) null);
        int a = cvg.A(string) ? 1 : wzf.a(string);
        int i3 = lic.setting_notification_group_chats_calls;
        String S13 = S1(qad.X);
        if (a != 1) {
            z = false;
        }
        arrayList.add(fyd.a(S13, i3, (String) null, z));
        return arrayList;
    }

    public final String j3() {
        return S1(qad.F5);
    }

    @oye
    public void onEvent(oe3 oe3) {
        if (this.o1) {
            k3();
        } else {
            T0(oe3);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [l0g, java.lang.Object] */
    public final void v0(int i) {
        rl d = this.q1.d();
        ? obj = new Object();
        obj.d = pid.t(i);
        d.a(new n0g(obj));
        this.E1.s(i);
        k3();
    }
}
