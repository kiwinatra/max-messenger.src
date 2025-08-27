package defpackage;

/* renamed from: l7c  reason: default package */
public final class l7c {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public l7c(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7c)) {
            return false;
        }
        l7c l7c = (l7c) obj;
        return t0g.a(this.a, l7c.a) && t0g.a(this.b, l7c.b) && t0g.a(this.c, l7c.c) && t0g.a(this.d, l7c.d) && t0g.a(this.e, l7c.e);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }
}
