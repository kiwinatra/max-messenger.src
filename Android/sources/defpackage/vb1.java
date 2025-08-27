package defpackage;

import android.view.View;
import kotlin.reflect.KProperty;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;

/* renamed from: vb1  reason: default package */
public final /* synthetic */ class vb1 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ CallLinkInfoScreen b;
    public final /* synthetic */ tb1 c;

    public /* synthetic */ vb1(tb1 tb1, CallLinkInfoScreen callLinkInfoScreen) {
        this.c = tb1;
        this.b = callLinkInfoScreen;
    }

    public final void onClick(View view) {
        tb1 tb1 = this.c;
        CallLinkInfoScreen callLinkInfoScreen = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = CallLinkInfoScreen.z0;
                sb1 sb1 = tb1.d;
                if (sb1 instanceof pb1) {
                    callLinkInfoScreen.d0().j((long) kqa.b);
                    return;
                } else if (sb1 instanceof rb1) {
                    callLinkInfoScreen.c0().c(qq1.a, false);
                    callLinkInfoScreen.d0().j((long) kqa.e);
                    return;
                } else {
                    return;
                }
            default:
                KProperty[] kPropertyArr2 = CallLinkInfoScreen.z0;
                callLinkInfoScreen.c0().c(qq1.a, false);
                callLinkInfoScreen.d0().j(tb1.h.getItemId());
                return;
        }
    }

    public /* synthetic */ vb1(CallLinkInfoScreen callLinkInfoScreen, tb1 tb1) {
        this.b = callLinkInfoScreen;
        this.c = tb1;
    }
}
