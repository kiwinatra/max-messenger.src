package defpackage;

/* renamed from: pnd  reason: default package */
public final class pnd {
    public final vnd a;
    public final vnd b;

    public pnd(vnd vnd, vnd vnd2) {
        this.a = vnd;
        this.b = vnd2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pnd.class != obj.getClass()) {
            return false;
        }
        pnd pnd = (pnd) obj;
        return this.a.equals(pnd.a) && this.b.equals(pnd.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        vnd vnd = this.a;
        String valueOf = String.valueOf(vnd);
        vnd vnd2 = this.b;
        if (vnd.equals(vnd2)) {
            str = "";
        } else {
            String valueOf2 = String.valueOf(vnd2);
            StringBuilder sb = new StringBuilder(valueOf2.length() + 2);
            sb.append(", ");
            sb.append(valueOf2);
            str = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder(g63.f(valueOf.length() + 2, str));
        sb2.append("[");
        sb2.append(valueOf);
        sb2.append(str);
        sb2.append("]");
        return sb2.toString();
    }
}
