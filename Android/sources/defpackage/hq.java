package defpackage;

import android.content.Context;
import android.provider.Settings;
import java.util.WeakHashMap;

/* renamed from: hq  reason: default package */
public final class hq extends pid {
    public static int[] m;
    public final WeakHashMap l = new WeakHashMap(1);

    public hq(Context context, fn5 fn5) {
        super(context, fn5);
    }

    public final int[] A() {
        if (m == null) {
            Context context = this.f;
            m = new int[]{context.getResources().getColor(tdc.led_1), context.getResources().getColor(tdc.led_2), context.getResources().getColor(tdc.led_3), context.getResources().getColor(tdc.led_4), context.getResources().getColor(tdc.led_5), context.getResources().getColor(tdc.led_6), context.getResources().getColor(tdc.led_7)};
        }
        return m;
    }

    public final boolean B() {
        return this.g.getBoolean("app.notification.show.text", true);
    }

    public final boolean C() {
        return c("app.notification.vibrate", true);
    }

    public final String D(String str) {
        ls7 ls7 = this.g;
        String string = ls7.getString(str, "DEFAULT");
        if (!string.equals("DEFAULT") && !string.equals("_NONE_")) {
            if (ls7.getBoolean("app.oldSounds", false)) {
                this.f.getResources();
                throw null;
            } else if (string.equals(Settings.System.DEFAULT_NOTIFICATION_URI.toString())) {
                return "DEFAULT";
            }
        }
        return string;
    }

    public final void E() {
        k("app.notification.dontDisturbUntil", 0L);
        G(true);
        l("app.notification.ringtone", (String) null);
        i("app.notification.vibrate", true);
        j(v(), "app.notification.led.color");
        j(0, "app.notification.dialogs.show");
        this.j.d(0);
        l("app.notification.dialogs.ringtone", (String) null);
        i("app.notification.dialogs.vibrate", true);
        j(v(), "app.notification.dialogs.led.color");
        s(0);
        l("app.notification.chats.ringtone", (String) null);
        i("app.notification.chats.vibrate", true);
        j(v(), "app.notification.chats.led.color");
        l("app.group.chat.call.notification.status", "ON");
        i("app.notification.in.app.sound", true);
        i("app.notification.in.app.vibrate", true);
        i("app.notification.show.new.users", true);
        i("app.notification.show.drafts", true);
    }

    public final void F(String str) {
        l("app.night.mode", str);
    }

    public final void G(boolean z) {
        i("app.notification.show.text", z);
    }

    public final void H(n0g n0g) {
        z68.c("hq", "updateUserSettings, settings = %s", n0g);
        Long l2 = n0g.b;
        if (l2 != null) {
            k("app.notification.dontDisturbUntil", l2);
        }
        Boolean bool = n0g.a;
        if (bool != null) {
            i("app.notification.show.new.users", bool.booleanValue());
        }
        int i = 2;
        String str = n0g.c;
        if (str != null) {
            int i2 = !str.equals("OFF") ? !str.equals("REPLY") ? 0 : 2 : 1;
            j(i2, "app.notification.dialogs.show");
            this.j.d(Integer.valueOf(i2));
        }
        String str2 = n0g.d;
        if (str2 != null) {
            if (str2.equals("OFF")) {
                i = 1;
            } else if (!str2.equals("REPLY")) {
                i = 0;
            }
            s(i);
        }
        String str3 = n0g.e;
        if (str3 != null) {
            l("app.notification.ringtone", str3);
        }
        String str4 = n0g.f;
        if (str4 != null) {
            l("app.notification.dialogs.ringtone", str4);
        }
        String str5 = n0g.g;
        if (str5 != null) {
            l("app.notification.chats.ringtone", str5);
        }
        Integer num = n0g.i;
        if (num != null) {
            j(h88.K(num.intValue()), "app.notification.led.color");
        }
        Boolean bool2 = n0g.h;
        if (bool2 != null) {
            i("app.privacy.online.show", !bool2.booleanValue());
        }
        Integer num2 = n0g.j;
        if (num2 != null) {
            j(h88.K(num2.intValue()), "app.notification.dialogs.led.color");
        }
        Integer num3 = n0g.k;
        if (num3 != null) {
            j(h88.K(num3.intValue()), "app.notification.chats.led.color");
        }
        Boolean bool3 = n0g.l;
        if (bool3 != null) {
            i("app.notification.vibrate", bool3.booleanValue());
        }
        Boolean bool4 = n0g.m;
        if (bool4 != null) {
            i("app.notification.dialogs.vibrate", bool4.booleanValue());
        }
        Boolean bool5 = n0g.n;
        if (bool5 != null) {
            i("app.notification.chats.vibrate", bool5.booleanValue());
        }
        int i3 = n0g.p;
        if (i3 != 0) {
            l("app.privacy.incoming.call", wzf.f(i3));
        }
        int i4 = n0g.o;
        if (i4 != 0) {
            l("app.privacy.chats.invite", wzf.f(i4));
        }
        m0g m0g = n0g.q;
        if (m0g != null) {
            l("app.privacy.inactive.ttl", m0g.a);
        }
        int i5 = n0g.r;
        if (i5 != 0) {
            l("app.group.chat.call.notification.status", wzf.e(i5));
        }
        int i6 = n0g.s;
        if (i6 != 0) {
            l("app.suggest.stickers.status", wzf.g(i6));
        }
        Boolean bool6 = n0g.t;
        if (bool6 != null) {
            i("audio.transcription.enabled", bool6.booleanValue());
        }
        Boolean bool7 = n0g.u;
        if (bool7 != null) {
            i("app.privacy.safe_mode", bool7.booleanValue());
        }
        int i7 = n0g.v;
        if (i7 != 0) {
            l("app.privacy.search_by_phone", wzf.f(i7));
        }
    }

    public final boolean u() {
        return this.g.getBoolean("app.messages.enable.animations", true);
    }

    public final int v() {
        return A()[3];
    }

    public final String w() {
        return this.g.getString("app.night.mode", "app.night.mode.system");
    }

    public final v7b x() {
        ls7 ls7 = this.g;
        return new v7b(Integer.valueOf(ls7.getInt("app.night.mode.end.h", 8)), Integer.valueOf(ls7.getInt("app.night.mode.end.m", 0)));
    }

    public final v7b y() {
        ls7 ls7 = this.g;
        return new v7b(Integer.valueOf(ls7.getInt("app.night.mode.start.h", 23)), Integer.valueOf(ls7.getInt("app.night.mode.start.m", 0)));
    }

    public final long z() {
        return this.g.getLong("app.notification.dontDisturbUntil", 0);
    }
}
