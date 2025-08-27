package defpackage;

import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: zhe  reason: default package */
public final class zhe {
    public static final Pattern a = Pattern.compile("\\{([^}]*)\\}");
    public static final Pattern b;
    public static final Pattern c;
    public static final Pattern d = Pattern.compile("\\\\an(\\d+)");

    static {
        int i = t0g.a;
        Locale locale = Locale.US;
        b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", new Object[]{"\\s*\\d+(?:\\.\\d+)?\\s*"}));
        c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", new Object[]{"\\s*\\d+(?:\\.\\d+)?\\s*"}));
    }

    public static PointF a(String str) {
        String str2;
        String str3;
        Matcher matcher = b.matcher(str);
        Matcher matcher2 = c.matcher(str);
        boolean find = matcher.find();
        boolean find2 = matcher2.find();
        if (find) {
            if (find2) {
                new StringBuilder(str.length() + 82);
            }
            str2 = matcher.group(1);
            str3 = matcher.group(2);
        } else if (!find2) {
            return null;
        } else {
            str2 = matcher2.group(1);
            str3 = matcher2.group(2);
        }
        str2.getClass();
        float parseFloat = Float.parseFloat(str2.trim());
        str3.getClass();
        return new PointF(parseFloat, Float.parseFloat(str3.trim()));
    }
}
