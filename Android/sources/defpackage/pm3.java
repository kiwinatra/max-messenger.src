package defpackage;

import java.util.Objects;

/* renamed from: pm3  reason: default package */
public final class pm3 {
    public static final pm3 e = new pm3("", om3.o, "");
    public final String a;
    public final String b;
    public final om3 c;
    public String d = null;

    public pm3(String str, om3 om3, String str2) {
        this.a = str;
        this.c = om3;
        this.b = str2;
    }

    public final String a() {
        if (equals(e) || this.c == om3.o) {
            return "";
        }
        String str = this.b;
        boolean D = cvg.D(str);
        String str2 = this.a;
        if (!D) {
            return cvg.A(str2) ? "" : str2;
        }
        if (this.d == null) {
            this.d = str2 + " " + str;
        }
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm3)) {
            return false;
        }
        pm3 pm3 = (pm3) obj;
        return this.c == pm3.c && Objects.equals(this.a, pm3.a) && this.b.equals(pm3.b);
    }

    public final int hashCode() {
        int hashCode = Objects.hashCode(this.b);
        return Objects.hashCode(this.c) + ((hashCode + (Objects.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactName{firstName='");
        sb.append(this.a);
        sb.append("', type=");
        sb.append(this.c);
        sb.append("', lastName=");
        return g63.l(sb, this.b, '}');
    }
}
