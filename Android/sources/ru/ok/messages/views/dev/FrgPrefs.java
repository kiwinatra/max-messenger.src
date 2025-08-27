package ru.ok.messages.views.dev;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.preference.CheckBoxPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import kotlin.TuplesKt;
import ru.ok.messages.views.dialogs.LogoutProgressDialog;
import ru.ok.messages.views.widgets.CustomPreference;

public class FrgPrefs extends PreferenceFragmentCompat implements SharedPreferences.OnSharedPreferenceChangeListener {
    public fi6 t1;
    public ei6 u1;

    @Keep
    public static class TamTamTestCrashException extends RuntimeException {
        public /* synthetic */ TamTamTestCrashException(int i) {
            this();
        }

        private TamTamTestCrashException() {
        }
    }

    public static void X2(Preference preference) {
        if (preference.K0) {
            preference.K0 = false;
            preference.h();
        }
        if (preference instanceof PreferenceGroup) {
            PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
            int size = preferenceGroup.Y0.size();
            for (int i = 0; i < size; i++) {
                X2(preferenceGroup.B(i));
            }
        }
    }

    public final tyc T2(PreferenceScreen preferenceScreen) {
        return new di6(this, preferenceScreen);
    }

    public final void U2(Preference preference) {
        EditTextPreferenceDialog editTextPreferenceDialog;
        if (Q1().E("PreferenceFragment.DIALOG") == null) {
            if (preference instanceof CustomPreference) {
                String str = preference.Z;
                editTextPreferenceDialog = new EditTextPreferenceDialog();
                editTextPreferenceDialog.L2(o54.f(TuplesKt.to("key", str)));
            } else {
                super.U2(preference);
                editTextPreferenceDialog = null;
            }
            if (editTextPreferenceDialog != null) {
                editTextPreferenceDialog.P2(0, this);
                editTextPreferenceDialog.Y2(Q1(), "PreferenceFragment.DIALOG");
            }
        }
    }

    public final void V2() {
        qra qra = (qra) ryg.x(this);
        String g = qra.j().g();
        if (!TextUtils.isEmpty(g)) {
            doa j = qra.j();
            String f = !j.e() ? null : ((ltb) j.c()).d.f("auth.account.name", (String) null);
            boolean f2 = qra.j().f();
            long s = qra.y().a.s();
            LogoutProgressDialog logoutProgressDialog = new LogoutProgressDialog();
            logoutProgressDialog.r1 = false;
            Dialog dialog = logoutProgressDialog.w1;
            if (dialog != null) {
                dialog.setCancelable(false);
            }
            logoutProgressDialog.Y2(Q1(), "ru.ok.messages.views.dialogs.LogoutProgressDialog");
            this.t1 = new fi6(this, qra, s, f, g, f2);
            qra.J().d(this.t1);
            bi6 bi6 = new bi6(qra, 1);
            ip5 ip5 = new ip5(21);
            nob nob = jbd.a;
            jbd.a(bi6, xfd.a(), (x6) null, ip5, (lfd) null);
        }
    }

    public final Preference W2(int i) {
        PreferenceScreen preferenceScreen;
        String S1 = S1(i);
        dtb dtb = this.m1;
        if (dtb == null || (preferenceScreen = dtb.g) == null) {
            return null;
        }
        return preferenceScreen.A(S1);
    }

    public final void Y2(PreferenceScreen preferenceScreen) {
        dtb dtb = this.m1;
        PreferenceScreen preferenceScreen2 = dtb.g;
        if (preferenceScreen != preferenceScreen2) {
            if (preferenceScreen2 != null) {
                preferenceScreen2.n();
            }
            dtb.g = preferenceScreen;
            this.o1 = true;
            if (this.p1) {
                hy hyVar = this.r1;
                if (!hyVar.hasMessages(1)) {
                    hyVar.obtainMessage(1).sendToTarget();
                }
            }
        }
        X2(preferenceScreen);
    }

