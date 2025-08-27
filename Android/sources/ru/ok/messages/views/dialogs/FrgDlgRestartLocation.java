package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.os.Bundle;

public class FrgDlgRestartLocation extends FrgDlgChecked<vh6> {
    public static FrgDlgRestartLocation f3(long j, long j2) {
        FrgDlgRestartLocation frgDlgRestartLocation = new FrgDlgRestartLocation();
        Bundle bundle = new Bundle();
        bundle.putLong("ru.ok.tamtam.extra.MY_MESSAGE_ID", j);
        bundle.putLong("ru.ok.tamtam.extra.MY_MESSAGE_DURATION", j2);
        frgDlgRestartLocation.L2(bundle);
        return frgDlgRestartLocation;
    }

    public final Dialog V2(Bundle bundle) {
        cg8 cg8 = new cg8(G2());
        cg8.i(jad.u);
        cg8 n = cg8.n(qad.e2, new d10(12, (Object) this));
        n.l(qad.m0, new e10(1));
        return n.g();
    }

    public final Class c3() {
        return vh6.class;
    }

    public final String e3() {
        return "ru.ok.messages.views.dialogs.FrgDlgRestartLocation";
    }
}
