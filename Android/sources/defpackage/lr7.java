package defpackage;

/* renamed from: lr7  reason: default package */
public final class lr7 {
    public static final String c = Integer.toString(0, 36);
    public static final String d = Integer.toString(1, 36);
    public final String a;
    public final String b;

    static {
        int i = v0g.a;
    }

    public lr7(String str, String str2) {
        this.a = v0g.T(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lr7.class != obj.getClass()) {
            return false;
        }
        lr7 lr7 = (lr7) obj;
        return v0g.a(this.a, lr7.a) && v0g.a(this.b, lr7.b);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
