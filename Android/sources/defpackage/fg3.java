package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import kotlin.reflect.KProperty;

/* renamed from: fg3  reason: default package */
public final /* synthetic */ class fg3 implements InputFilter {
    public final /* synthetic */ int a;

    public /* synthetic */ fg3(int i) {
        this.a = i;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        switch (this.a) {
            case 0:
                return gg3.b.matches(charSequence) ? charSequence : "";
            case 1:
                KProperty[] kPropertyArr = dc9.O0;
                return "";
            default:
                return "";
        }
    }
}
