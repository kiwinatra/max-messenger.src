package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: zs7  reason: default package */
public final class zs7 {
    public static String a(Date date) {
        String format;
        synchronized (j4b.v) {
            if (j4b.u == null) {
                j4b.u = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.ENGLISH);
            }
            format = j4b.u.format(date);
        }
        return format;
    }
}
