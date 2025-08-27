package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: i58  reason: default package */
public abstract class i58 {
    public static LocaleList a(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    public static LocaleList b() {
        return LocaleList.getAdjustedDefault();
    }

    public static LocaleList c() {
        return LocaleList.getDefault();
    }
}
