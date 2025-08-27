package defpackage;

/* renamed from: ha1  reason: default package */
public final class ha1 extends ka1 {
    public final ca1 a;

    public ha1(ca1 ca1) {
        this.a = ca1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ha1) && this.a == ((ha1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Network(networkState=" + this.a + ")";
    }
}
