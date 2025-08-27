package defpackage;

import java.io.Serializable;

/* renamed from: er3  reason: default package */
public final class er3 implements Serializable {
    public final String a;
    public final dr3 b;
    public final String c;

    public er3(String str, dr3 dr3, String str2) {
        this.a = str;
        this.b = dr3;
        this.c = str2;
    }

    public final String a() {
        dr3 dr3 = dr3.b;
        String str = this.a;
        dr3 dr32 = this.b;
        if (dr32 == dr3 || dr32 == dr3.a) {
            String str2 = this.c;
            if (cvg.D(str2)) {
                return g63.i(str, " ", str2);
            }
        }
        return str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{firstName='");
        sb.append(this.a);
        sb.append("', type=");
        sb.append(this.b);
        sb.append("', lastName=");
        return wj6.n(sb, this.c, "}");
    }
}
