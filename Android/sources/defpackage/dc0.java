package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: dc0  reason: default package */
public final class dc0 {
    public final lk4 a;
    public final List b;
    public final String c;
    public final int d;
    public final int e;
    public final vy4 f;

    public dc0(lk4 lk4, List list, String str, int i, int i2, vy4 vy4) {
        this.a = lk4;
        this.b = list;
        this.c = str;
        this.d = i;
        this.e = i2;
        this.f = vy4;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [kwd, java.lang.Object] */
    public static kwd a(lk4 lk4) {
        ? obj = new Object();
        if (lk4 != null) {
            obj.a = lk4;
            List emptyList = Collections.emptyList();
            if (emptyList != null) {
                obj.b = emptyList;
                obj.c = null;
                obj.d = -1;
                obj.e = -1;
                obj.f = vy4.d;
                return obj;
            }
            throw new NullPointerException("Null sharedSurfaces");
        }
        throw new NullPointerException("Null surface");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dc0)) {
            return false;
        }
        dc0 dc0 = (dc0) obj;
        if (this.a.equals(dc0.a) && this.b.equals(dc0.b)) {
            String str = dc0.c;
            String str2 = this.c;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.d == dc0.d && this.e == dc0.e && this.f.equals(dc0.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        return this.f.hashCode() ^ ((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003);
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.a + ", sharedSurfaces=" + this.b + ", physicalCameraId=" + this.c + ", mirrorMode=" + this.d + ", surfaceGroupId=" + this.e + ", dynamicRange=" + this.f + "}";
    }
}
