package defpackage;

/* renamed from: eb0  reason: default package */
public final class eb0 {
    public final String a;
    public final String b;
    public final String c;
    public final sc0 d;
    public final int e;

    public eb0(String str, String str2, String str3, sc0 sc0, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = sc0;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eb0)) {
            return false;
        }
        eb0 eb0 = (eb0) obj;
        String str = this.a;
        if (str != null ? str.equals(eb0.a) : eb0.a == null) {
            String str2 = this.b;
            if (str2 != null ? str2.equals(eb0.b) : eb0.b == null) {
                String str3 = this.c;
                if (str3 != null ? str3.equals(eb0.c) : eb0.c == null) {
                    sc0 sc0 = this.d;
                    if (sc0 != null ? sc0.equals(eb0.d) : eb0.d == null) {
                        int i = this.e;
                        if (i == 0) {
                            if (eb0.e == 0) {
                                return true;
                            }
                        } else if (tr1.c(i, eb0.e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        sc0 sc0 = this.d;
        int hashCode4 = (hashCode3 ^ (sc0 == null ? 0 : sc0.hashCode())) * 1000003;
        int i2 = this.e;
        if (i2 != 0) {
            i = tr1.y(i2);
        }
        return hashCode4 ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.a);
        sb.append(", fid=");
        sb.append(this.b);
        sb.append(", refreshToken=");
        sb.append(this.c);
        sb.append(", authToken=");
        sb.append(this.d);
        sb.append(", responseCode=");
        int i = this.e;
        sb.append(i != 1 ? i != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
