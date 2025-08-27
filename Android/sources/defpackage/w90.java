package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* renamed from: w90  reason: default package */
public final class w90 {
    public final jc0 a;
    public final int b;
    public final Size c;
    public final vy4 d;
    public final List e;
    public final je3 f;
    public final Range g;

    public w90(jc0 jc0, int i, Size size, vy4 vy4, List list, je3 je3, Range range) {
        if (jc0 != null) {
            this.a = jc0;
            this.b = i;
            if (size != null) {
                this.c = size;
                if (vy4 != null) {
                    this.d = vy4;
                    if (list != null) {
                        this.e = list;
                        this.f = je3;
                        this.g = range;
                        return;
                    }
                    throw new NullPointerException("Null captureTypes");
                }
                throw new NullPointerException("Null dynamicRange");
            }
            throw new NullPointerException("Null size");
        }
        throw new NullPointerException("Null surfaceConfig");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w90)) {
            return false;
        }
        w90 w90 = (w90) obj;
        if (this.a.equals(w90.a) && this.b == w90.b && this.c.equals(w90.c) && this.d.equals(w90.d) && this.e.equals(w90.e)) {
            je3 je3 = w90.f;
            je3 je32 = this.f;
            if (je32 != null ? je32.equals(je3) : je3 == null) {
                Range range = w90.g;
                Range range2 = this.g;
                if (range2 == null) {
                    if (range == null) {
                        return true;
                    }
                } else if (range2.equals(range)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i = 0;
        je3 je3 = this.f;
        int hashCode2 = (hashCode ^ (je3 == null ? 0 : je3.hashCode())) * 1000003;
        Range range = this.g;
        if (range != null) {
            i = range.hashCode();
        }
        return hashCode2 ^ i;
    }

    public final String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.a + ", imageFormat=" + this.b + ", size=" + this.c + ", dynamicRange=" + this.d + ", captureTypes=" + this.e + ", implementationOptions=" + this.f + ", targetFrameRate=" + this.g + "}";
    }
}
