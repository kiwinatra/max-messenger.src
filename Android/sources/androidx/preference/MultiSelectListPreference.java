package androidx.preference;

import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.view.AbsSavedState;
import java.util.HashSet;
import java.util.Set;

public class MultiSelectListPreference extends DialogPreference {
    public final CharSequence[] c1;
    public final CharSequence[] d1;
    public final HashSet e1 = new HashSet();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MultiSelectListPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            int r0 = defpackage.cdc.dialogPreferenceStyle
            r1 = 16842897(0x1010091, float:2.3693964E-38)
            int r0 = defpackage.b0h.s(r0, r1, r4)
            r3.<init>(r4, r5, r0)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r3.e1 = r1
            int[] r1 = defpackage.nnc.MultiSelectListPreference
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            int r5 = defpackage.nnc.MultiSelectListPreference_entries
            int r0 = defpackage.nnc.MultiSelectListPreference_android_entries
            java.lang.CharSequence[] r5 = r4.getTextArray(r5)
            if (r5 != 0) goto L_0x0028
            java.lang.CharSequence[] r5 = r4.getTextArray(r0)
        L_0x0028:
            r3.c1 = r5
            int r5 = defpackage.nnc.MultiSelectListPreference_entryValues
            int r0 = defpackage.nnc.MultiSelectListPreference_android_entryValues
            java.lang.CharSequence[] r5 = r4.getTextArray(r5)
            if (r5 != 0) goto L_0x0038
            java.lang.CharSequence[] r5 = r4.getTextArray(r0)
        L_0x0038:
            r3.d1 = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.MultiSelectListPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void A(Set set) {
        HashSet hashSet = this.e1;
        hashSet.clear();
        hashSet.addAll(set);
        if (x()) {
            Set<String> set2 = null;
            if (x()) {
                set2 = this.b.b().getStringSet(this.Z, (Set) null);
            }
            if (!set.equals(set2)) {
                SharedPreferences.Editor a = this.b.a();
                a.putStringSet(this.Z, set);
                y(a);
            }
        }
        h();
    }

    public final Object o(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(tw9.class)) {
            super.p(parcelable);
            return;
        }
        tw9 tw9 = (tw9) parcelable;
        super.p(tw9.getSuperState());
        A(tw9.a);
    }

    public final Parcelable q() {
        this.S0 = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.A0) {
            return absSavedState;
        }
        tw9 tw9 = new tw9(absSavedState);
        tw9.a = this.e1;
        return tw9;
    }

    public final void r(Object obj) {
        Set<String> set = (Set) obj;
        if (x()) {
            set = this.b.b().getStringSet(this.Z, set);
        }
        A(set);
    }
}
