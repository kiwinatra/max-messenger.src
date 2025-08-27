package defpackage;

import android.graphics.Matrix;

/* renamed from: cb0  reason: default package */
public final class cb0 implements l97 {
    public final a9f a;
    public final long b;
    public final int c;
    public final Matrix d;

    public cb0(a9f a9f, long j, int i, Matrix matrix) {
        if (a9f != null) {
            this.a = a9f;
            this.b = j;
            this.c = i;
            if (matrix != null) {
                this.d = matrix;
                return;
            }
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        throw new NullPointerException("Null tagBundle");
    }

    public final void b(ra5 ra5) {
        ra5.d(this.c);
    }

    public final a9f d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cb0)) {
            return false;
        }
        cb0 cb0 = (cb0) obj;
        return this.a.equals(cb0.a) && this.b == cb0.b && this.c == cb0.c && this.d.equals(cb0.d);
    }

    public final long getTimestamp() {
        return this.b;
    }

    public final int hashCode() {
        long j = this.b;
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.c) * 1000003);
    }

    public final String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.a + ", timestamp=" + this.b + ", rotationDegrees=" + this.c + ", sensorToBufferTransformMatrix=" + this.d + "}";
    }
}
