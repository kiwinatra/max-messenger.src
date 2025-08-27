package defpackage;

import java.util.Locale;

/* renamed from: fob  reason: default package */
public final class fob implements jv0 {
    public static final fob o = new fob(1.0f, 1.0f);
    public final float a;
    public final float b;
    public final int c;

    public fob(float f, float f2) {
        boolean z = false;
        y64.g(f > c44.DEFAULT_ASPECT_RATIO);
        y64.g(f2 > c44.DEFAULT_ASPECT_RATIO ? true : z);
        this.a = f;
        this.b = f2;
        this.c = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fob.class != obj.getClass()) {
            return false;
        }
        fob fob = (fob) obj;
        return this.a == fob.a && this.b == fob.b;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.a), Float.valueOf(this.b)};
        int i = t0g.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
