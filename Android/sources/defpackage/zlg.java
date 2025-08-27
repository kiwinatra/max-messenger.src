package defpackage;

import java.util.regex.Pattern;

/* renamed from: zlg  reason: default package */
public final class zlg {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final g1g a = new g1g(3, false);
    public final StringBuilder b = new StringBuilder();

    public static String a(g1g g1g, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = g1g.b;
        int i2 = g1g.c;
        while (i < i2 && !z) {
            char c2 = (char) g1g.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        g1g.I(i - g1g.b);
        return sb.toString();
    }

    public static String b(g1g g1g, StringBuilder sb) {
        c(g1g);
        if (g1g.c() == 0) {
            return null;
        }
        String a2 = a(g1g, sb);
        if (!"".equals(a2)) {
            return a2;
        }
        StringBuilder sb2 = new StringBuilder(1);
        sb2.append((char) g1g.v());
        return sb2.toString();
    }

    public static void c(g1g g1g) {
        while (true) {
            boolean z = true;
            while (g1g.c() > 0 && z) {
                int i = g1g.b;
                byte[] bArr = g1g.a;
                byte b2 = bArr[i];
                char c2 = (char) b2;
                if (c2 == 9 || c2 == 10 || c2 == 12 || c2 == 13 || c2 == ' ') {
                    g1g.I(1);
                } else {
                    int i2 = g1g.c;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b2 == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                } else if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            g1g.I(i2 - g1g.b);
                        }
                    }
                    z = false;
                }
            }
            return;
        }
    }
}
