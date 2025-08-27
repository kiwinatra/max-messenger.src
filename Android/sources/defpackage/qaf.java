package defpackage;

import java.io.Serializable;

/* renamed from: qaf  reason: default package */
public class qaf extends o9f implements Serializable {
    public final String b;
    public final String c;
    public final String o;
    public final n9f v;

    public qaf(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.o = str3;
        this.v = new n9f(g63.i(str, " ", str2), str3);
    }

    public String toString() {
        StringBuilder m = g63.m(getClass().getSimpleName(), "{error='");
        m.append(this.b);
        m.append("', message='");
        m.append(this.c);
        m.append("', localizedMessage='");
        return wj6.n(m, this.o, "'}");
    }
}
