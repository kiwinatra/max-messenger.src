package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import java.util.ArrayList;

public class FrgDlgDisableNotifs extends FrgDlgChecked<gh6> {
    public static FrgDlgDisableNotifs f3(long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("ru.ok.tamtam.extra.CHAT", j);
        FrgDlgDisableNotifs frgDlgDisableNotifs = new FrgDlgDisableNotifs();
        frgDlgDisableNotifs.L2(bundle);
        return frgDlgDisableNotifs;
    }

    public final Dialog V2(Bundle bundle) {
        a32 G = ((qra) ym.e()).l().G(this.x.getLong("ru.ok.tamtam.extra.CHAT"));
        cg8 cg8 = new cg8(G2());
        cg8.a.n = this;
        cg8.q(S1(qad.Z5));
        ArrayList arrayList = new ArrayList();
        arrayList.add(S1(qad.W5));
        arrayList.add(S1(qad.X5));
        arrayList.add(S1(qad.V5));
        arrayList.add(S1(qad.f6));
        cg8.h((CharSequence[]) arrayList.toArray(new CharSequence[0]), new fh6(this, arrayList, G, 0));
        return cg8.g();
    }

    public final Class c3() {
        return gh6.class;
    }

    public final String e3() {
        return "ru.ok.messages.views.dialogs.FrgDlgDisableNotifs";
    }

    public final void onCancel(DialogInterface dialogInterface) {
        gh6 gh6 = (gh6) b3();
        if (gh6 != null) {
            gh6.x();
        }
    }
}
