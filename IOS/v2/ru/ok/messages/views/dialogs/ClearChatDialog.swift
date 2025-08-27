package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import kotlin.Lazy;
import ru.ok.tamtam.util.HandledException;

public class ClearChatDialog extends FrgDlgChecked<x13> {
    public static ClearChatDialog f3(long j) {
        ClearChatDialog clearChatDialog = new ClearChatDialog();
        Bundle bundle = new Bundle();
        bundle.putLong("ru.ok.tamtam.extra.CHAT_ID", j);
        clearChatDialog.L2(bundle);
        return clearChatDialog;
    }

    public final Dialog V2(Bundle bundle) {
        CharSequence charSequence;
        z9f h = tr1.h((qra) ym.e());
        long j = F2().getLong("ru.ok.tamtam.extra.CHAT_ID");
        sjd sjd = (sjd) h;
        a32 G = sjd.g().G(j);
        Context G2 = G2();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(G2);
        cg8 q = new cg8(G2()).q(S1(qad.h5));
        yva s = sjd.s();
        m95 l = sjd.l();
        if (G == null) {
            ((uta) l).c(new HandledException("Chat is null, chatId: %d", Long.valueOf(j)), true);
            charSequence = s.k.c(S1(qad.t1));
        } else {
            charSequence = s.k.c(G.K() ? T1(qad.c8, G.r()) : G.N() ? T1(qad.e8, G.m().f()) : T1(qad.d8, G.r()));
        }
        q.a.f = charSequence;
        q.m(S1(qad.m0), new e10(1));
        if (G != null && G.e0() && G.L()) {
            LayoutInflater layoutInflater = this.X0;
            if (layoutInflater == null) {
                layoutInflater = D2();
            }
            View inflate = layoutInflater.inflate(ujc.dialog_with_checkbox, (ViewGroup) null);
            q.s(inflate);
            CheckBox checkBox = (CheckBox) inflate.findViewById(lic.dialog_checkbox__checkbox);
            checkBox.setText(S1(qad.S0));
            checkBox.setTextSize(13.0f);
            checkBox.setTextColor(k0.K);
        }
        if (G != null) {
            q.k(S1(qad.N4), new w13(this, G, 0));
        }
        return q.g();
    }

    public final Class c3() {
        return x13.class;
    }

    public final String e3() {
        return "ru.ok.messages.views.dialogs.ClearChatDialog";
    }
}
