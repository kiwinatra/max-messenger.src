package defpackage;

import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: uyb  reason: default package */
public final /* synthetic */ class uyb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileEditAdminPermissionsWidget b;

    public /* synthetic */ uyb(ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget, int i) {
        this.a = i;
        this.b = profileEditAdminPermissionsWidget;
    }

    public final Object invoke() {
        int i = 0;
        ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = ProfileEditAdminPermissionsWidget.v0;
                profileEditAdminPermissionsWidget.getClass();
                KProperty[] kPropertyArr2 = ProfileEditAdminPermissionsWidget.v0;
                KProperty kProperty = kPropertyArr2[0];
                long longValue = ((Number) profileEditAdminPermissionsWidget.b.a(profileEditAdminPermissionsWidget)).longValue();
                KProperty kProperty2 = kPropertyArr2[1];
                long longValue2 = ((Number) profileEditAdminPermissionsWidget.c.a(profileEditAdminPermissionsWidget)).longValue();
                eyb d0 = profileEditAdminPermissionsWidget.d0();
                boolean c0 = profileEditAdminPermissionsWidget.c0();
                bzb bzb = bzb.a;
                return new syb(longValue, longValue2, d0, c0, (qx2) bzb.d().getValue(), (eu3) bzb.getAccessor().h(eu3.class).getValue(), bzb.getAccessor().h(lwb.class), bzb.c(), bzb.e(), bzb.getAccessor().h(uj5.class));
            default:
                KProperty[] kPropertyArr3 = ProfileEditAdminPermissionsWidget.v0;
                profileEditAdminPermissionsWidget.getClass();
                OneMeButton oneMeButton = new OneMeButton(profileEditAdminPermissionsWidget.getContext(), (AttributeSet) null);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
                int roundToInt = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
                layoutParams.leftMargin = roundToInt;
                layoutParams.rightMargin = roundToInt;
                layoutParams.topMargin = roundToInt;
                layoutParams.bottomMargin = roundToInt;
                oneMeButton.setLayoutParams(layoutParams);
                oneMeButton.setSize(aqa.c);
                oneMeButton.setMode(zpa.a);
                oneMeButton.setAppearance(xpa.c);
                if (profileEditAdminPermissionsWidget.d0() != eyb.SETUP_NEW_ADMIN) {
                    i = 8;
                }
                oneMeButton.setVisibility(i);
                oneMeButton.setText(profileEditAdminPermissionsWidget.d0() == eyb.CHANGE_ADMIN ? ixa.i1 : ixa.K0);
                ct.G(oneMeButton, 300, new u99(20, (Object) profileEditAdminPermissionsWidget));
                return oneMeButton;
        }
    }
}
