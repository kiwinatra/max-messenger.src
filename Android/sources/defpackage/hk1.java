package defpackage;

import android.view.View;
import one.me.calls.ui.ui.call.CallScreen;

/* renamed from: hk1  reason: default package */
public final /* synthetic */ class hk1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ jk1 b;

    public /* synthetic */ hk1(jk1 jk1, int i) {
        this.a = i;
        this.b = jk1;
    }

    public final void onClick(View view) {
        jk1 jk1 = this.b;
        switch (this.a) {
            case 0:
                ik1 ik1 = jk1.K0;
                if (ik1 != null) {
                    gga gga = CallScreen.J0;
                    ((CallScreen) ((vs6) ik1).b).p0().c.g();
                    return;
                }
                return;
            default:
                ik1 ik12 = jk1.K0;
                if (ik12 != null) {
                    ze1 ze1 = jk1.P0;
                    gga gga2 = CallScreen.J0;
                    ((CallScreen) ((vs6) ik12).b).p0().o(ze1);
                    return;
                }
                return;
        }
    }
}
