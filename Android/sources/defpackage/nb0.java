package defpackage;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* renamed from: nb0  reason: default package */
public final class nb0 {
    public final UUID a;
    public final int b;
    public final int c;
    public final Rect d;
    public final Size e;
    public final int f;
    public final boolean g;
    public final boolean h;

    public nb0(UUID uuid, int i, int i2, Rect rect, Size size, int i3, boolean z) {
        if (uuid != null) {
            this.a = uuid;
            this.b = i;
            this.c = i2;
            if (rect != null) {
                this.d = rect;
                if (size != null) {
                    this.e = size;
                    this.f = i3;
                    this.g = z;
                    this.h = false;
                    return;
                }
                throw new NullPointerException("Null getSize");
            }
            throw new NullPointerException("Null getCropRect");
        }
        throw new NullPointerException("Null getUuid");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nb0)) {
            return false;
        }
        nb0 nb0 = (nb0) obj;
        return this.a.equals(nb0.a) && this.b == nb0.b && this.c == nb0.c && this.d.equals(nb0.d) && this.e.equals(nb0.e) && this.f == nb0.f && this.g == nb0.g && this.h == nb0.h;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003;
        if (this.h) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutConfig{getUuid=");
        sb.append(this.a);
        sb.append(", getTargets=");
        sb.append(this.b);
        sb.append(", getFormat=");
        sb.append(this.c);
        sb.append(", getCropRect=");
        sb.append(this.d);
        sb.append(", getSize=");
        sb.append(this.e);
        sb.append(", getRotationDegrees=");
        sb.append(this.f);
        sb.append(", isMirroring=");
        sb.append(this.g);
        sb.append(", shouldRespectInputCropRect=");
        return tr1.m(sb, this.h, "}");
    }
}
