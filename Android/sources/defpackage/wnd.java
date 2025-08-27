package defpackage;

/* renamed from: wnd  reason: default package */
public final class wnd {
    public static final wnd c = new wnd(0, 0);
    public final long a;
    public final long b;

    public wnd(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wnd.class != obj.getClass()) {
            return false;
        }
        wnd wnd = (wnd) obj;
        return this.a == wnd.a && this.b == wnd.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.a);
        sb.append(", position=");
        return wj6.m(sb, this.b, "]");
    }
}
