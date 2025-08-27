package defpackage;

/* renamed from: ofg  reason: default package */
public final class ofg extends n22 {
    public final long c;

    public ofg(long j) {
        super(2, Long.valueOf(j));
        this.c = j;
    }

    public final Long a() {
        return Long.valueOf(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ofg) && this.c == ((ofg) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("DialogBotId(sourceId="), this.c, ")");
    }
}
