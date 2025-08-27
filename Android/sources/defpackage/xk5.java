package defpackage;

/* renamed from: xk5  reason: default package */
public final class xk5 implements zk5 {
    public final float a;

    public xk5(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xk5) && Float.compare(this.a, ((xk5) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "Downloading(progress=" + this.a + ")";
    }
}
