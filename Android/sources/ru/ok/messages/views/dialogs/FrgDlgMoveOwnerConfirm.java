package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.os.Bundle;

public class FrgDlgMoveOwnerConfirm extends FrgDlgChecked<ph6> {
    public final Dialog V2(Bundle bundle) {
        long j = this.x.getLong("ru.ok.tamtam.extra.EXTRA_CONTACT_ID");
        a32 G = ((qra) ym.e()).l().G(this.x.getLong("ru.ok.tamtam.extra.EXTRA_CHAT_ID"));
        cg8 cg8 = new cg8(G2());
        int i = qad.t0;
        cg8 q = cg8.q(S1(i));
        String r = G.r();
        q.a.f = ((qra) ym.e()).v().k.c(G.K() ? String.format(S1(qad.u0), new Object[]{r}) : String.format(S1(qad.v0), new Object[]{r}));
        q.m(S1(qad.m0), new d10(9, (Object) this));
        q.k(S1(i), new oh6(this, j));
        return q.create();
    }

    public final Class c3() {
        return ph6.class;
    }

    public final String e3() {
        return "ru.ok.messages.views.dialogs.FrgDlgMoveOwnerConfirm";
    }
}
