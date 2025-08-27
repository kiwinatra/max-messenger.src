package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: to4  reason: default package */
public abstract class to4 {
    public static final HashMap a;
    public static final Pattern b = Pattern.compile("^\\s*(\\d+(\\.\\d+)*)\\s*([a-zA-Z]+)\\s*$");

    static {
        HashMap hashMap = new HashMap();
        a81.q(0, hashMap, "px", 1, "dip");
        a81.q(1, hashMap, "dp", 2, "sp");
        a81.q(3, hashMap, "pt", 4, "in");
        hashMap.put("mm", 5);
        a = hashMap;
    }

    public static float a(Context context, String str) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Matcher matcher = b.matcher(str);
        if (matcher.matches()) {
            float floatValue = Float.valueOf(matcher.group(1)).floatValue();
            Integer num = (Integer) a.get(matcher.group(3).toLowerCase(Locale.ROOT));
            if (num != null) {
                return TypedValue.applyDimension(num.intValue(), floatValue, displayMetrics);
            }
            throw new NumberFormatException();
        }
        throw new NumberFormatException();
    }
}
