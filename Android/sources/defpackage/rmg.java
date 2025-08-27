package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.util.regex.Pattern;

/* renamed from: rmg  reason: default package */
public abstract class rmg {
    public static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(g1g g1g) {
        String i = g1g.i();
        return i != null && i.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        int i = t0g.a;
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

    public static void d(g1g g1g) {
        int i = g1g.b;
        if (!a(g1g)) {
            g1g.H(i);
            String valueOf = String.valueOf(g1g.i());
            throw ParserException.a(valueOf.length() != 0 ? "Expected WEBVTT. Got ".concat(valueOf) : new String("Expected WEBVTT. Got "), (RuntimeException) null);
        }
    }
}
