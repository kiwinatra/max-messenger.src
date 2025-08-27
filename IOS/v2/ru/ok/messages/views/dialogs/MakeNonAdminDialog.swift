package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.os.Bundle;

public class MakeNonAdminDialog extends FrgDlgChecked<md8> {
    public long F1;

    public final Dialog V2(Bundle bundle) {
        String string = this.x.getString("ru.ok.tamtam.extra.NAME");
        this.F1 = this.x.getLong("ru.ok.tamtam.extra.CONTACT_IDs");
        cg8 cg8 = new cg8(O1());
        cg8.r(qad.k1);
        cg8.a.f = T1(qad.i1, string);
        cg8 j = cg8.j(qad.W1, new d10(17, (Object) this));
        j.l(qad.m0, new e10(1));
        return j.g();
    }

    public final Class c3() {
        return md8.class;
    }

    public final String e3() {
        return "ru.ok.messages.views.dialogs.MakeNonAdminDialog";
    }
}
