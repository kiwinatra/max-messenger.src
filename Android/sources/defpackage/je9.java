package defpackage;

/* renamed from: je9  reason: default package */
public final class je9 extends ne9 {
    public final long c;

    public je9(long j) {
        super(j, 4);
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof je9) && this.c == ((je9) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("ChannelId(channelId="), this.c, ")");
    }
}
