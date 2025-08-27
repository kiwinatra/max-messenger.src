package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;

public class ListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    public int J1;
    public CharSequence[] K1;
    public CharSequence[] L1;

    public final void c3(boolean z) {
        int i;
        if (z && (i = this.J1) >= 0) {
            String charSequence = this.L1[i].toString();
            ListPreference listPreference = (ListPreference) Z2();
            if (listPreference.a(charSequence)) {
                listPreference.C(charSequence);
            }
        }
    }

    public final void d3(dd ddVar) {
        ddVar.f(this.K1, this.J1, new uz7(this));
        ddVar.e((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    public final void i2(Bundle bundle) {
        CharSequence[] charSequenceArr;
        super.i2(bundle);
        if (bundle == null) {
            ListPreference listPreference = (ListPreference) Z2();
            if (listPreference.c1 == null || (charSequenceArr = listPreference.d1) == null) {
                throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
            }
            this.J1 = listPreference.A(listPreference.e1);
            this.K1 = listPreference.c1;
            this.L1 = charSequenceArr;
            return;
        }
        this.J1 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
        this.K1 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
        this.L1 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
    }

    public final void x2(Bundle bundle) {
        super.x2(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.J1);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.K1);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.L1);
    }
}
