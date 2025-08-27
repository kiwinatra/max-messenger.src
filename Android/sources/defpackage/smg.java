package defpackage;

import androidx.media3.common.ParserException;
import java.util.regex.Pattern;

/* renamed from: smg  reason: default package */
public abstract class smg {
    public static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(l8b l8b) {
        l8b.getClass();
        String h = l8b.h(x22.c);
        return h != null && h.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        int i = v0g.a;
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String parseLong : split[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(parseLong);
        }
        long j2 = j * 1000;
        if (split.length == 2) {
            j2 += Long.parseLong(split[1]);
        }
        return j2 * 1000;
    }

    public static void d(l8b l8b) {
        int i = l8b.b;
        if (!a(l8b)) {
            l8b.G(i);
            throw ParserException.a("Expected WEBVTT. Got " + l8b.h(x22.c), (RuntimeException) null);
        }
    }
}
