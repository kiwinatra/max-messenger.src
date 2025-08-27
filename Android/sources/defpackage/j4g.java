package defpackage;

/* renamed from: j4g  reason: default package */
public final class j4g {
    public final k4g a;
    public final boolean b;
    public final String c;
    public final String d;

    public j4g(lf6 lf6) {
        this.a = (k4g) lf6.c;
        this.b = lf6.b;
        this.c = (String) lf6.o;
        this.d = (String) lf6.v;
    }

    public final lf6 a() {
        lf6 lf6 = new lf6(9);
        lf6.c = this.a;
        lf6.b = this.b;
        lf6.o = this.c;
        lf6.v = this.d;
        return lf6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j4g.class != obj.getClass()) {
            return false;
        }
        j4g j4g = (j4g) obj;
        if (this.b != j4g.b) {
            return false;
        }
        k4g k4g = j4g.a;
        k4g k4g2 = this.a;
        if (k4g2 == null ? k4g != null : !k4g2.equals(k4g)) {
            return false;
        }
        String str = j4g.c;
        String str2 = this.c;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = j4g.d;
        String str4 = this.d;
        return str4 != null ? str4.equals(str3) : str3 == null;
    }

    public final int hashCode() {
        int i = 0;
        k4g k4g = this.a;
        int hashCode = (((k4g != null ? k4g.hashCode() : 0) * 31) + (this.b ? 1 : 0)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoConversion{videoConversionData=");
        sb.append(this.a);
        sb.append(", finished=");
        sb.append(this.b);
        sb.append(", preparedPath='");
        sb.append(this.c);
        sb.append("', resultPath='");
        return wj6.n(sb, this.d, "'}");
    }
}
