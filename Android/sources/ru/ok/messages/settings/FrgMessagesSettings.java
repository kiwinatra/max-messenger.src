package ru.ok.messages.settings;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/messages/settings/FrgMessagesSettings;", "Lru/ok/messages/settings/FrgBaseSettings;", "<init>", "()V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class FrgMessagesSettings extends FrgBaseSettings {
    public final void C(int i, Object obj) {
        hq hqVar = ym.v.c().c;
        if (i == lic.setting_message_send_by_enter) {
            hqVar.i("app.messages.send.by.enter", ((Boolean) obj).booleanValue());
            return;
        }
        String str = "1";
        if (i == lic.setting_message_in_app_browser) {
            nd c = ((qra) ((id3) this.p1.b)).c();
            Boolean bool = (Boolean) obj;
            if (!bool.booleanValue()) {
                str = "2";
            }
            c.f("ACTION_IN_APP_BROWSER", str);
            hqVar.i("app.messages.inAppBrowser", bool.booleanValue());
        } else if (i == lic.setting_message_replace_emoji) {
            nd c2 = ((qra) ((id3) this.p1.b)).c();
            Boolean bool2 = (Boolean) obj;
            if (!bool2.booleanValue()) {
                str = "0";
            }
            c2.f("REPLACE_EMOJI", str);
            hqVar.i("app.messages.replace.emoji", bool2.booleanValue());
        } else if (i == lic.setting_message_reactions_double_tap) {
            nd c3 = ((qra) ((id3) this.p1.b)).c();
            Boolean bool3 = (Boolean) obj;
            if (!bool3.booleanValue()) {
                str = "0";
            }
            c3.f("ENABLE_DOUBLE_TAP_REACTIONS", str);
            hqVar.i("app.messages.enable.double.tap.reactions", bool3.booleanValue());
        } else if (i == lic.setting_message_audio_transcription) {
            nd c4 = ((qra) ((id3) this.p1.b)).c();
            Boolean bool4 = (Boolean) obj;
            if (!bool4.booleanValue()) {
                str = "0";
            }
            c4.f("ENABLE_AUDIO_TRANSCRIPTION", str);
            hqVar.i("audio.transcription.enabled", bool4.booleanValue());
            ev0.v(i8b.t(this.b1), ((osa) ((qra) ((id3) this.p1.b)).G()).b().plus(caa.a), (f14) null, new ai6(this, (Continuation) null), 2);
        }
    }

    public final void E(int i, Object obj) {
        if (i == lic.setting_message_stickers) {
            v6.T(G2());
        }
    }

    public final String V2() {
        return "SETTINGS_MESSAGES";
    }

    public final ArrayList i3() {
        hq hqVar = ((qra) ((id3) this.p1.b)).y().c;
        ArrayList arrayList = new ArrayList();
        fyd a = fyd.a(S1(qad.w5), lic.setting_message_send_by_enter, (String) null, hqVar.g.getBoolean("app.messages.send.by.enter", false));
        a.X = true;
        arrayList.add(a);
        cud cud = ((qra) ((id3) this.p1.b)).y().b;
        cud.getClass();
        List v = cud.v(PmsKey.f9audiotranscriptionlocales, akd.r);
        a33 a33 = ((qra) ((id3) this.p1.b)).y().a;
        int i = b0h.g;
        String q = a33.q();
        if (cvg.A(q)) {
            q = b0h.B().getLanguage();
        }
        Locale locale = Locale.ROOT;
        if (v.contains(q.toLowerCase(locale)) || v.contains(b0h.B().getLanguage().toLowerCase(locale))) {
            fyd a2 = fyd.a(S1(qad.u5), lic.setting_message_audio_transcription, (String) null, hqVar.q());
            a2.X = true;
            arrayList.add(a2);
        }
        arrayList.add(fyd.c(lic.setting_message_stickers, S1(qad.O9), (String) null));
        return arrayList;
    }

    public final String j3() {
        return S1(qad.t5);
    }
}
