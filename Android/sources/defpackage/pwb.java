package defpackage;

/* renamed from: pwb  reason: default package */
public final class pwb extends ij0 {
    public final long b;
    public final long c;

    public pwb(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwb)) {
            return false;
        }
        pwb pwb = (pwb) obj;
        return this.b == pwb.b && this.c == pwb.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileAvatarUpdatedEvent(requestId=");
        sb.append(this.b);
        sb.append(", photoId=");
        return wj6.m(sb, this.c, ")");
    }
}
