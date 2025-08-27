package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import java.util.ArrayList;

public class FrgDlgShowChatHistory extends FrgDlgBase {
    public ArrayList F1;

    public final Dialog V2(Bundle bundle) {
        cg8 q = new cg8(G2()).q(S1(qad.k2));
        q.a.m = false;
        q.i(qad.h2);
        cg8 n = q.n(qad.j2, new wh6(this, 0));
        n.l(qad.i2, new wh6(this, 1));
        return n.g();
    }

    public final void i2(Bundle bundle) {
        super.i2(bundle);
        this.F1 = cjf.h(this.x.getLongArray("ru.ok.tamtam.extra.contact_ids"));
    }
}
