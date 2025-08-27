package defpackage;

/* renamed from: vnd  reason: default package */
public final class vnd {
    public static final vnd c = new vnd(0, 0);
    public final long a;
    public final long b;

    public vnd(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vnd.class != obj.getClass()) {
            return false;
        }
        vnd vnd = (vnd) obj;
        return this.a == vnd.a && this.b == vnd.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(60);
        sb.append("[timeUs=");
        sb.append(this.a);
        sb.append(", position=");
        return wj6.m(sb, this.b, "]");
    }
}
