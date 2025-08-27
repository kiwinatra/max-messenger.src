package defpackage;

/* renamed from: ovf  reason: default package */
public final class ovf {
    public final long a;

    public ovf(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ovf) && this.a == ((ovf) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("UnknownContactState(contactId="), this.a, ")");
    }
}
