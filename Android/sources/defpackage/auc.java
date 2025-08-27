package defpackage;

/* renamed from: auc  reason: default package */
public final class auc extends i8b {
    public final boolean e;

    public auc(boolean z) {
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof auc) && this.e == ((auc) obj).e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e);
    }

    public final String toString() {
        return tr1.m(new StringBuilder("Online(online="), this.e, ")");
    }
}
