package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;

public class ListPreference extends DialogPreference {
    public final CharSequence[] c1;
    public final CharSequence[] d1;
    public String e1;
    public String f1;
    public boolean g1;

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nnc.ListPreference, i, 0);
        int i2 = nnc.ListPreference_entries;
        int i3 = nnc.ListPreference_android_entries;
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(i2);
        this.c1 = textArray == null ? obtainStyledAttributes.getTextArray(i3) : textArray;
        int i4 = nnc.ListPreference_entryValues;
        int i5 = nnc.ListPreference_android_entryValues;
        CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(i4);
        this.d1 = textArray2 == null ? obtainStyledAttributes.getTextArray(i5) : textArray2;
        int i6 = nnc.ListPreference_useSimpleSummaryProvider;
        if (obtainStyledAttributes.getBoolean(i6, obtainStyledAttributes.getBoolean(i6, false))) {
            if (pf6.y == null) {
                pf6.y = new pf6(14);
            }
            this.U0 = pf6.y;
            h();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, nnc.Preference, i, 0);
        int i7 = nnc.Preference_summary;
        int i8 = nnc.Preference_android_summary;
        String string = obtainStyledAttributes2.getString(i7);
        this.f1 = string == null ? obtainStyledAttributes2.getString(i8) : string;
        obtainStyledAttributes2.recycle();
    }

    public final int A(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.d1) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public final CharSequence B() {
        CharSequence[] charSequenceArr;
        int A = A(this.e1);
        if (A < 0 || (charSequenceArr = this.c1) == null) {
            return null;
        }
        return charSequenceArr[A];
    }

    public final void C(String str) {
        boolean z = !TextUtils.equals(this.e1, str);
        if (z || !this.g1) {
            this.e1 = str;
            this.g1 = true;
            t(str);
            if (z) {
                h();
            }
        }
    }

    public final CharSequence f() {
        usb usb = this.U0;
        if (usb != null) {
            return usb.c(this);
        }
        Object B = B();
        CharSequence f = super.f();
        String str = this.f1;
        if (str == null) {
            return f;
        }
        if (B == null) {
            B = "";
        }
        String format = String.format(str, new Object[]{B});
        return TextUtils.equals(format, f) ? f : format;
    }

    public final Object o(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(tz7.class)) {
            super.p(parcelable);
            return;
        }
        tz7 tz7 = (tz7) parcelable;
        super.p(tz7.getSuperState());
        C(tz7.a);
    }

    public final Parcelable q() {
        this.S0 = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.A0) {
            return absSavedState;
        }
        tz7 tz7 = new tz7(absSavedState);
        tz7.a = this.e1;
        return tz7;
    }

    public final void r(Object obj) {
        C(e((String) obj));
    }

    public final void v(CharSequence charSequence) {
        super.v(charSequence);
        if (charSequence == null) {
            this.f1 = null;
        } else {
            this.f1 = ((String) charSequence).toString();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b0h.s(cdc.dialogPreferenceStyle, 16842897, context));
    }
}
