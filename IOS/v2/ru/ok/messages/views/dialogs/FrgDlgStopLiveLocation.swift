package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.os.Bundle;

public class FrgDlgStopLiveLocation extends FrgDlgChecked<yh6> {
    public final Dialog V2(Bundle bundle) {
        a32 G = ((qra) ym.e()).l().G(this.x.getLong("ru.ok.tamtam.extra.CHAT_ID"));
        cg8 cg8 = new cg8(G2());
        G.l0();
        cg8 q = cg8.q(G.X);
        q.i(qad.N3);
        cg8 j = q.j(jad.G, new w13(this, G, 7));
        j.l(qad.m0, new d10(14, (Object) this));
        return j.g();
    }

    public final Class c3() {
        return yh6.class;
    }

    public final String e3() {
        return "ru.ok.messages.views.dialogs.FrgDlgStopLiveLocation";
    }
}
