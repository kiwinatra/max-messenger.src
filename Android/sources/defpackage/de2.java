package defpackage;

/* renamed from: de2  reason: default package */
public final class de2 implements fe2 {
    public final long a;

    public de2(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof de2) && this.a == ((de2) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("Update(messageId="), this.a, ")");
    }
}
