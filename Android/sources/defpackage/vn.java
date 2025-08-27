package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* renamed from: vn  reason: default package */
public abstract class vn {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (!locales.equals(locales2)) {
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    public static j58 b(Configuration configuration) {
        return j58.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(j58 j58) {
        LocaleList.setDefault(LocaleList.forLanguageTags(j58.a.a.toLanguageTags()));
    }

    public static void d(Configuration configuration, j58 j58) {
        configuration.setLocales(LocaleList.forLanguageTags(j58.a.a.toLanguageTags()));
    }
}
