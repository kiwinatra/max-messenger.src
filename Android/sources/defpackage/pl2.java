package defpackage;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: pl2  reason: default package */
public final class pl2 implements InputFilter {
    public final int a;
    public final qk3 b;

    public pl2(int i, ol2 ol2) {
        this.a = i;
        this.b = ol2;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int length = this.a - (spanned.length() - (i4 - i3));
        qk3 qk3 = this.b;
        if (length <= 0) {
            int length2 = charSequence.length();
            if (qk3 != null) {
                try {
                    qk3.accept(Integer.valueOf(length2));
                } catch (Throwable unused) {
                }
            }
            return "";
        } else if (length >= i2 - i) {
            return null;
        } else {
            int i5 = length + i;
            if (!Character.isHighSurrogate(charSequence.charAt(i5 - 1)) || i5 - 1 != i) {
                CharSequence subSequence = charSequence.subSequence(i, i5);
                int length3 = charSequence.length() - subSequence.length();
                if (qk3 != null) {
                    try {
                        qk3.accept(Integer.valueOf(length3));
                    } catch (Throwable unused2) {
                    }
                }
                return subSequence;
            }
            int length4 = charSequence.length() - 1;
            if (qk3 != null) {
                try {
                    qk3.accept(Integer.valueOf(length4));
                } catch (Throwable unused3) {
                }
            }
            return "";
        }
    }
}
