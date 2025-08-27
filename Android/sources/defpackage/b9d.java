package defpackage;

import java.util.Arrays;

/* renamed from: b9d  reason: default package */
public final class b9d {
    public int a = 2;
    public boolean b = false;
    public float[] c = null;
    public int d = 0;
    public float e = c44.DEFAULT_ASPECT_RATIO;
    public int f = 0;
    public float g = c44.DEFAULT_ASPECT_RATIO;
    public boolean h = false;

    public static b9d a(float f2, float f3, float f4, float f5) {
        b9d b9d = new b9d();
        b9d.c(f2, f3, f4, f5);
        return b9d;
    }

    public static b9d b(float[] fArr) {
        b9d b9d = new b9d();
        fArr.getClass();
        cvg.m("radii should have exactly 8 values", fArr.length == 8);
        if (b9d.c == null) {
            b9d.c = new float[8];
        }
        System.arraycopy(fArr, 0, b9d.c, 0, 8);
        return b9d;
    }

    public final void c(float f2, float f3, float f4, float f5) {
        if (this.c == null) {
            this.c = new float[8];
        }
        float[] fArr = this.c;
        fArr[1] = f2;
        fArr[0] = f2;
        fArr[3] = f3;
        fArr[2] = f3;
        fArr[5] = f4;
        fArr[4] = f4;
        fArr[7] = f5;
        fArr[6] = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b9d.class != obj.getClass()) {
            return false;
        }
        b9d b9d = (b9d) obj;
        if (this.b == b9d.b && this.d == b9d.d && Float.compare(b9d.e, this.e) == 0 && this.f == b9d.f && Float.compare(b9d.g, this.g) == 0 && this.a == b9d.a && this.h == b9d.h) {
            return Arrays.equals(this.c, b9d.c);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = 0;
        int y = (((i != 0 ? tr1.y(i) : 0) * 31) + (this.b ? 1 : 0)) * 31;
        float[] fArr = this.c;
        int hashCode = (((y + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.d) * 31;
        float f2 = this.e;
        int floatToIntBits = (((hashCode + (f2 != c44.DEFAULT_ASPECT_RATIO ? Float.floatToIntBits(f2) : 0)) * 31) + this.f) * 31;
        float f3 = this.g;
        if (f3 != c44.DEFAULT_ASPECT_RATIO) {
            i2 = Float.floatToIntBits(f3);
        }
        return ((floatToIntBits + i2) * 961) + (this.h ? 1 : 0);
    }
}
