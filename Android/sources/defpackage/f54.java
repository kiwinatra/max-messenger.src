package defpackage;

import android.os.Bundle;
import android.text.Spanned;

/* renamed from: f54  reason: default package */
public abstract class f54 {
    public static final String a = Integer.toString(0, 36);
    public static final String b = Integer.toString(1, 36);
    public static final String c = Integer.toString(2, 36);
    public static final String d = Integer.toString(3, 36);
    public static final String e = Integer.toString(4, 36);

    static {
        int i = v0g.a;
    }

    public static Bundle a(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(a, spanned.getSpanStart(obj));
        bundle2.putInt(b, spanned.getSpanEnd(obj));
        bundle2.putInt(c, spanned.getSpanFlags(obj));
        bundle2.putInt(d, i);
        if (bundle != null) {
            bundle2.putBundle(e, bundle);
        }
        return bundle2;
    }
}
