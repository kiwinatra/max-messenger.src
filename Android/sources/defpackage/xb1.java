package defpackage;

import android.widget.LinearLayout;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.reflect.KProperty;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.profile.ProfileScreen;
import one.me.profileedit.ProfileEditScreen;
import one.me.sdk.arch.Widget;

/* renamed from: xb1  reason: default package */
public final /* synthetic */ class xb1 implements en {
    public final /* synthetic */ int a;
    public final /* synthetic */ gh5 b;
    public final /* synthetic */ Widget c;

    public /* synthetic */ xb1(gh5 gh5, Widget widget, int i) {
        this.a = i;
        this.b = gh5;
        this.c = widget;
    }

    public final void i(AppBarLayout appBarLayout, int i) {
        boolean z = false;
        Widget widget = this.c;
        gh5 gh5 = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = CallLinkInfoScreen.z0;
                float interpolation = gh5.getInterpolation(((float) Math.abs(i)) / ((float) appBarLayout.getTotalScrollRange()));
                CallLinkInfoScreen callLinkInfoScreen = (CallLinkInfoScreen) widget;
                callLinkInfoScreen.getClass();
                KProperty[] kPropertyArr2 = CallLinkInfoScreen.z0;
                ((LinearLayout) callLinkInfoScreen.x.getValue(callLinkInfoScreen, kPropertyArr2[0])).setAlpha(1.0f - interpolation);
                ((h3b) callLinkInfoScreen.z.getValue(callLinkInfoScreen, kPropertyArr2[2])).setTitleAlpha(interpolation);
                return;
            case 1:
                KProperty[] kPropertyArr3 = CallOpponentsListWidget.B0;
                float interpolation2 = gh5.getInterpolation(((float) Math.abs(i)) / ((float) appBarLayout.getTotalScrollRange()));
                float f = 1.0f - interpolation2;
                CallOpponentsListWidget callOpponentsListWidget = (CallOpponentsListWidget) widget;
                callOpponentsListWidget.getClass();
                KProperty[] kPropertyArr4 = CallOpponentsListWidget.B0;
                KProperty kProperty = kPropertyArr4[0];
                sn0 sn0 = callOpponentsListWidget.w;
                ((LinearLayout) sn0.getValue()).setAlpha(f);
                KProperty kProperty2 = kPropertyArr4[0];
                LinearLayout linearLayout = (LinearLayout) sn0.getValue();
                if (f > 0.1f) {
                    z = true;
                }
                kne.S(linearLayout, z);
                callOpponentsListWidget.e0().setTitleAlpha(interpolation2);
                return;
            case 2:
                KProperty[] kPropertyArr5 = ProfileEditScreen.w0;
                float interpolation3 = gh5.getInterpolation(((float) Math.abs(i)) / ((float) appBarLayout.getTotalScrollRange()));
                ProfileEditScreen profileEditScreen = (ProfileEditScreen) widget;
                profileEditScreen.getClass();
                ((LinearLayout) profileEditScreen.z.getValue(profileEditScreen, ProfileEditScreen.w0[3])).setAlpha(1.0f - interpolation3);
                profileEditScreen.c0().setTitleAlpha(interpolation3);
                return;
            default:
                KProperty[] kPropertyArr6 = ProfileScreen.D0;
                float interpolation4 = gh5.getInterpolation(((float) Math.abs(i)) / ((float) appBarLayout.getTotalScrollRange()));
                ProfileScreen profileScreen = (ProfileScreen) widget;
                profileScreen.getClass();
                ((LinearLayout) profileScreen.y.getValue(profileScreen, ProfileScreen.D0[3])).setAlpha(1.0f - interpolation4);
                profileScreen.e0().setTitleAlpha(interpolation4);
                return;
        }
    }
}
