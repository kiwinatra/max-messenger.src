package defpackage;

import android.util.AttributeSet;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.profileedit.ProfileEditScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: m0c  reason: default package */
public final /* synthetic */ class m0c implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileEditScreen b;

    public /* synthetic */ m0c(ProfileEditScreen profileEditScreen, int i) {
        this.a = i;
        this.b = profileEditScreen;
    }

    public final Object invoke() {
        ProfileEditScreen profileEditScreen = this.b;
        switch (this.a) {
            case 0:
                return profileEditScreen.a == ((qjd) ((x23) bzb.a.getAccessor().h(x23.class).getValue())).s() ? jgd.SETTINGS_PROFILE_EDITING : jgd.CHAT_INFO_EDITING;
            default:
                KProperty[] kPropertyArr = ProfileEditScreen.w0;
                OneMeButton oneMeButton = new OneMeButton(profileEditScreen.getContext(), (AttributeSet) null);
                oneMeButton.setId(fxa.d0);
                oneMeButton.setSize(aqa.c);
                oneMeButton.setMode(zpa.a);
                oneMeButton.setAppearance(xpa.o);
                wz3 wz3 = new wz3(-1, -2);
                wz3.c = 80;
                float f = (float) 16;
                wz3.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 0, MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density));
                oneMeButton.setLayoutParams(wz3);
                oneMeButton.setText(ixa.U);
                ct.G(oneMeButton, 300, new o0c(profileEditScreen, 1));
                return oneMeButton;
        }
    }
}
