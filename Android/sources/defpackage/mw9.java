package defpackage;

import java.util.regex.Pattern;

/* renamed from: mw9  reason: default package */
public final class mw9 implements zdb {
    public static final Pattern b = Pattern.compile("^[\\p{L}\\p{N}]+$");
    public final String a;

    public mw9(String str) {
        this.a = str.concat("_");
    }

    public final String a(Object obj) {
        String obj2 = obj.toString();
        if (b.matcher(obj2).matches()) {
            return this.a + obj;
        }
        throw new IllegalArgumentException(a81.m("Invalid key: ", obj2));
    }
}
