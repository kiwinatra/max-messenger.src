package defpackage;

/* renamed from: us4  reason: default package */
public final class us4 implements vs4 {
    public final float a;
    public final long b;
    public final long c;

    public us4(float f, long j, long j2) {
        this.a = f;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us4)) {
            return false;
        }
        us4 us4 = (us4) obj;
        return Float.compare(this.a, us4.a) == 0 && this.b == us4.b && this.c == us4.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + wzf.i(Float.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Loading(progress=");
        sb.append(this.a);
        sb.append(", time=");
        sb.append(this.b);
        sb.append(", botId=");
        return wj6.m(sb, this.c, ")");
    }
}
