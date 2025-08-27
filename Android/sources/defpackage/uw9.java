package defpackage;

import android.content.DialogInterface;
import androidx.preference.MultiSelectListPreferenceDialogFragmentCompat;

/* renamed from: uw9  reason: default package */
public final class uw9 implements DialogInterface.OnMultiChoiceClickListener {
    public final /* synthetic */ MultiSelectListPreferenceDialogFragmentCompat a;

    public uw9(MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat) {
        this.a = multiSelectListPreferenceDialogFragmentCompat;
    }

    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat = this.a;
        if (z) {
            multiSelectListPreferenceDialogFragmentCompat.K1 |= multiSelectListPreferenceDialogFragmentCompat.J1.add(multiSelectListPreferenceDialogFragmentCompat.M1[i].toString());
        } else {
            multiSelectListPreferenceDialogFragmentCompat.K1 |= multiSelectListPreferenceDialogFragmentCompat.J1.remove(multiSelectListPreferenceDialogFragmentCompat.M1[i].toString());
        }
    }
}
