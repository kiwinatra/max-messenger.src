package defpackage;

/* renamed from: nbf  reason: default package */
public final class nbf {
    public final String a;
    public final String b;

    public nbf(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nbf.class != obj.getClass()) {
            return false;
        }
        nbf nbf = (nbf) obj;
        String str = nbf.a;
        String str2 = this.a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = nbf.b;
        String str4 = this.b;
        return str4 != null ? str4.equals(str3) : str3 == null;
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
