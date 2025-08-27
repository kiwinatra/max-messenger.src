package defpackage;

/* renamed from: vq8  reason: default package */
public final class vq8 implements jv0 {
    public static final vq8 w = new vq8(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);
    public final long a;
    public final long b;
    public final long c;
    public final float o;
    public final float v;

    public vq8(long j, long j2, long j3, float f, float f2) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = f;
        this.v = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vq8)) {
            return false;
        }
        vq8 vq8 = (vq8) obj;
        return this.a == vq8.a && this.b == vq8.b && this.c == vq8.c && this.o == vq8.o && this.v == vq8.v;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        int i = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31;
        float f = this.o;
        int i2 = 0;
        int floatToIntBits = (i + (f != c44.DEFAULT_ASPECT_RATIO ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.v;
        if (f2 != c44.DEFAULT_ASPECT_RATIO) {
            i2 = Float.floatToIntBits(f2);
        }
        return floatToIntBits + i2;
    }
}
