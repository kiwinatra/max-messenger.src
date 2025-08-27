package defpackage;

/* renamed from: uu9  reason: default package */
public final class uu9 {
    public final String a;
    public final int b;
    public final int c;
    public final int d;

    public uu9(String str, int i, int i2, int i3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uu9.class != obj.getClass()) {
            return false;
        }
        uu9 uu9 = (uu9) obj;
        if (this.b == uu9.b && this.c == uu9.c && this.d == uu9.d) {
            return this.a.equals(uu9.a);
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }
}
