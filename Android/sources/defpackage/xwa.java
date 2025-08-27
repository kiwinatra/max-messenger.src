package defpackage;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: xwa  reason: default package */
public final /* synthetic */ class xwa implements InputFilter {
    public final /* synthetic */ zwa a;

    public /* synthetic */ xwa(zwa zwa) {
        this.a = zwa;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        return this.a.o.matches(charSequence) ? charSequence : "";
    }
}
