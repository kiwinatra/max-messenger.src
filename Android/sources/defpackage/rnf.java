package defpackage;

import java.util.Arrays;
import java.util.regex.Pattern;

/* renamed from: rnf  reason: default package */
public final class rnf {
    public static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String a;
    public final String b;
    public final String c;

    public rnf(String str, String str2) {
        String substring = (str2 == null || !str2.startsWith("/topics/")) ? str2 : str2.substring(8);
        if (substring == null || !d.matcher(substring).matches()) {
            throw new IllegalArgumentException(wj6.k("Invalid topic name: ", substring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.a = substring;
        this.b = str;
        this.c = g63.i(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rnf)) {
            return false;
        }
        rnf rnf = (rnf) obj;
        return this.a.equals(rnf.a) && this.b.equals(rnf.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }
}
