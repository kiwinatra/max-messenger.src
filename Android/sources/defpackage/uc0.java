package defpackage;

import android.media.MediaFormat;
import android.util.Size;

/* renamed from: uc0  reason: default package */
public final class uc0 implements t55 {
    public final String a;
    public final int b;
    public final xjf c;
    public final Size d;
    public final int e;
    public final vc0 f;
    public final int g;
    public final int h;
    public final int i;

    public uc0(String str, int i2, xjf xjf, Size size, int i3, vc0 vc0, int i4, int i5, int i6) {
        this.a = str;
        this.b = i2;
        this.c = xjf;
        this.d = size;
        this.e = i3;
        this.f = vc0;
        this.g = i4;
        this.h = i5;
        this.i = i6;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [n09, java.lang.Object] */
    public static n09 a() {
        ? obj = new Object();
        obj.b = -1;
        obj.y = 1;
        obj.v = 2130708361;
        obj.w = vc0.d;
        return obj;
    }

    public final String b() {
        return this.a;
    }

    public final MediaFormat c() {
        Size size = this.d;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.a, size.getWidth(), size.getHeight());
        createVideoFormat.setInteger("color-format", this.e);
        createVideoFormat.setInteger("bitrate", this.i);
        createVideoFormat.setInteger("frame-rate", this.g);
        createVideoFormat.setInteger("i-frame-interval", this.h);
        int i2 = this.b;
        if (i2 != -1) {
            createVideoFormat.setInteger("profile", i2);
        }
        vc0 vc0 = this.f;
        int i3 = vc0.a;
        if (i3 != 0) {
            createVideoFormat.setInteger("color-standard", i3);
        }
        int i4 = vc0.b;
        if (i4 != 0) {
            createVideoFormat.setInteger("color-transfer", i4);
        }
        int i5 = vc0.c;
        if (i5 != 0) {
            createVideoFormat.setInteger("color-range", i5);
        }
        return createVideoFormat;
    }

    public final xjf d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uc0)) {
            return false;
        }
        uc0 uc0 = (uc0) obj;
        return this.a.equals(uc0.a) && this.b == uc0.b && this.c.equals(uc0.c) && this.d.equals(uc0.d) && this.e == uc0.e && this.f.equals(uc0.f) && this.g == uc0.g && this.h == uc0.h && this.i == uc0.i;
    }

    public final int hashCode() {
        return this.i ^ ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderConfig{mimeType=");
        sb.append(this.a);
        sb.append(", profile=");
        sb.append(this.b);
        sb.append(", inputTimebase=");
        sb.append(this.c);
        sb.append(", resolution=");
        sb.append(this.d);
        sb.append(", colorFormat=");
        sb.append(this.e);
        sb.append(", dataSpace=");
        sb.append(this.f);
        sb.append(", frameRate=");
        sb.append(this.g);
        sb.append(", IFrameInterval=");
        sb.append(this.h);
        sb.append(", bitrate=");
        return wj6.l(sb, this.i, "}");
    }
}
