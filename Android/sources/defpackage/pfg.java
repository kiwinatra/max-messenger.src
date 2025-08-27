package defpackage;

/* renamed from: pfg  reason: default package */
public final class pfg extends n22 {
    public final long c;

    public pfg(long j) {
        super(1, Long.valueOf(j));
        this.c = j;
    }

    public final Long a() {
        return Long.valueOf(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pfg) && this.c == ((pfg) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("DialogUserId(sourceId="), this.c, ")");
    }
}
