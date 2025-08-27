package defpackage;

/* renamed from: tv  reason: default package */
public final class tv extends wv {
    public final long a;

    public tv(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tv) && this.a == ((tv) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("LoadingAround(time="), this.a, ")");
    }
}
