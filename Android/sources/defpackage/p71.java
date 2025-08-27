package defpackage;

import android.os.Bundle;
import android.view.View;
import kotlin.reflect.KProperty;
import one.me.calllist.ui.CallHistoryScreen;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.settings.privacy.ui.onboarding.SafeModeOnboardingScreen;

/* renamed from: p71  reason: default package */
public final /* synthetic */ class p71 implements View.OnClickListener {
    public final /* synthetic */ int a;

    public /* synthetic */ p71(int i) {
        this.a = i;
    }

    private final void a(View view) {
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = CallHistoryScreen.y0;
                b71.b.W0().b(":call-contact", (Bundle) null);
                return;
            case 1:
                KProperty[] kPropertyArr2 = CallHistoryScreen.y0;
                b71.b.W0().b(":call-contact", (Bundle) null);
                return;
            case 2:
                int i = r25.S0;
                return;
            case 3:
                KProperty[] kPropertyArr3 = MediaKeyboardWidget.A0;
                nq7.b.W0().b(":stickers/settings", (Bundle) null);
                return;
            case 4:
                return;
            default:
                int i2 = SafeModeOnboardingScreen.c;
                i3e.b.W0().b(":settings/privacy/pincode?mode=setup&replace_top=true", (Bundle) null);
                return;
        }
    }
}
