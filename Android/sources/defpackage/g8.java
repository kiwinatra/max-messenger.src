package defpackage;

import java.util.List;
import java.util.Locale;

/* renamed from: g8  reason: default package */
public final class g8 {
    public final aqg a;
    public final String b;

    public g8(aqg aqg) {
        String lowerCase;
        List list = h8.d;
        String str = "null";
        if (aqg != null) {
            String str2 = (String) aqg.b;
            if (!(str2 == null || (lowerCase = str2.toLowerCase(Locale.ROOT)) == null)) {
                str = lowerCase;
            }
            if (h8.d.contains(str)) {
                str = rae.q(new StringBuilder(), (String) aqg.a, ":", str);
            }
        }
        this.a = aqg;
        this.b = str;
    }
}
