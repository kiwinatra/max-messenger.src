package defpackage;

/* renamed from: om4  reason: default package */
public final class om4 {
    public final String a;
    public final String b;
    public final String c;

    public om4(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || om4.class != obj.getClass()) {
            return false;
        }
        om4 om4 = (om4) obj;
        return v0g.a(this.a, om4.a) && v0g.a(this.b, om4.b) && v0g.a(this.c, om4.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }
}
