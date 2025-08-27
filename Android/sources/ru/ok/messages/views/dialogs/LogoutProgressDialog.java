package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import kotlin.Lazy;

public class LogoutProgressDialog extends DialogFragment {
    public final Dialog V2(Bundle bundle) {
        Context G2 = G2();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(G2);
        cg8 cg8 = new cg8(G2());
        int i = ujc.dialog_progress_with_text;
        zc zcVar = cg8.a;
        zcVar.t = null;
        zcVar.s = i;
        zcVar.m = false;
        ed g = cg8.g();
        TextView textView = (TextView) g.findViewById(lic.dialog_progress__text);
        if (textView != null) {
            textView.setText(S1(qad.B1));
            textView.setTextColor(k0.K);
            textView.setTextSize(13.0f);
        }
        ProgressBar progressBar = (ProgressBar) g.findViewById(lic.dialog_progress__progress);
        if (progressBar != null) {
            progressBar.setIndeterminate(true);
            progressBar.setMax(100);
            iq.h(k0, progressBar);
        }
        return g;
    }
}
