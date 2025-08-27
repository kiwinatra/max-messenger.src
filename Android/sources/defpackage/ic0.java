package defpackage;

/* renamed from: ic0  reason: default package */
public final class ic0 {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public ic0(int i, int i2, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ic0)) {
            return false;
        }
        ic0 ic0 = (ic0) obj;
        return this.a == ic0.a && this.b == ic0.b && this.c == ic0.c && this.d == ic0.d;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = (((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003;
        if (this.d) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeatureSettings{cameraMode=");
        sb.append(this.a);
        sb.append(", requiredMaxBitDepth=");
        sb.append(this.b);
        sb.append(", previewStabilizationOn=");
        sb.append(this.c);
        sb.append(", ultraHdrOn=");
        return tr1.m(sb, this.d, "}");
    }
}
