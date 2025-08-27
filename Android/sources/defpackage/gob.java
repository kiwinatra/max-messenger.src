package defpackage;

import java.util.Locale;

/* renamed from: gob  reason: default package */
public final class gob {
    public static final gob d = new gob(1.0f);
    public static final String e = Integer.toString(0, 36);
    public static final String f = Integer.toString(1, 36);
    public final float a;
    public final float b;
    public final int c;

    static {
        int i = v0g.a;
    }

    public gob(float f2) {
        this(f2, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gob.class != obj.getClass()) {
            return false;
        }
        gob gob = (gob) obj;
        return this.a == gob.a && this.b == gob.b;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.a), Float.valueOf(this.b)};
        int i = v0g.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public gob(float f2, float f3) {
        boolean z = false;
        n79.g(f2 > c44.DEFAULT_ASPECT_RATIO);
        n79.g(f3 > c44.DEFAULT_ASPECT_RATIO ? true : z);
        this.a = f2;
        this.b = f3;
        this.c = Math.round(f2 * 1000.0f);
    }
}
