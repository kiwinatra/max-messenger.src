package defpackage;

import android.view.KeyEvent;
import android.view.View;

/* renamed from: mee  reason: default package */
public final /* synthetic */ class mee implements View.OnKeyListener {
    public final /* synthetic */ oee a;
    public final /* synthetic */ int b;

    public /* synthetic */ mee(oee oee, int i) {
        this.a = oee;
        this.b = i;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        boolean z = false;
        if (i != 67 || keyEvent.getAction() != 0) {
            return false;
        }
        lg3 lg3 = (lg3) this.a.E0;
        int i2 = this.b;
        int i3 = i2 - 1;
        lg7 J0 = lg3.J0(i2);
        String M = J0 != null ? ((oee) J0).M() : null;
        if (M == null || M.length() == 0) {
            z = true;
        }
        if (!(!z)) {
            lg7 J02 = lg3.J0(i3);
            if (J02 != null) {
                oee oee = (oee) J02;
                oee.N("");
                oee.F0.requestFocus();
            }
        } else if (J0 != null) {
            ((oee) J0).N("");
        }
        return true;
    }
}
