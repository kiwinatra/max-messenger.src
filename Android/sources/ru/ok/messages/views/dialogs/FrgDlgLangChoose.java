package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

public class FrgDlgLangChoose extends FrgDlgChecked<ih6> {
    public final Dialog V2(Bundle bundle) {
        t13 t13 = new t13(O1(), b0h.O(), ym.v.c().a.u(), this);
        LayoutInflater layoutInflater = this.X0;
        if (layoutInflater == null) {
            layoutInflater = D2();
        }
        View inflate = layoutInflater.inflate(ujc.dialog_language_choose, (ViewGroup) null);
        ((RecyclerView) inflate.findViewById(lic.dialog_language__rv_languages)).setAdapter(t13);
        cg8 s = new cg8(G2()).q(S1(qad.p9)).s(inflate);
        s.l(qad.m0, new d10(8, (Object) this));
        return s.g();
    }

    public final Class c3() {
        return ih6.class;
    }

    public final String e3() {
        return "ru.ok.messages.views.dialogs.FrgDlgLangChoose";
    }
}
