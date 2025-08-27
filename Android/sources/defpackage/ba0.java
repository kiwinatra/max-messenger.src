package defpackage;

/* renamed from: ba0  reason: default package */
public final class ba0 {
    public final int a;
    public final long b;

    public ba0(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ba0)) {
            return false;
        }
        ba0 ba0 = (ba0) obj;
        return this.a == ba0.a && this.b == ba0.b;
    }

    public final int hashCode() {
        long j = this.b;
        return ((int) ((j >>> 32) ^ j)) ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PacketInfo{sizeInBytes=");
        sb.append(this.a);
        sb.append(", timestampNs=");
        return wj6.m(sb, this.b, "}");
    }
}
