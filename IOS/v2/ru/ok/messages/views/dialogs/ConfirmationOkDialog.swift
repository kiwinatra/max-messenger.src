package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.os.Bundle;

public class ConfirmationOkDialog extends FrgDlgBase {
    public final Dialog V2(Bundle bundle) {
        String string = F2().getString("ru.ok.tamtam.extra.CONTENT");
        if (cvg.A(string) && F2().getInt("ru.ok.tamtam.extra.CONTENT_RES_ID") != 0) {
            string = S1(F2().getInt("ru.ok.tamtam.extra.CONTENT_RES_ID"));
        }
        String string2 = F2().getString("ru.ok.tamtam.extra.TITLE");
        if (cvg.A(string2) && F2().getInt("ru.ok.tamtam.extra.TITLE_RES_ID") != 0) {
            string2 = S1(F2().getInt("ru.ok.tamtam.extra.TITLE_RES_ID"));
        }
        cg8 cg8 = new cg8(G2());
        cg8.a.f = string;
        cg8 n = cg8.n(qad.y1, new d10(1, (Object) this));
        n.a.m = false;
        return n.q(string2).g();
    }
}
