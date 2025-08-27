package defpackage;

/* renamed from: ac7  reason: default package */
public final class ac7 extends q1 implements c1g {
    public static final ac7 a = new Object();

    public final String b() {
        return "null";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c1g)) {
            return false;
        }
        int g = ((q1) ((c1g) obj)).g();
        if (g != 0) {
            return g == 1;
        }
        throw null;
    }

    public final int g() {
        return 1;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "null";
    }
}
