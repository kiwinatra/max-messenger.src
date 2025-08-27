package defpackage;

/* renamed from: izb  reason: default package */
public final class izb implements mzb {
    public final long a;

    public izb(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof izb) && this.a == ((izb) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("ChatUpdate(requestId="), this.a, ")");
    }
}
