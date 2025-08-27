package defpackage;

/* renamed from: cwf  reason: default package */
public final class cwf implements ewf {
    public final long a;

    public cwf(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cwf) && this.a == ((cwf) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("InitialEvent(mark="), this.a, ")");
    }
}
