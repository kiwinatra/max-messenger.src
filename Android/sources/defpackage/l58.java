package defpackage;

import android.app.LocaleManager;
import android.os.LocaleList;

/* renamed from: l58  reason: default package */
public abstract class l58 {
    public static LocaleList a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static LocaleList b(Object obj) {
        return ((LocaleManager) obj).getSystemLocales();
    }
}
