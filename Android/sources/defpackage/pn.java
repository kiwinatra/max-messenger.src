package defpackage;

import android.app.LocaleManager;
import android.os.LocaleList;

/* renamed from: pn  reason: default package */
public abstract class pn {
    public static LocaleList a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static void b(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
