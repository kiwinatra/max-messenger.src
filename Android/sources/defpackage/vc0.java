package defpackage;

/* renamed from: vc0  reason: default package */
public final class vc0 {
    public static final vc0 d = new vc0(0, 0, 0);
    public static final vc0 e = new vc0(1, 3, 2);
    public static final vc0 f = new vc0(6, 7, 1);
    public static final vc0 g = new vc0(6, 6, 1);
    public final int a;
    public final int b;
    public final int c;

    public vc0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vc0)) {
            return false;
        }
        vc0 vc0 = (vc0) obj;
        return this.a == vc0.a && this.b == vc0.b && this.c == vc0.c;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderDataSpace{standard=");
        sb.append(this.a);
        sb.append(", transfer=");
        sb.append(this.b);
        sb.append(", range=");
        return wj6.l(sb, this.c, "}");
    }
}
