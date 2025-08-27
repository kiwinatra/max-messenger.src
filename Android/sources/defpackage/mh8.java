package defpackage;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: mh8  reason: default package */
public final class mh8 implements InputFilter {
    public final int a;

    public mh8(int i) {
        this.a = i;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i3, i4, charSequence.subSequence(i, i2).toString());
            if (Integer.parseInt(sb.toString()) <= this.a) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
