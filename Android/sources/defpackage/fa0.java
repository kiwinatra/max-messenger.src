package defpackage;

/* renamed from: fa0  reason: default package */
public final class fa0 {
    public final int a;
    public final ga0 b;

    public fa0(int i, ga0 ga0) {
        if (i != 0) {
            this.a = i;
            this.b = ga0;
            return;
        }
        throw new NullPointerException("Null type");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fa0)) {
            return false;
        }
        fa0 fa0 = (fa0) obj;
        if (tr1.c(this.a, fa0.a)) {
            ga0 ga0 = fa0.b;
            ga0 ga02 = this.b;
            if (ga02 == null) {
                if (ga0 == null) {
                    return true;
                }
            } else if (ga02.equals(ga0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int y = (tr1.y(this.a) ^ 1000003) * 1000003;
        ga0 ga0 = this.b;
        return (ga0 == null ? 0 : ga0.hashCode()) ^ y;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraState{type=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "CLOSED" : "CLOSING" : "OPEN" : "OPENING" : "PENDING_OPEN");
        sb.append(", error=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
