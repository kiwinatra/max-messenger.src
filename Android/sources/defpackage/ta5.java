package defpackage;

/* renamed from: ta5  reason: default package */
public final class ta5 {
    public int a;
    public int b;
    public int c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ta5.class != obj.getClass()) {
            return false;
        }
        ta5 ta5 = (ta5) obj;
        if (this.a == ta5.a && this.b == ta5.b) {
            return this.c == ta5.c;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }
}
