package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.os.Bundle;

public class FrgDlgFavoriteStickersLimit extends FrgDlgChecked<hh6> {
    public final Dialog V2(Bundle bundle) {
        Bundle bundle2 = this.x;
        if (bundle2 != null) {
            String string = bundle2.getString("ru.ok.tamtam.extra.TEXT");
            if (!cvg.A(string)) {
                cg8 cg8 = new cg8(G2());
                cg8.a.f = string;
                cg8 n = cg8.n(qad.W6, new d10(7, (Object) this));
                n.l(qad.m0, new e10(1));
                return n.g();
            }
            throw new IllegalArgumentException("Text can't be empty");
        }
        throw new IllegalArgumentException("Arguments can't be null");
    }

    public final Class c3() {
        return hh6.class;
    }

    public final String e3() {
        return "ru.ok.messages.views.dialogs.FrgDlgFavoriteStickersLimit";
    }
}
