package defpackage;

/* renamed from: k4g  reason: default package */
public final class k4g {
    public final String a;
    public final p4g b;

    public k4g(p7d p7d) {
        this.a = (String) p7d.b;
        this.b = (p4g) p7d.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k4g.class != obj.getClass()) {
            return false;
        }
        k4g k4g = (k4g) obj;
        String str = k4g.a;
        String str2 = this.a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        p4g p4g = k4g.b;
        p4g p4g2 = this.b;
        return p4g2 != null ? p4g2.equals(p4g) : p4g == null;
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        p4g p4g = this.b;
        if (p4g != null) {
            i = p4g.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "VideoConversionData{sourceUri='" + this.a + "', convertOptions=" + this.b + '}';
    }
}
