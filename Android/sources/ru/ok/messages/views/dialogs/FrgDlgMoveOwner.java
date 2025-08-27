package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public class FrgDlgMoveOwner extends FrgDlgChecked<nh6> {
    public static FrgDlgMoveOwner f3(long j, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putLong("ru.ok.tamtam.extra.CHAT_ID", j);
        bundle.putBoolean("ru.ok.tamtam.extra.EXTRA_BEFORE_LEAVE", z);
        FrgDlgMoveOwner frgDlgMoveOwner = new FrgDlgMoveOwner();
        frgDlgMoveOwner.L2(bundle);
        return frgDlgMoveOwner;
    }

    public final Dialog V2(Bundle bundle) {
        long j = this.x.getLong("ru.ok.tamtam.extra.CHAT_ID");
        a32 G = ((qra) ym.e()).l().G(j);
        String S1 = this.x.getBoolean("ru.ok.tamtam.extra.EXTRA_BEFORE_LEAVE", false) ? S1(qad.k) : S1(qad.m0);
        cg8 cg8 = new cg8(G2());
        int i = qad.t0;
        cg8 q = cg8.q(S1(i));
        String r = G.r();
        q.a.f = ((qra) ym.e()).v().k.c(G.K() ? String.format(S1(qad.i), new Object[]{r}) : String.format(S1(qad.j), new Object[]{r}));
        q.k(S1, new mh6(this, j, 0));
        q.o(S1(i), new mh6(this, j, 1));
        int i2 = qad.m0;
        if (!S1.equals(S1(i2))) {
            q.m(S1(i2), (DialogInterface.OnClickListener) null);
        }
        return q.g();
    }

    public final Class c3() {
        return nh6.class;
    }

    public final String e3() {
        return "ru.ok.messages.views.dialogs.FrgDlgMoveOwner";
    }
}
