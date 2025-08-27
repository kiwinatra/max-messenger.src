package defpackage;

import android.content.Intent;
import android.view.View;
import kotlin.reflect.KProperty;
import one.me.calls.ui.ui.call.CallScreen;

/* renamed from: ck1  reason: default package */
public final /* synthetic */ class ck1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ek1 b;

    public /* synthetic */ ck1(ek1 ek1, int i) {
        this.a = i;
        this.b = ek1;
    }

    public final void onClick(View view) {
        ek1 ek1 = this.b;
        switch (this.a) {
            case 0:
                dk1 dk1 = ek1.E0;
                if (dk1 != null) {
                    gga gga = CallScreen.J0;
                    jj1 p0 = ((mh1) dk1).a.p0();
                    KProperty[] kPropertyArr = jj1.O0;
                    p0.q(false, (Intent) null);
                    return;
                }
                return;
            default:
                dk1 dk12 = ek1.E0;
                if (dk12 != null) {
                    gga gga2 = CallScreen.J0;
                    ((mh1) dk12).a.p0().c.h.a(!ek1.F0);
                    return;
                }
                return;
        }
    }
}
