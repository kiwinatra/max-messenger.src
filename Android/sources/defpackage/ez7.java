package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: ez7  reason: default package */
public final class ez7 {
    public final String a;
    public final boolean b;

    public ez7(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ez7)) {
            return false;
        }
        ez7 ez7 = (ez7) obj;
        String str = this.a;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(ez7.a)) {
            return false;
        }
        boolean z = this.b;
        String str2 = ez7.a;
        if (z) {
            return str.equals(str2);
        }
        Pattern pattern = hhf.a;
        return str.length() == str2.length() && str2.regionMatches(true, 0, str, 0, str.length());
    }
}