    public final void f2(int i, int i2, Intent intent) {
        super.f2(i, i2, intent);
        if (i == 569 && i2 == -1) {
            ((CheckBoxPreference) W2(rmc.dev_prefs__use_ssl_key)).A(false);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r1v11, types: [ssb, java.lang.Object] */
    public final void i2(Bundle bundle) {
        super.i2(bundle);
        int i = loc.developer_options_prefs;
        dtb dtb = this.m1;
        if (dtb != null) {
            Context G2 = G2();
            PreferenceScreen preferenceScreen = this.m1.g;
            dtb.e = true;
            ctb ctb = new ctb(G2, dtb);
            XmlResourceParser xml = G2.getResources().getXml(i);
            try {
                PreferenceGroup c = ctb.c(xml, preferenceScreen);
                xml.close();
                PreferenceScreen preferenceScreen2 = (PreferenceScreen) c;
                preferenceScreen2.k(dtb);
                SharedPreferences.Editor editor = dtb.d;
                if (editor != null) {
                    editor.apply();
                }
                dtb.e = false;
                Y2(preferenceScreen2);
                id3 x = ryg.x(this);
                ((CheckBoxPreference) W2(rmc.dev_prefs__use_ssl_key)).v = new ci6(this);
                W2(rmc.dev_prefs__user_reset_cache_key).w = new ci6(this);
                W2(rmc.dev_prefs__sync_chat_settings_key).w = new ib4(22, this, x);
                W2(rmc.dev_prefs__test_crash_key).w = new Object();
                a33 a33 = ((qra) ryg.x(this)).y().a;
                ((CheckBoxPreference) W2(rmc.dev_prefs_send_scheduled_messages_key)).A(((qra) ((id3) f55.a.getValue())).y().a.g.getBoolean("user.dev.options.send.scheduled.messages", false));
                a33 a332 = ((qra) ((id3) dtf.a.getValue())).y().a;
                kv0.K();
                ((CheckBoxPreference) W2(rmc.dev_prefs_send_scheduled_message_with_special_error)).A(a332.g.getBoolean("user.dev.options.trololo.scheduled.messages", false));
                ((CheckBoxPreference) W2(rmc.dev_prefs_lorem_ipsum_message_key)).A(a33.g.getBoolean("lorem-ipsum", false));
                CheckBoxPreference checkBoxPreference = (CheckBoxPreference) W2(rmc.dev_prefs_emulate_release_market_build_key);
                vpa vpa = kv0.f;
                if (vpa == null) {
                    vpa = null;
                }
                vpa.getClass();
                PreferenceGroup preferenceGroup = this.m1.g;
                synchronized (preferenceGroup) {
                    try {
                        checkBoxPreference.z();
                        if (checkBoxPreference.R0 == preferenceGroup) {
                            checkBoxPreference.R0 = null;
                        }
                        if (preferenceGroup.Y0.remove(checkBoxPreference)) {
                            String str = checkBoxPreference.Z;
                            if (str != null) {
                                preferenceGroup.W0.put(str, Long.valueOf(checkBoxPreference.c));
                                preferenceGroup.X0.removeCallbacks(preferenceGroup.d1);
                                preferenceGroup.X0.post(preferenceGroup.d1);
                            }
                            if (preferenceGroup.b1) {
                                checkBoxPreference.z();
                            }
                        }
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                btb btb = preferenceGroup.P0;
                if (btb != null) {
                    btb.I(preferenceGroup);
                }
                ((CheckBoxPreference) W2(rmc.dev_prefs__enable_count_for_common_chats_key)).A(a33.g.getBoolean("app.count_for_common_chats_enabled", false));
                ((CheckBoxPreference) W2(rmc.dev_prefs__use_ssl_key)).A(a33.c("server.useTls", true));
                ((CheckBoxPreference) W2(rmc.dev_prefs__enable_host_rotation_key)).A(a33.g.getBoolean("app.debugHostRotation", false));
                ((CheckBoxPreference) W2(rmc.dev_prefs__enable_ua_dns_emulate_key)).A(a33.g.getBoolean("app.debugUaDnsEmulation", false));
                ((CheckBoxPreference) W2(rmc.dev_prefs__leak_canary_key)).A(a33.g.getBoolean("app.leakCanary", false));
                CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) W2(rmc.dev_prefs__dev_options_roaming_key);
                checkBoxPreference2.A(a33.c("user.dev.options.roaming", false));
                checkBoxPreference2.v(checkBoxPreference2.a.getString(rmc.dev_prefs__dev_options_roaming_summary));
                ((CheckBoxPreference) W2(rmc.dev_prefs__rand_text_button_key)).A(a33.g.getBoolean("user.dev.options.rand.text.button", false));
            } catch (Throwable th2) {
                xml.close();
                throw th2;
            }
        } else {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    public final void l2() {
        this.Q0 = true;
        if (this.t1 != null) {
            ((qra) ryg.x(this)).J().f(this.t1);
        }
        if (this.u1 != null) {
            ((qra) ryg.x(this)).J().f(this.u1);
        }
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        String str2;
        String str3;
        z68.c("ru.ok.messages.views.dev.FrgPrefs", "onSharedPreferenceChanged: key = %s", str);
        if (!TextUtils.isEmpty(str)) {
            a33 a33 = ym.v.c().a;
            id3 x = ryg.x(this);
            if (S1(rmc.dev_prefs_lorem_ipsum_message_key).equals(str)) {
                a33.i("lorem-ipsum", sharedPreferences.getBoolean(str, false));
            } else if (S1(rmc.dev_prefs_emulate_release_market_build_key).equals(str)) {
                sharedPreferences.getBoolean(str, false);
                a33.j.getClass();
                h2g.a.c().getClass();
                V2();
            } else if (S1(rmc.dev_prefs__use_ssl_key).equals(str)) {
                a33.i("server.useTls", sharedPreferences.getBoolean(str, true));
            } else if (S1(rmc.dev_prefs__enable_host_rotation_key).equals(str)) {
                a33.i("app.debugHostRotation", sharedPreferences.getBoolean(str, false));
            } else if (S1(rmc.dev_prefs__enable_ua_dns_emulate_key).equals(str)) {
                a33.i("app.debugUaDnsEmulation", sharedPreferences.getBoolean(str, false));
                a33.k("app.lastProxyUpdateTime", 0L);
            } else if (S1(rmc.dev_prefs__promo_push_key).equals(str)) {
                String string = sharedPreferences.getString(str, "");
                if (!TextUtils.isEmpty(string)) {
                    qra qra = (qra) x;
                    if (qra.j().e()) {
                        if (string.equals(S1(rmc.dev_prefs__promo_push_channel_f1))) {
                            str3 = "https://oneme.ru/formulaone";
                            str2 = "https://i504.mycdn.me/image?id=854445711459&t=33&plc=API&viewToken=r7AlbdvAcCWIsa3HJQp5bg&tkn=*1EkOH1rNgWfFtKzTM8S6-vTi7k8";
                        } else if (string.equals(S1(rmc.dev_prefs__promo_push_channel_wtf))) {
                            str3 = "https://oneme.ru/whtf";
                            str2 = "https://i500.mycdn.me/image?id=858681876005&t=33&plc=API&ts=000000005000000331&viewToken=5gdk0rReZiPPKWvzmn6pVg&tkn=*g7smZR8UraEI-QMMf43aZAWsm8Y";
                        } else if (string.equals(S1(rmc.dev_prefs__promo_push_chat_vichug))) {
                            str3 = "https://oneme.ru/vichuga";
                            str2 = "https://i512.mycdn.me/image?id=863727398386&t=33&plc=API&ts=0000000098000002b8&viewToken=H99McJZ3UPzAU2qvqr9McQ&tkn=*63jqQe-z7czlDnMDf_931kHbMl4";
                        } else {
                            str3 = null;
                            str2 = null;
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            ((cbf) qra.getAccessor().g(cbf.class)).b(str3, string, S1(rmc.dev_prefs__promo_push_title), str2);
                        }
                    }
                }
            } else if (S1(rmc.dev_prefs__leak_canary_key).equals(str)) {
                a33.i("app.leakCanary", sharedPreferences.getBoolean(str, false));
                y64.C(300, new y86(10, (Object) this));
            } else if (S1(rmc.dev_prefs__dev_options_roaming_key).equals(str)) {
                a33.i("user.dev.options.roaming", sharedPreferences.getBoolean(str, false));
            } else if (S1(rmc.dev_prefs__rand_text_button_key).equals(str)) {
                ((qra) x).y().a.i("user.dev.options.rand.text.button", sharedPreferences.getBoolean(str, false));
            } else if (S1(rmc.dev_prefs__enable_count_for_common_chats_key).equals(str)) {
                ((qra) x).y().a.i("app.count_for_common_chats_enabled", sharedPreferences.getBoolean(str, false));
            } else if (S1(rmc.dev_prefs_send_scheduled_messages_key).equals(str)) {
                ((qra) ((id3) f55.a.getValue())).y().a.i("user.dev.options.send.scheduled.messages", sharedPreferences.getBoolean(str, false));
            } else if (S1(rmc.dev_prefs_send_scheduled_message_with_special_error).equals(str)) {
                ((qra) ((id3) dtf.a.getValue())).y().a.i("user.dev.options.trololo.scheduled.messages", sharedPreferences.getBoolean(str, false));
            }
            if (a33.s() != -1) {
                jbd.a(new bi6(x, 0), ((kbf) ((qra) x).H()).a(), (x6) null, new ip5(22), (lfd) null);
            }
        }
    }

    public final void t2() {
        this.Q0 = true;
        dtb dtb = this.m1.g.b;
        (dtb != null ? dtb.b() : null).unregisterOnSharedPreferenceChangeListener(this);
    }

    public final void w2() {
        this.Q0 = true;
        dtb dtb = this.m1.g.b;
        (dtb != null ? dtb.b() : null).registerOnSharedPreferenceChangeListener(this);
    }
}
