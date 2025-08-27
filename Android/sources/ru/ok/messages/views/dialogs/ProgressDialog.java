package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.c;

public class ProgressDialog extends FrgDlgBase {
    public n7c F1;

    public static ProgressDialog b3(String str, boolean z, c cVar, String str2) {
        ProgressDialog progressDialog = new ProgressDialog();
        Bundle bundle = new Bundle();
        bundle.putString("ru.ok.tamtam.extra.TITLE", str);
        bundle.putBoolean("ru.ok.tamtam.extra.CANCELABLE", z);
        bundle.putString("ru.ok.tamtam.extra.NEGATIVE_TEXT", str2);
        bundle.putBoolean("ru.ok.tamtam.extra.INDETERMINATE", true);
        progressDialog.L2(bundle);
        progressDialog.Y2(cVar, "ru.ok.messages.views.dialogs.ProgressDialog");
        return progressDialog;
    }

    public final Dialog V2(Bundle bundle) {
        String string = this.x.getString("ru.ok.tamtam.extra.TITLE");
        boolean z = this.x.getBoolean("ru.ok.tamtam.extra.CANCELABLE");
        String string2 = this.x.getString("ru.ok.tamtam.extra.NEGATIVE_TEXT", "");
        boolean z2 = this.x.getBoolean("ru.ok.tamtam.extra.INDETERMINATE");
        this.r1 = z;
        Dialog dialog = this.w1;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
        if (string2 == null || string2.isEmpty()) {
            Context O1 = O1();
            cg8 cg8 = new cg8(O1);
            cg8.a.m = z;
            m5a.P(O1, string, cg8, z2);
            return cg8.create();
        }
        Context O12 = O1();
        cg8 cg82 = new cg8(O12);
        cg82.a.m = z;
        cg82.m(string2, new e10(2));
        m5a.P(O12, string, cg82, z2);
        return cg82.create();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        n7c n7c = this.F1;
        if (n7c != null) {
            n7c.b();
        }
    }
}
