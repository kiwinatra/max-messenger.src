package defpackage;

/* renamed from: le9  reason: default package */
public final class le9 extends ne9 {
    public final long c;

    public le9(long j) {
        super(j, 2);
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof le9) && this.c == ((le9) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("DialogBotId(botId="), this.c, ")");
    }
}
