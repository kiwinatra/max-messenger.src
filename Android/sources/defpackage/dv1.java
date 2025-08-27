package defpackage;

/* renamed from: dv1  reason: default package */
public final class dv1 {
    public final cv1 a;

    public dv1(cv1 cv1) {
        this.a = cv1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dv1) && this.a == ((dv1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CameraParams(facing=" + this.a + ")";
    }
}
