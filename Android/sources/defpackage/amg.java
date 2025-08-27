package defpackage;

import java.util.regex.Pattern;

/* renamed from: amg  reason: default package */
public final class amg {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final l8b a = new l8b();
    public final StringBuilder b = new StringBuilder();

    public static String a(l8b l8b, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = l8b.b;
        int i2 = l8b.c;
        while (i < i2 && !z) {
            char c2 = (char) l8b.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        l8b.H(i - l8b.b);
        return sb.toString();
    }

    public static String b(l8b l8b, StringBuilder sb) {
        c(l8b);
        if (l8b.a() == 0) {
            return null;
        }
        String a2 = a(l8b, sb);
        if (!"".equals(a2)) {
            return a2;
        }
        return "" + ((char) l8b.u());
    }

    public static void c(l8b l8b) {
        while (true) {
            boolean z = true;
            while (l8b.a() > 0 && z) {
                int i = l8b.b;
                byte[] bArr = l8b.a;
                byte b2 = bArr[i];
                char c2 = (char) b2;
                if (c2 == 9 || c2 == 10 || c2 == 12 || c2 == 13 || c2 == ' ') {
                    l8b.H(1);
                } else {
                    int i2 = l8b.c;
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
                            l8b.H(i2 - l8b.b);
                        }
                    }
                    z = false;
                }
            }
            return;
        }
    }
}
