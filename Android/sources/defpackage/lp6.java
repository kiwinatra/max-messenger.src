package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: lp6  reason: default package */
public final class lp6 {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final boolean a(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i = t0g.a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.a = parseInt;
            this.b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(rp9 rp9) {
        int i = 0;
        while (true) {
            pp9[] pp9Arr = rp9.a;
            if (i < pp9Arr.length) {
                pp9 pp9 = pp9Arr[i];
                if (pp9 instanceof i63) {
                    i63 i63 = (i63) pp9;
                    if ("iTunSMPB".equals(i63.c) && a(i63.o)) {
                        return;
                    }
                } else if (pp9 instanceof xi7) {
                    xi7 xi7 = (xi7) pp9;
                    if ("com.apple.iTunes".equals(xi7.b) && "iTunSMPB".equals(xi7.c) && a(xi7.o)) {
                        return;
                    }
                } else {
                    continue;
                }
                i++;
            } else {
                return;
            }
        }
    }
}
