package defpackage;

/* renamed from: sc0  reason: default package */
public final class sc0 {
    public final String a;
    public final long b;
    public final int c;

    public sc0(int i, String str, long j) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    public static cs a() {
        cs csVar = new cs(1, (byte) 0);
        csVar.o = 0L;
        return csVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sc0)) {
            return false;
        }
        sc0 sc0 = (sc0) obj;
        String str = this.a;
        if (str != null ? str.equals(sc0.a) : sc0.a == null) {
            if (this.b == sc0.b) {
                int i = sc0.c;
                int i2 = this.c;
                if (i2 == 0) {
                    if (i == 0) {
                        return true;
                    }
                } else if (tr1.c(i2, i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        int i3 = this.c;
        if (i3 != 0) {
            i = tr1.y(i3);
        }
        return i2 ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.b);
        sb.append(", responseCode=");
        int i = this.c;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
