package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import java.util.ArrayList;

public class FrgDlgNightMode extends FrgDlgChecked<qh6> {
    public final Dialog V2(Bundle bundle) {
        cg8 cg8 = new cg8(G2());
        cg8.q(S1(qad.b9));
        ArrayList arrayList = new ArrayList();
        arrayList.add(S1(qad.i9));
        arrayList.add(S1(qad.g9));
        hn4 n = ((qra) ym.e()).n();
        if (n.a.getPackageManager().hasSystemFeature("android.hardware.sensor.light") && n.a.getPackageManager().hasSystemFeature("android.hardware.sensor.proximity")) {
            arrayList.add(S1(qad.c9));
        }
        arrayList.add(S1(qad.f9));
        cg8.h((CharSequence[]) arrayList.toArray(new CharSequence[0]), new w13(this, arrayList, 4));
        return cg8.create();
    }

    public final Class c3() {
        return qh6.class;
    }

    public final String e3() {
        return "ru.ok.messages.views.dialogs.FrgDlgNightMode";
    }
}
