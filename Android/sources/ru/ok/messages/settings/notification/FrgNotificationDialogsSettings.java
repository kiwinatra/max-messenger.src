package ru.ok.messages.settings.notification;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import java.util.ArrayList;
import ru.ok.messages.settings.FrgBaseSettings;

public class FrgNotificationDialogsSettings extends FrgBaseSettings {
    public final hq E1 = ym.v.c().c;

    /* JADX WARNING: type inference failed for: r2v2, types: [l0g, java.lang.Object] */
    public final void C(int i, Object obj) {
        if (i == lic.setting_notification_vibrate) {
            Boolean bool = (Boolean) obj;
            this.E1.i("app.notification.vibrate", bool.booleanValue());
            rl e = ((qra) ym.e()).e();
            ? obj2 = new Object();
            obj2.l = bool;
            e.a(new n0g(obj2));
        }
    }

    public final void E(int i, Object obj) {
        if (i == lic.setting_notification_ringtone) {
            gsg.F(this, this.E1.D("app.notification.ringtone"));
        }
    }

    public final String V2() {
        return "SETTINGS_DIALOGS_NOTIFICATIONS";
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [l0g, java.lang.Object] */
    public final void b3(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 102) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            String uri2 = uri == null ? "_NONE_" : uri.toString();
            hq hqVar = this.E1;
            hqVar.l("app.notification.ringtone", uri2);
            rl e = ((qra) ym.e()).e();
            ? obj = new Object();
            obj.e = hqVar.D("app.notification.ringtone");
            e.a(new n0g(obj));
            k3();
        }
    }

    public final ArrayList i3() {
        ArrayList arrayList = new ArrayList();
        ((qra) ((id3) this.p1.b)).f().a().getClass();
        String uri = Settings.System.DEFAULT_NOTIFICATION_URI.toString();
        int i = lic.setting_notification_ringtone;
        String S1 = S1(qad.K5);
        Context O1 = O1();
        hq hqVar = this.E1;
        arrayList.add(fyd.c(i, S1, fhf.d(O1, hqVar.D("app.notification.ringtone"), uri)));
        arrayList.add(fyd.a(S1(qad.j6), lic.setting_notification_vibrate, (String) null, hqVar.C()));
        return arrayList;
    }

    public final String j3() {
        return S1(qad.D5);
    }

    @oye
    public void onEvent(oe3 oe3) {
        if (this.o1) {
            k3();
        } else {
            T0(oe3);
        }
    }
}
