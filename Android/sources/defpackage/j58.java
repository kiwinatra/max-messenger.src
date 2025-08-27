package defpackage;

import java.util.Locale;

/* renamed from: j58  reason: default package */
public final class j58 {
    public static final j58 b = new j58(new k58(i58.a(new Locale[0])));
    public final k58 a;

    public j58(k58 k58) {
        this.a = k58;
    }

    public static j58 a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = h58.a(split[i]);
        }
        return new j58(new k58(i58.a(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j58) {
            if (this.a.equals(((j58) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
