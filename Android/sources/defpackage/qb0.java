package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* renamed from: qb0  reason: default package */
public final class qb0 {
    public final Object a;
    public final na5 b;
    public final int c;
    public final Size d;
    public final Rect e;
    public final int f;
    public final Matrix g;
    public final it1 h;

    public qb0(Object obj, na5 na5, int i, Size size, Rect rect, int i2, Matrix matrix, it1 it1) {
        if (obj != null) {
            this.a = obj;
            this.b = na5;
            this.c = i;
            this.d = size;
            if (rect != null) {
                this.e = rect;
                this.f = i2;
                if (matrix != null) {
                    this.g = matrix;
                    if (it1 != null) {
                        this.h = it1;
                        return;
                    }
                    throw new NullPointerException("Null cameraCaptureResult");
                }
                throw new NullPointerException("Null sensorToBufferTransform");
            }
            throw new NullPointerException("Null cropRect");
        }
        throw new NullPointerException("Null data");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qb0)) {
            return false;
        }
        qb0 qb0 = (qb0) obj;
        if (this.a.equals(qb0.a)) {
            na5 na5 = qb0.b;
            na5 na52 = this.b;
            if (na52 != null ? na52.equals(na5) : na5 == null) {
                if (this.c == qb0.c && this.d.equals(qb0.d) && this.e.equals(qb0.e) && this.f == qb0.f && this.g.equals(qb0.g) && this.h.equals(qb0.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        na5 na5 = this.b;
        return this.h.hashCode() ^ ((((((((((((hashCode ^ (na5 == null ? 0 : na5.hashCode())) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Packet{data=" + this.a + ", exif=" + this.b + ", format=" + this.c + ", size=" + this.d + ", cropRect=" + this.e + ", rotationDegrees=" + this.f + ", sensorToBufferTransform=" + this.g + ", cameraCaptureResult=" + this.h + "}";
    }
}
