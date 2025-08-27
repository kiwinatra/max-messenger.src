package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.a;
import java.util.ArrayList;
import ru.ok.messages.settings.notification.FrgNotificationSettings;

public class FrgDlgNotification extends FrgDlgBase {
    public final Dialog V2(Bundle bundle) {
        cg8 cg8 = new cg8(G2());
        cg8.a.n = this;
        cg8.q(S1(qad.Z5));
        ArrayList arrayList = new ArrayList();
        arrayList.add(S1(qad.W5));
        arrayList.add(S1(qad.X5));
        arrayList.add(S1(qad.V5));
        cg8.h((CharSequence[]) arrayList.toArray(new CharSequence[0]), new w13(this, arrayList, 6));
        return cg8.g();
    }

    public final void Z2(m5 m5Var) {
        this.B1 = false;
        a aVar = this.G0;
        if (aVar != null && !(aVar instanceof FrgNotificationSettings)) {
            throw new IllegalStateException("FrgDlgNotification must be attached to fragment that implements FrgDlgNotification.Listener");
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        a aVar = this.G0;
        FrgNotificationSettings frgNotificationSettings = null;
        if ((aVar != null ? (FrgNotificationSettings) aVar : null) != null) {
            if (aVar != null) {
                frgNotificationSettings = (FrgNotificationSettings) aVar;
            }
            if (frgNotificationSettings.o1) {
                frgNotificationSettings.E1 = false;
                frgNotificationSettings.k3();
            }
        }
    }
}
