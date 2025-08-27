package defpackage;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;

/* renamed from: j3e  reason: default package */
public final /* synthetic */ class j3e implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SettingsPrivacyScreen b;

    public /* synthetic */ j3e(SettingsPrivacyScreen settingsPrivacyScreen, int i) {
        this.a = i;
        this.b = settingsPrivacyScreen;
    }

    public final Object invoke() {
        SettingsPrivacyScreen settingsPrivacyScreen = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = SettingsPrivacyScreen.x;
                e3e e3e = e3e.a;
                Lazy h = e3e.getAccessor().h(sv0.class);
                Lazy h2 = e3e.getAccessor().h(pid.class);
                Lazy h3 = e3e.getAccessor().h(rl.class);
                Lazy h4 = e3e.getAccessor().h(f8f.class);
                Class<x23> cls = x23.class;
                return new y3e(new ozd((gaf) e3e.c().getValue(), h), new abe(e3e.getAccessor().h(cls), new j3e(settingsPrivacyScreen, 1)), (gaf) e3e.c().getValue(), h2, e3e.getAccessor().h(bud.class), e3e.getAccessor().h(cls), h3, h4, (qe3) e3e.getAccessor().g(qe3.class));
            default:
                KProperty[] kPropertyArr2 = SettingsPrivacyScreen.x;
                return settingsPrivacyScreen.getContext();
        }
    }
}
