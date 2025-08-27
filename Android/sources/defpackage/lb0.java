package defpackage;

/* renamed from: lb0  reason: default package */
public final class lb0 {
    public final yc0 a;
    public final z90 b;
    public final int c;

    public lb0(yc0 yc0, z90 z90, int i) {
        this.a = yc0;
        this.b = z90;
        this.c = i;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, d19] */
    public static d19 a() {
        ? obj = new Object();
        obj.a = -1;
        obj.c = z90.a().i();
        obj.b = yc0.a().a();
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lb0)) {
            return false;
        }
        lb0 lb0 = (lb0) obj;
        return this.a.equals(lb0.a) && this.b.equals(lb0.b) && this.c == lb0.c;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSpec{videoSpec=");
        sb.append(this.a);
        sb.append(", audioSpec=");
        sb.append(this.b);
        sb.append(", outputFormat=");
        return wj6.l(sb, this.c, "}");
    }
}
