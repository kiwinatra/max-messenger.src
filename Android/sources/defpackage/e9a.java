package defpackage;

/* renamed from: e9a  reason: default package */
public final class e9a implements k9a {
    public final int b;

    public e9a(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e9a) && this.b == ((e9a) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return wj6.l(new StringBuilder("Auto(brightnessThreshold="), this.b, ")");
    }
}
