package defpackage;

import android.graphics.Rect;
import android.util.Size;

/* renamed from: kc0  reason: default package */
public final class kc0 {
    public final Size a;
    public final Rect b;
    public final su1 c;
    public final int d;
    public final boolean e;

    public kc0(Size size, Rect rect, su1 su1, int i, boolean z) {
        if (size != null) {
            this.a = size;
            if (rect != null) {
                this.b = rect;
                this.c = su1;
                this.d = i;
                this.e = z;
                return;
            }
            throw new NullPointerException("Null inputCropRect");
        }
        throw new NullPointerException("Null inputSize");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kc0)) {
            return false;
        }
        kc0 kc0 = (kc0) obj;
        if (this.a.equals(kc0.a) && this.b.equals(kc0.b)) {
            su1 su1 = kc0.c;
            su1 su12 = this.c;
            if (su12 != null ? su12.equals(su1) : su1 == null) {
                if (this.d == kc0.d && this.e == kc0.e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        su1 su1 = this.c;
        return (this.e ? 1231 : 1237) ^ ((((hashCode ^ (su1 == null ? 0 : su1.hashCode())) * 1000003) ^ this.d) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraInputInfo{inputSize=");
        sb.append(this.a);
        sb.append(", inputCropRect=");
        sb.append(this.b);
        sb.append(", cameraInternal=");
        sb.append(this.c);
        sb.append(", rotationDegrees=");
        sb.append(this.d);
        sb.append(", mirroring=");
        return tr1.m(sb, this.e, "}");
    }
}
