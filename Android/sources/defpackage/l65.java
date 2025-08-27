package defpackage;

/* renamed from: l65  reason: default package */
public final class l65 {
    public final String a;

    public l65(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l65)) {
            return false;
        }
        return this.a.equals(((l65) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return wj6.n(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
