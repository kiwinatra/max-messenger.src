package defpackage;

/* renamed from: rb0  reason: default package */
public final class rb0 {
    public final long a;
    public final tc0 b;
    public final ua0 c;

    public rb0(long j, tc0 tc0, ua0 ua0) {
        this.a = j;
        this.b = tc0;
        this.c = ua0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rb0)) {
            return false;
        }
        rb0 rb0 = (rb0) obj;
        return this.a == rb0.a && this.b.equals(rb0.b) && this.c.equals(rb0.c);
    }

    public final int hashCode() {
        long j = this.a;
        return this.c.hashCode() ^ ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
