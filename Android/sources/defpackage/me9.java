package defpackage;

/* renamed from: me9  reason: default package */
public final class me9 extends ne9 {
    public final long c;

    public me9(long j) {
        super(j, 1);
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof me9) && this.c == ((me9) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("DialogUserId(contactId="), this.c, ")");
    }
}
