package defpackage;

/* renamed from: nfg  reason: default package */
public final class nfg extends n22 {
    public final long c;

    public nfg(long j) {
        super(3, Long.valueOf(j));
        this.c = j;
    }

    public final Long a() {
        return Long.valueOf(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nfg) && this.c == ((nfg) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("ChatId(sourceId="), this.c, ")");
    }
}
