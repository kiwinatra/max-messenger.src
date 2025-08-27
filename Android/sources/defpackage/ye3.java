package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* renamed from: ye3  reason: default package */
public abstract class ye3 {
    public static LocaleList a(Configuration configuration) {
        return configuration.getLocales();
    }

    public static void b(Configuration configuration, j58 j58) {
        configuration.setLocales(j58.a.a);
    }
}
