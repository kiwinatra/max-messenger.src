package defpackage;

/* renamed from: soa  reason: default package */
public final class soa extends bs0 {
    public final int n;

    public soa(int i) {
        this.n = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof soa) && this.n == ((soa) obj).n;
    }

    public final int hashCode() {
        return Integer.hashCode(this.n);
    }

    public final String toString() {
        return wj6.l(new StringBuilder("Counter(value="), this.n, ")");
    }
}
