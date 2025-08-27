package defpackage;

/* renamed from: nm4  reason: default package */
public final class nm4 {
    public final String a;
    public final String b;
    public final String c;

    public nm4(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nm4.class != obj.getClass()) {
            return false;
        }
        nm4 nm4 = (nm4) obj;
        return t0g.a(this.a, nm4.a) && t0g.a(this.b, nm4.b) && t0g.a(this.c, nm4.c);
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
