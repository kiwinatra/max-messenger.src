package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: h25  reason: default package */
public final class h25 implements InputFilter {
    public final TextView a;
    public g25 b;

    public h25(TextView textView) {
        this.a = textView;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b2 = s15.a().b();
        if (b2 != 0) {
            if (b2 != 1) {
                if (b2 != 3) {
                    return charSequence;
                }
            } else if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                return charSequence;
            } else {
                if (!(i == 0 && i2 == charSequence.length())) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                CharSequence charSequence2 = charSequence;
                return s15.a().g(0, charSequence2.length(), charSequence2, IntCompanionObject.MAX_VALUE, 0);
            }
        }
        s15 a2 = s15.a();
        if (this.b == null) {
            this.b = new g25(textView, this);
        }
        a2.i(this.b);
        return charSequence;
    }
}
