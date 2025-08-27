package defpackage;

/* renamed from: t9  reason: default package */
public final class t9 {
    public int a;
    public int b;
    public Object c;
    public int d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9)) {
            return false;
        }
        t9 t9Var = (t9) obj;
        int i = this.a;
        if (i != t9Var.a) {
            return false;
        }
        if (i == 8 && Math.abs(this.d - this.b) == 1 && this.d == t9Var.b && this.b == t9Var.d) {
            return true;
        }
        if (this.d != t9Var.d || this.b != t9Var.b) {
            return false;
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            if (!obj2.equals(t9Var.c)) {
                return false;
            }
        } else if (t9Var.c != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.b);
        sb.append("c:");
        sb.append(this.d);
        sb.append(",p:");
        sb.append(this.c);
        sb.append("]");
        return sb.toString();
    }
}
