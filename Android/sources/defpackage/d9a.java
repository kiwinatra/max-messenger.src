package defpackage;

import java.util.Arrays;

/* renamed from: d9a  reason: default package */
public final class d9a {
    static {
        Arrays.sort("AOUIEАОУЫИЭЕЮЯЁ".toCharArray());
    }

    public static boolean a(StringBuilder sb, int i, char c) {
        int i2 = i + 1;
        return i2 < sb.length() && sb.charAt(i2) == c;
    }
}
