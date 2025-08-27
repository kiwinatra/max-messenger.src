package defpackage;

import kotlin.jvm.internal.Reflection;
import kotlin.text.Regex;

/* renamed from: id  reason: default package */
public final class id implements b1g {
    public final Regex a = new Regex("^[a-zA-ZА-я\\u0401\\u0451\\u00eb\\u00cb\\- ]+$");

    public final igf a(huf huf, String str) {
        Integer k;
        if (str.length() <= 0 || this.a.matches(str) || (k = te8.k(huf, Reflection.getOrCreateKotlinClass(id.class))) == null) {
            return null;
        }
        return new igf(k.intValue());
    }
}
