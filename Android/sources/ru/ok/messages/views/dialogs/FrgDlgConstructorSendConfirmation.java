package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.os.Bundle;

public class FrgDlgConstructorSendConfirmation extends FrgDlgChecked<dh6> {
    public final Dialog V2(Bundle bundle) {
        nd c = ((qra) ym.e()).c();
        String string = F2().getString("ru.ok.tamtam.extra.CONSTRUCTOR_NAME");
        cg8 q = new cg8(G2()).q(T1(qad.H1, string));
        q.h(new CharSequence[]{S1(qad.X6), S1(qad.G1), S1(qad.m0)}, new d10(this, c));
        return q.g();
    }

    public final Class c3() {
        return dh6.class;
    }

    public final String e3() {
        return "ru.ok.messages.views.dialogs.FrgDlgConstructorSendConfirmation";
    }
}
