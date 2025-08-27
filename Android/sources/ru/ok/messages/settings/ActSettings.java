package ru.ok.messages.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import ru.ok.messages.settings.caching.FrgCachingSettings;
import ru.ok.messages.settings.locations.FrgLiveLocationSettings;
import ru.ok.messages.settings.notification.FrgNotificationChatsSettings;
import ru.ok.messages.settings.notification.FrgNotificationDialogsSettings;
import ru.ok.messages.settings.notification.FrgNotificationSettings;
import ru.ok.messages.views.widgets.SlideOutLayout;

public class ActSettings extends m5 implements i2e, kmf, vde {
    public static final /* synthetic */ int A0 = 0;
    public b33 z0;

    public static void T(int i, Context context, boolean z) {
        Intent intent = new Intent(context, ActSettings.class);
        intent.putExtra("ru.ok.tamtam.extra.SETTING_ID", i);
        intent.putExtra("ru.ok.tamtam.extra.SHOW_PUSH_ALERT", z);
        context.startActivity(intent);
    }

    public final void A1(int i) {
        finish();
        overridePendingTransition(0, 0);
    }

    public final void D1() {
    }

    public final String E() {
        return null;
    }

    public final void F() {
        L(this.X.M);
    }

    public final boolean Q() {
        return v().E("ru.ok.messages.settings.FrgBaseSettings") instanceof FrgAppearanceSettings;
    }

    public final void U() {
        ed6 v = v();
        v.getClass();
        xe0 xe0 = new xe0(v);
        xe0.k(lic.act_settings__container, new FrgPinLockSettings(), "ru.ok.messages.settings.FrgPinLockSettings");
        xe0.c("ru.ok.messages.settings.FrgPinLockSettings");
        xe0.e(false);
    }

    public final boolean e1() {
        return true;
    }

    public final void h0() {
    }

    public final void onCreate(Bundle bundle) {
        a aVar;
        super.onCreate(bundle);
        setContentView(ujc.act_settings);
        scf scf = this.X;
        L(scf.M);
        obd obd = new obd(new fj((hn) this), (Toolbar) findViewById(lic.toolbar));
        obd.x = scf;
        b33 b33 = new b33(obd);
        this.z0 = b33;
        b33.g(nad.u);
        this.z0.i(new x4(6, (Object) this));
        ((SlideOutLayout) findViewById(lic.act_settings__slideout)).setSlideOutListener(this);
        if (bundle == null) {
            int intExtra = getIntent().getIntExtra("ru.ok.tamtam.extra.SETTING_ID", 0);
            if (intExtra == lic.setting_media) {
                aVar = new FrgMediaSettings();
            } else if (intExtra == lic.setting_appearance) {
                aVar = new FrgAppearanceSettings();
            } else if (intExtra == lic.setting_privacy) {
                aVar = new FrgPrivacySettings();
            } else if (intExtra == lic.setting_notifications) {
                boolean booleanExtra = getIntent().getBooleanExtra("ru.ok.tamtam.extra.SHOW_PUSH_ALERT", false);
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("ru.ok.tamtam.extra.SHOW_PUSH_ALERT", booleanExtra);
                aVar = new FrgNotificationSettings();
                aVar.L2(bundle2);
            } else if (intExtra == lic.setting_messages) {
                aVar = new FrgMessagesSettings();
            } else if (intExtra == lic.setting_chat_notifications) {
                long longExtra = getIntent().getLongExtra("ru.ok.tamtam.extra.CHAT_ID", 0);
                aVar = new FrgChatNotificationsSettings();
                Bundle bundle3 = new Bundle();
                bundle3.putLong("ru.ok.tamtam.extra.CHAT_ID", longExtra);
                aVar.L2(bundle3);
            } else if (intExtra == lic.setting_notifications_chats) {
                aVar = new FrgNotificationChatsSettings();
            } else if (intExtra == lic.setting_notifications_dialogs) {
                aVar = new FrgNotificationDialogsSettings();
            } else if (intExtra == lic.setting_privacy_live_location) {
                aVar = new FrgLiveLocationSettings();
            } else if (intExtra == lic.setting_privacy_black_list) {
                aVar = new FrgBlackListSettings();
            } else if (intExtra == 0 || intExtra == lic.setting_media_caching) {
                aVar = new FrgCachingSettings();
            } else {
                throw new IllegalArgumentException(a81.j(intExtra, "Fragment for setting id: ", " not found!"));
            }
            ed6 v = v();
            v.getClass();
            xe0 xe0 = new xe0(v);
            xe0.k(lic.act_settings__container, aVar, "ru.ok.messages.settings.FrgBaseSettings");
            c cVar = aVar.D0;
            if (cVar == null || cVar == xe0.r) {
                xe0.b(new md6(8, aVar));
                xe0.e(false);
                return;
            }
            throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + aVar.toString() + " is already attached to a FragmentManager.");
        }
    }

    public final b33 q1() {
        return this.z0;
    }
}
