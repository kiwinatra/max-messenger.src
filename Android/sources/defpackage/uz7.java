package defpackage;

import android.content.DialogInterface;
import androidx.preference.ListPreferenceDialogFragmentCompat;

/* renamed from: uz7  reason: default package */
public final class uz7 implements DialogInterface.OnClickListener {
    public final /* synthetic */ ListPreferenceDialogFragmentCompat a;

    public uz7(ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat) {
        this.a = listPreferenceDialogFragmentCompat;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat = this.a;
        listPreferenceDialogFragmentCompat.J1 = i;
        listPreferenceDialogFragmentCompat.I1 = -1;
        dialogInterface.dismiss();
    }
}
