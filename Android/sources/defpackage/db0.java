package defpackage;

/* renamed from: db0  reason: default package */
public final class db0 implements yrg {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public db0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static db0 e(yrg yrg) {
        return new db0(yrg.c(), yrg.a(), yrg.b(), yrg.d());
    }

    public final float a() {
        return this.b;
    }

    public final float b() {
        return this.c;
    }

    public final float c() {
        return this.a;
    }

    public final float d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof db0)) {
            return false;
        }
        db0 db0 = (db0) obj;
        return Float.floatToIntBits(this.a) == Float.floatToIntBits(db0.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(db0.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(db0.c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(db0.d);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d) ^ ((((((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003);
    }

    public final String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.a + ", maxZoomRatio=" + this.b + ", minZoomRatio=" + this.c + ", linearZoom=" + this.d + "}";
    }
}
