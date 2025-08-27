package defpackage;

import java.util.Objects;

/* renamed from: e51  reason: default package */
public final class e51 {
    public final String a;
    public final int b;
    public final int c;

    public e51(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e51.class != obj.getClass()) {
            return false;
        }
        e51 e51 = (e51) obj;
        return this.a.equals(e51.a) && this.b == e51.b && this.c == e51.c;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.c);
        return Objects.hash(new Object[]{this.a, tr1.a(this.b), valueOf});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallExternalId{id='");
        sb.append(this.a);
        sb.append("', type=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "ANONYM" : "VK" : "UNKNOWN");
        sb.append(", deviceIndex=");
        return tr1.k(sb, this.c, '}');
    }
}
