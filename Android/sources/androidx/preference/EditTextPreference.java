package androidx.preference;

import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.AbsSavedState;

public class EditTextPreference extends DialogPreference {
    public String c1;

    /* JADX WARNING: type inference failed for: r5v5, types: [java.lang.Object, wc8] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EditTextPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            int r0 = defpackage.cdc.editTextPreferenceStyle
            r1 = 16842898(0x1010092, float:2.3693967E-38)
            int r0 = defpackage.b0h.s(r0, r1, r4)
            r3.<init>(r4, r5, r0)
            int[] r1 = defpackage.nnc.EditTextPreference
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            int r5 = defpackage.nnc.EditTextPreference_useSimpleSummaryProvider
            boolean r0 = r4.getBoolean(r5, r2)
            boolean r5 = r4.getBoolean(r5, r0)
            if (r5 == 0) goto L_0x0031
            wc8 r5 = defpackage.wc8.x
            if (r5 != 0) goto L_0x002a
            wc8 r5 = new wc8
            r5.<init>()
            defpackage.wc8.x = r5
        L_0x002a:
            wc8 r5 = defpackage.wc8.x
            r3.U0 = r5
            r3.h()
        L_0x0031:
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.EditTextPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void A(String str) {
        boolean w = w();
        this.c1 = str;
        t(str);
        boolean w2 = w();
        if (w2 != w) {
            i(w2);
        }
        h();
    }

    public final Object o(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(b05.class)) {
            super.p(parcelable);
            return;
        }
        b05 b05 = (b05) parcelable;
        super.p(b05.getSuperState());
        A(b05.a);
    }

    public final Parcelable q() {
        this.S0 = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.A0) {
            return absSavedState;
        }
        b05 b05 = new b05(absSavedState);
        b05.a = this.c1;
        return b05;
    }

    public final void r(Object obj) {
        A(e((String) obj));
    }

    public final boolean w() {
        return TextUtils.isEmpty(this.c1) || super.w();
    }
}
