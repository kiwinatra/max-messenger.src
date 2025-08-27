package androidx.preference;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;

public class MultiSelectListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    public final HashSet J1 = new HashSet();
    public boolean K1;
    public CharSequence[] L1;
    public CharSequence[] M1;

    public final void c3(boolean z) {
        if (z && this.K1) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) Z2();
            HashSet hashSet = this.J1;
            if (multiSelectListPreference.a(hashSet)) {
                multiSelectListPreference.A(hashSet);
            }
        }
        this.K1 = false;
    }

    public final void d3(dd ddVar) {
        int length = this.M1.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.J1.contains(this.M1[i].toString());
        }
        ddVar.c(this.L1, zArr, new uw9(this));
    }

    public final void i2(Bundle bundle) {
        CharSequence[] charSequenceArr;
        super.i2(bundle);
        HashSet hashSet = this.J1;
        if (bundle == null) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) Z2();
            if (multiSelectListPreference.c1 == null || (charSequenceArr = multiSelectListPreference.d1) == null) {
                throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
            }
            hashSet.clear();
            hashSet.addAll(multiSelectListPreference.e1);
            this.K1 = false;
            this.L1 = multiSelectListPreference.c1;
            this.M1 = charSequenceArr;
            return;
        }
        hashSet.clear();
        hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
        this.K1 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
        this.L1 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
        this.M1 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
    }

    public final void x2(Bundle bundle) {
        super.x2(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList(this.J1));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.K1);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.L1);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.M1);
    }
}
