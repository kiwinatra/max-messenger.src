package defpackage;

/* renamed from: buc  reason: default package */
public final class buc extends i8b {
    public final boolean e;

    public buc(boolean z) {
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof buc) && this.e == ((buc) obj).e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e);
    }

    public final String toString() {
        return tr1.m(new StringBuilder("Verified(verified="), this.e, ")");
    }
}
