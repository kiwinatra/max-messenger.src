package defpackage;

import android.util.Size;

/* renamed from: jc0  reason: default package */
public final class jc0 {
    public final int a;
    public final l3f b;
    public final long c;

    public jc0(int i, l3f l3f, long j) {
        if (i != 0) {
            this.a = i;
            this.b = l3f;
            this.c = j;
            return;
        }
        throw new NullPointerException("Null configType");
    }

    public static int a(int i) {
        if (i == 35) {
            return 2;
        }
        if (i == 256) {
            return 3;
        }
        if (i == 4101) {
            return 4;
        }
        return i == 32 ? 5 : 1;
    }

    public static jc0 b(int i, int i2, Size size, pc0 pc0) {
        int a2 = a(i2);
        l3f l3f = l3f.NOT_SUPPORT;
        int a3 = pde.a(size);
        if (i == 1) {
            if (a3 <= pde.a((Size) pc0.b.get(Integer.valueOf(i2)))) {
                l3f = l3f.s720p;
            } else {
                if (a3 <= pde.a((Size) pc0.d.get(Integer.valueOf(i2)))) {
                    l3f = l3f.s1440p;
                }
            }
        } else if (a3 <= pde.a(pc0.a)) {
            l3f = l3f.VGA;
        } else if (a3 <= pde.a(pc0.c)) {
            l3f = l3f.PREVIEW;
        } else if (a3 <= pde.a(pc0.e)) {
            l3f = l3f.RECORD;
        } else {
            if (a3 <= pde.a((Size) pc0.f.get(Integer.valueOf(i2)))) {
                l3f = l3f.MAXIMUM;
            } else {
                Size size2 = (Size) pc0.g.get(Integer.valueOf(i2));
                if (size2 != null) {
                    if (a3 <= size2.getHeight() * size2.getWidth()) {
                        l3f = l3f.ULTRA_MAXIMUM;
                    }
                }
            }
        }
        return new jc0(a2, l3f, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jc0)) {
            return false;
        }
        jc0 jc0 = (jc0) obj;
        return tr1.c(this.a, jc0.a) && this.b.equals(jc0.b) && this.c == jc0.c;
    }

    public final int hashCode() {
        long j = this.c;
        return ((int) (j ^ (j >>> 32))) ^ ((((tr1.y(this.a) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceConfig{configType=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "RAW" : "JPEG_R" : "JPEG" : "YUV" : "PRIV");
        sb.append(", configSize=");
        sb.append(this.b);
        sb.append(", streamUseCase=");
        return wj6.m(sb, this.c, "}");
    }
}
