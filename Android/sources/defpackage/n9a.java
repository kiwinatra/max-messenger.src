package defpackage;

import kotlin.jvm.internal.Reflection;

/* renamed from: n9a  reason: default package */
public final class n9a implements b1g {
    public final igf a(huf huf, String str) {
        if (str.length() <= 0) {
            return null;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt != '-' && charAt != ' ') {
                return null;
            }
        }
        Integer k = te8.k(huf, Reflection.getOrCreateKotlinClass(n9a.class));
        if (k != null) {
            return new igf(k.intValue());
        }
        return null;
    }
}
