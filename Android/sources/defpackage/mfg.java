package defpackage;

/* renamed from: mfg  reason: default package */
public final class mfg extends n22 {
    public final long c;

    public mfg(long j) {
        super(4, Long.valueOf(j));
        this.c = j;
    }

    public final Long a() {
        return Long.valueOf(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mfg) && this.c == ((mfg) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("ChannelId(sourceId="), this.c, ")");
    }
}
