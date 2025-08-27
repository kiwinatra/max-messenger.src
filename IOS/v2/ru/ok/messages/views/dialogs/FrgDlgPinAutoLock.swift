package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import java.util.Locale;
import ru.ok.messages.settings.FrgPinLockSettings;

public class FrgDlgPinAutoLock extends FrgDlgBase {
    public static final long[] F1 = {-1, 60000, 300000, 3600000};

    public final Dialog V2(Bundle bundle) {
        cg8 cg8 = new cg8(G2());
        cg8.a.n = this;
        String[] strArr = new String[4];
        for (int i = 0; i < 4; i++) {
            String q = j4b.q(F1[i], O1());
            strArr[i] = q;
            if (!q.isEmpty()) {
                strArr[i] = strArr[i].substring(0, 1).toUpperCase(Locale.getDefault()) + strArr[i].substring(1);
            }
        }
        cg8.r(qad.w7);
        cg8.h(strArr, new d10(10, (Object) this));
        return cg8.g();
    }

    public final void Z2(m5 m5Var) {
        this.B1 = false;
        if (!(this.G0 instanceof FrgPinLockSettings)) {
            throw new IllegalStateException("FrgDlgPinAutoLock must be attach to fragment implements FrgDlgPinAutoLock.Listener");
        }
    }
}
