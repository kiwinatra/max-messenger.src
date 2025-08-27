package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: mp6  reason: default package */
public final class mp6 {
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
            int i = v0g.a;
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

    public final void b(sp9 sp9) {
        int i = 0;
        while (true) {
            qp9[] qp9Arr = sp9.a;
            if (i < qp9Arr.length) {
                qp9 qp9 = qp9Arr[i];
                if (qp9 instanceof j63) {
                    j63 j63 = (j63) qp9;
                    if ("iTunSMPB".equals(j63.c) && a(j63.o)) {
                        return;
                    }
                } else if (qp9 instanceof yi7) {
                    yi7 yi7 = (yi7) qp9;
                    if ("com.apple.iTunes".equals(yi7.b) && "iTunSMPB".equals(yi7.c) && a(yi7.o)) {
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
