package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.os.Bundle;

public class FrgDlgReportType extends FrgDlgChecked<uh6> {
    public final Dialog V2(Bundle bundle) {
        cg8 q = new cg8(G2()).q(((qra) ym.e()).l().G(F2().getLong("ru.ok.tamtam.extra.CHAT_ID")).K() ? S1(qad.g5) : S1(qad.k5));
        q.h(new CharSequence[]{S1(qad.q8), S1(qad.p8), S1(qad.m8), S1(qad.n8), S1(qad.o8)}, new d10(11, (Object) this));
        return q.g();
    }

    public final Class c3() {
        return uh6.class;
    }

    public final String e3() {
        return "ru.ok.messages.views.dialogs.FrgDlgReportType";
    }
}
