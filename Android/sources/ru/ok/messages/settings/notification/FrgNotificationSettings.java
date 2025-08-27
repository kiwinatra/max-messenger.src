package ru.ok.messages.settings.notification;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.messages.settings.ActSettings;
import ru.ok.messages.settings.FrgBaseSettings;
import ru.ok.messages.views.dialogs.ConfirmationDestructiveDialog;
import ru.ok.messages.views.dialogs.FrgDlgChatsNotification;
import ru.ok.messages.views.dialogs.FrgDlgNotification;

public class FrgNotificationSettings extends FrgBaseSettings implements ch6 {
    public boolean E1;
    public boolean F1;
    public Resources G1;
    public hq H1;

    public static String l3(int i, Context context) {
        return i != 0 ? i != 1 ? i != 2 ? "" : context.getString(qad.h6) : context.getString(qad.g6) : context.getString(qad.Y5);
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [l0g, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v8, types: [l0g, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v12, types: [l0g, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v21, types: [l0g, java.lang.Object] */
    public final void C(int i, Object obj) {
        if (i == lic.setting_notification_show_all_msg) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            this.E1 = !booleanValue;
            if (booleanValue) {
                this.H1.k("app.notification.dontDisturbUntil", 0L);
                rl e = ((qra) ym.e()).e();
                ? obj2 = new Object();
                obj2.b = 0L;
                e.a(new n0g(obj2));
                k3();
                ((qwa) ((qra) ((id3) this.p1.b)).f().g.getValue()).c();
                return;
            }
            new FrgDlgNotification().Y2(N1(), "ru.ok.messages.views.dialogs.FrgDlgNotification");
        } else if (i == lic.setting_notification_show_text) {
            this.H1.G(((Boolean) obj).booleanValue());
            ((qwa) ((qra) ym.e()).f().g.getValue()).c();
        } else if (i == lic.setting_notification_important_priority) {
            this.H1.i("app.notification.important.priority", ((Boolean) obj).booleanValue());
        } else if (i == lic.setting_notification_vibrate) {
            Boolean bool = (Boolean) obj;
            this.H1.i("app.notification.vibrate", bool.booleanValue());
            rl e2 = ((qra) ym.e()).e();
            ? obj3 = new Object();
            obj3.l = bool;
            e2.a(new n0g(obj3));
        } else if (i == lic.setting_notification_inapp_sound) {
            this.H1.i("app.notification.in.app.sound", ((Boolean) obj).booleanValue());
        } else if (i == lic.setting_notification_inapp_vibrate) {
            this.H1.i("app.notification.in.app.vibrate", ((Boolean) obj).booleanValue());
        } else if (i == lic.setting_notification_show_new_users) {
            Boolean bool2 = (Boolean) obj;
            this.H1.i("app.notification.show.new.users", bool2.booleanValue());
            rl d = this.q1.d();
            ? obj4 = new Object();
            obj4.a = bool2;
            d.a(new n0g(obj4));
        } else if (i == lic.setting_notification_show_drafts) {
            this.H1.i("app.notification.show.drafts", ((Boolean) obj).booleanValue());
        } else if (i == lic.setting_notification_group_chats_calls) {
            int i2 = ((Boolean) obj).booleanValue() ? 1 : 2;
            hq hqVar = this.H1;
            hqVar.getClass();
            hqVar.l("app.group.chat.call.notification.status", wzf.e(i2));
            rl d2 = this.q1.d();
            ? obj5 = new Object();
            obj5.r = i2;
            d2.a(new n0g(obj5));
        }
    }

    public final void E(int i, Object obj) {
        if (i == lic.setting_notification_off_warning) {
            this.F1 = true;
            ((qra) ((id3) this.p1.b)).w().f(jgd.SETTINGS_NOTIFICATIONS_SYSTEM, h8b.e);
            Context O1 = O1();
            ArrayList arrayList = gsg.j;
            Intent intent = new Intent();
            intent.setFlags(268435456);
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", O1.getPackageName());
            O1.startActivity(intent);
        } else if (i == lic.setting_notification_reset) {
            String str = ConfirmationDestructiveDialog.B1;
            q8.w((String) null, S1(qad.J5), S1(qad.m0), S1(qad.f2)).Y2(N1(), ConfirmationDestructiveDialog.B1);
            N1().g0("CONFIRMATION_DESTRUCTIVE_REQUEST_KEY", this, new ms1(21, new ata(8, new u75(14, this), new a46(17))));
        } else if (i == lic.setting_notification_ringtone) {
            gsg.F(this, this.H1.D("app.notification.ringtone"));
        } else if (i == lic.setting_notification_group_notifications) {
            ActSettings.T(lic.setting_notifications_chats, O1(), false);
        } else if (i == lic.setting_notification_dialogs) {
            ActSettings.T(lic.setting_notifications_dialogs, O1(), false);
        } else if (i == lic.setting_notification_system_all) {
            ((qra) ((id3) this.p1.b)).w().f(jgd.SETTINGS_NOTIFICATIONS_SYSTEM, h8b.e);
            Context O12 = O1();
            ArrayList arrayList2 = gsg.j;
            Intent intent2 = new Intent();
            intent2.setFlags(268435456);
            intent2.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent2.putExtra("android.provider.extra.APP_PACKAGE", O12.getPackageName());
            O12.startActivity(intent2);
        } else if (i == lic.setting_notification_show_chats_msg) {
            new FrgDlgChatsNotification().Y2(N1(), "ru.ok.messages.views.dialogs.FrgDlgChatsNotification");
        }
    }

    public final String V2() {
        return "SETTINGS_MESSAGES_NOTIFICATIONS";
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [l0g, java.lang.Object] */
    public final void b3(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 102) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            this.H1.l("app.notification.ringtone", uri == null ? "_NONE_" : uri.toString());
            rl d = this.q1.d();
            ? obj = new Object();
            obj.e = this.H1.D("app.notification.ringtone");
            d.a(new n0g(obj));
            k3();
        }
    }

    public final void i2(Bundle bundle) {
        super.i2(bundle);
        if (bundle != null) {
            this.E1 = bundle.getBoolean("ru.ok.tamtam.extra.DO_NOT_DISTURB_UNTIL_CHECKED", false);
            this.F1 = bundle.getBoolean("ru.ok.tamtam.extra.NOTIF_WARNING_TAPPED", false);
        } else if (this.x.getBoolean("ru.ok.tamtam.extra.SHOW_PUSH_ALERT")) {
            ym.v.c().a.k("app.last.push.alert.time", Long.valueOf(System.currentTimeMillis()));
        }
        this.G1 = R1();
        this.H1 = ym.v.c().c;
    }

    public final ArrayList i3() {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        if (this.x.getBoolean("ru.ok.tamtam.extra.SHOW_PUSH_ALERT") && !nea.a(((qra) ((id3) this.p1.b)).f().b().i(false).b)) {
            fyd c = fyd.c(lic.setting_notification_off_warning, S1(qad.S5), S1(qad.T5));
            c.Y = this.r1.l;
            c.w0 = true;
            c.X = true;
            arrayList.add(c);
        }
        if (this.H1.z() < ((ltb) this.q1.u()).a.m() && this.H1.z() != -1 && !this.E1) {
            z = true;
        }
        fyd a = fyd.a(this.G1.getString(qad.L5), lic.setting_notification_show_all_msg, z ? S1(qad.k6) : j4b.u(O1(), ((qra) ((id3) this.p1.b)).y().a.m(), this.H1.z()), z);
        a.X = true;
        arrayList.add(a);
        arrayList.add(fyd.b(this.G1.getString(qad.G5)));
        arrayList.add(fyd.a(this.G1.getString(qad.M5), lic.setting_notification_show_text, (String) null, this.H1.B()));
        fyd c2 = fyd.c(lic.setting_notification_system_all, this.G1.getString(qad.Q5), this.G1.getString(qad.R5));
        c2.X = true;
        arrayList.add(c2);
        arrayList.add(fyd.b(this.G1.getString(qad.E5)));
        arrayList.add(new fyd(lic.setting_notification_show_chats_msg, S1(qad.U5), l3(this.H1.n(), O1()), (String) null, (Object) null, 1));
        arrayList.add(fyd.b(this.G1.getString(qad.H5)));
        arrayList.add(fyd.a(this.G1.getString(qad.N5), lic.setting_notification_show_new_users, this.G1.getString(qad.O5), this.H1.g.getBoolean("app.notification.show.new.users", true)));
        fyd c3 = fyd.c(lic.setting_notification_reset, this.G1.getString(qad.I5), (String) null);
        c3.Y = this.r1.z;
        arrayList.add(c3);
        return arrayList;
    }

    public final String j3() {
        return S1(qad.U5);
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
        this.H1.s(i);
        k3();
    }

    public final void w2() {
        fyd fyd;
        super.w2();
        lf0 lf0 = this.C1;
        int i = lic.setting_notification_off_warning;
        Iterator it = ((List) lf0.v).iterator();
        while (true) {
            if (!it.hasNext()) {
                fyd = null;
                break;
            }
            fyd = (fyd) it.next();
            if (fyd.a == i) {
                break;
            }
        }
        boolean z = true;
        boolean z2 = fyd != null;
        if (nea.a(((qra) ((id3) this.p1.b)).f().b().i(false).b) || !this.x.getBoolean("ru.ok.tamtam.extra.SHOW_PUSH_ALERT")) {
            z = false;
        }
        if (z2 != z) {
            if (!z && this.F1) {
                this.q1.c().e("GRANT_PUSH_ACCESS_AFTER_TAP_SETTING");
            }
            k3();
        }
        this.F1 = false;
        ((qra) ((id3) this.p1.b)).w().f(jgd.SETTINGS_NOTIFICATIONS, h8b.e);
    }

    public final void x2(Bundle bundle) {
        super.x2(bundle);
        bundle.putBoolean("ru.ok.tamtam.extra.DO_NOT_DISTURB_UNTIL_CHECKED", this.E1);
        bundle.putBoolean("ru.ok.tamtam.extra.NOTIF_WARNING_TAPPED", this.F1);
    }
}
