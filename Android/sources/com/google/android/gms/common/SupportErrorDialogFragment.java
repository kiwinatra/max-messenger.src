package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

public class SupportErrorDialogFragment extends DialogFragment {
    public Dialog B1;
    public DialogInterface.OnCancelListener C1;
    public AlertDialog D1;

    public final Dialog V2(Bundle bundle) {
        Dialog dialog = this.B1;
        if (dialog != null) {
            return dialog;
        }
        this.s1 = false;
        if (this.D1 == null) {
            Context O1 = O1();
            vzg.m(O1);
            this.D1 = new AlertDialog.Builder(O1).create();
        }
        return this.D1;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.C1;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
