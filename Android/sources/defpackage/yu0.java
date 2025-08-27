package defpackage;

/* renamed from: yu0  reason: default package */
public final class yu0 {
    public final long a;
    public final boolean b;

    public yu0(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu0)) {
            return false;
        }
        yu0 yu0 = (yu0) obj;
        return this.a == yu0.a && this.b == yu0.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BufferingState(messageId=");
        sb.append(this.a);
        sb.append(", isBuffering=");
        return tr1.m(sb, this.b, ")");
    }
}
