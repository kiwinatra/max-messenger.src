package defpackage;

import java.util.Objects;

/* renamed from: y4g  reason: default package */
public final class y4g {
    public final int a;
    public final int b;
    public final int c;

    public y4g(r3 r3Var) {
        this.a = r3Var.a;
        this.b = r3Var.b;
        this.c = r3Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y4g.class != obj.getClass()) {
            return false;
        }
        y4g y4g = (y4g) obj;
        return this.a == y4g.a && this.b == y4g.b && this.c == y4g.c;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), tr1.a(this.c)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoDisplayLayout{width=");
        sb.append(this.a);
        sb.append(", height=");
        sb.append(this.b);
        sb.append(", fit=");
        int i = this.c;
        sb.append(i != 1 ? i != 2 ? "null" : "CONTAIN" : "COVER");
        sb.append('}');
        return sb.toString();
    }
}
