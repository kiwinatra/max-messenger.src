package defpackage;

import java.io.Serializable;

/* renamed from: cl4  reason: default package */
public final class cl4 implements Serializable {
    public final long a;
    public final boolean b;

    public cl4(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cl4)) {
            return false;
        }
        cl4 cl4 = (cl4) obj;
        return this.a == cl4.a && this.b == cl4.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        String U = iq.U(Long.valueOf(this.a));
        return "DelayedAttributes(timeToFire=" + U + ", notifySender=" + this.b + ")";
    }
}
