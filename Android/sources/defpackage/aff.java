package defpackage;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: aff  reason: default package */
public final class aff extends j3h {
    public static final aff b = new j3h((Object) null);

    public final boolean U0() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }
}
